package day15loops;

import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args) {
        /*

               Example 1: Asagidaki sekli cizen kodu yaziniz

                 1
                 1 2
                 1 2 3
                 1 2 3 4
                 1 2 3 4 5
 */

        Scanner input = new Scanner(System.in);

        System.out.println("Satir (row) sayisini giriniz..");
        int row = input.nextInt();

        for (int i = 1; i <= row; i++) {//1 den baslar bizim koydugumuz sayı kadar calisir

            for (int k = 1; k <= i; k++) {//Disardaki gelen loop degerine göre limit belirleyerek calisiyor

                System.out.print(k + " ");

            }
            System.out.println();//Tek görevi inner loop tamamlandiktan sonra pointeri bir sonraki satira almak
        }


    }

}
