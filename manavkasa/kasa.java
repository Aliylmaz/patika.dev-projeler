import java.util.Scanner;
public class manavkasa {
    public static void main(String[]args){

        Scanner input =new Scanner(System.in);

        double armut=2.14 ,elma=3.67, domates=1.11, muz=0.95,patlican=5,kg;
        double armutkg,elmakg,domateskg,muzkg,patlicankg,total;

        System.out.print("Kaç kilo armut aldınız :");
        kg=input.nextDouble();
        armutkg=kg*armut;

        System.out.print("Kaç kilo elma aldınızz :");
        kg=input.nextDouble();
        elmakg=kg*elma;

        System.out.print("Kaç kilo domates aldınız :");
        kg=input.nextDouble();
        domateskg=kg*domates;

        System.out.print("Kaç kilo muz aldınız :");
        kg=input.nextDouble();
        muzkg=kg*muz;

        System.out.print("Kaç kilo patlýcan aldınız :");
        kg=input.nextDouble();
        patlicankg=kg*patlican;

        System.out.println("Armut fiyatı :"+armutkg);
        System.out.println("Elma fiyatı :"+elmakg);
        System.out.println("Domates fiyatı :"+domateskg);
        System.out.println("Muz fiyatı :"+muzkg);
        System.out.println("Patlýcan fiyatı :"+patlicankg);


        total=patlicankg+muzkg+domateskg+elmakg+armutkg;
        System.out.println("Toplam fiyat tutarı :"+total);








    }



}
