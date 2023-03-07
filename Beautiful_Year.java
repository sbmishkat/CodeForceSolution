import java.util.*;

public class Beautiful_Year {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        for (;;) {
            year++;
            int a = year / 1000;
            int b = (year / 100) % 10;
            int c = (year / 10) % 10;
            int d = year % 10;
            if (a != b && a != c && a != d && b != c && b != d && c != d) {
                scanner.close();
                break;
            }
        }
        System.out.println(year);
        scanner.close();
    }
}
