import java.util.Scanner;

public class SampleInput {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String name1, name2 = "";
        System.out.println("Enter a string:");
        name1 = input.nextLine();
        System.out.println("Input String1:" + " " + name1);
        name2 = input.nextLine();
        System.out.println("Input String2:" + " " + name2);
        StringBuilder sb = new StringBuilder(name1);
        sb.reverse();
        System.out.println("Reverse String: " + sb);
        
        //BooleanExp
        System.out.println(sb.toString().equals(name2)? "The input string is a palindrome" : "The input string is not a palindrome");

        /* If then else 
        if(sb.toString().equals(name2))
            System.out.println("The input string is a palindrome");
        else
            System.out.println("The input string is not a palindrome");
        */

    }
    
}
