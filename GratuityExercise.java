// Write your imports here if needed
import java.util.Scanner;

public class GratuityExercise {

    public static void main (String[] args){

        //Defining variables
        Scanner userInput = new Scanner(System.in);
        double subTotal, gratuityPercentage, gratuityDollar, gratuityTotal;

        //Accept User Input
        System.out.print("Enter the subtotal and a gratuity rate: ");
        subTotal = userInput.nextDouble();
        gratuityPercentage = userInput.nextDouble();

        //Calculate how much the gratuity is and add it to the subtotal
        gratuityDollar = ((gratuityPercentage/100) * subTotal);
        gratuityTotal = (subTotal + gratuityDollar);

        //Output Gratuity and Total
        System.out.print("\nThe gratuity is $" + (float)gratuityDollar + " and total is $" + (float)gratuityTotal);

    }// END MAIN
}//END PROGRAM

