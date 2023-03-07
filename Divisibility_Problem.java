import java.util.*;

public class DivisibilityProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int time = 0;
        int[][] arr = new int[t][2];
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < t; i++) {
            if (arr[i][0] % arr[i][1] == 0)
                System.out.println(time);
            else {
                time = arr[i][1] - (arr[i][0] % arr[i][1]);
                System.out.println(time);
            }
            time = 0;
        }
        sc.close();
    }
}
