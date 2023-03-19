package designpatterns.factory;

public class S8 implements Telefon {
    private String model;
    private String batarya;
    private int en;
    private int boy;

    public S8(String model, String batarya, int en, int boy) {
        this.model = model;
        this.batarya = batarya;
        this.en = en;
        this.boy = boy;
    }

    @Override
    public String toString() {
        return "S8{" +
                "model='" + model + '\'' +
                ", batarya='" + batarya + '\'' +
                ", en=" + en +
                ", boy=" + boy +
                '}';
    }

    @Override
    public String getModel() {
        return null;
    }

    @Override
    public String getBatarya() {
        return null;
    }

    @Override
    public int getEn() {
        return 0;
    }

    @Override
    public int getBoy() {
        return 0;
    }
}
