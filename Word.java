import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        
        String word = scanner.nextLine();
        int ccount=0,scount=0;
        
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)>='A'&&word.charAt(i)<='Z'){
                ccount++;
            }else{
                scount++;
            }
        }
        if(ccount==scount){
            System.out.println(word.toLowerCase());
        } else if (ccount>scount) {
            System.out.println(word.toUpperCase());
        } else {
            System.out.println(word.toLowerCase());
        }
    }
}    
