public class OperatoryLogiczne {
    public static void main(String[] args) {
        boolean firstValue = true;
        boolean secondValue = false;
        boolean thirdValue = true;
        boolean fourthValue = false;

        // && -> true gdy wyrażenia składowe są różne true
        System.out.println(firstValue && secondValue);
        System.out.println(firstValue && thirdValue);

        // || lub -> jedno musi być true
        System.out.println(firstValue||secondValue); // true
        System.out.println(secondValue||fourthValue); // false

        // ! negacja -> zwraca wartość przeciwną
        System.out.println(!firstValue);   // false
        System.out.println(!secondValue);   // true
    }
}
