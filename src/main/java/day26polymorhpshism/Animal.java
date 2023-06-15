package day26polymorhpshism;

public class Animal {
    /*
    1) Parnet Class taki child class icinde ozellestirilerek kullanmaya Overriding denir.
    2) Overridingde methodun parantezine ve method ismine dokunulmaz,(==> method signature) degistirilmez
       methodun body si degistirilir
    3) Private methodlar override edilemez
    4) Child Classtaki methodun access modifieri parent Classtaki override edilmis method(Override Method) un
       access modifierindan dar olamaz. Aynisi olabilir yada daha genis olabilir
    5) Child Classta ovverride edilen methodun return type i ile parenttaki methodun return type i arasindaki IS-A iliskisi
    varsa return type degistirilebilir
    6) Methodun return type i primitive ise overriding yaparken return type degistirilemez. Cunku return type ya ayni olur
    veya parenttan secilir ama primitiveler arasi parent child iliskisi olmadigindan parenttan secmek söz konusu olamaz
    7) Child ta override edilen methodun return type ı ile parenttaki methodun return typei arasindaki IS-A iliskisi
    yoksa return type degistirilemez
    mesela;
    Integer wrapper class ile long wrapper class arasinda IS-A iliskisi YOKTUR. O yuzden degistirilemez
    8) Methodun return type i void ise, Overriding yaparken return type degistirilemez.
    9) "static" methodlar override edilemezler. Cunku static methodlar tum child lar icin ortak methodlardir.
    mesela bir child bir ortak methodu degistirdiginde diger childlar bundan olumsuz etkilenebilir. Bu nedenle java
    static methodlarin override edilmesine izin vermez.
    10) final methodlar override edilemezler.
        a) Final keywordunu variable larda kullabilirsiniz
           i) final variable a mutlaka deger atanmalidir
           ii) ilk atanan deger bir daha degistirilemez
        b) Final keywordunu methodlarda kullanabilirsiniz
           i) final methodun bodysi degistirilmez
           ii) method bodysi degistirilemeyince override yapmak mumkun olmaz
        c)  Final keywordunu classlarda kullanabilirsiniz
            i) class final ise o classin childi olmaz

     Polymorphism = Method overloading + method overriding

     */
    public void eat(){

        //parenttaki override edilmis eat() methoduna "Overriden Method" denir
        System.out.println("Animals eat ..");
    }
    public void drink(){
        System.out.println("Animals drink ..");
    }

    public Animal create(){
        return new Animal();
    }

    public int add(int a, int b){
        return a+b;
    }

    public Integer multiply(Integer a, Integer b){
        return a*b;
    }

    public final double circleArea(double r){
        return 3.14*r*r;
    }











}