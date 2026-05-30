import java.util.Scanner;

public class SampleInput {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String name = "";

        StringBuilder sb = new StringBuilder("Tesda");
        sb.reverse();
        System.out.println("Enter a name");
        name = input.nextLine();
        System.out.println(name.equals(sb.toString())? "The input string is a pallindrome" : "The input string is not a pallindrome");

    }
    
}
