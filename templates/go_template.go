// Advent of Code - Year YYYY - Day XX
// Solution in Go

package main

import (
	"fmt"
	"io"
	"os"
	"strings"
)

func readInput() string {
	data, err := io.ReadAll(os.Stdin)
	if err != nil {
		panic(err)
	}
	return strings.TrimSpace(string(data))
}

func part1(data string) int {
	// TODO: Implement solution for part 1
	return 0
}

func part2(data string) int {
	// TODO: Implement solution for part 2
	return 0
}

func main() {
	data := readInput()

	result1 := part1(data)
	fmt.Printf("Part 1: %d\n", result1)

	result2 := part2(data)
	fmt.Printf("Part 2: %d\n", result2)
}
