package miscellaneous.Array;

public class PracticeArray {
    public int j;
    int c[] = {1, 2, 3};

    public static void main(String[] args) {
        int a[] = new int[3];
        a[0] = 10;
        a[1] = 2;
        a[2] = 25;
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        int b[] = {2, 32, 566, 66};
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
        // j=0;
        PracticeArray p = new PracticeArray();
        p.a();
    }

    public void a() {
        c[1] = 22;
        j = 0;
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }
}
