package day03methodobjectcreationscanner;

public class MethodCreation01 {

    public static void main(String[] args) {
        double kup = getCube(5);
        System.out.println("kup= " + kup);

        print("java is easy");

        //method olusturmak icin 2. yol
        //Ornek 2. yol: Girilen bir kelimeyi ekrana yazdıran bir method oluşturup kullanınız.
        //main method içinde iken methodta kullanılacak olan variable lari olusturunuz
        String str = "TechproEdu";
        //method ismi ve parametreleri yazarız
        //kırmızı kısmın üzerinde bekleyip create methoda tıklarız intelijj otomatik olarak bir method oluşturur
        //daha sonra kendi isteğimize göre dizayn ederiz
        printConsole(str);


        //Ornek 4: Verilen bir tamsayinin  karesini hesaplayıp console a yazdıran methodu oluşturup kullanınız.

        int sayi = 5;
        karesiniAl(sayi);



    }

    private static void karesiniAl(int sayi) {
        System.out.println(sayi*sayi);
    }

    private static void printConsole(String str) {
        System.out.println(str);
    }

    //Orenk 1: Verilen bir ondalık sayının küpünü hesaplayan bir method olusturup kullanınız.
    static double getCube(double a) {
        return a * a * a;
    }

    //Note: Acces modifier i default yapmak isterseniz access modifier i YAZMAYINIZ...

    //Ornek 2: Girilen bir kelimeyi ekrana yazdıran bir method oluşturup kullanınız.
    public static void print(String str){
        System.out.println("str = " + str);
    }

    //Eger bir method yeni bir data üretmiyorsa return typ i void olur.
    //Methodun return typ i void ise method body icinde return keywordu yazilmaz.







}