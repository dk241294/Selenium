package miscellaneous.Inheritance;

public class thisDemo {
    int a = 3; //this refers to current object and object scope lie in class level

    public void getData() {
        int a = 2;

        System.out.println(a);
        System.out.println(a + this.a);
        System.out.println(this.a);
    }

    public static void main(String[] args) {
        thisDemo d = new thisDemo();
        d.getData();

    }
}
