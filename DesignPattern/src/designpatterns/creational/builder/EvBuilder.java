package designpatterns.creational.builder;

public class EvBuilder {
    private String il;
    private String ilce;
    private String mahalle;
    private int binaYili;
    private int odaSayisi;
    private int banyoSayisi;
    private int tuvaletSayisi;
    private int balkonSayisi;
    private boolean isDublex;
    private boolean isEşyali;
    private boolean hasotopark;
    private boolean hasCocukParki;
    private boolean hasKlima;
    private boolean hasHavuz;

    public static EvBuilder startBuild(String il){ // zorunlu alan il
        EvBuilder evBuilder = new EvBuilder();
        evBuilder.il = il;
        return evBuilder;
    }
    public Ev buid(){
        Ev ev = new Ev();
        ev.setIl(il);
        ev.setIlce(ilce);
        ev.setMahalle(mahalle);
        ev.setBinaYili(binaYili);
        ev.setOdaSayisi(odaSayisi);
        ev.setBanyoSayisi(banyoSayisi);
        ev.setTuvaletSayisi(tuvaletSayisi);
        ev.setBalkonSayisi(balkonSayisi);
        ev.setDublex(isDublex);
        ev.setEşyali(isEşyali);
        ev.setHasotopark(hasotopark);
        ev.setHasCocukParki(hasCocukParki);
        ev.setHasKlima(hasKlima);
        ev.setHasHavuz(hasHavuz);
        return ev;
    }



    public EvBuilder setIlçe(String ilce) {
        this.ilce = ilce;
        return this;
    }

    public EvBuilder setMahalle(String mahalle) {
        this.mahalle = mahalle;
        return this;
    }

    public EvBuilder setBinaYili(int binaYili) {
        this.binaYili = binaYili;
        return this;
    }

    public EvBuilder setOdaSayisi(int odaSayisi) {
        this.odaSayisi = odaSayisi;
        return this;
    }

    public EvBuilder setBanyoSayisi(int banyoSayisi) {
        this.banyoSayisi = banyoSayisi;
        return this;
    }

    public EvBuilder setTuvaletSayisi(int tuvaletSayisi) {
        this.tuvaletSayisi = tuvaletSayisi;
        return this;
    }

    public EvBuilder setBalkonSayisi(int balkonSayisi) {
        this.balkonSayisi = balkonSayisi;
        return this;
    }

    public EvBuilder setDublex(boolean dublex) {
        isDublex = dublex;
        return this;
    }

    public EvBuilder setEşyali(boolean eşyali) {
        isEşyali = eşyali;
        return this;
    }

    public EvBuilder setHasotopark(boolean hasotopark) {
        this.hasotopark = hasotopark;
        return this;
    }

    public EvBuilder setHasCocukParki(boolean hasCocukParki) {
        this.hasCocukParki = hasCocukParki;
        return this;
    }

    public EvBuilder setHasKlima(boolean hasKlima) {
        this.hasKlima = hasKlima;
        return this;
    }

    public EvBuilder setHasHavuz(boolean hasHavuz) {
        this.hasHavuz = hasHavuz;
        return this;
    }
}
