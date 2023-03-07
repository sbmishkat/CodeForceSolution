import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0, n = sc.nextInt();
        String word = sc.next();
        word = word.toLowerCase();
        if (n < 26)
            System.out.println("NO");
        else {
            for (char a = 'a'; a <= 'z'; a++) {
                if (word.contains(String.valueOf(a)))
                    count++;
            }
            if (count == 26)
                System.out.println("Yes");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}
