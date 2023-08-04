import java.util.Scanner;

public class PalindromeNo {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            boolean isPalindrome = checkPalindrome(num);
            if (isPalindrome) {
                System.out.println(num + " is a palindrome number.");
            } else {
                System.out.println(num+ " is not a palindrome number.");
            }
        }
            static boolean checkPalindrome(int num){
                int originalNum = num;
                int reversedNum = 0;

                while (num > 0) {
                    int digit = num % 10;
                    reversedNum = reversedNum * 10 + digit;
                    num /= 10;
                }

                return originalNum == reversedNum;
            }
    }


