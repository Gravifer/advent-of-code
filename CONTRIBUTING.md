# Contributing Guide

Thank you for contributing to this Advent of Code solutions repository!

## Adding a New Solution

### 1. Create the Directory Structure

For a new day's solution:
```bash
mkdir -p YYYY/dayXX/LANGUAGE
```

Example:
```bash
mkdir -p 2024/day15/python
```

### 2. Copy a Template

Copy the appropriate template from the `templates/` directory:
```bash
cp templates/python_template.py 2024/day15/python/solution.py
```

### 3. Update the Template

- Update the header comment with the correct year and day
- Implement your solution in the `part1()` and `part2()` functions
- Test your solution with the provided examples

### 4. Add a README (Optional but Recommended)

Create a README.md in the day's directory:
```bash
cp 2024/day01/README.md 2024/dayXX/README.md
```

Then update it with:
- Link to the puzzle
- Brief problem description
- Your approach/strategy
- Any interesting observations

### 5. Test Your Solution

Make sure your solution runs correctly:
```bash
cd YYYY/dayXX/LANGUAGE
python solution.py < input.txt  # or appropriate command for your language
```

## Guidelines

### Input Files

- **DO NOT** commit input files to the repository
- Input files are user-specific per Advent of Code's policy
- The `.gitignore` file is configured to exclude `input.txt` files

### Code Style

- Write clean, readable code
- Add comments for complex logic
- Follow the conventions of the language you're using
- Keep solutions self-contained when possible

### Multiple Languages

- Feel free to solve the same day in multiple languages
- Create separate directories for each language
- Example structure:
  ```
  2024/day01/
  ├── python/
  │   └── solution.py
  ├── javascript/
  │   └── solution.js
  └── rust/
      └── solution.rs
  ```

### Documentation

- Update the day's README with your solution approach
- Document any interesting algorithms or optimizations
- Include complexity analysis if relevant

## Adding New Language Templates

To add a template for a new language:

1. Create `templates/LANGUAGE_template.ext`
2. Follow the structure of existing templates:
   - Read input from stdin
   - Separate functions for part 1 and part 2
   - Clear TODO comments
   - Header with year/day placeholders
3. Add instructions to `templates/README.md`
4. Update the main README.md's "Supported Languages" section

## Questions?

If you have questions or suggestions, feel free to open an issue!
