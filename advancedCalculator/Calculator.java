import java.util.Scanner;

public class advancedCalculator {


    static int sum(int a, int b) {
        int result = a + b;

        System.out.println("Toplam :" + result);
        return result;
    }

    static int minus(int a, int b) {
        int result = a - b;
        System.out.println("Çıkarma :" + result);
        return result;
    }

    static int times(int a, int b) {
        int result = a * b;
        System.out.println("Çarpma :" + result);
        return result;
    }

    static int divided(int a, int b) {
        if (b == 0) {
            System.out.println("ikinci sayi 0'dan farkli olmali");
            return 0;
        }
        int result = a / b;
        System.out.println("Bölüm :" + result);
        return result;
    }

    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;

        }
        System.out.println("Üs alma sonucu :" + result);
        return result;
    }

    static int factorial(int a) {
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        System.out.println("Faktoriyel sonucu :" + result);
        return result;
    }

    static int mod(int a, int b) {
        int result = a % b;
        System.out.println("Mod alma sonucu :" + result);
        return result;

    }

    static void rectangle(int a, int b) {
        System.out.println("Cevresi :" + (2 * (a + b)));
        System.out.println("Alani :" + (a * b));

    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Mod Alma\n"
                + "7- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";
        System.out.println(menu);

        while (true) {
            System.out.println("================");
            System.out.print("Bir işlem seçiniz :");
            select = input.nextInt();

            if (select == 0) {
                break;

            }
            System.out.print("ilk sayi :");
            int a = input.nextInt();

            System.out.print("İkinci sayi :");
            int b = input.nextInt();
            System.out.println("================");
            switch (select) {
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    minus(a, b);
                    break;
                case 3:
                    times(a, b);
                    break;
                case 4:
                    divided(a, b);
                    break;
                case 5:
                    power(a, b);
                    break;

                case 6:
                    mod(a, b);
                    break;
                case 7:
                    rectangle(a, b);
                    break;
                default:
                    System.out.println("Geçersiz bir işlem girdiniz !");


            }
        }
        System.out.println("Güle Güle!");
    }
}
