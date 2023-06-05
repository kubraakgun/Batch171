package day15loops;

public class WhileLoop01 {
    public static void main(String[] args) {

        //Kalıbını oluşturalım

        /*for (baslangic degeri; loop calisma kuralı; artırma azaltma){
            calısacak kadar
        }
      */

       /* while loop kalıbı
        başlangıç degeri
        while(loop calısma kuralı){
            calısacak kodlar
                    artırma/azaltma
        }*/

        //Ornek 1: 3 ten 6 ya kadar tam sayilari console a yazdiriniz
        //1. Yol : for loop
        for (int i = 3; i < 7; i++) {
            System.out.println(i + " ");
        }
        System.out.println();

        //2.Yol : while loop
        int i = 3;
        while (i < 7) {
            System.out.println(i + " ");
            i++;
        }
        System.out.println();

        //Ornek 2: 23 ten 12 ye kadar cıft sayilari console a yazdiriniz
        int k = 23;
        while(k>11){
            if (k%2==0)//eger k cift ise demek
            System.out.print(k+" ");

            k--;
        }
        System.out.println();
        //Ornek 3: 6 dan 19 a kadar tum tek sayilari console a yazdiriniz.
        int m=6;
        while (m<20){

            if(m%2!=0){
                System.out.print(m+" ");
            }
            m++;
        }
























    }
}
