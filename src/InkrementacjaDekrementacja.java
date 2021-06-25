public class InkrementacjaDekrementacja {
    public static void main(String[] args) {
        int a = 0;
        System.out.println("Wartość a: " + a); //0
        int b = a++;
        System.out.println("Wartość b: " +b); // 0
        System.out.println("Wartość a: " + a); //1
        int c = ++a;
        System.out.println("Wartość c: " +c); //2
        System.out.println("Wartość a: " +a); //2
    }
}
