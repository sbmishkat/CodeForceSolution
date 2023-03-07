import java.util.*;
public class AnthonAndDanik {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        int acount=0,dcount=0,times =Integer.parseInt(scanner.nextLine());
        String won = scanner.nextLine();

        for(int i=0;i<times;i++){
            if(won.charAt(i)=='A')
                acount++;
            else
                dcount++;
        }
        if(acount==dcount)
            System.out.println("Friendship");
        else if (acount>dcount) {
            System.out.println("Anton");
        }else
            System.out.println("Danik");
    }
}
