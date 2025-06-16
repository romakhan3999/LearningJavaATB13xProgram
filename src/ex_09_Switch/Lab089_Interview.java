package ex_09_Switch;

public class Lab089_Interview {
    public static void main(String[] args) {
        char ch = 'A';
        switch (ch) //65 because Char is also Integer
        {
            case 65:
                System.out.println("Match ASCII");
                break;
            default:
                System.out.println("No Match");
        }

    }
}
