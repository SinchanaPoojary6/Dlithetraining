import java.util.Scanner;

public class ShiftLetters {
    public String shiftingLetters(String s, int[] shifts) {
        int n = s.length();
        char[] result = new char[n];

        // Calculate the total shifts needed for each index in the shifts array
        int totalShifts = 0;
        for (int i = n - 1; i >= 0; i--) {
            totalShifts = (totalShifts + shifts[i]) % 26;
            int shifted = (s.charAt(i) - 'a' + totalShifts) % 26;
            result[i] = (char) ('a' + shifted);
        }

        return new String(result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string s: ");
        String s = scanner.nextLine();

        System.out.print("Enter the number of shifts: ");
        int n = scanner.nextInt();
        int[] shifts = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter shift " + (i + 1) + ": ");
            shifts[i] = scanner.nextInt();
        }

        ShiftLetters shiftingLetters = new ShiftLetters();
        String result = shiftingLetters.shiftingLetters(s, shifts);
        System.out.println("Final String: " + result);

        scanner.close();
    }
}


