package day09ifstatements;

public class IfStatements01 {
    public static void main(String[] args) {
        //Ornek 1:Sayi uc basamakli ise ekrana "Sayi uc basamaklidir!" yazdirin


        int number = -123;
        number = Math.abs(number);

        number = Math.abs(number);
        if(number>99 && number<1000){
            System.out.println("Sayi uc basamaklidir");

        }

        //Ornek 2: Bir Stringteki tekrarsiz caharacterleri ekrana yazdiriniz
        //     abbccdc  ==> ad                   a b b c c d c
                                              // 0 1 2 3 4 5 6
        String str = "aac";
        char ch1 = str.charAt(0);

        if (str.indexOf(ch1) == str.lastIndexOf(ch1)){ //a yazmaz
            System.out.println(ch1);
        }

        char ch2 = str.charAt(1);
        if (str.indexOf(ch2) == str.lastIndexOf(ch2)){ // a yazmaz
            System.out.println();
        }

        char ch3 = str.charAt(2);
        if (str.indexOf(ch3) == str.lastIndexOf(ch3)){ // c yazar
            System.out.println(ch3);
        }














    }
}
