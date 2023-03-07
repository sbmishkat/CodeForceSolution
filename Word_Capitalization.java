import java.util.*;
public class Capitalization
{
    public static void main(String[] args)
    {
       Scanner scanner = new Scanner(System.in);

       String word = scanner.nextLine();

        word = word.replace(String.valueOf(word.charAt(0)),String.valueOf(Character.toUpperCase(word.charAt(0))));

        System.out.println(word);
    }
}
