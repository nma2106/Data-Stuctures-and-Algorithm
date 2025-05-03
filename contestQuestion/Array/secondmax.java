package contestQuestion.Array;

import java.util.Scanner;

public class secondmax {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        try (Scanner scanner = new Scanner(System.in)) {
            int size = scanner.nextInt();
            
            if (size < 2) {
                System.out.println("No second maximum");
                return;
            }

            int maxValue = Integer.MIN_VALUE, secondMaxValue = Integer.MIN_VALUE;

            for (int i = 0; i < size; i++) {
                int currentNumber = scanner.nextInt();
                
                if (currentNumber > maxValue) {
                    secondMaxValue = maxValue;
                    maxValue = currentNumber;
                } else if (currentNumber > secondMaxValue && currentNumber < maxValue) {
                    secondMaxValue = currentNumber;
                }
            }

            System.out.println((secondMaxValue == Integer.MIN_VALUE) ? "No second maximum" : secondMaxValue);
        }
    }
}
