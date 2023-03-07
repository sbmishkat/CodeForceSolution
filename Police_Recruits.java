import java.util.*;

public class Police_Recruits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int crime = 0, rec = 0, n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i : arr) {
            if (i < 0) {
                crime++;
                if(rec>0){
                    crime--;
                    rec--;
                }
            } else if (i > 0) {
                rec += i;
            }
        }
        System.out.println(crime);
        sc.close();
    }
}
