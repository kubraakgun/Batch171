package day24stringbuilder;

public class Sb02 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Java is easy");
        System.out.println(sb1);

        sb1.reverse();//String in ters cevrilmesini looplar ilede yapilir bu kısa yoldur
        System.out.println(sb1);//ysae si avaJ


        sb1.deleteCharAt(6);//verilen indexteki karakteri siler
        System.out.println(sb1);//ysae s avaJ

        //4,5,6 silinir 7 silinmez
        sb1.delete(4,7);//Baslangic index dahil bitis index haric olmak uzere araligi siler
        System.out.println(sb1);//ysaeavaJ

        sb1.replace(2,5,"X");//sb1.replace(2,5,"X")==> 2 dahil, 5 haric olmak uzere 2,3,4 teki karakterlerin yerine X koyar
        System.out.println(sb1);//ysXvaJ

        sb1.insert(3,"000");
        System.out.println(sb1);//ysX000vaJ

        StringBuilder sb2=new StringBuilder("Java");
        StringBuilder sb3=new StringBuilder("Java");


        //sonuc 0 ise alfabetik olarak ayni siradalar demektir
        //sonuc -1 ise sb2, sb3 ten alfabetik olarak 1 onde demektir
        //sonuc 1 ise sb2, sb3 ten alfabetik olarak 1 sonda demektir
        int r1=sb2.compareTo(sb3);
        System.out.println(r1);
        /*
        compareto iki stringBuilder esit mi diye kontrol etmek icin ilk harften baslayarak tüm karakterleri karşılaştırır.
        Aynı olan karakterler için bir şey return etmezken farklı olan ilk karakter için ascii tablosuna göre
        kaç değer geride veya ileride olduğunu yazdırır.tamamen aynı ise bize 0 return eder
         */


        //StringBuilder nasil Stringe cevrilir?
        //toString() methodu sayesinde cevrilir
        //String classta var olan ama stringBuilder classta var olmayan toUpperCase() methodu gibi methodlara ihityac duydugumuzdan
        //toString() kullanarak string class methodlarini kullanabiliriz
        String str = sb2.toString().toUpperCase();//JAVA
        System.out.println(str);//JAVA
        System.out.println(sb2);//

        //String nasil stringBuilder e cevrilir?
        StringBuilder newSb1= new StringBuilder(str);
        System.out.println(newSb1);//JAVA








    }
}
