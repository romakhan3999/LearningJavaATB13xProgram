package ex_16_Arrays;

public class Lab158_String_CLI_ForEach_Loop {
    public static void main(String[] roma) {
//        10, Roma, true

        for (int i = 0; i < roma.length; i++) {
            System.out.println(roma[i]);
            
        }
        System.out.println("------For Each-----");

        for(String arg: roma)
        {
            System.out.println(arg);
        }
    }
}
