
public class repNumbers {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {3, 5, 6, 15, 5, 7, 6, 3,2,2,2,8,9,10,10};

        int[] ciftsayi = new int[list.length];
        int startIndex = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) ;
                if (!isFind(ciftsayi, list[i]))
                    ciftsayi[startIndex++] = list[i];
                break;

            }


        }
        for (int value : ciftsayi) {
            if (value != 0 && value % 2 != 1) {
                System.out.println(value);
            }
        }


    }
