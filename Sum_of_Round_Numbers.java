import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SumofRoundNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = 0, inc = 1, temp = 0, n = sc.nextInt();
        int[] arr = new int[n];
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            val = arr[i];
            while (val != 0) {
                temp = val % 10;
                if (temp != 0) {
                    list.add(temp * inc);
                }
                inc *= 10;
                val /= 10;
            }
            System.out.println(list.size());
            Collections.reverse(list);
            for (int j : list) {
                System.out.print(j + " ");
            }
            inc = 1;
            list.clear();
            System.out.println();
        }
        sc.close();
    }
}
