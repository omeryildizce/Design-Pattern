package designpatterns.strucrual.bridge.bridgeless;

public class Spotify {
    public String muzikCalar(Muzik muzik){
        System.out.printf("Spotify %s şarkısını çalıyor.%n", muzik);
        return muzik.getSes();
    }
}
