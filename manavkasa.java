import java.util.Scanner;
public class manavkasa {
    public static void main(String[]args){

        Scanner input =new Scanner(System.in);

        double armut=2.14 ,elma=3.67, domates=1.11, muz=0.95,patlican=5,kg;
        double armutkg,elmakg,domateskg,muzkg,patlicankg,total;

        System.out.print("Ka� kilo armut ald�n�z :");
        kg=input.nextDouble();
        armutkg=kg*armut;

        System.out.print("Ka� kilo elma ald�n�z :");
        kg=input.nextDouble();
        elmakg=kg*elma;

        System.out.print("Ka� kilo domates ald�n�z :");
        kg=input.nextDouble();
        domateskg=kg*domates;

        System.out.print("Ka� kilo muz ald�n�z :");
        kg=input.nextDouble();
        muzkg=kg*muz;

        System.out.print("Ka� kilo patl�can ald�n�z :");
        kg=input.nextDouble();
        patlicankg=kg*patlican;

        System.out.println("Armut fiyat� :"+armutkg);
        System.out.println("Elma fiyat� :"+elmakg);
        System.out.println("Domates fiyat� :"+domateskg);
        System.out.println("Muz fiyat� :"+muzkg);
        System.out.println("Patl�can fiyat� :"+patlicankg);


        total=patlicankg+muzkg+domateskg+elmakg+armutkg;
        System.out.println("Toplam fiyat tutar� :"+total);








    }



}
