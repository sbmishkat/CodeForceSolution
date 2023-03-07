import java.util.Scanner;

public class Design_Tutorial_Learn_from_Math {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        if(a%2==0){
            System.out.println("4 "+(a-4));
        }else{
            System.out.println("9 "+(a-9));
        }
        sc.close();
    }
}
