package designpatterns.prototype;

public class Kategori implements Cloneable{
    private Long id;
    private String adi;

    public Kategori() {

    }

    @Override
    public String toString() {
        return  adi;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    @Override
    protected Kategori clone() throws CloneNotSupportedException {
        return (Kategori) super.clone();
    }
}
