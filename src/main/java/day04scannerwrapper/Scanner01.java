package day04scannerwrapper;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //Ornek: Kullanıcıdan ilk ismini ve soy ismini alıp ikisini aynı satıra yazdırınız.

        //1.adım: Scanner classtan bir obje oluştur.
        Scanner input =new Scanner(System.in);

        //2.adım: Kullanıcıya ne istediğinize dair mesaj veriniz
        System.out.println("Ilk isminizi giriniz...");

        //3.adım: Uygun methodu kullanarak kullanıcının verdiği datayı memory ye yerleştiriniz.
        //Next methodu kullanıcıdan tek kelimeli string icin kullanılır.
        String firstName= input.next();

        System.out.println("Soy isminizi giriniz..");
        String lastName= input.next();

        System.out.println(firstName+" "+lastName);









    }
}
