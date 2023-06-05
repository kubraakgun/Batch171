package group_work_day01;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Methods method =new Methods();
        Scanner input =new Scanner(System.in);

        System.out.println("lutfen islem tipini giriniz\n" +
                "toplama icin       (+)\n" +
                "cikarma icin       (-)\n" +
                "carpma icin        (*)\n" +
                "bolme icin         (/)");

        method.operator = input.next().charAt(0);

        System.out.println("sayi gir");
        method.sayi1 =input.nextDouble();

        System.out.println("sayi daha gir");
        method.sayi2 =input.nextDouble();

        if (method.operator == '+') {
            method.topla(method.sayi1,method.sayi2);

        } else if (method.operator == '-') {
            method.cikar(method.sayi1,method.sayi2);

        } else if (method.operator=='*') {
            method.carp(method.sayi1,method.sayi2);

        } else if (method.operator=='/') {

            method.bol(method.sayi1,method.sayi2);
        }else {
            System.out.println("hatali giris");
        }

    }


}

