import java.util.Scanner;

public class InputSample {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //int a, b = 0;
        /*System.out.println();
        int a, b = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        a = input.nextInt();
        System.out.println("Enter second number");
        b = input.nextInt();
        System.out.println("The sum of two numbers is" + " " + (a+b));

        //Odd or Even
        System.out.println("Enter a number");
        int c = input.nextInt();
        System.out.println(
        //(booleanExp)? true : false
        ((c%2)==0) ? "even" : "odd"
        );*/

        //StringBuilder sb1 = new StringBuilder(4);
        StringBuilder sb2 = new StringBuilder("Tesda");
        //a = input.nextInt();
        //System.out.println(sb1.reverse());
        /*System.out.println(sb1);
        System.out.println(sb2);
        System.out.println("Enter a number");
        a = input.nextInt();*/
        System.out.println(sb2.length()-1);
        System.out.println(sb2.charAt(4));

        String ab = "";
        ab = input.nextLine();
        System.out.println(ab);
        StringBuilder sb3 = new StringBuilder(ab);
        sb3.reverse();
        System.out.println(sb3);
        //System.out.println(ab.equals(sb3)? true: false);
        System.out.println(ab.equals(sb3.toString())? true : false);

        /*if(ab.equals(sb3.toString())){
            System.out.println("The input string is a palindrome");
        }
        else{
            System.out.println("The input string is not a palindrome");
        }*/

    }
    
}
