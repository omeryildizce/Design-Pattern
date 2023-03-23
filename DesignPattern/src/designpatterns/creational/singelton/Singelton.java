package designpatterns.creational.singelton;

/**
 * Singleton tasarım kalıbı, bir sınıfın yalnızca bir örneğinin olmasını sağlar ve bu örneğin global bir erişime sahip olmasını sağlar.<br>
 * <p>
 * Bu örnek, uygulama boyunca bir kez oluşturulur ve herhangi bir yerden erişilebilir.<br>
 * <p>
 * Bu tasarım kalıbı, genellikle kaynak kullanımı, bağlantı noktaları ve yapılandırma ayarları gibi global olarak erişilebilir tek bir nesnenin varlığı gerektiren durumlarda kullanılır.<br>
 */
public class Singelton {
    private static Singelton instance;
    private int sayi = 1;

    private Singelton() {
        System.out.println("Execute");
    }

    /**
     * <b>Multi thread</b> <br>
     * Lazy loading, yani tembel yükleme, singleton deseniyle birleştirildiğinde, sınıf örneği yalnızca ihtiyaç duyulduğunda oluşturulur.<br>
     * Bu, uygulamanın yüklenme süresini azaltır ve bellek kullanımını optimize eder. <br>
     * Multi-threaded (çoklu iş parçacıklı) bir ortamda çalışırken, singleton desenindeki sınıf örneğinin birden fazla thread tarafından oluşturulmasını engellemek için bazı ek önlemler almak gerekir.
     * Bunun için, genellikle çift kilitleme mekanizması kullanılır (double checked locking mechanism).<br>
     */
    public static Singelton getInstance() {
        if (instance == null) {
            synchronized (Singelton.class) {
                if (instance == null)
                    instance = new Singelton();
            }
        }

        return instance;
    }
}
