public class OperatoryMatematyczne {

    public static void main(String[] args) {
        float firstNumber = 4F;
        float secondNumber =6F;

        float addition = firstNumber + secondNumber;
        float subtraction = firstNumber - secondNumber;
        float multiplication = firstNumber * secondNumber;
        float division = firstNumber / secondNumber;
        float mod = secondNumber % firstNumber;

        System.out.println("Wynik dodawania " + addition);
        System.out.println("Wynik odejmonwania " + subtraction);
        System.out.println("Wynik mnożenia " + multiplication);
        System.out.println("Wynik dzielenia " + division);
        System.out.println("Modulo  " + mod);

    }
}
