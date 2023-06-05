package day05concatinationoperatortypecasting;

public class TypeCasting {
    /*
        Numeric primitive data type larinin birbirine dönüştürülmesine "Type Casting" denilir.
        Numeric (Sayisal) primitive Data type lar: byte - short - int - long - float - double
     */
    //Note 1: Kucuk data type larini buyuk data typelarina cevirmeyi java otomatik olarak yapabilir
    // Bu isleme "AutoWidening" (otomatik genisletme ) denir.

    //Note 2: Buyuk data typelarını kucuk data typelarına cevirmek riskli bir istir, java bu riskli
    // isi otomatik olarak yapmaz, bu islemi kod yazanlar yaparlar
    //Bu isleme "ExplicitNarrowing" (Acıktan daraltma) denir

    public static void main(String[] args) {
        //byte data typeını int data typeına ceviriniz
        byte age =13;
        int ageInt = age;//AutoWidening

        //int data typeını data typeına ceviriniz
        int weight = 313;
        short weightShort = (short)weight;//Explicit Narrowing

        //int data type ini float data typeına ceviriniz
        int population = 77000;
        System.out.println(population);//77000

        float populationFloat = population;
        System.out.println(populationFloat);//77000.0

        //double data typinı short data typina ceviriniz
        double number = 12.99;
        System.out.println(number);//12.99

        short numberShort = (short) number;
        System.out.println(numberShort);//12

        //Ornek
        short num = 260;
        System.out.println(num);//260

        byte numByte = (byte) num;
        System.out.println(numByte);//4

        //Not: Donusum yaptıgınız sayi (260), donuseceginiz data typeinin sınırları dısında ise
        // java kullandiginiz sayi ile "mod" isleminin sonucu sizin yeni degeriniz olur.











    }
}
