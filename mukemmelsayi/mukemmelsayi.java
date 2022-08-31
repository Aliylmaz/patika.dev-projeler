import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, toplam = 0, i = 1;
        System.out.print("Sayiyi girin :");
        n = input.nextInt();
        while (i < n) {
            if (n % i == 0) {
                System.out.println(i + "");
                toplam += i;

            }
            i++;
        }
        System.out.println("Toplam :" + toplam);
        if (toplam == n) {
            System.out.println(n + " Bir mükemmel sayidir.");
        } else {
            System.out.println(i + " Bir mükemmel sayi degildir");
        }
    }
}
