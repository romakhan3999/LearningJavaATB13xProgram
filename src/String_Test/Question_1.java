package String_Test;

public class Question_1 {
    public static void main(String[] args) {
        String first_name = "Roma";
        String last_name = " Khan";

        String full_name = first_name + last_name;
        System.out.println(full_name);

        System.out.println(full_name.length());

        String sub_string = full_name.substring(0,4);
        System.out.println(sub_string);

        System.out.println(full_name.charAt(2));
    }
}
