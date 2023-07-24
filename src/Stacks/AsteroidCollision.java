package Stacks;

import java.util.*;

public class AsteroidCollision {
    public static List<Integer> asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids) {
            if (asteroid > 0) { // asteroid moving to the right
                stack.push(asteroid);
            } else { // asteroid moving to the left
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(asteroid)) {
                    stack.pop(); // smaller asteroid on the right side explodes
                }
                if (stack.isEmpty() || stack.peek() < 0) {
                    stack.push(asteroid); // non-destructive collision or no asteroids on the right
                } else if (stack.peek() == Math.abs(asteroid)) {
                    stack.pop(); // both asteroids explode
                }
            }
        }

        List<Integer> result = new ArrayList<>(stack);
        Collections.reverse(result); // reverse the stack to get the correct order of surviving asteroids
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] asteroids = new int[n];
        for (int i = 0; i < n; i++) {
            asteroids[i] = scanner.nextInt();
        }
        List<Integer> result = asteroidCollision(asteroids);
        for (int asteroid : result) {
            System.out.print(asteroid + " ");
        }
    }
}
