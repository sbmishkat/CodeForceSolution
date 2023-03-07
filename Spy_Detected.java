import java.util.*;

public class Spy_Detected {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0, t = sc.nextInt();
        for (int k = 0; k < t; k++) {
            n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            if (arr[0] != arr[1] && arr[0] != arr[2]) {
                System.out.println("1");
                continue;
            }
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] != arr[i + 1]) {
                    System.out.println(i + 2);
                    break;
                }
            }
        }
        sc.close();
    }
}
