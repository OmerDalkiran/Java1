package assignments.Loops.WhileLoop;

public class LoopWhile {

    public static void main(String[] args) {

        // Ex 1. While Loop u kullanarak Ex 30 dan 40 ka kadar olan sayilari yan yana yazdir.

        int i = 30;
        while (i < 41) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        // Ex. 2 While lopp u kullanarak 30 dan 40 a kadar olan sayilarin toplamini yazdir.

        int k = 30;
        int sum = 0;

        k = 30;
        while (k < 41) {
            sum = sum + k;

            k++;
            {

            }
            //  System.out.print(+sum+ " "); //  30 61 93 126 160 195 231 268 306 345 385
        }
        System.out.print(+sum + " ");  // 385



        // Ex 4. WHILE LOOP kullanarak  20 den 50 ye kadar 7 ye bolunen tamsayilarin toplamini hesaplayan kodu yaziniz.


        int sum3 = 0;
        int m = 20;
        while (m < 51) {

            if (m % 7 == 0)
                sum3 = sum3 + m;

            {
                m++;
            }
        }
        System.out.print(sum3 + " ");  //175
        System.out.println();

        //60 tan 11'e kadar 4 ile bölünebilen ve 6 ile bölünebilen tüm tam sayıları aynı satırda iki
        //ardışık tam sayı arasında boşluk bırakarak yazınız.
         int a= 60;
        while(a>10){
            if (a%4==0 && a%6==0){
                System.out.print(a + " ");
            }
            a--;
        }
        System.out.println(a);
    }
}
