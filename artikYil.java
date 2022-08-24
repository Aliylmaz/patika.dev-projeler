
import java.util.Scanner;

public class artikYil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int yil;
        System.out.print("Yýlý giriniz :");
        yil = input.nextInt();
        if (yil > 0) {


            if (yil % 4 == 0) {
                if (yil % 100 == 0) {
                    if (yil % 400 == 0) {
                        System.out.println(yil + " Artýk yýldýr.");
                    } else {
                        System.out.println(yil + " Artýk yýl deðildir !");

                    }

                } else {
                    System.out.println(yil + " Artýk bir yýldýr !");
                }
            } else {
                System.out.println(yil + " Artýk bir yýl deðildir !");
            }
        } else {
            System.out.println("Yanlýþ deðer girdiniz !");
        }

    }
}



