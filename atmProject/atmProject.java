
import javax.swing.*;
import java.util.Scanner;

public class atmProject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password;
        int right = 3;
        int select;
        int balance = 2000;
        while (right > 0) {

            System.out.print("Kullan�c� ad�n� girin :");
            userName = input.nextLine();

            System.out.print("�ifreyi girin :");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba kodluyoruz bankas�na ho�geldiniz!");

                do {

                    System.out.println("1-Para yat�rma\n2-Para �ekme\n3-Bakiye sorgulama\n4-��k�� ");
                    System.out.print("L�tfen yapmak istedi�iniz i�lemi se�in : ");
                    select = input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.println("Yat�rmak istedi�iniz miktar� giirn :");
                            int invest = input.nextInt();
                            balance += invest;
                            break;
                        case 2:
                            System.out.println("�ekmek istde�iniz miktar� girin :");
                            int withdraw = input.nextInt();
                            if (withdraw > balance) {
                                System.out.println("Bakiye yetersiz!");
                            } else {
                                balance -= withdraw;
                                break;
                            }
                        case 3:
                            System.out.println("Bakiyeniz :" + balance);
                            break;


                    }


                } while (select != 4);
                System.out.println("Tekrar g�r��mek �zere!");
                break;
            }else {
                right--;

                System.out.println("Hatal� kullan�c� ad� veya �ifre.Tekrar deneyin");
                if (right==0){
                    System.out.println("Kart�n�z bloke olmu�tur.L�tfen bankayla ileti�ime ge�iniz.");
                }else {
                    System.out.println("Kalan Hakk�n�z :"+right);
                }
            }
        }
    }
}
