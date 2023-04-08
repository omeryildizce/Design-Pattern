package designpatterns.strucrual.bridge.bridgeless;

public class App {
    public static void main(String[] args) {
        Muzik muzik = new Muzik("Sezen Aksu", "Gülümse");
        Bilgisayar bilgisayar = new Bilgisayar();
        bilgisayar.muzikCal(muzik);


    }
}
