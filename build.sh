#!/bin/bash
set -e

# Directory Paths
BASE_DIR="$(cd "$(dirname "$0")" && pwd)"
LIB_DIR="$BASE_DIR/lib"
SRC_DIR="$BASE_DIR/src"
INPUT_JAR="$BASE_DIR/input/NinjaSchool_217w.jar"
DIST_JAR="$BASE_DIR/dist/NinjaSchool_217w_MatrixMOD.jar"
BUILD_DIR="$BASE_DIR/build_output"

echo "=================================================="
echo "   ⚡ MTX-API Automated Mod Builder v1.0 ⚡     "
echo "=================================================="

# Clean build directory
rm -rf "$BUILD_DIR"
mkdir -p "$BUILD_DIR/mod_classes" "$BUILD_DIR/patcher_classes" "$BUILD_DIR/patched_classes" "$BASE_DIR/dist"

echo "🔨 [1/4] Compiling MatrixAPI Facade & Modular Subpackages (Target: J2ME CLDC 1.1 / MIDP 2.0)..."
MOD_FILES=$(find "$SRC_DIR/mod" -name "*.java")
java -jar "$LIB_DIR/ecj.jar" -1.3 \
  -cp "$LIB_DIR/midpapi20.jar:$LIB_DIR/cldcapi11.jar:$INPUT_JAR" \
  -d "$BUILD_DIR/mod_classes" \
  $MOD_FILES

echo "🔨 [2/4] Compiling Bytecode Patcher..."
java -jar "$LIB_DIR/ecj.jar" -1.8 \
  -cp "$LIB_DIR/javassist.jar:$LIB_DIR/midpapi20.jar:$LIB_DIR/cldcapi11.jar:$INPUT_JAR:$BUILD_DIR/mod_classes" \
  -d "$BUILD_DIR/patcher_classes" \
  "$SRC_DIR/patcher/Patcher.java"

echo "⚡ [3/4] Instrumenting Game Bytecode with Deep Logging Hooks..."
java -cp "$BUILD_DIR/patcher_classes:$LIB_DIR/javassist.jar:$LIB_DIR/midpapi20.jar:$LIB_DIR/cldcapi11.jar:$INPUT_JAR:$BUILD_DIR/mod_classes" \
  patcher.Patcher "$INPUT_JAR" "$BUILD_DIR/mod_classes" "$BUILD_DIR/patched_classes"

echo "📦 [4/4] Repacking final Runnable J2ME JAR..."
cp "$INPUT_JAR" "$DIST_JAR"
cd "$BUILD_DIR/patched_classes"
zip -u -r "$DIST_JAR" . > /dev/null
cd "$BUILD_DIR/mod_classes"
zip -u -r "$DIST_JAR" mod/ > /dev/null

echo "=================================================="
echo " ✅ BUILD SUCCESSFUL WITH DEEP LOGGING!"
echo " 📁 Output File: $DIST_JAR"
echo " 📦 File Size:   $(du -h "$DIST_JAR" | cut -f1)"
echo "=================================================="
