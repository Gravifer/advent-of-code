// Advent of Code - Year YYYY - Day XX
// Solution in C++

#include <iostream>
#include <string>
#include <sstream>

std::string readInput() {
    std::stringstream buffer;
    buffer << std::cin.rdbuf();
    return buffer.str();
}

int part1(const std::string& data) {
    // TODO: Implement solution for part 1
    return 0;
}

int part2(const std::string& data) {
    // TODO: Implement solution for part 2
    return 0;
}

int main() {
    std::string data = readInput();
    
    int result1 = part1(data);
    std::cout << "Part 1: " << result1 << std::endl;
    
    int result2 = part2(data);
    std::cout << "Part 2: " << result2 << std::endl;
    
    return 0;
}
