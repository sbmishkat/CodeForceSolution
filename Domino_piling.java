import java.util.Scanner;

public class Domino_piling
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int domino;

        domino= (m*n)/2;
        System.out.println(domino);
    }
}
