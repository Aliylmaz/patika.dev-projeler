
import java.util.Scanner;
public class kdvtutar {
    public static  void main(String[]args){
        Scanner input=new Scanner(System.in);

        double urun,kdv,kdvli,kdvtut;
        boolean kdvDurumu;

        System.out.print("�r�n fiyat�n� giriniz :");
        urun=input.nextDouble();



        kdvDurumu=(0<urun)&&(urun<1000);
        kdv=kdvDurumu ? 0.18 : 0.08;

        kdvtut=urun*kdv;
        kdvli=urun+kdvtut;

        System.out.println("Kdv oran� :"+kdv);
        System.out.println("�r�n�n kdvsiz fiyat� :"+urun);
        System.out.println("�r�n�n kdvli fiyat� :"+kdvli);
        System.out.println("Kdv tutar� :" +kdvtut);


    }
}


 /* import java.util.Scanner;

public class kdvtutar {
    public static void main(String[] args) {
        double tutar, kdvTutar, kdvliTutar, kdv;
        boolean kdvDurum;

        Scanner input = new Scanner(System.in);
        System.out.println("�cret tutar�n� giriniz: ");
        tutar = input.nextDouble();

        kdvDurum = (0 < tutar) && (tutar < 1000);
        kdv = kdvDurum ? 0.18 : 0.08;

        kdvTutar = tutar * kdv;
        kdvliTutar = kdvTutar + tutar;

        System.out.println("KDV Oran� : " + kdv);
        System.out.println("KDV'siz Tutar : " + tutar);
        System.out.println("KDV Tutar� : " + kdvTutar);
        System.out.println("KDV'li Tutar�: " + kdvliTutar);
    }
}

  */