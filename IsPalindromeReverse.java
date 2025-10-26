import java.util.Scanner;

public class IsPalindromeReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = (int)(Math.random() * 900) + 100; // Generate random 3-digit number
        System.out.print("Enter the reverse of " + number + ": ");
        int userReverse = input.nextInt();

        // Validate 3-digit input
        while (userReverse < 100 || userReverse > 999) {
            System.out.print("Please enter a 3-digit reverse number of " + number + ": ");
            userReverse = input.nextInt();
        }

        int reversedNumber = reverse(number);
        boolean result = isPalindrome(userReverse, reversedNumber);

        System.out.println("The digit " + userReverse + " is palindrome of " + number + " is " + result + ".");
        input.close();
    }

    public static int reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }

    public static boolean isPalindrome(int userInput, int reversedNumber) {
        return userInput == reversedNumber;
    }
}
