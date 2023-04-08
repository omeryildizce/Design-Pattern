package designpatterns.strucrual.bridge.bridge.cihaz;

import designpatterns.strucrual.bridge.bridge.Muzik;
import designpatterns.strucrual.bridge.bridge.muzikcalar.MuzikCalar;
import designpatterns.strucrual.bridge.bridge.sescihazi.SesCihazi;

public abstract class MuzikCalabilenBilgisayar {
    protected SesCihazi sesCihazi;
    protected MuzikCalar muzikCalar;

    public MuzikCalabilenBilgisayar() {
    }

    public MuzikCalabilenBilgisayar(SesCihazi sesCihazi, MuzikCalar muzikCalar) {
        this.sesCihazi = sesCihazi;
        this.muzikCalar = muzikCalar;
    }

    public void muzikCal(Muzik muzik){
        String ses = muzikCalar.muzikCal(muzik);
        sesCihazi.sesiCal(ses);
    }
}

