import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if (n % 2 == 1)
            System.out.println("NO");
        else if (n == 2) {
            System.out.println("NO");
        } else
            System.out.println("YES");
        scanner.close();

    }
}
