package day22arraylistsdatetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class DateTime01 {
    public static void main(String[] args) {

        //Icinde bulundugumuz zaman dilimindeki tarihi nasil aliriz?
        LocalDate myCurrentDate = LocalDate.now();
        System.out.println(myCurrentDate);//2023-06-07

        //Tarihten istedigimiz bilesenleri nasil aliriz?
        int monthValue = myCurrentDate.getMonthValue();
        System.out.println(monthValue);//6

        int yearValue = myCurrentDate.getYear();
        System.out.println(yearValue);//2023

        int dayValue = myCurrentDate.getDayOfMonth();
        System.out.println(dayValue);//7


        //Month bir enum dir (Aklımızda depo olarak kalabilir)
        //Enum javada sabit degerler (Ay isimleri, Gun isimleri, Ulkedeki sehir isimleri) depolamak icin kullanilir
        Month monthName = myCurrentDate.getMonth();
        System.out.println(monthName);//JUNE


        //DayOfWeek bir enumdir
        DayOfWeek dayName = myCurrentDate.getDayOfWeek();
        System.out.println(dayName);//WEDNESDAY

        //İleriki tarihe nasil gidilir?
        System.out.println(myCurrentDate.plusDays(5).plusMonths(2).plusYears(3));


        //Gecmis tarihe nasil gidilir?
        System.out.println(myCurrentDate.minusYears(20).minusMonths(2).minusDays(5));


        //Specific bir tarih objesi nasil olusturulur?
        LocalDate date1 = LocalDate.of(2002,11,8);
        LocalDate date2 = LocalDate.of(2001,4,18);


        //Bir tarihin bir tarihten sonra olup olmadigini nasil kontrol ederiz?
        boolean r1 = date1.isAfter(date2);
        System.out.println(r1);//true

        boolean r2 = date1.isBefore(date2);
        System.out.println(r2);//false

        boolean r3= date1.isEqual(date2);//iki tarih birbirine esit mi
        System.out.println(r3);//false





    }
}
