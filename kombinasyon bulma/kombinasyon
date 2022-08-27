import java.util.Scanner;

public class kombinasyon {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n, r, toplamn = 1, toplamr = 1;

        System.out.print("C(n,r) bicimindeki n degerini giriniz: :");
        n = input.nextInt();

        System.out.print("C(n,r) bicimindeki r degerini giriniz:");
        r = input.nextInt();
        if (n > 0 && r > 0) {
            for (int i = 1; i <= n; i++) {
                toplamn *= i;
            }
            System.out.println("n'nin kombinasyon de�eri :"+toplamn);


            for (int a = 1; a <= r; a++) {
                toplamr *= a;
            }
            System.out.println("r'nin kombinasyon de�eri: "+toplamr);

            double com;
            com = toplamn / (toplamr * (n - r));
            System.out.println("C(n,r) sonucu :" + com);
        } else {
            System.out.println("Yanl�� de�er girdiniz.");
        }
    }
}
