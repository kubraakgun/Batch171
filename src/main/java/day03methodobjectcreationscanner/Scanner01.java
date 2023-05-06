package day03methodobjectcreationscanner;

import java.util.Scanner;
//Java nın util kutuphanesinden scanner class import edildi.
public class Scanner01 {
    public static void main(String[] args) {
        //1. Adım Scanner Class tan object oluştur
        Scanner input = new Scanner(System.in);

        //2. Adım kullanıcıya ne istedğinize dair mesaj veriniz
        System.out.println("Lutfen yasınızı gırınız");


        //3. Adim Ugun methodu kullanarak kullanıcının verdiği datayı memory e yerleştiriniz
        byte age = input.nextByte();

        System.out.println("age = " + age);


    }


}
