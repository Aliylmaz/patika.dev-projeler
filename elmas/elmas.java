import java.util.Scanner;

public class elmas {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int basamaksayisi;

        System.out.print("Basamak say�s�n� girin :");
        basamaksayisi = input.nextInt();

        for (int i = 1; i <= basamaksayisi; i++) {
            for (int j = 1; j <= (basamaksayisi - i); j++) {
                System.out.print(" ");

            }
            for (int k = 1; k <= ((2 * i - 1)); k++) {
                System.out.print("*");
            }

            System.out.println(" ");
        }
        for (int i=(basamaksayisi-1);i>=1;i--){
            for (int j=1;j<=(basamaksayisi-i);j++){
                System.out.print(" ");

            }for (int k=1;k<=(2*i)-1;k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
