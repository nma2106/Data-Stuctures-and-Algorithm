

public class decreasingNumber {

    public static void function(int n ){

        if(n==1){
            System.out.println("1");
            return;
        }

        System.out.println(n);
        function(n-1);
    }
    public static void main(String[] args) {
        int n = 7;
        function(n);
    }
}
