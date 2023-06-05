package day08stringmanipulationmemoryusageifstatement;

import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        /*
        HOMEWORK
        1) Bir string variable olusturunuz ve bu string deki rakam olmayan tum karakterlerin sayisini console a yazdiriniz
    2) Bir string variable olusturunuz ve ilk karakter ile son karakter disindaki tum karakterleri console a buyuk harflerle yazdiriniz
    3) Bir string variable olusturunuz ve bu string deki ilk ve son karakterlerin ASCII degerleri toplamini console a yazdiriniz
    4) Tek kelimeli bir sehir ismi icin string variable olusturun ve sehir isiminin ilk harfini buyuk harfle diger harflerini kucuk harflerle
    console a yazdirin
    5)Asagidaki kurallara gore kullanicinin girdigi password u kontrol ediniz
        a)En az 6 character olsun
        b)En az bir tane buyuk harf olsun
        c)En az bir tane kucuk harf olsun
        d)En az bir tane rakam olsun

    Note 1: Once canli oturum sirasinda cozulen ornekleri yapiniz
    Note 2: Tum sorulari dinamik kodlarla cozulmelidir
    Note 3: Birbirinizin cozumlerini inceleyerek tavsiyede bulunabilir yada yardim isteyebilirsiniz
         */



        //1) Bir string variable olusturunuz ve bu string deki rakam olmayan tum karakterlerin sayisini console a yazdiriniz
        String yas = "Hatice 20 yasinda olmali";
        int yas1 = yas.replaceAll("[0-9]","").length();
        System.out.println(yas1);

        int yas2 = yas.length();
        System.out.println(yas2);



        // 2) Bir string variable olusturunuz ve ilk karakter ile son karakter disindaki tum karakterleri console a buyuk harflerle yazdiriniz

        String ortakarakter = yas.toUpperCase().substring(1,yas2-1);//Buyuk harf verir

        char ilkHarf1 = yas.toLowerCase().charAt(0);//h
        char sonHarf1= yas.toLowerCase().charAt(yas.length()-1);//i

        System.out.println("sonuc = " + ilkHarf1 + ortakarakter + sonHarf1);


        //3)  3) Bir string variable olusturunuz ve bu string deki ilk ve son karakterlerin ASCII degerleri toplamini console a yazdiriniz

        char ilkHarf2 = yas.charAt(0);
        char sonHarf2 = yas.charAt(yas.length()-1);
        System.out.println(ilkHarf2 + sonHarf2);//Eger soru bizden cikti olarak string isteseydi basina cift tirnak ("") koymamiz gerekirdi


        // 4) Tek kelimeli bir sehir ismi icin string variable olusturun ve sehir isiminin ilk harfini buyuk harfle, diger harflerini kucuk harflerlerle console a yazdirin

        String cityName ="istAnBuL";
        String ilkHarf3 = cityName.substring(0,1).toUpperCase();
        String sonHarf3 = cityName.substring(1).toLowerCase();
        System.out.println(ilkHarf3 + sonHarf3);


        //  5)Asagidaki kurallara gore kullanicinin girdigi password u kontrol ediniz
        /*
                a)En az 6 character olsun
                b)En az bir tane buyuk harf olsun
                c)En az bir tane kucuk harf olsun
                d)En az bir tane rakam olsun
         */
        //a) En az 6 character olsun

        Scanner passWord= new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz");
        String parola = passWord.nextLine();

        boolean gereklilik1 = parola.length()>5;
        boolean gereklilik2 = parola.replaceAll("[^A-Z]","").length()>0;
        boolean gereklilik3 = parola.replaceAll("[^a-z]","").length()>0;
        boolean gereklilik4 = parola.replaceAll("[^0-9]","").length()>0;
        System.out.println("gereklilik1 = " + gereklilik1);
        System.out.println("gereklilik2 = " + gereklilik2);
        System.out.println("gereklilik3 = " + gereklilik3);
        System.out.println("gereklilik4 = " + gereklilik4);
        System.out.println("Hepsi karsilaniyor mu" + (gereklilik1 && gereklilik2 && gereklilik3 && gereklilik4));

    }
}
