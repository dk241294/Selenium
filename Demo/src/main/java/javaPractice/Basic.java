package javaPractice;

/*
class{
   method(){
           variable
          --->first  make  object then
            method call
            variable call if static then call directly

            want to call other class method  just make object of that class


}
*/
public class Basic {
    int a = 4;

    public static void main(String[] args) {
       // System.out.println(a);
        System.out.println("hello");
        Basic a = new Basic();
        a.B();
        System.out.println(a.a);
        Second sn= new Second();
        sn.add();
    }

    public void B() {
        System.out.println("deeepak");
        Basic b = new Basic();
        b.d();
        System.out.println(b.a);
        //  a.B();
    }

    public void d() {
        int d=5;
        System.out.println("lapak");
        System.out.println();
    }
}

