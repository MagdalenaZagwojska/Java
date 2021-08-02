public class AutoTest {
    public static void main(String[] args) {

        Auto mercedes = new Auto();
        mercedes.marka = "Mercedes";
        mercedes.model = "Klasa S";
        mercedes.przebieg = 200;
        mercedes.rok = 2021;
        mercedes.kolor = "niebieski";

        mercedes.jedź();
        mercedes.hamuj();
        mercedes.info();

        Auto audi = new Auto();
        audi.marka = "Audi";
        audi.model = "A5";
        audi.rok = 2020;
        audi.przebieg = 0;
        audi.kolor = "biały";

        audi.info();

        Auto fiat = new Auto();
        fiat.jedź();
        fiat.hamuj();
        fiat.info();


    }
}
