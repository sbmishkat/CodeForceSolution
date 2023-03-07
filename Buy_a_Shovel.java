import java.util.Scanner;

public class Buy_a_Shovel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = 0, p = sc.nextInt(), n = sc.nextInt();
        for (int i = 1;; i++) {
            if ((p * i) % 10 == n || (p * i) % 10 == 0) {
                tt = i;
                break;
            }
        }
        System.out.println(tt);
        sc.close();
    }
}
