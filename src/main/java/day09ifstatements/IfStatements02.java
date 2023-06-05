package day09ifstatements;

import java.util.Scanner;

public class IfStatements02 {
    public static void main(String[] args) {
        //Ornek : Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz..");
        int num = input.nextInt();
        // 1. YOL:
        // 2 sart kontrol edildi

       /*
        if (num % 2 == 0){

            System.out.println("cift sayidir");
        }

        if(num % 2 != 0){ //!= --> esit değildir demek
            System.out.println("tek sayidir");
        }
        */
        // 2.YOL:
        // 2 sart kontrol edildi kontrol edilen condition sayisi daha az oldugu icin tavsiye edilir
        if (num % 2 == 0) {
            System.out.println("cift sayidir..");
        } else {

            System.out.println("tek sayidir..");
        }


    }
}
