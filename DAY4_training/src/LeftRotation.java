import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeftRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Size of the array
        int d = scanner.nextInt(); // Number of left rotations
        List<Integer> arr = new ArrayList<>();

        // Input array elements
        for (int i = 0; i < n; i++) {
            arr.add(scanner.nextInt());
        }

        List<Integer> rotatedArray = leftRotateArray(arr, d);
        for (int num : rotatedArray) {
            System.out.print(num + " ");
        }
    }

    static List<Integer> leftRotateArray(List<Integer> arr, int d) {
        List<Integer> rotated = new ArrayList<>(arr.size());

        for (int i = 0; i < arr.size(); i++) {
            int newIndex = (i + d) % arr.size();
            rotated.add(arr.get(newIndex));
        }

        return rotated;
    }
}

