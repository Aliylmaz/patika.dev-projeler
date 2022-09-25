import java.util.Scanner;
public class burcbulma {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int month, day;
        String burc = "";
        boolean isEror=false;
        System.out.print("Hangi ayda doğdunuz :");
        month=input.nextInt();

        System.out.print("Hangi günde doğdunuz :");
        day=input.nextInt();

        if(month==1){
            if (day>0 && day<=21){
                burc="Oğlak";

            } else if (day>21 && day<=31) {
                burc="Kova";

            }else
                isEror=true;
        } else if (month==2) {
            if (day>0 && day<=19){
                burc="Kova";
            } else if (day>0 && day<=29) {
                burc="Balık";
            }else
                isEror=true;
        }else if (month==3) {
            if (day>0 && day<=20){
                burc="Balık";
            } else if (day>0 && day<=31) {
                burc="Koç";
            }else
                isEror=true;
        }else if (month==4) {
            if (day>0 && day<=20){
                burc="Koç";
            } else if (day>0 && day<=30) {
                burc="Boğa";
            }else
                isEror=true;
        }else if (month==5) {
            if (day>0 && day<=21){
                burc="Boğa";
            } else if (day>0 && day<=30) {
                burc="Ikizler";
            }else
                isEror=true;
        }else if (month==6) {
            if (day>0 && day<=19){
                burc="Ikizler";
            } else if (day>0 && day<=29) {
                burc="Yengeç";
            }else
                isEror=true;
        }else if (month==7) {
            if (day>0 && day<=22){
                burc="Yengeç";
            } else if (day>0 && day<=31) {
                burc="Aslan";
            }else
                isEror=true;
        }else if (month==8) {
            if (day>0 && day<=22){
                burc="Aslan";
            } else if (day>0 && day<=31) {
                burc="Başak";
            }else
                isEror=true;
        }else if (month==9) {
            if (day>0 && day<=22){
                burc="Başak";
            } else if (day>0 && day<=30) {
                burc="Terazi";
            }else
                isEror=true;
        }else if (month==10) {
            if (day>0 && day<=22){
                burc="Terazi";
            } else if (day>0 && day<=29) {
                burc="Akrep";
            }else
                isEror=true;
        }else if (month==11) {
            if (day>0 && day<=21){
                burc="Akrep";
            } else if (day>0 && day<=30) {
                burc="Yay";
            }else
                isEror=true;
        }else if (month==12) {
            if (day>0 && day<=21){
                burc="Yay";
            } else if (day>0 && day<=31) {
                burc="Oğlak";
            }else
                isEror=true;
        }if (month>12 || month<1){
            System.out.println("Hatalı giriş yaptınız. Tekrar deneyin !");
        } else if (isEror) {
            System.out.println("Hatalı giriş yaptınız. Tekrar deneyin !");
        }else
            System.out.println("Burcunuz :"+ burc);


    }
}
