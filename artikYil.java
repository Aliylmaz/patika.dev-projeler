
import java.util.Scanner;

public class artikYil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int yil;
        System.out.print("Y�l� giriniz :");
        yil = input.nextInt();
        if (yil > 0) {


            if (yil % 4 == 0) {
                if (yil % 100 == 0) {
                    if (yil % 400 == 0) {
                        System.out.println(yil + " Art�k y�ld�r.");
                    } else {
                        System.out.println(yil + " Art�k y�l de�ildir !");

                    }

                } else {
                    System.out.println(yil + " Art�k bir y�ld�r !");
                }
            } else {
                System.out.println(yil + " Art�k bir y�l de�ildir !");
            }
        } else {
            System.out.println("Yanl�� de�er girdiniz !");
        }

    }
}



