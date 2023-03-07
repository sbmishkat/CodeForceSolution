import java.util.Scanner;

public class Short_Substrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = 1, cases = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < cases; i++) {
            String word = sc.nextLine();
            char[] wordC = new char[((word.length() - 2) / 2) + 2];
            wordC[0] = word.charAt(0);
            wordC[((word.length() - 2) / 2) + 1] = word.charAt(word.length() - 1);
            for (int j = 1; j < word.length()-1;) {
                if (word.charAt(j) == word.charAt(j+1)) {
                    wordC[k] = word.charAt(j);
                    k++;
                }
                j+=2;
            }
            k = 1;
            word = new String(wordC);
            System.out.println(word);
        }
        sc.close();
    }
}
