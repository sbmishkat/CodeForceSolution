import java.util.Arrays;
import java.util.Scanner;

public class Anton_and_Letters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        String word = sc.nextLine();
        word = word.replace("{", "");
        word = word.replace("}", "");
        word = word.replace(",", "");
        word = word.replace(" ", "");
        char[] wordc = word.toCharArray();
        Arrays.sort(wordc);
        if (wordc.length == 0) {
            System.out.println("0");
            sc.close();
            return;
        }
        for (int i = 1; i < wordc.length; i++) {
            if (wordc[i - 1] != wordc[i]) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
