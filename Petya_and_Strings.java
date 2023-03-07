import java.util.Scanner;

public class Petya_and_Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = (scanner.nextLine()).toUpperCase();
        String second = (scanner.nextLine()).toUpperCase();

        int value = first.compareTo(second);

        if (value < 0)
            System.out.println("-1");
        else if (value == 0)
            System.out.println(value);
        else
            System.out.println("1");
        scanner.close();

    }
}
