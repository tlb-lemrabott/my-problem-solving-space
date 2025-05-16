#!/bin/bash

# Path
cd /Users/lemrabotttoulba/Documents/coding-practice || exit

git checkout main

# Loopingfiles and assing a custom commit to each one 
find . -type f -name "*.java" | while read -r file; do
  # Extract the file name without extension
  filename=$(basename "$file" .java)
  
  # Stage the file
  git add "$file"

  # Create commit message with the filename
  git commit -m "Pushing my solution for the #$filename problem"

done