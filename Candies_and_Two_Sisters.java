import java.util.*;

public class CandiesandTwoSisters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0, t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            n = sc.nextInt();
            if (n % 2 == 0)
                n--;
            n = n < 3 ? 0 : (n / 2);
            System.out.println(n);
        }
        sc.close();
    }
}
