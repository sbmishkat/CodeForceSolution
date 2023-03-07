import java.util.*;
public class Soldier_and_Bananas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstBanana = scanner.nextInt();
        int initialMoney = scanner.nextInt();
        int totalBanana = scanner.nextInt();
        int borrowMoney,totalCostOfBanana=0;


        for(int i=1;i<=totalBanana;i++) {
            totalCostOfBanana+= (firstBanana*i);
        }

        if((initialMoney-totalCostOfBanana)<0) {
            borrowMoney = totalCostOfBanana - initialMoney;
            System.out.println(borrowMoney);
        }else {
            System.out.println("0");
        }


    }
}
