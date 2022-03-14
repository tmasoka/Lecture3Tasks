
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BasicCalc {
    public static void main(String[] args) throws IOException {

        float firstNumber, secondNumber, sum, subtraction, product, quotient;


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("The program calculates sum, difference, product and quotient for two numbers.");
        System.out.println("Enter the first number (and press Enter): ");
        firstNumber = Float.parseFloat(br.readLine());
        System.out.println("Enter the second number (and press Enter): ");
        secondNumber = Float.parseFloat(br.readLine());

        sum = firstNumber + secondNumber;
        subtraction = firstNumber - secondNumber;
        product = firstNumber * secondNumber;
        quotient = firstNumber / secondNumber;

        System.out.printf("You entered two numbers,the first is: " + "%2.2f" , firstNumber);
        System.out.printf(" and the second is: " + "%2.2f", secondNumber);

        System.out.println();//blank line

        System.out.printf("Sum = " + "%2.2f, \n", +sum);
        System.out.printf("Difference =" + "%2.2f, \n", +subtraction);
        System.out.printf("Product =" + "%2.2f, \n", +product);
        System.out.printf("Quotient = " + "%2.2f, \n", +quotient);


    }
}
