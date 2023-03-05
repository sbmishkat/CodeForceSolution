import java.util.*;

public class RemoveSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int t = sc.nextInt();
        for (int k = 0; k < t; k++) {
            int n = sc.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            if (n == 1) {
                System.out.println("yes");
                continue;
            }

            // Arrays.sort(arr);
            for (int j = 1; j < n; j++) {
                if (arr[j - 1] == arr[j] || arr[j - 1] == (arr[j] - 1)) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }

            }
            System.out.println(flag ? "yes" : "No");
        }
        sc.close();
    }
}
