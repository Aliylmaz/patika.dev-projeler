
import java.util.Scanner;
public class kdvtutar {
    public static  void main(String[]args){
        Scanner input=new Scanner(System.in);

        double urun,kdv,kdvli,kdvtut;
        boolean kdvDurumu;

        System.out.print("Ürün fiyatýný giriniz :");
        urun=input.nextDouble();



        kdvDurumu=(0<urun)&&(urun<1000);
        kdv=kdvDurumu ? 0.18 : 0.08;

        kdvtut=urun*kdv;
        kdvli=urun+kdvtut;

        System.out.println("Kdv oraný :"+kdv);
        System.out.println("Ürünün kdvsiz fiyatý :"+urun);
        System.out.println("Ürünün kdvli fiyatý :"+kdvli);
        System.out.println("Kdv tutarý :" +kdvtut);


    }
}


 