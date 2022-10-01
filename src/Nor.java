public class Nor {
    public static void main(String[] args) {
        int[] array = {1, 5, 6, 4, 9, 7, 3, 8, 2};
        boolean abc = true;
        while (abc) {
            abc = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int g = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = g;
                    abc = true;
                }
            }
        }
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
//            System.out.print("---------");
        int[] array1 = {1, 5, 6, 4, 9, 7, 3, 8, 2};
        for (int i = 0; i < array1.length; i++) {
            for (int k = 1; k < array1.length - i; k++) {
                if (array1[k] > array1[k - 1]) {
                    int j = array1[k];
                    array1[k] = array1[k - 1];
                    array1[k - 1] = j;
                }
            }
        }
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
    }
}


