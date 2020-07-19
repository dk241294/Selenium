package miscellaneous.Constructor;

public class Constructor {
    public Constructor() {
        System.out.println("no return type and same name of class execute when  object made");
    }

    //parametrized constructor
    public Constructor(String str) {
        System.out.println(str);
    }

    public void A() {
    }

    public static void main(String[] args) {
        Constructor c = new Constructor();
        Constructor ca = new Constructor("hello");

    }
}
