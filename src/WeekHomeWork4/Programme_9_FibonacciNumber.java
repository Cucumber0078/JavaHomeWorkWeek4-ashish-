package WeekHomeWork4;

import java.util.Scanner;

public class Programme_9_FibonacciNumber {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Input Fibonacci number count;");
        isFibonacciNumber(scanner.nextInt());
        scanner.close();

    }
    public static void isFibonacciNumber(int count){
        int n1=0,n2=1,n3;

        System.out.println(n1+ ""+n2);
        for (int i =2; i< count; ++i){
            n3 = n1 +n2;
            System.out.println(""+n3);
            n1= n2;
            n2 = n3;

        }
    }
}
