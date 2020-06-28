package javaPractice;

public class NestedLoop {
    public static void main(String[] args) {
//        for (int i = 0; i < 4; i++) {
//            System.out.println("outer loop");
//            for (int j = 0; j <= i; j++) {
//                System.out.println("inner loop");
//            }
//        }
        pattern42();
    }

    public static void pattern11() {
        int count = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println("");
        }

    }

    public static void pattern12() {
        int count = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println("");
        }

    }

    public static void pattern21() {
        int count = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println("");
        }

    }

    public static void pattern22() {
        int count = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println("");
        }


    }

    public static void pattern31() {
        //int count = 1;
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
                //count++;
            }
            System.out.println("");
        }


    }
    public static void pattern41() {
        int count = 3;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(count + " ");
                count=count+3;
            }
            System.out.println("");
        }

    }
    public static void pattern42() {
        int count = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(count*3 + " ");
                count++;
            }
            System.out.println("");
        }

    }
}
