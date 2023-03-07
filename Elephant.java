import java.util.Scanner;

public class Elephant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int location = scanner.nextInt();

        if (location % 5 == 0)
            System.out.println(location / 5);
        else
            System.out.println((location / 5) + 1);
        scanner.close();
    }
}
