import java.util.Scanner;
public class vucutkutleindeksi {
    public  static void main(String[]args){

        Scanner input=new Scanner(System.in);
        double height, kilo,index;

        System.out.print("enter height in meters :");
        height=input.nextDouble();
        System.out.print("enter your kilo :");
        kilo=input.nextDouble();

        index=kilo/(height*height);
        System.out.println("your index " +index);

        String str= 20<index && index<25 ? "your index is normal" : "you going to be fat dont eat more";
        System.out.println(str);

    }
}
