import java.util.Scanner;

public class Way_Too_Long_Words {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int times = Integer.parseInt(scanner.nextLine());

        for(int i=1; i<=times;i++) {
            String word = scanner.nextLine();

            if (word.length() <= 10)
                System.out.println(word);
            else
                System.out.println(word.charAt(0) + "" + (word.length() - 2) + "" + (word.charAt(word.length() - 1)));
        }

    }
}
