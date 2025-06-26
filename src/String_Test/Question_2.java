package String_Test;

public class Question_2 {
    public static void main(String[] args) {
        String s1 = "Roma";
        String s2 = "Roma";
        String s3 = new String("Roma");
        String s4 = "roma";

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s2== s4);

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));

        System.out.println(s1.equalsIgnoreCase(s4));

        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s4.compareTo(s1));
        System.out.println(s1.compareTo(s4));
    }
}
