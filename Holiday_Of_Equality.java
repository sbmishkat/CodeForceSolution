import java.util.*;

public class Holiday_Of_Equality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        Arrays.sort(arr);
        n *= arr[n - 1];
        n -= sum;
        System.out.println(n);
        sc.close();
    }
}
