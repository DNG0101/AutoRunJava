#!/bin/bash

echo "Preparing to run Java..."

javac Main.java

if [ $? -ne 0 ]; then
  echo "Compilation error"
  exit 1
fi

echo "Running..."
java Main