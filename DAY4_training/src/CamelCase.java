import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();
        int wordCount = countWords(s);
        System.out.println(wordCount);
    }

    static int countWords(String s) {
        int count = 1; // Initialize count to 1, assuming there's at least one word

        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                count++;
            }
        }
        return count;
    }
}
