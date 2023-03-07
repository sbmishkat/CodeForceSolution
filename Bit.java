import java.util.Scanner;

public class Bit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bit = 0, count = Integer.parseInt(scanner.nextLine());
        String operation;

        for (int i = 1; i <= count; i++) {
            operation = scanner.nextLine();
            if ((operation.equals("X++")) || (operation.equals("++X")))
                bit++;
            else
                bit--;
        }
        System.out.println(bit);
        scanner.close();
    }
}
