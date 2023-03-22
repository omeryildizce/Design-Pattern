package designpatterns.prototype;

public class BelgeTuru implements Cloneable {
    private Long id;
    private String adi;

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    @Override
    public String toString() {
        return adi;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BelgeTuru() {

    }

    @Override
    protected BelgeTuru clone() throws CloneNotSupportedException {
        return (BelgeTuru) super.clone();
    }
}
