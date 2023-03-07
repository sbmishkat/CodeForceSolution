import java.util.Scanner;

public class Choosing_Teams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0, total = 0, student = sc.nextInt(), preTimes = sc.nextInt();
        int[] arr = new int[student];
        for (int i = 0; i < student; i++)
            arr[i] = sc.nextInt();
        for (int i = 0; i < student; i++) {
            if (arr[i] + preTimes <= 5) {
                count++;
            }
            if (count == 3) {
                total++;
                count = 0;
            }
        }
        System.out.println(total);
        sc.close();
    }
}