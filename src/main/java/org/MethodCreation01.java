package day02variables;

public class MethodCreation01 {
    /*
    Java'da method nasıl oluşturulur?

    1)main methodun dışında class ın içinde oluşturulur

    2)Access Modifier + Return type + Method ismi + () + {}
     */

    /*
    oluşturulan methodlar nasıl kullanılır?
    1) Methodu oluşturmak methodu çalıştırmak için yeterli değildir. Kullanılmak istenen method main methodun
        içinden kullanılır.
    2)Method un ismini  + parantez() yazın
    3)Varsa işlem yapacağınız dataları parantezin içine koyun
      bu işlem method call (method çağırma) olarak adlandırılır
    4) method name ve parametreler ==> method signature
     */
    public static void main(String[] args){

      int sonuc= toplamaYap(3,5);
        System.out.println(sonuc);

        long carpmaSonucu = multiply(5,12);
        System.out.println(carpmaSonucu);

    }
    //ORNEK 1: toplama işlemi yapan method oluşturunuz

    public static int toplamaYap(int a,int b){// bu kısımda method kapsamında kullanılmasını ve işlenmesini istediğim dataları deklare ediyoruz
       return a+b;
       //return demek bu methodun çağırıldığı yere bu değeri return et demek (geri döndür) demek


    }
    //main method static olduğu için main method içinde kullanacağımız method static olmalıdır.

    //Ornek 2: 2 sayıyı çarpma işlemi yapan bir method oluşturunuz
    protected static long multiply(int a, int b){
       return a*b;


    }
    //Ornek verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu sayi ile toplayan methodu olusturunuz ve kullanınız

private static int firstTwoMultiplyThirdAdd(int a,int b,int c){

    return a*b+c;
    }
}


