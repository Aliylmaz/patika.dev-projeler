import java.util.Scanner;

public class asalSayiMetot {


    static void Isasal(int sayi, int i) {
        if (i == sayi) {
            System.out.println(sayi + " asaldır");
            return;
        } else if (sayi % i == 0) {
            System.out.println(sayi + " asal değildir");
            return;
        }
        Isasal(sayi, i + 1);


    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;
        System.out.print("Sayıyı girin :");
        sayi = input.nextInt();
        Isasal(sayi, 2);


    }
}
