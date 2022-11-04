package WeekHomeWork4;

import java.util.Scanner;

public class Programme_1_ReadNumbersAndSum {
    public static void readTenNumberAndSum(){
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        while(true){
            int order = counter+1;
            System.out.println("Enter number #" + order+ ":");
            boolean isAnt = scanner.hasNextInt();
            if (isAnt){
                int number = scanner.nextInt();
                counter++;
                sum += number;
                if (counter == 10) {
                    break;
                }
                System.out.println("Invalid number");

            }
            System.out.println();
        }
        scanner.close();
    }

    public static void main(String[] args) {
        readTenNumberAndSum();
    }
}
