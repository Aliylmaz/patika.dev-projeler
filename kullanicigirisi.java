import java.util.Scanner;

public class kullanicigirisi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String username, password, sifreistegi, yenisifre;

        System.out.print("Kullanici adi giriniz :");
        username = input.nextLine();
        System.out.print("Sifreyi giriniz :");
        password = input.nextLine();

        if (username.equals("patika") && password.equals("java")) {
            System.out.println(" Giri� yap�ld�");
        } else {
            System.out.println("�ifreniz yanl��t�r s�f�rlamak isterseniz \"yes\" istemezseniz \"no\" se�in ");
            sifreistegi = input.nextLine();
            if (sifreistegi.equals("no")) {
                System.out.println("Sonland�");
            } else if (sifreistegi.equals("yes")) {
                System.out.print("Yeni sifrenizi girin :");
                yenisifre=input.nextLine();
                if (yenisifre.equals("java")){
                    System.out.println("Yeni sifreyle eskisi ayn�");
                }else {
                    System.out.println("Sifre yenilendi!");
                }

            }else {
                System.out.println("Hatal� se�im se�tiniz");
            }


        }


    }
}
