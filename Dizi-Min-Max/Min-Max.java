public class diziMinMax {
    public static void main(String[] args) {
        int[] list = {-6, -50, 56, 213, 75, 4123, 3, 21, -31};

        int min = list[0];
        int max = list[0];

        for (int i : list) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Minimum değer :" + min);
        System.out.println("Maksimum deper :" + max);


    }
}
