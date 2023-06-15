package day24stringbuilder;

public class Sb01 {
    public static void main(String[] args) {
      /*
     1) StringBuilder classı da string ureten bir classtir.
     2) String Class kullanarak string uretiriz, nicin StringBuilder classi da var?
          String Class immutable (degistirilemez) String uretir
          StringBuilder class mutable (degistirilebilir) String uretir
     3) Immutable olmak demek orijinal degerin korunmasi, degistirilemez olmasi demektir
      mutable olmak demek orijinal degerin degistirilebilir olmasi demektir

       */
        //Immutable
        String s = "Java";
        String t = s + "!";
        String w = t + "?";

        //Stringi degistirdikten sonra ayni string assign ederseniz, java yine yeni bir container olusturur.
        //degismis degeri bu yeni container in icine koyar ve eski container i gosteren pointer yeni container a yonlendirir
        //Dolayisiyla eski container adressiz kalir,ve "Garbage Collector" adressiz olan container lari siler

        String a = "Money";
        a = a + "More";


        //mutable
        //StringBuilder kullanarak string olusturmanin 1. yolu
        StringBuilder sb1 = new StringBuilder("Python");
        System.out.println(sb1);//Python
        sb1.append("!");
        System.out.println(sb1);//Python


        //StrinBuilder kullanarak string olusrurmanin 2. yolu
        StringBuilder sb2 = new StringBuilder();
        System.out.println(sb2.length());//0
        System.out.println(sb2.capacity());//16


        sb2.append("Java");
        sb2.append("xxxxxxxxxxxxxxx");

        //capacity() ve lenght arasindaki fark nedir?
        System.out.println(sb2.length());//4
        System.out.println(sb2.capacity());//34

        //capaticy() javanin size verdigi data depolama yer sayisidir
        //lenght ise size verilen data depolama yerinin kullanilan kismidir
        // Java baslangic olarak size capacity i 16 olarak verir, eger siz verilen capacity asarsaniz
        //Java yeni capaticy i varolanin 2 katinin 2 fazlasi olacak sekilde degistirir
        //16==> 16*2+2            34==> 34*2+2

        //StringBuilder kullanarak string olusturmanin 3. yolu
        //default capacity i nasil degistirebiliriz?
        StringBuilder sb3 = new StringBuilder(3);
        sb3.append("ali");









    }
}
