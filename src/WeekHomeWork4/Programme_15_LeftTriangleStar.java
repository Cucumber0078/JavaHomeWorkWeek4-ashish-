package WeekHomeWork4;

import java.util.Scanner;

public class Programme_15_LeftTriangleStar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows;");
        int a = scanner.nextInt();
        leftTriagle(a);
        scanner.close();
    }

    public static void leftTriagle(int x) {
        int i, j = 0;
        for (i = 1; j <= i; j++) {
            System.out.println("*");
        }
        System.out.println("\n");
    }
}

