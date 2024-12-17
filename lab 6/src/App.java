public class App {
    public static void main(String[] args) throws Exception {
        // Test cases for Task2
        try {
            System.out.println(Task2.intToBinaryString(21)); // Expected: "10101"
            System.out.println(Task2.intToBinaryString(0));  // Expected: "0"
            System.out.println(Task2.intToBinaryString(-5)); // Expected: "-101"
            System.out.println(Task2.intToBinaryString(1024)); // Expected: "10000000000"
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Invalid case example (if needed)
        try {
            System.out.println(Task2.intToBinaryString(Integer.MAX_VALUE + 1)); // Out of range test
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Test cases for Task8
        try {
            System.out.println(Task8.countNumbersInString("The user with the nickname koala757677 this month wrote 3 times more comments than the user with the nickname croco181dile920 4 months ago")); // Expected: 2
            System.out.println(Task8.countNumbersInString("There are 42 apples and 7 oranges")); // Expected: 2
            System.out.println(Task8.countNumbersInString("123 456 789")); // Expected: 3
            System.out.println(Task8.countNumbersInString("No numbers here!")); // Expected: 0
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Invalid case example (if needed)
        try {
            System.out.println(Task8.countNumbersInString(null)); // Null input test
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

class Task2 {
    public static String intToBinaryString(int i) {
        // Convert integer to binary string
        return Integer.toBinaryString(i);
    }
}

class Task8 {
    public static int countNumbersInString(String input) {
        if (input == null) {
            throw new NullPointerException("Input string cannot be null.");
        }

        // Split the string into words and count numeric-only words
        String[] words = input.split("\\s+");
        int count = 0;

        for (String word : words) {
            if (word.matches("\\d+")) {
                count++;
            }
        }
        return count;
    }
}