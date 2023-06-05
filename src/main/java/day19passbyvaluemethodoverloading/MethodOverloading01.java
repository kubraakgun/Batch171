package day19passbyvaluemethodoverloading;

public class MethodOverloading01 {
    public static void main(String[] args) {


      add(3,5);

      String s="Java";
      s.contains("a");


    }
    public static void add(int a,int b){
        System.out.println(a+b);

    }
    public static void add(double a,double b){
        System.out.println(a+b);
    }
    public static void add(double a,int b){
        System.out.println(a+b);
    }
    public static void add(int a,double b){
        System.out.println(a+b);
    }
    public static void add(int a,int b,int c){
        System.out.println(a+b+c);
    }

    /*
    1) Method Overloading yaparken ismi degistirilmez.
    2) Method Overloading yaparken parametreler degistirilir
       a) Parametreleri degistirirken, parametrelerin data typle ları değiştirilebilir
       b) Parametre değiştirirken, parametrelerin sayısı değiştirilebilir
       c) Parametre değiştirirken parametrelerin data typeları farklı ise yerleri o zaman değiştirilebilir
    3) Java için "ismi" ve "parametreleri" aynı olan iki method tamamen aynıdır,
    bu yüzden ismi ve parametre "Method signature" olarak adlandırılır

    4) Method Overloading oluştururken return type i değiştirmenin hiçbir etkisi yoktur
    Method Overloading oluştururken access modifier i değiştirmenin hiçbir etkisi yoktur
    Method Overloading oluştururken methodu static ya da non-static yapmanın hiçbir etkisi yoktur
    Method Overloading oluştururken body i değiştirmenin hiçbir etkisi yoktur

    5) "private" methodlar overload edilebilir.Çünkü method overloading sadece bir class içinde olur
    private olmak ise başka classlara gidildiğinde problem oluşturur.

    6) static methodlar overload edilebilir,
    overloading yapmak icin (method ismini degistirmeden) method signature i degistiririz,
    dolayisiyla signature degistiginde yeni bir method olusturmus oluruz, bu nedenle static olmasi birseyi degistirmez



     */





}
