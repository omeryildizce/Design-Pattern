package designpatterns.strucrual.bridge.bridge.sescihazi;

public class Kulaklik implements SesCihazi {
    @Override
    public void sesiCal(String ses) {
        System.out.printf("Kulaklık ses çalıyor %s%n", ses);
    }
}
