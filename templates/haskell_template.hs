-- Advent of Code - Year YYYY - Day XX
-- Solution in Haskell

module Main where

import System.IO

-- Parse the input data
parseInput :: String -> [String]
parseInput = lines

-- Solve part 1
part1 :: [String] -> Int
part1 input = 0  -- TODO: Implement solution for part 1

-- Solve part 2
part2 :: [String] -> Int
part2 input = 0  -- TODO: Implement solution for part 2

main :: IO ()
main = do
    input <- getContents
    let parsedInput = parseInput input
    putStrLn $ "Part 1: " ++ show (part1 parsedInput)
    putStrLn $ "Part 2: " ++ show (part2 parsedInput)
