import java.util.Scanner;
public class hesapmakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double n1, n2;
        int secim;

        System.out.print("1. sayýyý giriniz :");
        n1 = input.nextDouble();
        System.out.print("2.sayýyý giriniz :");
        n2 = input.nextDouble();
        System.out.println("Toplama\nÇýkarma\nÇarpma\nBölme");
        System.out.println("Seçiminizi yapýnýz");
        secim = input.nextInt();

        switch (secim){
            case 1:
                System.out.println("Toplam :"+(n1+n2));
                break;
            case 2:
                System.out.println("Çýkarma :"+(n1-n2));
                break;
            case 3:
                System.out.println("Çarpma :"+(n1*n2));
                break;
            case 4 :
                if (n2!=0){
                    System.out.println("Bölüm :"+(n1/n2));
                }else{
                    System.out.println("Bir sayý 0 a bölünemez!");
                }
                break;
            default:
                System.out.println("Hatalý seçim yaptýnýz ");
        }



























       

    }
}
