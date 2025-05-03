package contestQuestion.Array;

import java.util.Scanner;

public class consecutive1or0 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int size = scanner.nextInt();

            if (size == 0) {
                System.out.println(0);
                return;
            }

        int maxConsecutiveCount = 0;
        int currentCount = 1;
        int prevElement = scanner.nextInt();

        for (int i = 1; i < size; i++) {
            int currentElement = scanner.nextInt();

            if (currentElement == prevElement) {
                currentCount++;
            } else {
                maxConsecutiveCount = Math.max(maxConsecutiveCount, currentCount);
                currentCount = 1;
                prevElement = currentElement;
            }
        }

        maxConsecutiveCount = Math.max(maxConsecutiveCount, currentCount);
            System.out.println(maxConsecutiveCount);
        }
    }
}
