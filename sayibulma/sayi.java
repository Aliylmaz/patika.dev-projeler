import java.util.Scanner;

public class sayibulma {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int k, adet = 0, toplam = 0;

        double ortalama;
        System.out.println("Sayı girin :");
        k = input.nextInt();
        for (int i = 0; i <= k; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.println(i);
                toplam += i;
                adet++;


            }
        }
        ortalama = toplam / (adet - 1);
        System.out.println("SAYILARIN ORTALAMASI :" + ortalama);

    }
}
