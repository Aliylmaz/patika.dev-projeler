import java.util.Scanner;

public class sinifgecme {
    public static void main(String[] args) {
        int matematik, fizik, turkce, kimya, muzik;
        int ortalama;
        int toplamDersSayisi = 0;
        int toplamNot = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz: ");
        matematik = input.nextInt();
        if(!(matematik <= 0 || matematik > 100)) {
            toplamNot += matematik;
            toplamDersSayisi++;
        }

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();
        if(!(fizik <= 0 || fizik > 100)) {
            toplamNot += fizik;
            toplamDersSayisi++;
        }

        System.out.print("T�rk�e notunuzu giriniz: ");
        turkce = input.nextInt();
        if(!(turkce <= 0 || turkce > 100)) {
            toplamNot += turkce;
            toplamDersSayisi++;
        }

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();
        if(!(kimya <= 0 || kimya > 100)) {
            toplamNot += kimya;
            toplamDersSayisi++;
        }

        System.out.print("M�zik notunuzu giriniz: ");
        muzik = input.nextInt();
        if(!(muzik <= 0 || muzik > 100)) {
            toplamNot += muzik;
            toplamDersSayisi++;
        }

        ortalama = toplamNot / toplamDersSayisi;


        if(ortalama <= 55) {
            System.out.println("Ge�me durumu: Kald�n�z, seneye g�r���r�z!");
        } else {
            System.out.println("Ge�me durumu: Ge�tiniz, tebrik ederiz!");
        }

        System.out.println("Ortalaman�z: " + ortalama);
    }
}
