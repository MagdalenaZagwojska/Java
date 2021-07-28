public class Switch {

    public static void main(String[] args) {

    String danie = "kk";

    switch (danie) {
        case "Pizza":
            System.out.println("Cena pizzy to 22 zł.");
            break;
        case "Frytki":
            System.out.println("Cena frytek to 9 zł.");
            break;
        case "Burger":
            System.out.println("Cena burgera to 19 zł");
            break;
        default:
            System.out.println("Nie mamy takiej pozycji w karcie.");



    }
    }
}