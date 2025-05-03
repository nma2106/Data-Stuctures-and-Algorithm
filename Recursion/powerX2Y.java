// package Recursion;

public class powerX2Y {
    public static int power(int x, int y) {
        if (y == 0) {
            return 1;
        }
        return x * power(x, y - 1);
    }

    public static int power2(int x, int y) {
        if (y == 0) {
            return 1;
        }
        int halfPower = power2(x, y / 2); // Recursive call for y/2
    if (y % 2 == 0) {
        return halfPower * halfPower; // If y is even
    } else {
        return x * halfPower * halfPower; // If y is odd
    }

    }


   public static void main(String[] args) {
         int x = 50;
         int y = 50;
         System.out.println(power(x, y));
         System.out.println(power2(x, y));
   } 
}
