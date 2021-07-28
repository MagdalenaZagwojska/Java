import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        Scanner checker = new Scanner(System.in);
        System.out.println("Hello, give me your age");
        int age = checker.nextInt();
        if (age>=18) {
            System.out.println("Dziękujemy za zakupy.");
        } else if (age <0) {
            System.out.println("Podaj poprawną wartość");
        }
        else {
            System.out.println("Musisz mieć skończone 18 lat.");
        }
        }


    }
