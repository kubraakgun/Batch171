package day11nestedifternaryincrementdecrement;

public class Ternary02 {
    public static void main(String[] args) {

        //Orenek 1:
        int a = 10;
        int b = 20;

        int r1 = a < b ? a++ : ++b;

        System.out.println(r1);//10
        System.out.println(a);//11
        System.out.println(b);//20


        //Ornek 2: Verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz
        //          -4 --> -1* -4     4-->4        0-->0

        int c = 4;
        int r2 = c < 0 ? -1 * c : c;
        System.out.println(r2);

        //Ornek 3: Iki sayinin isareti ayni ise bu sayilari carpan, isaretlerifarkli ise
        // " farkli isaretli sayilari carpamiyorum" mesaji veren kodu yaziniz
        int m = 5;
        int n = -6;

        Object r3 = (m > 0 && n > 0) || (m < 0 && n < 0) ? m * n : "farkli isaretli sayilari carpamiyorum";
        System.out.println(r3);

        //"Object " javada butun "Non-Primitive Data Type" (class) larinin ortak "Parent" (baba-anne) dir.
        //"Object" in Parent i yoktur.
        //Farkli data type lar icin ortak bir variable olusturmak istediginizde, data type olarak object kullanabilirsiniz
        //Javada "Object", insanlik alemindeki "Hz Adem e benzer."


        //Ornek 4:Size verilen sayinin 3 basamakli olup olmadigini kontrol eden kodu yaziniz
        int p = -315;
        p=Math.abs(p);

        String r4 = p > 99 && p < 1000 ? p+ " uc basamaklidir " : p + " uc basamakli degildir ";
        System.out.println(r4);


    }
}
