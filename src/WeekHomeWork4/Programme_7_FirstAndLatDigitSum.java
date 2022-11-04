package WeekHomeWork4;

import java.security.PublicKey;
import java.util.Scanner;

public class Programme_7_FirstAndLatDigitSum {
    public static int sumFirstAndLastDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int r, rev = 0, fd, id, s;
        id = number % 10;
        while (number > 0) {
            r = number % 10;
            rev = rev * 10 + r;
            number = number / 10;
        }
        fd= rev %10;
        s=fd+id;
        return s;


    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter any number");
        int a = scanner.nextInt();
        System.out.println("The sum of first & last digit is;" + sumFirstAndLastDigitSum(a));
        scanner.close();
    }

    }

