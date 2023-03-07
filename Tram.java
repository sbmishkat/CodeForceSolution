import java.util.*;

public class Tram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b, sum = 0, max = 0, time = scanner.nextInt();
        for (int i = 1; i <= time; i++) {
            a = scanner.nextInt();
            b = scanner.nextInt();

            sum -= a;
            sum += b;
            if (max <= sum)
                max = sum;
        }
        System.out.println(max);
        scanner.close();
    }
}
