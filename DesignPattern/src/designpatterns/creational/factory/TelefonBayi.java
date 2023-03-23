package designpatterns.creational.factory;



public class TelefonBayi {
    public static void main(String[] args) {
        Telefon s8 = TelefonFabrikasi.getTelefon("s8", "5000mah", 86, 190);
        Telefon note8 = TelefonFabrikasi.getTelefon("note8", "6000mah", 92, 200);

        System.out.println(s8);
        System.out.println(note8);


//        Telefon s6 = TelefonFabrikasi.getTelefon("s6", "2000mah", 80, 180);
//        System.out.println(s6);
    }
}
