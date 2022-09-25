import java.util.Scanner;
public class kdvtutar {
    public static  void main(String[]args){
        Scanner input=new Scanner(System.in);

        double urun,kdv,kdvli,kdvtut;
        boolean kdvDurumu;

        System.out.print("Ürün fiyatını giriniz :");
        urun=input.nextDouble();



        kdvDurumu=(0<urun)&&(urun<1000);
        kdv=kdvDurumu ? 0.18 : 0.08;

        kdvtut=urun*kdv;
        kdvli=urun+kdvtut;

        System.out.println("Kdv oranı :"+kdv);
        System.out.println("Ürünün kdvsiz fiyatı :"+urun);
        System.out.println("Ürünün kdvli fiyatı :"+kdvli);
        System.out.println("Kdv tutarı :" +kdvtut);


    }
}
