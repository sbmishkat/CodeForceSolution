import java.util.*;
public class StonesOnTheTable {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int count=0,n = Integer.parseInt(scanner.nextLine());
        String word = scanner.nextLine();

        for(int i=1;i<n;i++) {
            if(word.charAt(i-1)==word.charAt(i))
                count++;
        }
        System.out.println(count);
    }
}
