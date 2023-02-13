import java.util.Scanner;

public class Team
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int[] know = new int[3];
        int max=0, probNum = scanner.nextInt();

        for(int i=0; i<probNum;i++)
        {
            for (int j = 0; j < 3; j++)
            {
                know[j] = scanner.nextInt();
            }
            if ((know[0] + know[1] + know[2]) >= 2) {
                max++;
            }
        }
        System.out.println(max);
    }
}
