import java.util.Scanner;

public class MayinTarlasi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Satırı girin :");
        int a = input.nextInt();
        System.out.print("Sütün sayısını girin :");
        int b = input.nextInt();

        MineSweeper x = new MineSweeper(a, b);
        x.run();

    }
}
