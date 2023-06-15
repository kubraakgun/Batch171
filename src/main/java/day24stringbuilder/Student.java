package day24stringbuilder;

public class Student {
  /*
          Access Modifier

          1)public
          2)protected
          3)default(Access Modifier i default yapmak icin access modifier yazmayiz)
          4)private

          Note: Access Mofifier leri genisten dara dogru siralayiniz
          public > protected > default > private

          Note: pulic --> olanlar her classtan kullanilabilir
                protected --> olanlar baska package lardan kullanilamaz
                ama baska package ta child class icinden kullanilabilir
                default --> olanlar baska package dan kullanilamazlar
                private --> olanlar sadece olusturulduklari class icinde kullanılabilirler


          Note: "protected" ile "default"un farkini söyleyiniz?
          protected olanlar baska package tan kullanilamaz ancak baska package ta chil class icinden kullanilabilir
          default olanlar baska package dan kullanilamazlar   */



         //public her classtan kullanilabilir
         public String stdName ="Ali Can";

         //protected olanlar baska package dan sadece child classlardan gorülür
         protected String address="Istanbul";

         //default olanlar baska package dan kullanilamazlar
         String email="alican@gmail.com";


         //private olanlar sadece olusturulduklari class icinde kullanilabilirler
         private String SsnId ="123456789";

}
