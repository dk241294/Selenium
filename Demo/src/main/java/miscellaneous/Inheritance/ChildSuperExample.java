package miscellaneous.Inheritance;

public class ChildSuperExample  extends  ParentSuperExample{
    String name ="kumar";
    public void getData(){
        System.out.println(name);
        System.out.println(super.name);
    }

    public static void main(String[] args) {
        ChildSuperExample childSuperExample=new ChildSuperExample();
        childSuperExample.getData();
    }
}
