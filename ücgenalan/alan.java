import java.util.Scanner;
public class ücgenalan {

    public  static void main (String[]args){

        Scanner input=new Scanner(System.in);
        
        int a,b,c,cevre,u;
        double alan;


        System.out.println("1.kenar uzunluğunu girin :");
        a=input.nextInt();
        System.out.println("2.kenar uzunluğunu girin :");
        b=input.nextInt();
        System.out.println("3.kenar uzunluğunu girin :");
        c=input.nextInt();

        cevre=a+b+c;
        u=cevre/2;

        alan=Math.sqrt(u * (u - a)* (u - b) * (u - c));
        System.out.println("Üçgenin alanı :"+alan);


    }
}
