package day02datatypesmethodcreation;

public class Homework{

    /*
      1) Dikdörtgenin alanini hesaplayan methodu olusturun ve kullaniniz.

      2) Dikdörtgenin cevresini hesaplayan methodu olusturun ve kullaniniz.
     */


    public static void main(String[] args) {

        int sonuc = alanBul(4,8);
        System.out.println(sonuc);

        int sonuc2 = cevreBul (4,8);
        System.out.println(sonuc2);
        }

       public static int alanBul(int a, int b){

        return a*b;
       }

       public static int cevreBul(int a, int b){

        return 2*(a+b);
       }






}








