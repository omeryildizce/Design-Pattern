package designpatterns.strucrual.adapter;

public class Priz {
    public void elektirikVer(ElektirikliEvAletleri elektirikliEvAletleri){
        int volt = elektirikliEvAletleri.prizeTakVeCalistir();
        System.out.println("Prizden " + volt + " volt alınıyor.");
    }
}
