package day09ifstatements;

import java.util.Scanner;

public class IfStatements03 {
    public static void main(String[] args) {
        //Ornek : Kullanicinin vermis oldugu karakter buyuk harf ise ekrana "Buyuk Harf",
        //kucuk harf ise "Kucuk Harf" yazdiran kodu olusturunuz

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir character giriniz..");
        char ch = input.next().charAt(0);

        //1. YOL:

       /* if (ch >='A' && ch <='Z'){
            System.out.println("Buyuk Harf");
        }

        if (ch >= 'a' && ch <= 'z'){
            System.out.println("Kucuk Harf");
        } */

        //2. YOL:
        if (ch>'A' && ch <='Z'){
            System.out.println("Buyuk Harf");

        } else if (ch >='a' && ch <='z'){
            System.out.println("Kucuk Harf");

        } else {

            System.out.println("Harf Degil");
        }






    }
}
