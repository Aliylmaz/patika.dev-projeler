import java.util.Scanner;
public class burcbulma {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int month, day;
        String burc = "";
        boolean isEror=false;
        System.out.print("Hangi ayda do�dunuz :");
        month=input.nextInt();

        System.out.print("Hangi g�nde do�dunuz :");
        day=input.nextInt();

        if(month==1){
            if (day>0 && day<=21){
                burc="O�lak";

            } else if (day>21 && day<=31) {
                burc="Kova";

            }else
                isEror=true;
        } else if (month==2) {
            if (day>0 && day<=19){
                burc="Kova";
            } else if (day>0 && day<=29) {
                burc="Bal�k";
            }else
                isEror=true;
        }else if (month==3) {
            if (day>0 && day<=20){
                burc="Bal�k";
            } else if (day>0 && day<=31) {
                burc="Ko�";
            }else
                isEror=true;
        }else if (month==4) {
            if (day>0 && day<=20){
                burc="Ko�";
            } else if (day>0 && day<=30) {
                burc="Bo�a";
            }else
                isEror=true;
        }else if (month==5) {
            if (day>0 && day<=21){
                burc="Bo�a";
            } else if (day>0 && day<=30) {
                burc="Ikizler";
            }else
                isEror=true;
        }else if (month==6) {
            if (day>0 && day<=19){
                burc="Ikizler";
            } else if (day>0 && day<=29) {
                burc="Yenge�";
            }else
                isEror=true;
        }else if (month==7) {
            if (day>0 && day<=22){
                burc="Yenge�";
            } else if (day>0 && day<=31) {
                burc="Aslan";
            }else
                isEror=true;
        }else if (month==8) {
            if (day>0 && day<=22){
                burc="Aslan";
            } else if (day>0 && day<=31) {
                burc="Ba�ak";
            }else
                isEror=true;
        }else if (month==9) {
            if (day>0 && day<=22){
                burc="Ba�ak";
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
                burc="O�lak";
            }else
                isEror=true;
        }if (month>12 || month<1){
            System.out.println("Hatal� giri� yapt�n�z. Tekrar deneyin !");
        } else if (isEror) {
            System.out.println("Hatal� giri� yapt�n�z. Tekrar deneyin !");
        }else
            System.out.println("Burcunuz :"+ burc);


    }
}
