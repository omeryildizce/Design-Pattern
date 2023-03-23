package designpatterns.creational.builder;

public class EmlakciV2 {
    public static void main(String[] args) {
        EvBuilder evBuilder = EvBuilder.startBuild("istanbul")

                .setIlçe("Ümraniye")
                .setMahalle("Tatlısu")
                .setBinaYili(2008)
                .setOdaSayisi(3)
                .setHasCocukParki(true)
                .setHasotopark(true)
                ;

        Ev ev = EvBuilder.startBuild("istanbul")

                .setIlçe("Ümraniye")
                .setMahalle("Tatlısu")
                .setBinaYili(2008)
                .setOdaSayisi(3)
                .setHasCocukParki(true)
                .setHasotopark(true)
                .buid();
        printEv(ev);

    }

    private static void printEv(Ev ev) {
        System.out.println();
        System.out.println("Ev eklendi -> " + ev.toString());
    }
}
