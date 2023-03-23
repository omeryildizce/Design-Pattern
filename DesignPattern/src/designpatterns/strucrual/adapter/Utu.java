package designpatterns.strucrual.adapter;

public class Utu implements ElektirikliEvAletleri{
    private int volt;

    public Utu() {
        this.volt = 220;
    }

    @Override
    public int prizeTakVeCalistir() {
        System.out.println("Ütü çalışıyor.");
        return volt;
    }
}
