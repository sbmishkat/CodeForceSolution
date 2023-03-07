import java.util.*;

public class Is_your_horseshoe_on_the_other_hoof {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] arr = new long[4];
        int count = 0;
        for (int i = 0; i < 4; i++) {
            arr[i] = sc.nextLong();
        }
        Arrays.sort(arr);
        for (int i = 1; i < 4; i++) {
            if (arr[i - 1] == arr[i])
                count++;
        }
        System.out.println(count);
        sc.close();
    }
}
