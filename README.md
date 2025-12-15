# Advent of Code Solutions

My attempt at solving [Advent of Code](https://adventofcode.com/) challenges across multiple years and programming languages.

## Repository Structure

Solutions are organized by year, with support for multiple programming languages:

```
advent-of-code/
├── 2023/
│   ├── day01/
│   │   ├── python/
│   │   │   └── solution.py
│   │   ├── javascript/
│   │   │   └── solution.js
│   │   └── README.md
│   └── day02/
│       └── ...
├── 2024/
│   └── day01/
│       └── ...
├── templates/
│   ├── python_template.py
│   ├── javascript_template.js
│   ├── java_template.java
│   └── ...
└── README.md
```

## Getting Started

### Adding a New Solution

1. Create a directory for the day: `mkdir -p YYYY/dayXX/LANGUAGE`
2. Copy the appropriate template from `templates/` directory
3. Implement your solution
4. Add your input file (not tracked by git) or read from stdin

### Running Solutions

Each language has its own way to run:

#### Python
```bash
cd YYYY/dayXX/python
python solution.py < input.txt
```

#### JavaScript (Node.js)
```bash
cd YYYY/dayXX/javascript
node solution.js < input.txt
```

#### Java
```bash
cd YYYY/dayXX/java
javac Solution.java
java Solution < input.txt
```

#### Haskell
```bash
cd YYYY/dayXX/haskell
ghc -o solution solution.hs
./solution < input.txt
```

## Supported Languages

- Python
- JavaScript (Node.js)
- Java
- Haskell
- C/C++
- Rust
- Go
- Ruby

Feel free to add solutions in any language!

## Notes

- Input files are not tracked in this repository (they're user-specific per Advent of Code's policy)
- Each day's directory can contain multiple language implementations
- Solutions may vary in optimization and approach

## Resources

- [Advent of Code Website](https://adventofcode.com/)
- [Advent of Code Subreddit](https://www.reddit.com/r/adventofcode/)

## License

See [LICENSE](LICENSE) file for details.
