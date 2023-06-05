package day20statickeywordconstructors;

public class Car {

    /*
    Constructor nedir?
    Classtan object uretmemize yarayan code blocklaridir.

    Class olusturdugumuzda java bize otomatik olarak bir constructor verir .Ama bu constructor gozle gorulmez,
    gozle gorulmeyen otomatik olarak java tarafından verilen bu constructor lara default constructor denir

    default constructor ===>   " Car(){   } "  seklindedir

    Bir class ta farkli parametreler kullanarak istediginiz kadar constructor olusturabilirsiniz.
    farkli constructor lar sayesinde  farkli farkli objeler olusturabilirsiniz

    1)Constructor nasil olusturulur?
       Acces Modifier + Class ismi + () + {}

       Interview sorusu:
    2) Method ile constructor arasindaki farklar nelerdir?
       a) Methodlarda return type olur, constructor larda olmaz
       b) Methodlar yaptiklari işe göre isimlendirilirler
       Constructorlar ise her zaman Class ismi ile isimlendirilir
       c) Methodlar bir aksiyon yapmak icin olusturulur
       Constructorlar ise object olusturmak icindir
       d) Method isimleri kucuk harf ile baslar
         Constructor larin isimleri class ismi ile ayni oldugu icin herzaman buyuk harfle baslar

     3) Parametreli Constructor'l olusturarak ayni class dan farkli ozelliklere sahip objectler olusturabiliriz.


     */
    String make = "Honda";

    String model = "Accord";

    int year = 2023;
    boolean hybrid = true;

    public Car(String make,String model,int year,boolean hybrid){
        this.make = make;
        this.model=model;
        this.year=year;
        this.hybrid=hybrid;
    }

    public Car(String make, String model){
        this.make=make;
        this.model=model;
    }

    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
    }
}
