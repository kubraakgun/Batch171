package day10ifstatements;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;

public class IfStatements01 {
    public static void main(String[] args) {
        //Ornek : Verilen bir sayının pozitif, negatif ya da nötr oldugunu kontrol eden kodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int num = input.nextInt();

        if (num>0) {
            System.out.println("Pozitif");}
         else if (num<0) {
            System.out.println("Negatif");}
         else {
            System.out.println("Notr");}






    }
}

