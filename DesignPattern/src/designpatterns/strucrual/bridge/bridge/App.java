package designpatterns.strucrual.bridge.bridge;


import designpatterns.strucrual.bridge.bridge.cihaz.BilgisayarKF;
import designpatterns.strucrual.bridge.bridge.cihaz.Telefon;
import designpatterns.strucrual.bridge.bridge.muzikcalar.Fizy;
import designpatterns.strucrual.bridge.bridge.muzikcalar.Spotify;
import designpatterns.strucrual.bridge.bridge.sescihazi.Kulaklik;

public class App {
    public static void main(String[] args) {
       Muzik muzik = new Muzik("Sezen Aksu", "Gülümse");
        BilgisayarKF bilgisayarKF = new BilgisayarKF();
        bilgisayarKF.muzikCal(muzik);

        System.out.println("********************************************");
        Telefon telefon = new Telefon(new Kulaklik(), new Fizy());
        telefon.muzikCal(muzik);

        System.out.println("********************************************");
        Telefon telefon1 = new Telefon(new Kulaklik(), new Spotify());
        telefon1.muzikCal(muzik);
    }
}
