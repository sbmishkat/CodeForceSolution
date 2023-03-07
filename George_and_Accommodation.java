import java.util.*;

public class GeorgeAndAccommodation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int canstay = 0, time = sc.nextInt();
        int[] presentPeople = new int[time];
        int[] capacity = new int[time];
        for (int i = 0; i < time; i++) {
            presentPeople[i] = sc.nextInt();
            capacity[i] = sc.nextInt();
            if ((presentPeople[i]+2)<=capacity[i])
                canstay++;
        }
        System.out.println(canstay);
        sc.close();
    }
}
