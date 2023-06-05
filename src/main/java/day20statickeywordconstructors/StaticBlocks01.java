package day20statickeywordconstructors;

public class StaticBlocks01 {

    //Bir variable olusturdugunuzda, deger atamazsanız o variablı "initialize" etmediniz demektir
    static double pi;

    static String shape;
    //Note : static bloklar static variable ları initalize etmek icin kullanilirlar
    //ve class icinde her seyden once kullanılırlar
    //birden fazla static block oldugunda static bloclar yukarıdan asagıya dogru yani yukarida olan once calisir
    static{
        shape="Circle";
        System.out.println("Static block 2");
    }

    static {
        pi=3.14;
        System.out.println("Static block 1");
    }

    public static void main(String[] args) {
        /*Bazen main method dan calistirilmadan once variable larin hazir hale getirilmesi gerekir .
          Bu nedenle static blocklara ihtiyac duyabiliriz

          static variable lar static bloclar icinde initialize edilirse o class ın icinde her seyden once hazır
          hale getirilmis olur
         */

        System.out.println(pi);
        System.out.println("main method");







    }










}
