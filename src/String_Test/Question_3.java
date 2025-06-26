package String_Test;

public class Question_3 {
    public static void main(String[] args) {
        int count = 100000;

//        For String

        long start_string = System.currentTimeMillis();
        String s = "";

        for (int i = 0; i <count ; i++) {
            s = s + "a";

        }
        long end_string = System.currentTimeMillis();
        System.out.println("For String, Time used : " + ( end_string - start_string) +" ms");

//        For String Builder

        long start_sb = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append("a");

        }
        long end_sb = System.currentTimeMillis();
        System.out.println("For String Builder, Time used : " + ( end_sb - start_sb) +" ms");

//   For String Buffer

        long start_sbf = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer();

        for (int i = 0; i < count; i++) {
            sbf.append("a");

        }
        long end_sbf = System.currentTimeMillis();
        System.out.println("For String Buffer, Time used : " + ( end_sbf - start_sbf) +" ms");





    }
}
