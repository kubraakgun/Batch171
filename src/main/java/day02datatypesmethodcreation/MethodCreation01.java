package day02datatypesmethodcreation;

public class MethodCreation01 {

    /*
    Java'da method nasil olusturulur?

    1)main method un dısında classin icinde olusturulur.

    2) Access modifier + Return type + Method name + () + {}
     */

    /*
    Olusturulan methodlar nasil kullanilir?

    1) Methodu olusturmak methodu calıstırmak icin yeterli degildir.
    Kullanilmak istenen method un icinden kullanilir.

    2) methodun ismini + () yazin

     */

    public static void main(String[] args) {

        int sonuc = toplamaYap(3,5);
        System.out.println("sonuc = " + sonuc);

        System.out.println("----------");

        long sonuc2 = carpmaYap(5, 15);
        System.out.println("sonuc2 = " + sonuc2);

        System.out.println("----------");

        System.out.println(firstTwoMultiplyThirdAdd(2, 3, 4));

    }

    //Ornek 1 : Toplama islemi yapan bir method olusturunuz.

    public static int toplamaYap(int a, int b) //bu kisimda method kapsaminda kullanilmasini
    //                            ve islenmesini istedigim datalari deklare ediyoruz.
    {
        return a + b;
        // return demek bu methodun cagirildigi yere bu degeri return et demek


    }

    //Ornek 2 : 2 sayiyi carpma islemi yapan bir method olusturunuz.

    protected static long carpmaYap(long a, long b)
    {

        return a * b;

    }

    //Ornek 3 : verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu sayi ile toplayan methodu olusturunuz ve kullaniniz.

    private static int firstTwoMultiplyThirdAdd(int a, int b, int c)
    {

        return a*b+c;

    }

    /*
    Homework

    1) Dikdörtgenin alanini hesaplayan methodu olusturun ve kullaniniz.

    2) Dikdörtgenin cevresini hesaplayan methodu olusturun ve kullaniniz.

     */
}
