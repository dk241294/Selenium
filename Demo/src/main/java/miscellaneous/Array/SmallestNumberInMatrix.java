package miscellaneous.Array;
/* 2 4 6
 * 1 2 3
 * 7 8 9*/

import com.sun.jdi.PathSearchingVirtualMachine;

public class SmallestNumberInMatrix {
    public static void main(String[] args) {
        int a[][] = {{2, 4, 6}, {44, 68, 3}, {7, 8, 66}};
        int smallest = a[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (smallest > a[i][j]) {
                    smallest = a[i][j];

                }

            }
        }
        System.out.println(smallest);
    }
}
