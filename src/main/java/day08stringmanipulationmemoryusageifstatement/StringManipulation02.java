package day08stringmanipulationmemoryusageifstatement;

public class StringManipulation02 {
    public static void main(String[] args) {
        //Ornek 1: Bir stringin belirli bir characterinden baslayarak belirli bir charactere kadar dynamic(kodun birden fazla senaryo icinde calismasi) olarak alınız
        //   abc@gmail.com  ==> gmail


        String a = "abc@gmail.com";

        int startingIndex = a.indexOf('@')+1;

        int endingIndex = a.indexOf('.');

        String companyName = a.substring(startingIndex,endingIndex);


        System.out.println("companyName = "+ companyName);//companyName = gmail

        //Ornek 2: Verilen iki stringin birbirinin aynisi olup olmadigini kontrol eden kodu yaziniz
        String h = "ali Can";
        String i = "Ali Can";
        boolean result = h.equals(i);
        System.out.println(result);//false

        //Javada Memory kullanimi
        /*
        Javada iki tane Memory vardir
        1) Stack Memory ==> small
           a)Kucuk memory dir
           b)Primitiveleri ve Non-Primitivelerin adreslerini (referance) tutar

        2)Heap Memory ==> Huge
           a)Buyuk memory dir
           b)Non-Primitive datalari icerir
           ==> Java heap memoryde yerlestirilen tum Non-primitive datalar icin bir adres olusturur
           ve bu adresi stack memory de saklar.
         */

        /*
        Note: Stringlerin esitliklerini kontrol ederken cift esit(==) yerine "equals()" methodu kullaniriz
        Neden kullaniriz?
        Cunku; "==" sembolu iki stringi karsılastirirken hem adreslerine hem de degerlerine bakar,
        degerleri ile ilgeliniriz.Bu yuzden String karsilastirmalarinda "==" kullanmayiz

        "equals()" methodu ise iki stringi karsilastirirken sadece degerlerine bakar, degerleri ayni ise bu iki string
        esittir der, degerler farkli ise bu iki string farklidir der ki bu bizim kod yazarken ihtiyac duydugumuz seydir,
         */

        String s = "Tom";
        String t = "Terry";
        String r = new String("Tom");

        System.out.println(s==t);//false cunku adresler ve degerler farklidir
        System.out.println(s.equals(t));//false cunku degerler farkli
        System.out.println(s==r);//false cunku adresler farkli
        System.out.println(s.equals(r));//true cunku equals sadece degerlere bakar "s" ve "r nin" degerleri ayni oldugunda true verir


        //Ornek 3: Verilen iki stringin birbirinin aynisi olup olmadigini buyuk harf kucuk harf dikkate almadan
        //kontrol eden kodu yaziniz

        String j = "ali Can";
        String k = "Ali Can";
        boolean result3 =j.equalsIgnoreCase(k);
        System.out.println(result3);//true













    }
}
