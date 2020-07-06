package miscellaneous.Inheritance;

public class Overloading {
    public static void main(String[] args) {
        Overloading a = new Overloading();
        a.color("red");
        a.color("red", "green");

    }

    public void color(String a) {
        System.out.println(a);
    }

    public void color(String a, String b) {
        System.out.println(a + "and" + b);
    }
}
