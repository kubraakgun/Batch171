package day17arrays;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {
        //Specific bir elemanin arrayde olup olmadigini anlamak icin gerekeen kodu yaziniz.
        String names[] = {"K", "C", "R", "A", "S"};
        String el = "R";

        //1. Way:

        int counter = 0;
        for (String w : names) {

            if (w.equals(el)) {
                counter++;

                break;
            }
        }
        if (counter > 0) {
            System.out.println("Array has " + el);
        } else {
            System.out.println("Array does not have " + el); //loop bittikten sonra counter ı kontrol ederek array in eleman icerip icermedigini tespit etmek.
        }

        //2. Way: binarySearch() methodu hizli calisir
        /*
        1) binarySearch() methodunu  sort() kullanmadan kullanmayiniz, cunku  binarySearch() mantigi sirali elemanlar icin gecerlidir
        2) binarySearch() methodunu var olan elemanlar icin size o elemanin indexini verir
           binarySearch() methodundan aldiginiz index "0" ya da "0" dan buyuk ise o eleman arrayde var demektir
        3) binarySearch() methodu olmayan elemanlar icin negatif tamsayi degeri verir
        "-" isaretinin anlami eleman yok demektir
        "sayi" ise o eleman olsaydi kacinci eleman olurdu demektir.
         */

        Arrays.sort(names);
        int result = Arrays.binarySearch(names, el);
        System.out.println(Arrays.toString(names));//[A, C, K, R, S]
        System.out.println(result);

        if (result<0){
            System.out.println("Array does not have "+ el);
        }else{
            System.out.println("Array has "+el);
        }
       int num1 = Arrays.binarySearch(names,"A");
        System.out.println(num1);//0 ==> var hemde indexi sifir

        int num2 = Arrays.binarySearch(names,"K");
        System.out.println(num2);//2==> var hem de indexi 2


        int num3 = Arrays.binarySearch(names,"U");
        System.out.println(num3);//-6 ==> "-" bu eleman yok demek
        //"6"==> ise olsaydi  6. eleman olurdu demek




















    }
}
