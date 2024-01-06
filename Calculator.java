import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for(;;) {

        System.out.println("Enter the first number : " );
        double num1 = input.nextDouble();

        System.out.println("Enter the second number: ");
        double num2 = input.nextDouble();

        System.out.println("Enter the operator (+, -, *, /) or press '=' to exit: ");
        String operator = input.next();

        if(operator.equals("=")) {
            break;
        }

        double result;

        switch(operator) {
            case "+": 
                result = num1 + num2;
                System.out.println("num1" + " + " + "num2" + " = " + result);
                break;
            case "-":
                result = num1 - num2;
                System.out.println("num1" + " - " + "num2" + " = " + result);
                break;
            case "*":
                result = num1 * num2;
                System.out.println("num1" + " * " + "num2" + " = " + result);
                break;
            case "/":
                result = num1 / num2;
                System.out.println("num1" + " / " + "num2" + " = " + result);
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }

        System.out.println("The result is: "+result);
        }
    }
}