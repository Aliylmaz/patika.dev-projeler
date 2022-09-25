import java.util.Scanner;

public class ciftVeDordunKati {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a, toplam = 0;



        do {
            System.out.println("Sayı girin :");
            a = input.nextInt();
            if ( a%4==0) {
                toplam += a;


            }
        } while (a %2==0);

        System.out.println("Çift ve 4'ün katı sayıların toplamı  :" + toplam);
    }
}

