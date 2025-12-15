# Solution Templates

This directory contains templates for starting new Advent of Code solutions in various programming languages.

## Available Templates

- `python_template.py` - Python 3 solution template
- `javascript_template.js` - JavaScript (Node.js) solution template
- `java_template.java` - Java solution template
- `haskell_template.hs` - Haskell solution template
- `rust_template.rs` - Rust solution template
- `go_template.go` - Go solution template
- `cpp_template.cpp` - C++ solution template

## Using a Template

1. Copy the appropriate template to your solution directory:
   ```bash
   cp templates/python_template.py YYYY/dayXX/python/solution.py
   ```

2. Update the header comment with the correct year and day

3. Implement your solution in the `part1()` and `part2()` functions

4. Run your solution with your input file:
   ```bash
   python solution.py < input.txt
   ```

## Template Structure

All templates follow a similar structure:
- Input reading from stdin
- `part1()` function for the first part of the puzzle
- `part2()` function for the second part of the puzzle
- Main function that ties everything together

## Adding New Templates

Feel free to add templates for other languages! Follow the existing pattern:
- Read input from stdin
- Separate functions for part 1 and part 2
- Clear TODO comments for implementation
- Header comment with year/day placeholders
