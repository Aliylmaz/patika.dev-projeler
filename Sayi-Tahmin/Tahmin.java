import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayiTahmin {
    public static void main(String[] args) {
        Random random = new Random();

        int number = random.nextInt(100);
        System.out.println(number);
        Scanner input = new Scanner(System.in);

        int right = 0;
        int tahmin;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        while (right < 5) {
            System.out.print("Tahmininizi giriniz :");
            tahmin = input.nextInt();
            if (tahmin < 0 || tahmin > 100) {
                System.out.println("Lütfen 0-100 arasında bir değer girin!");
                if (isWrong) {
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız! Kalan hak :" + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("Bir dahaki hatalı girişinizde hakkınızdan düşülecektir!");
                }
                continue;
            }
            if (tahmin == number) {
                System.out.println("Tahmininiz doğru Tebrikler!");
                isWin = true;
                break;
            } else {


                System.out.println("Yanlış tahmin Tekrar deneyiniz!");
                if (tahmin > number) {
                    System.out.println(tahmin + " Gizli sayıdan büyüktür!");
                } else {
                    System.out.println(tahmin + " Gizli sayıdan küçüktür!");


                }
                wrong[right++] = tahmin;

                System.out.println("Kalan hakkınız :" + (5 - right));

            }

        }
        if (!isWin) {
            System.out.println("KAYBETTİNİZ!");
            if (!isWrong) {
                System.out.println("Tahminleriniz :" + Arrays.toString(wrong));

            }

        }

    }
}
