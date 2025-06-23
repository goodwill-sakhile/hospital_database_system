@echo off
echo Compiling Java sources...
if not exist bin mkdir bin
dir /s /b src\*.java > sources.txt
javac -d bin @sources.txt
if %errorlevel% equ 0 (
  echo Compilation successful.
  echo Running main CLI (adjust class path as needed)...
  java -cp bin com.hms.cli.MainCLI
) else (
  echo Compilation failed.
)
del sources.txt
