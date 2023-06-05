package day15loops;

import java.util.Scanner;

public class WhileLoop02 {
    public static void main(String[] args) {
        //Example 1: Kullanicinin verdigi sayi icin carpim tablosunu olusturup console'a yazdiran kodu yaziniz
/*            3 ==> 3x1=3
                    3x2=6
                    3x3=9
                    3x4=12 ...
                    3x10=30*/
        Scanner input = new Scanner(System.in);
        System.out.println("Carpım tablosunu gormek icin bir sayı giriniz..");
        int num = input.nextInt();

        int i = 1;
        while (i < 11) {
            System.out.println(num + " x " + i + " = " + (num * i));//num sepetinde 3 var

            i++;
        }


        //Example 2: Verilen bir stringte her harfin sonrasına "*" sembolu ekleyiniz
        //      Java ==> J*a*v*a*
        System.out.println("Bir kelime giriniz..");
        String word = input.next();
        String newWord = "";

        int a = 0;
        while (a < word.length()) {
            newWord = newWord + word.charAt(a) + "*";

            a++;
        }
        System.out.println(newWord);

        //Example 3: Bir string deki tekrarsız karakterleri console a yazdiriniz
        //kertenkelle ==> rtn
        //lastIndexOf("k") ==> 0

        //indexOf("r") ==> 2 aynı ise tekrarsız
        //lastIndexOf("r")==> 2

        /*   indeOf("k")==>0
             LastIndeOf("k")==>6 ilk gorunumun index i ile son gorunumun index i farkli ise
             o karakterin tekrarli oldugunu gosterir
             indeOf("r")==>0
             LastIndeOf("r")==>6 ilk gorunumun index i ile son gorunumun index i ayni ise
             o karakterin tekrarsiz oldugunu gosterir */


        String s = "kertenkelle";
        String sonuc = "";
        int b = 0;

        while (b < s.length()) {
            char ch = s.charAt(b);

            if (s.indexOf(ch) == s.lastIndexOf(ch)) {
                sonuc = sonuc + ch;
            }
            b++;
        }
        System.out.println(sonuc);


    }
}
