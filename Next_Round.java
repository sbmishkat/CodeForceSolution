import java.util.Scanner;

public class Next_Round
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int nextRound=0,numPlayer,scoreCom;
        numPlayer = scanner.nextInt();
        scoreCom = scanner.nextInt();

        int[] score = new int[numPlayer];

        for(int i=0;i<numPlayer;i++)
        {
            score[i]=scanner.nextInt();
        }
        for(int i=0;i<numPlayer;i++)
        {
            if(score[i]>0)
            {
                if(score[i]>=score[scoreCom-1])
                    nextRound++;
            }
        }
        System.out.println(nextRound);
        scanner.close();
    }

}
