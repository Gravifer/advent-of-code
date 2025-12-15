import java.util.Scanner;

/**
 * Advent of Code - Year YYYY - Day XX
 * Solution in Java
 */
public class Solution {
    
    public static String readInput() {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (scanner.hasNextLine()) {
            sb.append(scanner.nextLine()).append("\n");
        }
        scanner.close();
        return sb.toString().trim();
    }
    
    public static Object part1(String data) {
        // TODO: Implement solution for part 1
        return null;
    }
    
    public static Object part2(String data) {
        // TODO: Implement solution for part 2
        return null;
    }
    
    public static void main(String[] args) {
        String data = readInput();
        
        Object result1 = part1(data);
        System.out.println("Part 1: " + result1);
        
        Object result2 = part2(data);
        System.out.println("Part 2: " + result2);
    }
}
