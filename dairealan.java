import java.util.Scanner;
public class dairealan {

    public static void main(String[]args){

        Scanner cikis=new Scanner(System.in);

        int r;
        double a,pi=3.14,Dairedilimalan,alan,cevre;


        System.out.print("Yar� �ap� girin :");
        r= cikis.nextInt();
        System.out.print("Merkez a��s�n�n �l��s�n� girin :");
        a=cikis.nextDouble();
        alan=pi*r*r;
        cevre=2*pi*r;
        Dairedilimalan=(pi*(r*r)*a)/360;

        System.out.println("Daire alan� :"+alan);
        System.out.println("Dairenin �evresi :"+cevre);
        System.out.println("Daire diliminin alan� :"+Dairedilimalan);
















    }


}
