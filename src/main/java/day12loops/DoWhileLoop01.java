package day12loops;

public class DoWhileLoop01 {
    public static void main(String[] args) {


        int i = 1;

        while (i < 1) {

            System.out.println("While Loop");

            i++;


        }

        int k = 1;
        do {

            System.out.println("do-while loop");

        } while (k < 1);


        // Ex 1 : Bir ondalik sayinin ondalik kismindaki rakamlarin toplamini bulunuz.

        // 24,5673 ==>  +6+7+3 = 23

        double num = 24.5673;  // noktanin oldugu yerden kesilir.
        System.out.println(num); // 24.5673 bu double

        // split double da kullanilmaz. bunu string e cevirmek lazim. String claas a gidin value of methodu double i alir Stringe cevirir

        String str = String.valueOf(num);
        System.out.println(str);// output 24.5673  bu ise rakam olmasina ragmen String oldu. Asil mesele double stringe cevirmek.

        // Regex icin nokta kullandiginizda onune "\\" koyunuz.

        String decimalPart = str.split("\\.")[1];
        System.out.println(decimalPart); //5673

        int decimalInt = Integer.valueOf(decimalPart);

        System.out.println(decimalInt); // 5673

        int sum = 0;


        do {


            sum = sum + decimalInt % 10;
            decimalInt = decimalInt / 10;


        } while (decimalInt > 0);

        System.out.println(sum);

        //Ex. 2  34.749803 un ondalik kismini hesaplayan codu u yaziniz.

        double num2 = 34.749803;
        String str2 = String.valueOf(num2);
        String ondalikPart = str2.split("\\.")[1];
        int ondalikInt = Integer.valueOf(ondalikPart);
        System.out.println(ondalikInt); // 749803

        int sum2 = 0;
        do {
            sum2 = sum2 + ondalikInt % 10;
            ondalikInt = ondalikInt / 10;

        } while (ondalikInt > 0);
        System.out.println(sum2);


    }

}
