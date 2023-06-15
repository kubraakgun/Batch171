package day26polymorhpshism;

public class Student {
    //Encapsulation ==> kapsulleme
    /*
     Encapsulation Nedir? (Data Hiding) veri saklamak
     data nasil saklanir?
     Access modifierlarini private yaparak datayi diger classlardan gorunmez hale getiririm
     boylece datayi saklarim
     Encapsulation yaptigimiz datayi istersek diger classlardan okuyabiliriz
     Nasil okuruz? getmethod olusturarak Encapsulate edilmis datanin degerini okuyabiliriz
     getter methodlarda parantez icine bir sey yazilmaz

     1) get methodlar public olur
     2) get methodun return typei okudugu variablein return typei ile ayni olur
     3) get methodun boolean bir variable icin olusturulmus ise get method ismi is ile baslar
     */
    private String stdId= "AC20230614";
    public String stdName = "Ali Can ";
    public int age=23;
    private double notOrt = 3.53;
    private boolean successful = false;

    public String getStdId() {
        return stdId;
    }

    public double getNotOrt() {
        return notOrt;
    }


    public boolean isSuccessful() {
        return successful;
    }
}

