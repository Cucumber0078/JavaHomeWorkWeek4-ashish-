package WeekHomeWork4;

import java.util.Scanner;

public class Prgoramme_14_DiamondPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number of row");
        int a= scanner.nextInt();
        System.out.println("Enter the symbol");
        char c = scanner.next().charAt(0);
        prrintDiamond(a,c);
        scanner.close();
        ;

    }
    public static void prrintDiamond(int r, char ch){
        int i =1;
        int j;
        while (i<=r){
            j=1;
            while (j++<=r -i){
                System.out.println("");
            }
            j=1;
            while (j++<=i *2-1){
                System.out.println(ch);
            }
            System.out.println();
            i++;
        }
        i = r -1;
        while (i>0){
            j=1;
            while (j++<=r - i){
                System.out.println("");
            }
            j =1;
            while (j++ <=i *2-1){
                System.out.println(ch);
            }
            System.out.println();
            i--;

        }
    }
}
