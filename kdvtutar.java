
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


 