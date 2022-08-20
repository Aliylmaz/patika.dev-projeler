import java.util.Scanner;
public class dairealan {

    public static void main(String[]args){

        Scanner cikis=new Scanner(System.in);

        int r;
        double a,pi=3.14,Dairedilimalan,alan,cevre;


        System.out.print("Yarý çapý girin :");
        r= cikis.nextInt();
        System.out.print("Merkez açýsýnýn ölçüsünü girin :");
        a=cikis.nextDouble();
        alan=pi*r*r;
        cevre=2*pi*r;
        Dairedilimalan=(pi*(r*r)*a)/360;

        System.out.println("Daire alaný :"+alan);
        System.out.println("Dairenin çevresi :"+cevre);
        System.out.println("Daire diliminin alaný :"+Dairedilimalan);
















    }


}
