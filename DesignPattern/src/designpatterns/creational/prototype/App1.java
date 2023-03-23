package designpatterns.creational.prototype;

import java.util.Date;

public class App1 {

    public static void main(String[] args) {


        long id1 = 1L;
        long id2 = 2L;
        GenelEntitiyService genelEntitiyService = new GenelEntitiyService();
        Date ilkTarih = new Date();
        Belge belge1 = genelEntitiyService.findBelgeById(id1);
        belgeyiVeSaniyeFarkiniYazdir(ilkTarih, belge1);


        GenelEntitiyService genelEntitiyService1 = new GenelEntitiyService();
        Belge belge2 = genelEntitiyService1.findBelgeById(id2);
        belgeyiVeSaniyeFarkiniYazdir(ilkTarih, belge2);


        try {
            Belge belgeClone = belge1.clone();
            belgeClone.setAdi("Günlük");
            belgeClone.setVeri("günlük");
            belgeyiVeSaniyeFarkiniYazdir(ilkTarih, belgeClone);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    private static void belgeyiVeSaniyeFarkiniYazdir(Date ilkTarih, Belge belge1) {
        Date sonTarih = new Date();
        Long saniyeFarki = getSaniyeFarki(ilkTarih, sonTarih);
        System.out.println(belge1.toString());
        System.out.println(saniyeFarki);
        System.out.println("***************************************\n");
    }

    private static Long getSaniyeFarki(Date ilkTarih, Date sonTarih) {
        long has = 1000;
        long saniyeFarki = sonTarih.getTime() - ilkTarih.getTime();
        saniyeFarki /= has;
        return saniyeFarki;
    }
}
