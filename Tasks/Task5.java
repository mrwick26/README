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

        System.out.println(firstNum + "" + secondNum + "" + thirdNum);

    }
}
