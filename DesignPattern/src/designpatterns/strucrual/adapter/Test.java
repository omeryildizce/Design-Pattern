package designpatterns.strucrual.adapter;

public class Test {
    public static void main(String[] args) {
        Priz priz = new Priz();
        Utu utu = new Utu();
        Buzdolabi buzdolabi = new Buzdolabi();

        priz.elektirikVer(utu);
        priz.elektirikVer(buzdolabi);

        SamsungTelefon samsungTelefon = new SamsungTelefon();
        TelefonEEAAdapter adapter = new TelefonEEAAdapter(samsungTelefon);
        priz.elektirikVer(adapter);
    }
}
