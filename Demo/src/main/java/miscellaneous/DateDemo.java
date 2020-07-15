package miscellaneous;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d.toString());
        SimpleDateFormat df =new SimpleDateFormat();
        System.out.println(df.format(d));
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(dateFormat.format(d));
       // String dateFormat=
    }
}
