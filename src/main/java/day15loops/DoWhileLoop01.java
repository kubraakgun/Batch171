package day15loops;

public class DoWhileLoop01 {
    public static void main(String[] args) {
         /* while loop kalıbı

            başlangıç degeri

        while(loop calısma kuralı){

            calısacak kodlar

            artırma/azaltma
        }*/

        //Ornek 1: 5 ten 3 e kadar tamsayilari console a yazdiriniz
        int a = 5;

        do {
            System.out.println(a);
            a--;
        }while (a>2);


        // 1) while-loop
        int i =1;
        while(i<1){
            System.out.println("Sen bir while loopsun..");
            i++;
        }
        //while loop ta zero execution mumkundur






        // 2) do-while-loop
        int k = 1;
        do {
            System.out.println("Sen bir do-while loopsun..");
            k++;
        }while (k<1);
        //do while kullandiginizda loop body en az bir kere calisir, zero executionmumkun degildir










    }
}
