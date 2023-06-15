package day25inheritance;

public class Animal {
    //Inheritance ==> miras alma
    /*
    Ozellikleri bir classtam diger classlara alan bir kavramdir
    Mesela siz bir class olusturmak istiyorsunuz ama daha once olusturulmus
    bir class sizin istediginiz ozelliklerin cogunu kaplıyor o zaman yeni olusturdugunuz
    class ı ozelliklerini kullanmak istediginiz class a child yaparsiniz

    Inheritance ın faydalari
    1) Code tekrarlarindan kurtuluruz
    2) Code tamiri(maintenance)  kolay olur
    3) Child classlari daha atomik yapmis oluruz

    => Bir classi baska bir classin child classi yapmak icin
    extends keywordu kullanilir.Ilk yazilan child, ikinci yazilan class
    parent olur. Parent class a super classta denir.

    => Child class objeleri parent classtan methot ve variable lari kullanabilirler
    => Parent class objeleri child classtan method ve variable

    => Javada bir class in sadece 1 tane parenti olabailir, coklu parenta "Multiple Inheritance" derler,
    tekli parenta "single inheritance" derler. Java "Multiple Inheritance" i desteklemez. Java

    => Apartman seklindeki inheritance yapisina  "MultiLevel Inheritance" denir, java multilevel inheritance i destekler

    => Object class her classin parentidir.Javada object class haric her classin parenti vardir
       Javada parenti olmayan tek class object classtir

    => Javada parent tan child a olan iliskilere "HAS-A Relation Ship" denir
       child dan parenta olan iliskilere "IS-A Relation Ship" denir


    => Javada her classin bir tane default    

  */

    public void eat(){
        System.out.println("Animals eat...");
    }

    public void drink(){
        System.out.println("Animals drink...");
    }

































}
