import  java.util.Scanner;
public class projects {

    public static void main(String[] args){


        Scanner input = new Scanner(System.in);

        int mat,fizik,kimya,biyoloji,beden,felsefe;

        System.out.print("Matematik notunuzu girin :");
        mat=input.nextInt();

        System.out.print("fizik notunuzu girin :");
        fizik=input.nextInt();

        System.out.print("kimya notunuzu girin :");
        kimya=input.nextInt();

        System.out.print("biyoloji notunuzu girin :");
        biyoloji=input.nextInt();

        System.out.print("Beden notunuzu girin :");
        beden=input.nextInt();

        System.out.print("Felsefe notunuzu girin :");
        felsefe=input.nextInt();

        double ortalama =(mat+fizik+kimya+biyoloji+beden+felsefe)/6;
        System.out.println("Ortalamanýz :"+ortalama);

        String str= ortalama >=60 ? " Tebrikler geçtiniz" : "Üzgünüm Kaldýnýz";
        System.out.println(str);






    }

}
