import java.util.Scanner;
public class dairealan {

    public static void main(String[]args){

        Scanner cikis=new Scanner(System.in);

        int r;
        double a,pi=3.14,alan;


        System.out.print("Yar� �ap� girin :");
        r= cikis.nextInt();
        System.out.print("Merkez a��s�n�n �l��s�n� girin :");
        a=cikis.nextDouble();

        alan=(pi*(r*r)*a)/360;
        System.out.println("Daire diliminin alan� :"+alan);













        


    }


}
