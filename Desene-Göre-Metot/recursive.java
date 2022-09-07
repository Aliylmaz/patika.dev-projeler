import java.util.Scanner;

public class main {
    static void recursive(int a) {
        if (a > 0) {
            System.out.println(a + "");
            recursive(a - 5);
        }
        System.out.println(a + "");

    }

    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayi giriniz:");
        n = input.nextInt();
        recursive(n);
    }
}
