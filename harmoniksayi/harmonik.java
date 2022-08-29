import java.util.Scanner;

public class harmonikSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi;
        double result = 0;
        System.out.println("Say�y� girin :");
        sayi = input.nextInt();
        for (int i = 1; i <= sayi; i++) {
            result += (1.0 / i);


        }
        System.out.println(result);

    }
}
