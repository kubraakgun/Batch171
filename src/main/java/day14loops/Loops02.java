package day14loops;

public class Loops02 {
    public static void main(String[] args) {
        //Ornek 1: 5 den 8 e kadar tamsayilarin toplmaini veren kodu yaziniz
        //  5+6+7+8 ==> 26

        int sum = 0;

        for (int i = 5; i < 9; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

        //Ornek 2: 7 den 9 a kadar tamsayilarin carpimini veren kodu yaziniz
        // 7*8*9 ==> 504

        int multiply = 1;

        for (int i = 7; i < 10; i++) {
            multiply = multiply * i;

        }
        System.out.println(multiply);


        //Ornek 3: Verilen bir tamsayinin rakamlarinin toplamini bulan kodu yaziniz
        //578 ==> 5+7+8 = 20
        //Cozum : 578%10==>8   578/10 ==>57.8 ("8" silinir)    57%10==>7   57/10==5.7 ("7" silinir) 5%10==>5  5/10==>0.5 ("5"silinir)

        int toplam = 0;
        int n = -578;
        n = Math.abs(n);



        for (int i = n; i > 0; i = i / 10) {
            toplam = toplam + i % 10;
        }
        System.out.println(toplam);

    }

}
