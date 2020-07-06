package miscellaneous.Inheritance;

public class Mercedes  extends Car{
    public void engine(){
        System.out.println("mercedes engine");

    }

    public static void main(String[] args) {
        Mercedes m =  new Mercedes();
        m.engine();
        m.color();
        m.gear();

    }
}
