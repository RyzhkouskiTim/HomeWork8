import java.util.Scanner;

public class DateTimeUtils {
    public static void main(String[] args) {
        System.out.println("Введите год: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        boolean y = isLeapYear(x);
        if (y) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }
    }

    public static boolean isLeapYear(int year) {
        if ((year % 400 == 0) || (year % 4 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}
