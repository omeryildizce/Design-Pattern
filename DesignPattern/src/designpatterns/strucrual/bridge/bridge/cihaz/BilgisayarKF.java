package designpatterns.strucrual.bridge.bridge.cihaz;

import designpatterns.strucrual.bridge.bridge.Muzik;
import designpatterns.strucrual.bridge.bridge.muzikcalar.Fizy;
import designpatterns.strucrual.bridge.bridge.sescihazi.Kulaklik;

public class BilgisayarKF extends MuzikCalabilenBilgisayar {
    public BilgisayarKF() {
        sesCihazi = new Kulaklik();
        muzikCalar = new Fizy();
    }

    @Override
    public void muzikCal(Muzik muzik) {
        System.out.println("Bilgisayar çalıştı");
        super.muzikCal(muzik);
    }
}
