package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        int a = 13;

        //Bu yapinin icinde sadece bir tane data depolanabilir.
        //Ama biz code yazarken bir yapinin icinde coklu data depolama ihtiyaci hissederiz.
        //Bir yapinin icinde toplu data depolayabilme icin java Array yapısını olusturmustur.


        //Array nasıl olusturulur?
        String stdNames[] = new String[5];


        //Arrayler console a nasil yazdirilir?
        //toString() methodunu kullanmadan sadece array ismiyle yazdirirsaniz Java o Array in adresini yazdirir



        /*
        Arrayler diger collectionlardan cok  cok daha hizlidir (superfast).
        Arrayler diger collectionlardan daha az memory kullanirlar.
         */

        //Array e eleman ekleme nasil yapilir?
        stdNames[0] = "Kubra";
        stdNames[1] = "Emre";
        stdNames[2] = "Nisa";
        stdNames[3] = "Rumeysa";
        stdNames[4] = "Alican";

        System.out.println(Arrays.toString(stdNames));


        //Arrayden spesific bir elemani nasil aliriz?
        System.out.println(stdNames[3]);

        //Ornek 1: Arraydeki her elemanin sonuna "!" isareti koyarak yazdiriniz.
        //lenght() stringlerde method (parantezli) ,Arraylerde ise parantezsiz yazilir(method degil)

        for (int i = 0; i < stdNames.length; i++) {
            System.out.println(stdNames[i] + "*");

        }


    }
}
