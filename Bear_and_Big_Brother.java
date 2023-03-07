import java.util.*;
public class BearAndBigBrother {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a= scanner.nextInt();
        int b= scanner.nextInt();
        int year=0;

        while(a<b||a==b){
            a*=3;
            b*=2;
            year++;
        }
        System.out.println(year);

    }
}
