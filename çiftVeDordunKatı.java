import java.util.Scanner;

public class �iftVeDordunKat� {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a, toplam = 0;



        do {
            System.out.println("Say� girin :");
            a = input.nextInt();
            if ( a%4==0) {
                toplam += a;


            }
        } while (a %2==0);

        System.out.println("�ift ve 4'�n kat� say�lar�n toplam�  :" + toplam);
    }
}

