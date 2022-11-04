package WeekHomeWork4;

import java.util.Scanner;

public class Programme_8_SymbloTriange {
    public static void symbolTriagnle(int n){
        for (int i=0;i<n; i++){
            for (int j=0; j<i; j++){
                System.out.println("@");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Input number of rows:");
        symbolTriagnle(scanner.nextInt());
        scanner.close();
    }
}
