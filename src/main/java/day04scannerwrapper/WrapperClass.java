package day04scannerwrapper;

public class WrapperClass {
    public static void main(String[] args) {


        //primitive     :  char    - boolean - byte - short - int     - long  - float - double
        //Wrapper Class :Character - Boolean - Byte - Short - Integer - Long  - Float - Double

        //Wrapper Class lar non primitive dir. o yuzden memory de cok yer kaplarlar
        //o yuzden sart degilse Wrapper class kullanmayı tercih etmeliyiz
        //n yazip nokta koyarsaniz hiç method gormezsiniz , cunku primitiveler method icermez
        int n= 12;

        //m yazip nokta koyarsaniz bircok method gorursunuz, cunku wrapper classlar method icerir

        Integer m=12;

        byte p = 13;
        Byte r = 13;
        

        //Ornek 1: short data type inin minimum ve maximum degerlerin kod yazarak bulunuz
        short maxShort = Short.MAX_VALUE;
        System.out.println("maxShort = " + maxShort);

        short minShort = Short.MIN_VALUE;
        System.out.println("minShort = " + minShort);

        //Ornek 2: int data type inin minimum degeri ile byte data type inin maximum degerleri toplamınız bulunuz.

        int intMin = Integer.MIN_VALUE;
        byte byteMax = Byte.MAX_VALUE;
        System.out.println(intMin + byteMax);//-2147483521


        //Ornek 3:Primitive inti i Wrapper Int e ceviriniz.(AutoBoxing)
        int num = 19;

        Integer wrapperNum = num;

        //Ornek 4: Wrapper Byte i primitive byte a ceviriniz(Unboxing)
        Byte k = 19;
        byte primitiveK =k;


        //Ornek 5: Primitive char ı Wrapper Character e ceviriniz(AutoBoxing)
        char initial ='T';
        Character initialWrapper = initial;


        //Ornek 6: Wrapper Boolean i ptimitive boolean a ceviriniz.(UnBoxing)
        Boolean isOldWrapper = true;
        boolean isOld =isOldWrapper;













    }


}
