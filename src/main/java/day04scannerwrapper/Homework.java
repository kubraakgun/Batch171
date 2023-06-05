package day04scannerwrapper;

import java.util.Scanner;

public class Homework {
   // HOMEWORK
    public static void main(String[] args) {
        //1) kullanicidan aldiğiniz 3 tane sayinin ortalamasını bulan kodu yaziniz
        //orneğin --> 3,5,7 icin ortalama (3+5+7)/3=5


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 3 sayi giriniz..");

        double firstNumber = input.nextDouble();
        double secondNumber = input.nextDouble();
        double thirdNumber = input.nextDouble();
        System.out.println((firstNumber + secondNumber + thirdNumber)/3);


        //2) kullanıcıdan aldğiniz 3 basamaklı bir sayinin rakamları toplamını bulunuz
        // orneğin --> 312 icin 3+1+2=6

        System.out.println("Lutfen 3 basamakli sayi giriniz");
        int number = input.nextInt();

        int birlerBasamagi = number % 10;
        number = number / 10;

        int onlarBasamagi = number % 10;
        number = number / 10;

        int yuzlerBasamagi = number % 10;

        System.out.println(birlerBasamagi + onlarBasamagi + yuzlerBasamagi);




























    }


}
