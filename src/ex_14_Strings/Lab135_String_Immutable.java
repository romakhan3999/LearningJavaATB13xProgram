package ex_14_Strings;

public class Lab135_String_Immutable {
    public static void main(String[] args) {
        String name = "Roma"; //SCP
//        name.toUpperCase();
        name = name.toUpperCase(); // Reassigning //ROMA
        System.out.println(name); //Older Value will print.Need to assign
    }
}
