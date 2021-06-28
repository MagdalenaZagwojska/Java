import java.util.Scanner;

public class homeworkCalculator {
    public static void main(String[] args) {
        Scanner pingwin = new Scanner(System.in);
        System.out.println("Hello, give me a first number: ");
        int firstNumber = pingwin.nextInt();
        System.out.println("First number is: " + firstNumber);
        System.out.println("And now, give me a second number: ");
        int secondNumber = pingwin.nextInt();
        System.out.println("Second number is: " + secondNumber);
        int resultOfAddition = firstNumber +secondNumber;
        System.out.println("The result of adding the first number and the second number is " + resultOfAddition);

    }
}
