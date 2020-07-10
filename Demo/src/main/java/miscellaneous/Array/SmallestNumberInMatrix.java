package miscellaneous.Array;
/* 2 4 6
 * 1 2 3
 * 7 8 9*/

import com.sun.jdi.PathSearchingVirtualMachine;

public class SmallestNumberInMatrix {
    public static void main(String[] args) {
        SmallestNumberInMatrix sb = new SmallestNumberInMatrix();
        sb.max();
        sb.maxInCol();


    }

    public void max() {
        int a[][] = {{222, 4, 6}, {44, 68, 3}, {7, 8, 66}};
        int smallest = a[0][0];
        int biggest = a[0][0];
        int col = 0;
        int j;
        for (int i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if (smallest > a[i][j]) {
                    smallest = a[i][j];
                    col = j;

                }
            }
            if (smallest < a[i][col]) {
                biggest = a[i][col];
            }


        }


        System.out.println(smallest);
        System.out.println(biggest);

    }

    public void maxInCol() {

    }
}
