import java.util.Scanner;
public class dairealan {

    public static void main(String[]args){

        Scanner cikis=new Scanner(System.in);

        int r;
        double a,pi=3.14,alan;


        System.out.print("Yarý çapý girin :");
        r= cikis.nextInt();
        System.out.print("Merkez açýsýnýn ölçüsünü girin :");
        a=cikis.nextDouble();

        alan=(pi*(r*r)*a)/360;
        System.out.println("Daire diliminin alaný :"+alan);













        


    }


}
