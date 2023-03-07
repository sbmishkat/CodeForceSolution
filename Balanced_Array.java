import java.util.Scanner;

public class Balanced_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum1 = 0, sum2 = 0, t = sc.nextInt();
        for (int k = 0; k < t; k++) {
            int n = sc.nextInt();
            if (n % 4 != 0) {
                System.out.print("NO");
            } else {
                System.out.println("Yes");
                for (int i = 2; i <= n; i += 2) {
                    System.out.print(i + " ");
                    sum1 += i;
                }
                for (int i = 1; i <= n - 2; i += 2) {
                    System.out.print(i + " ");
                    sum2 += i;
                }
                System.out.print(sum1 - sum2);
                sum1 = 0;
                sum2 = 0;
            }
            System.out.println();
        }
        sc.close();
    }
}
