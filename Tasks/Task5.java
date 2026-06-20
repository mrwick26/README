package Tasks;

import java.util.Scanner;

public class Task5 {
    
    public static void main(String[] args) {
        
        int firstNum = 0;
        int secondNum = 0;
        int thirdNum = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        firstNum = input.nextInt();
        secondNum = input.nextInt();
        thirdNum = input.nextInt();

        String largestNum = "The largest number is ";
        System.out.println("First number: " + firstNum + "\n"
            + "Second number: " + secondNum + "\n"
            + "Third number: " + thirdNum);

        if (firstNum == secondNum && secondNum == thirdNum) {
            System.out.println("All numbers are equal");
        }else if(firstNum >= secondNum && firstNum >= thirdNum){
            System.out.println(largestNum + "the first number, which is: " + firstNum);
        }else if (secondNum >= firstNum && secondNum >= thirdNum) {
            System.out.println(largestNum + "the second number, which is: " + secondNum);
        }else if (thirdNum >= firstNum && thirdNum >= secondNum) {
            System.out.println(largestNum + "the third number, which is: " + thirdNum);
        }
    }
}
