import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x, n1 = 0, n2 = 1, n3, toplam = 0;

        System.out.println("Eleman sayisini girin: ");
        x = input.nextInt();

        for (int i = 2; i <= x; i++) {
            n3 = n1 + n2;
            System.out.println(n1 + "+" + n2 + " = " + n3);
            n1 = n2;
            n2 = n3;
        }


    }
}
