package day20statickeywordconstructors;

public class Student {
    /*
    1) Static variable veya static methodlar (class member) tum objeler için ortak elemandır
    2) Static class member lar uzerinde yapılan tum degisiklikler tum objeleri etkiler
    3) Static class memberlar class a non-ststaic class memberlar objelere monte edilir
    Mesela bir classtan  100 tane obje olusturdugunuzda non-static olanlar 100 kere olusturulur
    ama static olanlar obje sayısından bağımsız olarak bir kere olusturulur.
    4) Static class memberlara ulasmak icin obje olusturmaya gerek duyulmaz.
    Ama non-static class memberlara ulasmak icin obje olusturmak sarttir
    5) Static variable larin diger adi "Class variable veya Object variable dir
       Non-static variable larin diger adi "Instance Variable" veya "Object Variable" dir
     */

    public static String stdName = "Tom Hanks";
    public int age = 13;

    public static void staticMethod(){
        System.out.println("Ben static methodum");
    }


    public void nonStaticMethod(){
        System.out.println("Ben static olmayan methodum");
    }








}
