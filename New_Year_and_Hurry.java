import java.util.*;

public class NewYearandHurry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt=0,n = sc.nextInt(), k = sc.nextInt();
        for (int i = 1;i<=n; i++) {
            if ((k + (5 * ((i * (i + 1)) / 2)))<=(4*60)) {
                tt=i;
            }
        }
        System.out.println(tt);

        sc.close();
    }
}
