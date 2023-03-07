import java.util.*;

public class Vasya_the_Hipster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        if (a > b) {
            System.out.print(b+" ");
            System.out.print((a-b)/2);
        }else{
            System.out.print(a+" ");
            System.out.print((b-a)/2);
        }

        sc.close();
    }
}
