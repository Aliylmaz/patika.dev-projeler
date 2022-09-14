import java.util.Scanner;
import java.util.Arrays;

public class diziMinMax {
    public static void main(String[] args) {
        int[] list = {-6, -50, 56, 213, 75, 4123, 3, 21, -31};
        Scanner input = new Scanner(System.in);
        int min = list[0];
        int max = list[0];

        int sayi;
        System.out.println(Arrays.toString(list));
        System.out.println("Sayı giriniz :");
        sayi = input.nextInt();

        Arrays.sort(list);

        for (int i : list) {
            if (i < sayi) {
                min = i;
            }
            if (i > sayi) {
                max = i;
                break;
            }

        }
        System.out.println("Girilen sayıdan küçük en yakın sayı :" + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı :" + max);


    }
}
