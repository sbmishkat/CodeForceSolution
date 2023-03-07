import java.util.Scanner;

public class Beautiful_Matrix
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = new int[5][5];
        int move=0;

        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                matrix[i][j]= scanner.nextInt();
                if(matrix[i][j]==1)
                {
                    if(i>=2)
                        move=(i-2);
                    else
                        move=(2-i);
                    if(j>=2)
                        move+=(j-2);
                    else
                        move+=(2-j);
                }
            }
        }
        System.out.println(move);

    }
}
