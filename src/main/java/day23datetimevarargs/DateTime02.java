package day23datetimevarargs;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {

        //Anlik zmaani nasil aliriz?
        LocalTime myCurrentTime = LocalTime.now();
        System.out.println(myCurrentTime);//23:28:31.873260800 sondaki nano saniye


        //Anlik zamanda bilesenler nasil alinir?
        int hour = myCurrentTime.getHour();
        System.out.println(hour);

        int minute=myCurrentTime.getMinute();
        System.out.println(minute);

        int second = myCurrentTime.getSecond();
        System.out.println(second);

        int nano = myCurrentTime.getNano();
        System.out.println(nano);


        //Gelecek ve gecmise nasil gidilir?
        LocalTime next = myCurrentTime.plusMinutes(13).plusHours(3).minusMinutes(13).minusHours(3);
        System.out.println(next);      //plus eklemek                                      minus çıkarmak

        //Zaman formati nasil degistirilir?
        /*
        DateTime classta kullanilan tarih saat formatlari
        HH : mm ==> 24 lu saat sistemi
        hh : mm ==> 12 li saat sistemi AM, PM gösterilmez
        hh : mm a ==> 12 li saat sistemi AM, PM gösterilir
        HH : mm : ss == 24 lu saat sistemi
        HH : MM ==> Yanlis format MM aylar icin kullanilir
        "mm" minutes demektir. "MM" month demektir

        dd-MM-yyy ==> gun ay yil
        MMM ==> Aug
        MMMM ==> August
         */
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern(  "HH : mm" );
        String formattedMyCurrentTime = dtf1.format(myCurrentTime);
        System.out.println(formattedMyCurrentTime);//23 : 49

        //Date formati nasil degistirilir?
        LocalDate myDate = LocalDate.of(2023,8,13);
        System.out.println(myDate);//2023-08-13

        //Tarihi AY/GUN/YIL sekline ceviriniz
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedMyDate = dtf2.format(myDate);
        System.out.println(formattedMyDate);//08/13/2023


        //Tarih GUN/Ay isminin ilk 3 harfi / YIL sekline ceviriniz 25/Aug/22
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MMM/yy");
        String formattedMyDate2 = dtf3.format(myDate);
        System.out.println(formattedMyDate2);//13/Ağu/23


        //Tarih GUN/Ay ismi / YIL sekline ceviriniz 25/Aug/22











    }
}
