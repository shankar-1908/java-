import java.util.Scanner;
interface Calculator
{
    double add(double num1, double num2);

    double subtract(double num1, double num2);

    double multiply(double num1, double num2);

    double divide(double num1, double num2);
}
class SimpleCalculator implements Calculator
{
    public double add(double num1, double num2)
    {
        return num1 + num2;
    }

    public double subtract(double num1, double num2)
    {
        return num1 - num2;
    }

    public double multiply(double num1, double num2)
    {
        return num1 * num2;
    }

    public double divide(double num1, double num2)
    {
        if (num2 == 0)
        {
            System.out.println("Division by zero is not possible.");
            return 0;
        }
        return num1 / num2;
    }
}
public class EXP5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        SimpleCalculator calculator = new SimpleCalculator();

        System.out.println("Choose Operation");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
	 System.out.print("Enter your choice:");
        int choice = sc.nextInt();

        System.out.print("First Number: ");
        double num1 = sc.nextDouble();

        System.out.print("Second Number: ");
        double num2 = sc.nextDouble();

        switch(choice)
        {
            case 1:
                System.out.println("Result = " + calculator.add(num1, num2));
                break;

            case 2:
                System.out.println("Result = " + calculator.subtract(num1, num2));
                break;

            case 3:
                System.out.println("Result = " + calculator.multiply(num1, num2));
                break;

            case 4:
                System.out.println("Result = " + calculator.divide(num1, num2));
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}        
