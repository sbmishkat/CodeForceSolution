import java.util.Scanner;

public class SoftDrinking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
        for (int i = 0; i < 8; i++) {
            arr[i] = sc.nextInt();
        }
        if ((((arr[1] * arr[2]) / arr[6]) / arr[0]) <= ((arr[5] / arr[7]) / arr[0])
                && (((arr[1] * arr[2]) / arr[6]) / arr[0]) <= ((arr[3] * arr[4]) / arr[0])) {
            System.out.println((((arr[1] * arr[2]) / arr[6]) / arr[0]));
        } else if (((arr[3] * arr[4]) / arr[0]) <= (((arr[1] * arr[2]) / arr[6]) / arr[0])
                && ((arr[3] * arr[4]) / arr[0]) <= ((arr[5] / arr[7]) / arr[0])) {
            System.out.println(((arr[3] * arr[4]) / arr[0]));
        } else {
            System.out.println(((arr[5] / arr[7]) / arr[0]));
        }

        sc.close();
    }
}
