package BankApp.MoneyManagement;

import java.util.Scanner;

public class CashInOut{
    
    
    

    public static void main(String[] args) {

        int currentBalance = 0;
        int cash = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Cash In: ");
        cash = input.nextInt();


        if(currentBalance <= cash){
            
        }

        if (cash >= currentBalance) {
            System.out.println("Not enough gold");
            System.out.println("Current balance: " + currentBalance);
        }else{
            currentBalance = currentBalance + cash;
            System.out.println("Current balance: " + currentBalance);

            System.out.print("Cash out: ");
            cash = input.nextInt();

            currentBalance = currentBalance - cash;
            System.out.println("Current balance: " + currentBalance);
        }

    }

}