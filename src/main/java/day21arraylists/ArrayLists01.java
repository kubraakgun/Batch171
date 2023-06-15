package day21arraylists;

import java.util.ArrayList;

public class ArrayLists01 {
    public static void main(String[] args) {
        /*
        1) Ayni data typindaki coklu datalari depolamak icin Array kullaniriz
        2) Arraylerin negatif bir yonu var, icine koyacaginiz eleman sayisini en basta belirlemek zorundasiniz
        3) Arrayler eleman sayisinda esnek degildirler bu yuzden java "Arraylist" adlı yeni bir yapı olusturdu
        Bu yapi eleman sayisinda esnektir.Hic eleman koymazsaniz eleman sayisini sifir olarak ayarlar.
        1000 eleman koyarsaniz eleman sayisini 1000 olarak ayarlar
        4) Arraylist yerine sadece "List" de diyebilirsiniz
        5) Java Arraylistleri olusturduktan sonra Arrayleri iptal etmedi cunku;
             a)Arrayler super hizlidir
             b)Arrayler memoryde cok az yer kaplar
             c)Bu nedenle eleman sayisi belli olan dataları depolamak icin Arrayler tercih edilir
         6) Arrayler primitive data type lari ve referancelari depolayabilir
            Ama Arraylist ler non-primitive data type lari depolar, bu nedenle Arraylistler Arraylerden daha fazla yer kaplar
         */

       //ArrayList nasil olusturulur?
        ArrayList<Integer> ages= new ArrayList<Integer>();

        //ArrayList console a nasil yazdirilir?
        System.out.println(ages);

        //ArrayList lere eleman nasil eklenir?
        //ArrayListlere eleman eklemek icin add() methodunu kullaniriz
        //add() methodu elemanlari sizin verdiginiz sirada "List" e ekler(insertion order)
        ages.add(9);
        ages.add(12);
        ages.add(10);
        ages.add(1,656);
        ages.add(3,777);
        ages.add(888);
        System.out.println(ages);//[9, 656, 12, 777, 10, 888]


        //List'e coklu eleman nasil eklenir? veya List'e baska bir list nasil eklenir
        //Bir liste coklu eleman eklemek icin o elemanlari oncelikle bir listin icine koymalisiniz
        ArrayList<Integer>newAges = new ArrayList<>();
        newAges.add(8);
        newAges.add(9);
        newAges.add(10);
        System.out.println(newAges);//[8, 9, 10]

        ages.addAll(newAges);
        System.out.println(ages);//[9, 656, 12, 777, 10, 888, 8, 9, 10]

        ages.addAll(2,newAges);
        System.out.println(ages);//[9, 656, 8, 9, 10, 12, 777, 10, 888, 8, 9, 10]

        //ArrayList de eleman sayisi nasil bulunur?
        //size() methodu bir listteki eleman sayisini verir
        int numOfElement = ages.size();
        System.out.println(numOfElement);//12


        //ArrayList te specifik bir eleman nasil alinir?
        //get() methodu index kullanarak istedgimiz elemani almaya yarar
        int el1 = ages.get(1);
        System.out.println(el1);//656

        //ArrayList te specific bir elemani nasil degistirebiliriz?
        ages.set(6,111);
        System.out.println(ages);//[9, 656, 8, 9, 10, 12, "111", 10, 888, 8, 9, 10]

        ages.set(4,313);
        System.out.println(ages);//[9, 656, 8, 9, "313", 12, 111, 10, 888, 8, 9, 10]

        //Bir list te tum elemanlari nasil silebiliriz?
        // ages.clear();
        // System.out.println(ages);

        //ArrayListte specific bir elemanin var olup olmadigini nasil anlariz?
        boolean r = ages.contains(313);
        System.out.println(r);

        //Bir Arraylist in bos olup olmadigini nasil kontrol ederiz?
        //isEmpty methodu Arraylist bos ise true bos degilse false return eder.
        boolean r2 = ages.isEmpty();
        System.out.println(r2);

        //Ornek 1: Size verilen bir listin bos olup olmadigini kontrol eden kodu yaziniz.
        ArrayList<String> names = new ArrayList<>();
        names.add("Gulce");
        names.add("Seda");
        names.add("Benna");
        names.add("Rıdvan");
        names.add("Enes");

        //1. yol:
        if (names.size()==0){
            System.out.println("List is empty");
        }else{
            System.out.println("List has at least 1 element"); //list en az 1 elemana sahiptir.
        }

        names.clear();

        //2. yol:
        if (names.isEmpty()){
            System.out.println("List is empty");
        }else{
            System.out.println("List has at least 1 element");
        }


        /*
        Bir methodu ogrenirken asagidaki uc seyi ogrenin
        1) O method ne is yapar?
        2) O method nasil kullanilir?
        3) O method size neyi verir?
         */

















    }
}
