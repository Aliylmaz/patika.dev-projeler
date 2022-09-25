import java.util.Scanner;
public class havasicakligi {
    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);

        int derece;

        System.out.println("Hava kaç derece  :");
        derece=input.nextInt();

        if (derece<5 && derece>-90){
            System.out.println("Kayak yapabilirsin");
        } else if (derece>=10 && derece<= 15) {
            System.out.println("Hem sinema hem de piknik yapabilirsin.");

        } else if (derece>5 && derece<15) {
            System.out.println("Sinemaya gidebilirsin.");


        } else if (derece>10 && derece<25) {
            System.out.println("Piknik yapabilirsin.");
            
        } else if (derece>=25 && derece<60) {
            System.out.println("Yüzebilirsin.");

        }else  {
            System.out.println("Böyle bir sıcaklık değeri yok");
        }


    }
}
