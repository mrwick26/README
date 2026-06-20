package Tasks;

import java.util.Scanner;

public class Task5 {
    
    public static void main(String[] args) {
        
        int firstNum = 0;
        int secondNum = 0;
        int thirdNum = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        System.out.print("First number: ");
        firstNum = input.nextInt();
        System.out.print("Second number: ");
        secondNum = input.nextInt();
        System.out.print("Third number: ");
        thirdNum = input.nextInt();

        String largestNum = "The largest number is ";

        if (firstNum == secondNum && secondNum == thirdNum) {
            System.out.println("All numbers are equal");
        }else if(firstNum >= secondNum && firstNum >= thirdNum){
            System.out.println(largestNum + "the first number, which is: " + firstNum);
        }else if (secondNum >= firstNum && secondNum >= thirdNum) {
            System.out.println(largestNum + "the second number, which is: " + secondNum);
        }else if (thirdNum >= firstNum && thirdNum >= secondNum) {
            System.out.println(largestNum + "the third number, which is: " + thirdNum);
        }

        input.close();
    }
}
