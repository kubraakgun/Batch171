package day25inheritance;

public class Vehicle {
    public  Vehicle(){
        this(1000);
        System.out.println("Vehicle 1");
    }
    public Vehicle(int price){
        System.out.println("Vehicle 2");
    }
    /*
    1) Child classtan bir obje olusturdugunuzda constructor en ustteki parent classtan baslatilarak alta dogru calistiriniz
    2) Child classtaki constructor dan Parent classtaki constuctora gidebilmek icin super parantez kullanilir
    3) Prent classta birden fazla constructor varsa istenilen constructor super() ifadesinin icine yazilan parametreler
     yardimi ile secilebilir
    4) Ayni class icindeki constructori secmek icin this() kullanilir.Ayni classta birden fazla constructor varsa istenilen
    constructor this() ifadesinin parantez icine yazilan parametreler yardimi ile secilebilir
    5) super() ifadesini yazmak istege baglidir, yazmassaniz da java sanki super() varmis gibi davranir,
    Ama kodunuzu daha okunur kılmak icin yazmaniz tavsiye edilir
    6) super() ve this() ifadeleri constructor icinde her zaman ilk satirda olmalidir
    7) Bir constructor icinde super() ve this() ifadeleri sadece bir kere kullanilabilir. (Bakiniz 6.)
    8) Inheritance da variablllari ve methodlari cagirmak icin this veya super kullanilir
       this ayni class icindeki variable veya methodlari cagirmak icin kullanilir
       super parent class icindeki variable veya methodlari cagirmak icin kullanilir
     */
    //super()==>parent cons.
    //super==>parent classtaki method veya variable
    //this()==>class icindeki cons
    //this==>class icindeki method veya variable a goturur
}
