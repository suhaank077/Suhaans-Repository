import java.util.Scanner;

public class project2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a word or type exit to quit: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break; 
            }

            if (isPalindrome(input)) {
                System.out.println(input + " is a palindrome. True");
            } else {
                System.out.println(input + " is not a palindrome. False");
            }
        }

        scanner.close();
    }

    public static boolean isPalindrome(String word) {
        word = word.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
