import java.util.Scanner;
public class hesapmakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double n1, n2;
        int secim;

        System.out.print("1. say�y� giriniz :");
        n1 = input.nextDouble();
        System.out.print("2.say�y� giriniz :");
        n2 = input.nextDouble();
        System.out.println("Toplama\n��karma\n�arpma\nB�lme");
        System.out.println("Se�iminizi yap�n�z");
        secim = input.nextInt();

        switch (secim){
            case 1:
                System.out.println("Toplam :"+(n1+n2));
                break;
            case 2:
                System.out.println("��karma :"+(n1-n2));
                break;
            case 3:
                System.out.println("�arpma :"+(n1*n2));
                break;
            case 4 :
                if (n2!=0){
                    System.out.println("B�l�m :"+(n1/n2));
                }else{
                    System.out.println("Bir say� 0 a b�l�nemez!");
                }
                break;
            default:
                System.out.println("Hatal� se�im yapt�n�z ");
        }



























       

    }
}
