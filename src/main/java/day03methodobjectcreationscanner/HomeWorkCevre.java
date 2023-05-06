package day03methodobjectcreationscanner;

public class HomeWorkCevre {
    /*
    Homework
    1)Çemberin cevresini hesaplayan methodu olusturunuz ve kullanınız
    2)Dairenin alanini hesaplayan methodu olusturun ve kullanınız
     */


    public static void main(String[] args) {

        double sonucCember = cemberCevre(10);
        System.out.println("sonucCember = " + sonucCember);

        double sonucAlan = cemberAlani(50);
        System.out.println("sonucAlan = " + sonucAlan);

    }


    public static double cemberCevre(double a) {
        return a * 3.14 * 2;
    }


    public static double cemberAlani(double b) {
        return (b * b) * 3.14;
    }


}










































