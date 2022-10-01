public class test1 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("------------------------");

        int i = 0;
        while (i < 100) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();
        System.out.println("------------------------");

        for (int j = 0; j < 100; j++) {
            if (j % 3 == 0) {
                System.out.print(j + " ");
            }
        }
        System.out.println();
        System.out.println("------------------------");

        for (int i2 = 0; i2 < 11; i2++) {
            System.out.println(" i2 is " + i2);
            System.out.println("--------------------");
            int j = 0;
            while (j < 11) {
                System.out.println("j is " + j);
                j++;

            }
        }
        System.out.println();
        System.out.println("------------------------");


        int x;
        for (x = 0; x < 40; x++) {
            int z;
            for (z = x; z < 13; z++)
                System.out.print("*");
            System.out.println();
        }
    }
}



