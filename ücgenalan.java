import java.util.Scanner;
public class �cgenalan {

    public  static void main (String[]args){

        Scanner input=new Scanner(System.in);
        
        int a,b,c,cevre,u;
        double alan;


        System.out.println("1.kenar uzunlu�unu girin :");
        a=input.nextInt();
        System.out.println("2.kenar uzunlu�unu girin :");
        b=input.nextInt();
        System.out.println("3.kenar uzunlu�unu girin :");
        c=input.nextInt();

        cevre=a+b+c;
        u=cevre/2;

        alan=Math.sqrt(u * (u - a)* (u - b) * (u - c));
        System.out.println("��genin alan� :"+alan);


    }
}
