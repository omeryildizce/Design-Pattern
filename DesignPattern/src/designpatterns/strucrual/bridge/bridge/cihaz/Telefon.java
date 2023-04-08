package designpatterns.strucrual.bridge.bridge.cihaz;

import designpatterns.strucrual.bridge.bridge.Muzik;
import designpatterns.strucrual.bridge.bridge.muzikcalar.MuzikCalar;
import designpatterns.strucrual.bridge.bridge.sescihazi.SesCihazi;

public class Telefon extends MuzikCalabilenBilgisayar {
    public Telefon(SesCihazi sesCihazi, MuzikCalar muzikCalar) {
        super(sesCihazi, muzikCalar);
    }

    @Override
    public void muzikCal(Muzik muzik) {
        System.out.println("Telefon müzik çalıyor");
        super.muzikCal(muzik);
    }
}
