import java.util.*;

public class Magnet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1, n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=1;i<n;i++){
            if (arr[i - 1] != arr[i])
                count++;
        }
        System.out.println(count);
        sc.close();
    }
}
