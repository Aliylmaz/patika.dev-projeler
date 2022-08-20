import java.util.Scanner;
public class manavkasa {
    public static void main(String[]args){

        Scanner input =new Scanner(System.in);

        double armut=2.14 ,elma=3.67, domates=1.11, muz=0.95,patlican=5,kg;
        double armutkg,elmakg,domateskg,muzkg,patlicankg,total;

        System.out.print("Kaç kilo armut aldýnýz :");
        kg=input.nextDouble();
        armutkg=kg*armut;

        System.out.print("Kaç kilo elma aldýnýz :");
        kg=input.nextDouble();
        elmakg=kg*elma;

        System.out.print("Kaç kilo domates aldýnýz :");
        kg=input.nextDouble();
        domateskg=kg*domates;

        System.out.print("Kaç kilo muz aldýnýz :");
        kg=input.nextDouble();
        muzkg=kg*muz;

        System.out.print("Kaç kilo patlýcan aldýnýz :");
        kg=input.nextDouble();
        patlicankg=kg*patlican;

        System.out.println("Armut fiyatý :"+armutkg);
        System.out.println("Elma fiyatý :"+elmakg);
        System.out.println("Domates fiyatý :"+domateskg);
        System.out.println("Muz fiyatý :"+muzkg);
        System.out.println("Patlýcan fiyatý :"+patlicankg);


        total=patlicankg+muzkg+domateskg+elmakg+armutkg;
        System.out.println("Toplam fiyat tutarý :"+total);








    }



}
