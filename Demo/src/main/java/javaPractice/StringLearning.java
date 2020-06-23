package javaPractice;

public class StringLearning {
    /* String a="hello";
    String b="hello";{instead of allocating new memory same is refrenced to to b ,}
    String c="abcd"{new memory is allocated}
    String A =new String(Hello);
    String A =new String(Hello);{but whenever new is used seperate memory is allocated in the heap}
    * */
    public static void main(String[] args) {
        String a= " learningJava";
        System.out.println("length of String "+a.length());
        System.out.println("triming the space "+a.trim());
        System.out.println(a.indexOf("ea"));
        System.out.println(""+a.contains("ng"));
        a=a.trim();
        System.out.println(a.charAt(3));
        System.out.println(a.concat(" is fun"));
        System.out.println(a.substring(2,6));
        System.out.println(a.substring(2));
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());
        System.out.println(a.indexOf("p"));
        System.out.println(a.indexOf("java"));


    }
}
