import java.util.Scanner;
public class ucakbiletihesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mesafe, yas, tip, tutar;
        double yasindirimorani;

        System.out.print("Mesafeyi km t�r�nden girin :");
        mesafe = input.nextInt();

        System.out.print("Ya��n�z� girin :");
        yas = input.nextInt();

        System.out.print("Yolculuk tipini girin : (\"1=> tek y�n\" \"2=> gidi� d�n��\") ");
        tip = input.nextInt();


        if ((mesafe > 0) && (yas > 0 && yas<100) && (tip == 1 || tip == 2)) {
            if (yas<12){
                yasindirimorani=0.50;
            } else if (yas>=12 && yas<=24) {
                yasindirimorani=0.10;
                
            } else if (yas >65) {
                yasindirimorani=0.30;
            }else
                yasindirimorani=0;


        double normaltutar,yasindirimi,indirimlitutar,gidisdonusindirim,toplamTutar;

        normaltutar=mesafe*0.10;
        yasindirimi=normaltutar*yasindirimorani;
        indirimlitutar=normaltutar-yasindirimi;
        gidisdonusindirim=indirimlitutar*0.20;

            if (tip==2){
            gidisdonusindirim=indirimlitutar*0.20;
            toplamTutar=(indirimlitutar-gidisdonusindirim)*2;

            }else{
            toplamTutar=indirimlitutar;
        }
            System.out.println("Normal tutar :"+normaltutar);
            System.out.println("Ya� indirimi :"+yasindirimi);
            System.out.println("�ndirimli tutar :"+indirimlitutar);
            System.out.println("Gidi� d�n�� indirimi :"+gidisdonusindirim);
            System.out.println("Toplam tutar(indirimli tutar-gidi� d�n�� bilet indirimi)*2 :"+toplamTutar);
        }else {
            System.out.println("Hatal� veri girdiniz.");
        }
    }
}
