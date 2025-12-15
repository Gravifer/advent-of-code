/**
 * Advent of Code - Year YYYY - Day XX
 * Solution in JavaScript
 */

const fs = require('fs');

function readInput() {
    // Read from stdin or file
    return fs.readFileSync(0, 'utf-8').trim();
}

function part1(data) {
    // TODO: Implement solution for part 1
    return null;
}

function part2(data) {
    // TODO: Implement solution for part 2
    return null;
}

function main() {
    const data = readInput();
    
    const result1 = part1(data);
    console.log(`Part 1: ${result1}`);
    
    const result2 = part2(data);
    console.log(`Part 2: ${result2}`);
}

main();
