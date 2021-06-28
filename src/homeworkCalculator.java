import java.util.Scanner;

public class homeworkCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, give me a first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("First number is: " + firstNumber);
        System.out.println("And now, give me a second number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Second number is: " + secondNumber);
        int resultOfAddition = firstNumber + secondNumber;
        int resultOfSubtraction = firstNumber - secondNumber;
        int resultOfMultiplication = firstNumber * secondNumber;
        int resultOfDivision = firstNumber / secondNumber;
        System.out.println("The result of the addition is " + resultOfAddition);
        System.out.println("The result of the subtraction is " + resultOfSubtraction);
        System.out.println("The result of the multiplication is " + resultOfMultiplication);
        System.out.println("The result of the division is " + resultOfDivision);

    }
}
