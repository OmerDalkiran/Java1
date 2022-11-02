package farkliProjeler.odevVeAlistirmalar;

public class TypeCasting {
    // Short Data type ta bir degisken olusturunuz ve onu bir int degiskenine dönüstürünüz.

    public static void main(String[] args) {
        short yas = 12;
        int yeniYas = yas;
        System.out.println("yas "+ yeniYas); // print out is yas 12
        System.out.println("yeniYas" + 40);// print out yeniYas40
        System.out.println("yeniYas "+ 40);// print out yaniYas 40

        long yas1 =14L;
        int yeniYas1= (int) yas1;
        System.out.println("yas " + yas1); // print out yas 14

       /* Byte data tipinde bir değişken oluşturunuz ve onu bir double değişkenine dönüştürünüz.
                Sonrasında bu double değişkenin değerini konsolda yazdırınız.
                Not : Çıktıya dikkat ediniz, ondalık bir değer olmayacaktır.*/

        byte age = 23;
        double newAge = age;
        System.out.println(newAge); //

       // Double data tipinde bir değişken oluşturunuz ve onu bir short değişkenine dönüştürünüz.
              //  Sonrasında bu short değişkenin değerini konsolda yazdırınız.
                //Not : Çıktıya dikkat ediniz, ondalık bir değer olmayacaktır.

        double fiyat = 1.2;
        short yeniFiyat = (short) fiyat;
        System.out.println(yeniFiyat); // cikti = 1    ondalik kesimi atilmis

        double fiyat1 = 11789;
        short yeniFiyat1 = (short) fiyat;
        System.out.println(yeniFiyat1); // cikti = 1  niye? cunku fiyati yukaridan aldi.ikincisinde fiyat1 yazmamiz gerekirdi!!!

        double fiyat2 = 11789;
        short yeniFiyat2 = (short) fiyat2;
        System.out.println(yeniFiyat2); // cikti = 11789

        //Double data tipinde bir değişken oluşturunuz ve onu bir float değişkenine dönüştürünüz

        double yol = 15;
        float newYol = (float) yol;
        System.out.println(yol); // cikti 15.0
        System.out.println(newYol); //cikti 15.0





    }
    }
