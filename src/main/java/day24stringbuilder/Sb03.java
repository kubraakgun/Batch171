package day24stringbuilder;

public class Sb03 {
    public static void main(String[] args) {
        /*
        1) StringBuffer javada string ureten bir diger classtir
           StringBuffer javanin string uretmek icin olusturdugu ilk classtir

        2) StringBuffer, StringBuilder a cok benzer, yani ikiside "mutable" string uretir
        3) StringBuffer "multi-thread" dir ama StringBuilder "multi-thread" degildir.
        4) StringBuilder "multi-thread" olmadigi icin StringBuffer dan daha hizli calisir
        5) "multi-thread" yapilirken yapilan islerin siralamasi onem arz eder ,
            yapilan isleri mantikli bir siraya koymak "synchronized" dir.

        3 tane String olusturan Class ogrendik;
            1)immutable string lazimsa ;String Class
            2)mutable string lazimsa; StringBUilder veya StringBuffer
                 a)StringBuilder i "multi-thread" gerekmezse kullanmayiz
                 b)StringBuilder i "multi-thread" gerekirse kullaniriz     */


        StringBuffer sbf = new StringBuffer("Java");
        System.out.println(sbf);//Java


        System.out.println(sbf.capacity());

















    }
}
