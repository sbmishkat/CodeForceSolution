import java.util.Arrays;
import java.util.Scanner;

public class The_New_Year_Meeting_Friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int x = arr[1] - arr[0];
        int y = arr[2] - arr[1];
        System.out.println(x + y);
        sc.close();
    }
}
