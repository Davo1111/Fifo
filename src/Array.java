public class Array {

    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int a = 9;
        for (int i = 0; i < array.length; i++) {
            array[i] = a--;
            System.out.print(array[i] + " ");

        }
        System.out.println();
        System.out.print("------");
        System.out.println();

        int[] array1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int a1 = 0;
        for (int i = 0; i < array1.length; i++) {
            array1[i] = a1++;
            System.out.print(array1[i] + " ");

        }
    }
}



















