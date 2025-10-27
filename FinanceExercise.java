// Write your imports here if needed

import java.util.Scanner;

public class FinanceExercise {
    public static void main(String[] args){

        //defining variables
        Scanner userInput = new Scanner(System.in);
        double futureInvestmentValue, investmentAmount, monthlyInterestRate, numberOfYears;

        //Prompts user for capital
        System.out.print("Enter Investment amount: ");
        investmentAmount = userInput.nextDouble();

        //prompts user for APR
        System.out.print("\nEnter annual rate in percentage: ");
        monthlyInterestRate = userInput.nextDouble();
        monthlyInterestRate /= 1200; // multiplied 1/12 and 1/100 for one conversion factor 1/1200

        //Prompts user for time duration
        System.out.print("\nEnter number of years: ");
        numberOfYears = userInput.nextDouble();

        //Calculates total Yield
        futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate), (12 * numberOfYears));

        //Outputs total Yield
        System.out.print("\nAccumulated value is $" + (float)futureInvestmentValue);


    }//END MAIN
}//END PROGRAM

