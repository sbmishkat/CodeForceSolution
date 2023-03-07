import java.util.*;

public class Ultra_Fast_Mathematician {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n1 = sc.nextLine();
        String n2 = sc.nextLine();
        char[] sum = new char[n1.length()];
        for (int i = 0; i < n2.length(); i++) {
            if (n1.charAt(i) == n2.charAt(i)) {
                sum[i] = '0';
            } else
                sum[i] = '1';
        }
        System.out.println(sum);
        sc.close();
    }
}
