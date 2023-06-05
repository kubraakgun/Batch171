package day01variables;

public class Variables01 {

    public static void main(String[] args) {
        //java bu satırı okumaz, kendimize ve başkalarına açıklama satırıdır

        /*
        java bu satırları da okumaz
        */


        //Variable nasıl oluşturulur?

        //Data type + variable name + Assigment Operator(atama operatörü) + Variable değeri+noktalı virgül
        int age = 13;


        //java cümlesi => statement
        //Dil bigisindeki nokta neyse javadaki noktalı virgül ; aynı şeydir,statement in bittiğini gösterir.
        //Eğer variable declaration yapar,Assignment  yapmazsanız java kendi default değerlerini koyar.
        //Default değer sayılar için sıfırdır.
        //Java da "=" assignment operatördür. ve java bu operatörü gördüğü zaman önce sağ tarafı çalıştırır.
        //ve sağdaki değeri alır soldaki kutuya koyar
        //Javada eşittir demek "=="     Matematikte"=",  Javada "=="
        //Data type + VariableName ==> Variable declarition
        //Assignment Operatör  (=)  +  Variable değeri  ==> Assignment



        /*
        Javada temelde iki tip data vardır
         1)primitive data type:
             char, boolean, short, int, long, float, double
         2)non-primitive data type:
             string
         */


        //Örnek 1: Öğrenci ismi için variable oluşturup değer olarak Ali can atayınız
        //Data type + variable name + Assignment Operatör(atama operatörü)  + Variable değeri+noktalı virgül
        String ogrenciAdi = "Ali Can";

        //Stringlere verilen değerler daima çift tırnak içinde yazılmalıdır
        //stringler için "default value"(==>varsayılan değer) "null" dır
       /*
       String bir variable oluşturduğumuzda çoğu zaman ona bir değer atarız. Atama yapmazsak, java o variable a
      varsayılan değer olarak null koyar
      -null demek 0 demek değildir ,0 da codingte bir değerdir, null hiçlik demektir.
      -içinde variable ya da method bulunmayan boş bir obje demektir
        */


        //char data type
        //TEK karakterler için kullanılır .Sayı,sembol ya da harf farketmez
        // örneğin==> A, x, ?, 5,....
        //örnek2: char data tipinde  bir ismin ilk harfi olarak bir variable oluşturunuz ve bir değer atayınız
        char isminilkharfi = 'A';

        //Note: char data type inda değerler daima tek tirnak içinde yazilmalidir


        //boolean data type:
        //booleanlar sadece iki farklı değer alabilir; true (doğru) veya false (yanlış)
        //o yuzden isimlendirme yapilirken ingilizce olarak mi? soru eki anlamında basina is konulur
        //Ornek 3:boolean data tipinde emekli misin sorusu için bir variable oluşturun ve false değerini atayın.


        boolean isRetired = false;


        //byte data type
        //tam sayılar için kullanılır, hafızada 1 byte yer kaplar
        //byte : -128 den +127 ye (dahi) kadar tamsayi değerleri için kullanılır
        //Ornek 4: byte data tipinde öğrenci yaşı için bir variable oluşturunuz ve değer atayınız.

        byte ogrenciYasi = 18;


        //short data type
        // tam sayılar icin kullanilir, hafızada 2 byte yer kaplar
        //short : -32768 den +32767 e (dahi) kadar tamsayi değerleri için kullanilir


        //Ornek5: Site nufusu için bir variable oluşturup değer atayınız .
        short siteNufusu = 1300;


        //int data type
        //tam sayılar için kullanılır, hafızada 4 byte yer kaplar
        //int : -2,147,438,648 ile 2 147,438,647 (dahil) kadar tamsayı değerleri için kullanılır

        //Ornek 6: ulke nufusları için bir variable oluşturun ve değer ataması yapınız
        int ulkeNufusu = 131313131;


        //long data type:
        //tam sayılar için kullanılır , hafızada 8 byte yer kaplar
        //long -9,223,372,036,854,775,808 ile 9,223,372,036,854,775,808 (dahil) kadar tamsayı değerleri için kullanılır

        //Ornek 7: Insan vucudundaki hucre sayısı için variable oluşturup değer ataması yapınız

        //Note:Bir değer long ise sonuna "L" (tavsiye edilir) veya l koyulur
        long cellNumberInHumanBody = 1245468795674566L;


        //Eğer long a atadığınız değer int lerin araliğinda ise sonuna "L" koymaya gerek yok
        //Long dememize rağmen sonuna L koymazsak eğer int aralığında ise java onu int kabul eder


        //float data type :
        //float virgullu sayilar (Decimal Numbar => ondalikli sayılar) için kullanılır(Fiyatlandırmalar - 12.999

        //Ornek 8: Gomlek ve ayakkabı fiyatları için iki tane variable oluşturun

        //Java ondalikli sayıları otomatik olarak "double" kabul eder.
        //Siz data type ini float yazarsanız hata alırsınız, float olmasında ısrar ediyorsanız sonuna "F","f" koymalısınız
        float shirtPrice = 12.99F;
        float shoesPrice = 15.99f;


        //doble data type: 8 byte yer kaplar
        //ondalıklı kısmı için daha fazla rakam olabilir . Hücre ağırlığı gibi bilimsel çalışmalarda kullanılabilir

        //Ornek 9: Hucre ağırlığı ve Amip in agirligi icin iki tane variable olusturunuz

        double hucreAgirligi = 0.00000000000013;
        double amipAgirligi = 0.000000000000003;

        // Ornek 10: Ogrenci notlari icin iki adet variable olusturunuz ve toplamlarını ekrana yazdırınız.
        byte note1 = 50;
        byte note2 = 70;

        System.out.println(note1); //ekrana yazdırır
        System.out.println(note2);

        //System.out.println(); ekrana yazdırır ve bir sonraki satıra koyar
        //System.out.print(); ekrana yazdırır ve pointer ı aynı satırdir
 /*
ctrl+x Kes
ctrl+v Yapıştır
ctrl+c kopyala
ctrl+a Tümünü seç
ctrl+z Geri al
 */





















    }
}

