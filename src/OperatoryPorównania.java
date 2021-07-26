import java.util.Scanner;

public class OperatoryPorównania {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a first number");
        int firstNumber = scanner.nextInt();
        System.out.println("Give me a second number");
        int secondNumber = scanner.nextInt();

        // = przypisanie wartości == porównanie wartości

        System.out.println("First number > Second number: " + (firstNumber > secondNumber));
        System.out.println("First number < Second number: " + (firstNumber < secondNumber));
        System.out.println("First number >= Second number: " + (firstNumber >= secondNumber));
        System.out.println("First number <= Second number: " + (firstNumber <= secondNumber));
        System.out.println("First number == Second number: " + (firstNumber == secondNumber));
        System.out.println("First number != Second number: " + (firstNumber != secondNumber));
    }
}
