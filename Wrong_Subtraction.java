import java.util.Scanner;

public class Wrong_Subtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int time = scanner.nextInt();
        while (time != 0) {
            if ((number % 10) != 0) {
                number--;
            } else {
                number /= 10;
            }
            time--;
        }
        System.out.println(number);
        scanner.close();

    }
}
