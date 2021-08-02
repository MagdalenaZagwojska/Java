public class Auto {
    public String marka;
    public String model;
    public Integer rok;
    public Integer przebieg;
    public String kolor;

    public void jedź() {
        System.out.println("Jedź");
    }

    public void hamuj() {
        System.out.println("Hamuj");
    }

    public void info() {
        System.out.println("Marka to: " + marka);
        System.out.println("Model to: " + model);
        System.out.println("Rok produkcji to: " + rok);
        System.out.println("Przebieg to: " + przebieg);
        System.out.println("Kolor to: " + kolor);
    }

}
