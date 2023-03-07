import java.util.*;
public class NearlyLuckyNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long count=0,number = scanner.nextLong();

        while(number!=0){
            if(number%10==4||number%10==7){
                count++;
            }
            number/=10;
        }
        if(count==4||count==7)
            System.out.println("YES");
        else
            System.out.println("NO");

    }
}
