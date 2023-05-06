package day03methodobjectcreationscanner;

public class Runner {

    public static void main(String[] args) {
        //Object nasil olusturulur
        //new keywordu sifirdan yeni bir object olusturmak icin kullanilir
        //Constructor java da objeleri olusturmak icin kullanılan ozel bir methodtur
        //Class ismi + Object ismi + Assignment Operator + "new" keywordu + Constructor
               Car          myCar              =                new             Car();

        System.out.println("myCar.fiyat = " + myCar.fiyat);
        System.out.println("myCar.model = " + myCar.model);

        myCar.hareket();
        myCar.dur();

        Student aliCan = new Student();
        System.out.println("aliCan.name = " + aliCan.name);
        System.out.println("aliCan.adress = " + aliCan.adress);
        System.out.println("aliCan.grade = " + aliCan.grade);
        aliCan.study();
        aliCan.feed();


        //homework
        //içinde isim ve yaş olsun variable lari ile teach methodu bulunan bir Teacher objecti oluşturun ve obje uzerinde bu ozellikleri kullanin


        Teacher Gul= new Teacher();
        System.out.println("Gul.name = " + Gul.name);
        System.out.println("Gul.age = " + Gul.age);
        Gul.memory();

    }





    }


