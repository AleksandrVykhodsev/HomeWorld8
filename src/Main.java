public class Main {
    public static void main(String[] args) {
        //Задача 1
        int [] a = new int[3];
        a [0] = 1;
        a [1] = 2;
        a [2] = 3;

        double [] b = {1.57, 7.654, 9.986};

        int [] c = {74, 54, 83, 68, 12};

        //Задача 2
        for (int i = 0; i < a.length; i++ ) {
            System.out.print(a[i]);
            if (i != a.length - 1){
                System.out.print(", ");
            }

        }
        System.out.println();
        for (int i = 0; i < b.length; i++ ) {
            System.out.print(b[i]);
            if (i != b.length - 1){
                System.out.print(", ");
            }

        }
        System.out.println();
        for (int i = 0; i < c.length; i++ ) {
            System.out.print(c[i]);
            if (i != c.length - 1){
                System.out.print(", ");
            }

        }
        System.out.println();

        //Задача 3
        for (int i = a.length - 1; i >= 0 ; i-- ) {
            System.out.print(a[i]);
            if (i != 0){
                System.out.print(", ");
            }

        }
        System.out.println();
        for (int i = b.length - 1; i >= 0 ; i-- ) {
            System.out.print(b[i]);
            if (i != 0){
                System.out.print(", ");
            }

        }
        System.out.println();
        for (int i = c.length - 1; i >= 0 ; i-- ) {
            System.out.print(c[i]);
            if (i != 0){
                System.out.print(", ");
            }

        }
        System.out.println();
        //Задача 4
        for (int i = 0; i < a.length; i++ ){
            if (a[i] % 2 != 0) {
                a[i] += 1;
            }
            System.out.println(a[i]);
        }


    }
}