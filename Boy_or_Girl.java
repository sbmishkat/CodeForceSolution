import java.util.*;
public class Boy_or_Girl
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        char[] wordChar = name.toCharArray();
        HashSet<Character> ans = new HashSet<>();

        for(int i = 0; i<wordChar.length; i++)
        {
           ans.add(wordChar[i]);
        }

        int count = ans.size();

        if(count%2==0)
            System.out.println("CHAT WITH HER!");
        else
            System.out.println("IGNORE HIM!");
    }
}
