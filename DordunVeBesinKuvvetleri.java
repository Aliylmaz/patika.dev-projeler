import java.util.Scanner;

public class DordunVeBesinKuvvetleri {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a, b, c;
        System.out.print("Sayý giriniz :");
        a = input.nextInt();
        for (b = 1; b <= a; b *= 4) {

            System.out.println("4'ün kuvvetleri :" + b);


        }
        System.out.println("-------------------------");

        for (c = 1; c <= a; c *= 5) {
            System.out.println("5'in kuvvetleri :" + c);
        }

    }
}
