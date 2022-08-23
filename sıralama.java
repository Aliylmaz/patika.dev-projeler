import java.util.Scanner;

public class sýralama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a, b, c;

        System.out.print("1.sayýyý girin :");
        a = input.nextInt();
        System.out.print("2.sayýyý girin :");
        b = input.nextInt();
        System.out.print("3.sayýyý girin :");
        c = input.nextInt();


        if (a < b && a < c) {
            if (b < c) {
                System.out.println("a<b<c");
            } else {
                System.out.println("a<c<b");
            }
        } else if (b < a && b < c) {
            if (a < c) {
                System.out.println("b<a<c");
            } else {
                System.out.println("b<c<a");
            }
        } else if (c < a && c < b) {
            if (a < b) {
                System.out.println("c<a<b");
            } else {
                System.out.println("c<b<a");
            }
        } else if (a == b && a == c) {
            System.out.println("a=b=c");
        } else if (a == b && c > a) {
            System.out.println("a=b<c");
            if (a > c) {
                System.out.println("c<a=b");
            }

        } else if (b == c && a > b) {
            System.out.println("b=c<a");
            if (b > c) {
                System.out.println("a<b=c");
            }
        } else if (a == c && b > a) {
            System.out.println("a=c<b");

            } else if (a==c && b<a) {
            System.out.println("b<a=c");

        }


    }

}