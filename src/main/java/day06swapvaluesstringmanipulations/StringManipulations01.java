package day06swapvaluesstringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {
        //String bir non-primitive data type dir ve ayni zamanda bir classtır.

        String s = "Java is easy";

        //Ornek 1: "s" String indeki tum characterleri buyuk harf yapiniz.
        String sUpper = s.toUpperCase();
        System.out.println(sUpper);// JAVA İS EASY


        //Ornek 2: "s" String indeki tum characterleri kucuk harf yapiniz.

       String sLower = s.toLowerCase();
        System.out.println(sLower);//java is easy


        //Ornek 3: "s" String indeki ilk karakteri aliniz.
        char firstChar = s.charAt(0);
        System.out.println(firstChar);//J


        //Ornek 4: "s" String indeki ikinci ve sondan ikinci karakteri aliniz ve ekrana yazdiriniz.
        char secondChar = s.charAt(1);//a
        char secondLastChar = s.charAt(10);//s
        System.out.println(""+secondChar +secondLastChar);


        //Ornek 5: "s" String inde kullanilan toplam character sayisini bulunuz.
        int sLenght = s.length();
        System.out.println(sLenght);//12


        //Ornek 6: "s" String indeki ilk dort characteri aliniz
        //substring methodunda ilk index dahil demektir. İkinci index dahil degildir.
        String sub1 = s.substring(0,4);
        System.out.println(sub1);//Java



        //Ornek 7: "s" Stringindeki "is" kelimesini alınız
        String sub2 = s.substring(5,7);
        System.out.println(sub2);



        //Ornek 8: "s" String indeki "easy" kelimesini aliniz
        String sub3= s.substring(8,12);
        System.out.println(sub3);

        //İKİNCİ YOL
        //Bir character den baslayip String in sonuna kadar alamk isterseniz, ikinci indexi yazmayiniz.
        //substring (8,12); yerine substring (8); yazdik böylece baslangic indexinden itibaren sonuna kadar aldik.
        String sub4 = s.substring(8);
        System.out.println(sub4);



        //Ornek 9:"s" String inde "money" kelimesinin var olup olmadiğini kontrol ediniz
        boolean isExit = s.contains("money");
        System.out.println(isExit);


        //Ornek 10: "s" String inin belli bir harfle baslayip baslamadigini kontrol ediniz
        boolean isStart = s.startsWith("Java");
        System.out.println(isStart);//True



        //Ornek 11: "s" String inin 6. cahracterden itibaren belli bir harfle baslayip baslamadigini kontrol ediniz
       boolean isBegin = s.startsWith("i",5);
        System.out.println(isBegin);//True












    }


}
