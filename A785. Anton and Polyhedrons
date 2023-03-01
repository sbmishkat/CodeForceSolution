import java.util.Scanner;

public class AntonandPolyhedrons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, n = Integer.parseInt(sc.nextLine());
        String word = new String();
        for (int i = 1; i <= n; i++) {
            word = sc.nextLine();
            switch (word) {
                case "Tetrahedron":
                    sum += 4;
                    break;
                case "Cube":
                    sum += 6;
                    break;
                case "Octahedron":
                    sum += 8;
                    break;
                case "Dodecahedron":
                    sum += 12;
                    break;
                case "Icosahedron":
                    sum += 20;
                    break;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
