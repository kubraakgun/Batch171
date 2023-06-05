package day19passbyvaluemethodoverloading;

public class PassByValue01 {
    public static void main(String[] args) {
        //Note :Java "pass by value" sayesinde variable larin orjinal degerlerini korur
        int shirtPrice = 100;

        //java methoda gönderirken orjinal degeri degil,kopyasini gönderir ve degisen deger kopya deger olur
        System.out.println(discount("student",shirtPrice));//90
        System.out.println(discount("veteran",shirtPrice));//80
        System.out.println(discount("senior",shirtPrice));//95


        //Normalde indirim yaptık discount methodu ile ama buradaki deger hala orjinal
        System.out.println(shirtPrice);//100

        shirtPrice=discount("veteran",shirtPrice);
        System.out.println("shirtprice kampanya"+shirtPrice);


    }

    //Discount Methodunu olusturalim
    public static int discount(String type, int price){
        switch (type){
            case "student" :
                price=price-10;
                break;

            case "veteran" :
                price=price-20;
                break;

            case "senior" :
                price=price-5;
                break;

            default:
                price=price;
        }
        return price;
    }
/*
     Pass By Value:
     1) Java "pass by value" kullanır
     2) Yani; java methodlarin orjinal degeri degistirmesine müsade etmez
     3) Java method lara deger yollarken orjinal degerin kopyasini olusturur veo o kopyayi method a yollar.
        Method kopya deger uzerinde degisiklik yapar, boylece original deger korunmus olur.
     4)Java esnek bir dildir istersek yazdiğimiz kod ile orjinal degerin degismesini de temin edebiliriz
     Bakiniz line 16


     Pass By Referance:
     1) Pass by Referance da method a  referance yollanir
     2) Referance adres demektir. Adres yollaninca method adresi kullanarak orjinal degere ulasir ve orjinal degeri degistirir
     Bu yüzden "C#" gibi Pss By Referance kullanan method variable in orjinal degerini degistirir.

 */











}
