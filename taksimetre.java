import java.util.Scanner;
public class taksimetre {
    public static void main(String []args){
        
        Scanner input=new Scanner(System.in);

        double km=2.20,ucret;
        int acilis=10,mesafe;
        System.out.println("gidilen km yi yaz�n�z :" );
        mesafe=input.nextInt();

        ucret=(mesafe*km)+acilis;

        System.out.println("�denecek Tutar :" +(ucret>20 ?  ucret : 20)+" T�rk liras�d�r.");

    }
}
