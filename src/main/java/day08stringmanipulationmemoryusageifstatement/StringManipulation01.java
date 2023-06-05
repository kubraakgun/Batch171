package day08stringmanipulationmemoryusageifstatement;

public class StringManipulation01 {
    public static void main(String[] args) {
        //Ornek 1: Bir stringin hiç character icermediğini (Bos string oldugunu) kontrol eden kodu yazınız.
        //1.Yol lenght methodu ile cozum
        String str = "";
        boolean result1 = str.length()==0;
        System.out.println("String bos mu? " + result1);//String bos mu? true

        //2.Yol tavsiye edilir
        //Cunku Java eger bir konuda method olusturmussa , o methodu kullanmak en iyisidir.
        boolean result2 = str.isEmpty();
        System.out.println("is Empty? " + result2);//is Empty? true


        //Ornek 2:Bir Stringin space haric hiçbir character icermedigini kontrol eden kodu yazınız
        String t = "     ";
        //1.Yol
        boolean result3 = t.replace(" ","").length()==0;
        System.out.println(result3);

        //2.Yol
        boolean result4 = t.replace(" ","").isEmpty();
        System.out.println(result4);

        //3.Yol
        boolean result5 = t.isBlank();
        System.out.println(result5);
        //isBlank() methodu sadece space iceren Stringler icin true verir, space disinda bir character var ise false verir
        //isBlank methodu bos stringler icin de true verir
        //isBlank methodu space + hicbir şey icin true verir
        //isEmpty methodu sadece hicbir şey icin true verir


        //Ornek 3: Bir stringte a , i, e characterlerinin ilk gorunumlerinin indexleri toplamini ekrana yazdiriniz
        // " Java is easy to learn" ==>  1 + 5 + 8 ==> 14
        //   0123456789...index
        String r = "Java is easy to learn";
        int idxA = r.indexOf('a');
        System.out.println(idxA);//1

        int idxI = r.indexOf('i');
        System.out.println(idxI);//5

        int idxE = r.indexOf('e');
        System.out.println(idxE);//8

        System.out.println(idxA + idxI + idxE);//14

        //Ornek 4: Bir stringteki "Java" kelimesinin ilk olarak kacinci indexte kullanildigini gosteren kodu yaziniz
        //"Ah Java vah Java sensiz olmuyor Java."
        // indexOf(Java") kullaniminda siz "Java" kelimesinin ilk gorunumundeki ilk harfin (yani J nin) indexini almis olur

        String u = "Ah Java vah Java sensiz olmuyor Java.";

        int idxJava = u.indexOf("Java");
        System.out.println(idxJava);//3

        //indexOf methodu olmayan characterler icin kullanilirsa her zaman -1 return eder
        int idxjava = u.indexOf("java");
        System.out.println(idxjava);//-1


        //Ornek 5: Bir stringte a , i, e characterlerinin ilk gorunumlerinin indexleri toplamini ekrana yazdiriniz
        String v = "Java is easy to learn";
        int idxOfa = v.lastIndexOf('a');
        System.out.println(idxOfa);

        int idxOfe = v.lastIndexOf('e');
        System.out.println(idxOfe);

        int idxOfi = v.lastIndexOf('i');
        System.out.println(idxOfi);

        System.out.println(idxOfa + idxOfe + idxOfi);

        //Note : lastIndexOf methodu olmayan characterler icin kullanilirsa her zaman -1 verir

















    }
}
