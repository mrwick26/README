package Tasks;
/**
 * @author 
 * 
 * 
 * 
 * manongnimo's
 * 
 * 
 * 
 *This is created by mrwick26
 * 
 */
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNum = input.nextInt();

        System.out.print("Enter the second number: ");
         int secondNum = input.nextInt();

        int sum = firstNum + secondNum;
        int difference = firstNum - secondNum;
        int product = firstNum * secondNum;
        int quotient = firstNum / secondNum;

        System.out.println("The sum of the two numbers is: " + sum);
        System.out.println("The difference of the two numbers is: " + difference);
        System.out.println("The product of the two numbers is: " + product);
        System.out.println("The quotient of the two numbers is: " + quotient);

        input.close();
    }
}