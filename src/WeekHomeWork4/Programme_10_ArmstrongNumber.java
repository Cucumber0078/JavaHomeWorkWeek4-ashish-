package WeekHomeWork4;

public class Programme_10_ArmstrongNumber {
    public static void main(String[] args) {

    }
    public static void isArmstrongNumber(int num) {
        int number, temp, total = 0;
        number = num;
        while (num != 0) {
            temp = num % 10;
            total = total + temp * temp * temp;
            num /= 10;
        }
        if (total == number) {
            System.out.println(number + "is an Armstrong number");
        }

            else
            {
                System.out.println(number + "is not an Armstrong number");
            }
        }
    }