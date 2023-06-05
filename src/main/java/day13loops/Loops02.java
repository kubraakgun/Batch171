package day13loops;

public class Loops02 {
    public static void main(String[] args) {
        // Ornek 1: 21 den 180 e kadar hem 2 hemde 3 ile tam bolunebilen tamsayilari ekrana yazdiran kodu yaziniz
        for (int i = 21; i < 181; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println(i);
            }
        }

        //Ornek 2: Size verilen kucuk harfle yazilmis stringin indexi cift sayi olan karakterlerini büyük harfe dönüştürünüz
        //      ankara ==> AKR
        //      012345 ==> cift olanlari istiyor
        String s = "ankara";

        for (int i = 0; i < s.length(); i++) {

            String ch = s.substring(i, i + 1);

            if (i % 2 == 0) {
                System.out.println(ch.toUpperCase());
            }

        }

        //Ornek 3: Verilen bir stringte ilk a harfinden onceki tum characterleri console a yazdirin
        //"I love Java" ==> "I love J"
        String s1 = "Tramway";

        for (int i = 0; i < s1.length(); i++) {

            char ch = s1.charAt(i);
            if (ch == 'a') {
                break;
            }
            System.out.print(ch);
        }

        System.out.println("\n");

        //Ornek 4: Verilen bir stringte son a dan sonraki tum characterleri ters siradan yazdiriniz..
        //     "Germany" ==> yn
        String t = "Germany";
        for (int i = t.length() - 1; i >= 0; i--) {

            if (t.charAt(i) == 'a') {
                break;
            }
            System.out.print(t.charAt(i));


        }
    }
}