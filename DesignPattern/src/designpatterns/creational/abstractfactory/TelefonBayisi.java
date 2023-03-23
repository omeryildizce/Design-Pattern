package designpatterns.creational.abstractfactory;

public class TelefonBayisi {
    public static void main(String[] args) {
        S8Fabrikasi s8Fabrikasi = new S8Fabrikasi();
        Telefon s8 = s8Fabrikasi.getTelefon("S8", "2588mah", 75, 156);

        Note8Fabrikasi note8Fabrikasi = new Note8Fabrikasi();
        Telefon note8 = note8Fabrikasi.getTelefon("Note8", "3500mah", 80, 170);
        System.out.println(s8);
        System.out.println(note8);

    }
}
