// package Recursion;

public class increasingNumber {

    public static void function(int n ){

        if(n==1){
            System.out.println("1");
            return;
        }
        function(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        int n =7;
        function(n);
    }
}
