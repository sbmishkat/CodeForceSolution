import java.util.*;
public class Helpful_Maths
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        word=word.replace("+","");

        char[] wordToList= word.toCharArray();

        Arrays.sort(wordToList);

        for(int i=0; i<wordToList.length;i++)
        {
            System.out.print(wordToList[i]);
            if(i==wordToList.length-1)
                break;
            System.out.print("+");
        }
    }
}
