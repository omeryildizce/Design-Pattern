package designpatterns.strucrual.adapter;

public class TelefonEEAAdapter implements ElektirikliEvAletleri{
    private Telefon telefon;

    public TelefonEEAAdapter(Telefon telefon) {
        this.telefon = telefon;
    }

    @Override
    public int prizeTakVeCalistir() {
        return telefon.sarjEt();
    }
}
