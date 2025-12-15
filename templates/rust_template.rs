// Advent of Code - Year YYYY - Day XX
// Solution in Rust

use std::io::{self, Read};

fn read_input() -> String {
    let mut buffer = String::new();
    io::stdin().read_to_string(&mut buffer).unwrap();
    buffer.trim().to_string()
}

fn part1(data: &str) -> i32 {
    // TODO: Implement solution for part 1
    0
}

fn part2(data: &str) -> i32 {
    // TODO: Implement solution for part 2
    0
}

fn main() {
    let data = read_input();
    
    let result1 = part1(&data);
    println!("Part 1: {}", result1);
    
    let result2 = part2(&data);
    println!("Part 2: {}", result2);
}
