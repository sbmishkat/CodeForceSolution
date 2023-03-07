import java.util.Scanner;

public class Yet_Another_Two_Integers_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, n = sc.nextInt();
        int[][] a = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            sum = Math.abs(a[i][0] - a[i][1]) / 10;
            if ((a[i][0] - a[i][1])%10 != 0)
                sum++;
            System.out.println(sum);
        }
        sc.close();
    }
}
