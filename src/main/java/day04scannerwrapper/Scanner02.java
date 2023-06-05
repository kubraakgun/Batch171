package day04scannerwrapper;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        //Ornek:kullanıcıdan adresini alınız ve ekrana yazdırınız.
        Scanner input = new Scanner(System.in);

        System.out.println("lutfen adresinizi giriniz..");
        //nextLine methodu kullanicidan cok kelimeli String almak icin kullanılır.
        String adress = input.nextLine();
        System.out.println(adress);

    }

}
