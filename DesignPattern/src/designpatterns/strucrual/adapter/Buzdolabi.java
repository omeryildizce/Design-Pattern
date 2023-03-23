package designpatterns.strucrual.adapter;

public class Buzdolabi implements ElektirikliEvAletleri {
    private int volt;

    public Buzdolabi() {
        this.volt = 220;
    }

    @Override
    public int prizeTakVeCalistir() {
        System.out.println("Buzdolabı çalışıyor.");
        return volt;
    }
}
