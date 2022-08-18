import java.util.Scanner;
public class ücgenalan {

    public  static void main (String[]args){

        Scanner input=new Scanner(System.in);
        
        int a,b,c,cevre,u;
        double alan;


        System.out.println("1.kenar uzunluðunu girin :");
        a=input.nextInt();
        System.out.println("2.kenar uzunluðunu girin :");
        b=input.nextInt();
        System.out.println("3.kenar uzunluðunu girin :");
        c=input.nextInt();

        cevre=a+b+c;
        u=cevre/2;

        alan=Math.sqrt(u * (u - a)* (u - b) * (u - c));
        System.out.println("Üçgenin alaný :"+alan);


    }
}
