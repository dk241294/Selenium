package Collection;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(2);
        a.add(31);
        a.add(21);
        a.add(34);
        a.add(25);
        a.add(35);
        System.out.println( a.get(1));;
        a.remove(2);
        a.remove(Integer.valueOf(21));
        System.out.println(a);
        System.out.println( a.indexOf(31));
        System.out.println(a.contains(31));;
    }
}
