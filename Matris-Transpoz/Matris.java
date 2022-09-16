public class MatrisTranspoz {
    public static void main(String[] args) {

        int[][] arr = new int[2][3];
        int[][] arr2 = new int[3][2];

        System.out.println("Matris");
        int num = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = num++;
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println("Matrisin Transpozu ");
        for (int i = 0; i < arr.length + 1; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr2[i][j] = arr[j][i];
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }


    }
}
