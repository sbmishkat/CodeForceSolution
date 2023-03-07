import java.util.Scanner;

public class Hit_the_Lottery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total=n/100+((n%100)/20)+(((n%100)%20)/10)+((((n%100)%20)%10)/5)+((((n%100)%20)%10)%5)/1;
        System.out.println(total);
        sc.close();
    }
}

