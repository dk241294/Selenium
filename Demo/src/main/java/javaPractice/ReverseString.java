package javaPractice;

public class ReverseString {
    public static void main(String[] args) {
        String a = "madam";
        StringBuilder b = new StringBuilder();
        int length = a.length();
        for (int i = length; i > 0; i--) {
            System.out.print(a.charAt(i - 1));
            b.append(a.charAt(i - 1));
        }
        if(a.contains(b)){
            System.out.println("palindrome");
        }
    }
}