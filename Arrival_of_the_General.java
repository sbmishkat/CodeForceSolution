import java.util.*;

public class Arrival_of_the_General {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0], min = arr[0], a = 0, b = 0;
        for (int i = 0; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
                a = i;
            }
        }
        for (int i = 0; i < n; i++) {
            if (min >= arr[i]) {
                min = arr[i];
                b = i;
            }
        }
        int ans = a + (n - 1) - b;
        if (a > b)
            System.out.println(ans - 1);
        else
            System.out.println(ans);
        sc.close();
    }
}
