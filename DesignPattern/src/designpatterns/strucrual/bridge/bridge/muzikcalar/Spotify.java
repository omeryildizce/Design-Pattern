package designpatterns.strucrual.bridge.bridge.muzikcalar;

import designpatterns.strucrual.bridge.bridge.Muzik;

public class Spotify implements MuzikCalar {
    @Override
    public String muzikCal(Muzik muzik) {
        System.out.printf("Spotify %s şarkısını çalıyor%n", muzik);
        return muzik.getSes();
    }
}
