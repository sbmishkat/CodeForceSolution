import java.util.*;

public class Translation {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String firstWord = scanner.nextLine();
        String secondWord = scanner.nextLine();
        int count=0;

        if(firstWord.length()>secondWord.length()){
        for(int i=0;i<secondWord.length();i++){
            if(firstWord.charAt((secondWord.length()-1)-i)==secondWord.charAt(i))
                count++;
        }
        }else{
                for(int i=0;i<firstWord.length();i++){
                    if(firstWord.charAt((firstWord.length()-1)-i)==secondWord.charAt(i))
                        count++;
            }

        }

        if(firstWord.length()==count)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
