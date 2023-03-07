import java.util.Scanner;

public class FoxAndSnake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                if (i % 2 == 1)
                    System.out.print("#");
                else {
                    if ( j==1&& i % 4 == 0)
                        System.out.print("#");
                    else if (j <=b &&i % 4 == 0)
                        System.out.print(".");
                    else if(j < b && i % 2 == 0)
                        System.out.print(".");
                    else
                        System.out.print("#");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
