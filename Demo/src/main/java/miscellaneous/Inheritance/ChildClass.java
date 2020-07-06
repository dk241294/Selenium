package miscellaneous.Inheritance;

public class ChildClass extends  ParentClassDemo {
    public static void main(String[] args) {
        ChildClass cc = new ChildClass();
        cc.colour();
        cc.audioSystem();
        cc.brakes();
        cc.gear();


    }
//    public void colour(){
//        System.out.println(color);  {inheritance}
//    }
    public void colour(){
        System.out.println("yellow");
    }
}
