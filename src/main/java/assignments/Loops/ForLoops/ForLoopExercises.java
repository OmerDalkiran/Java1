package assignments.Loops.ForLoops;

public class ForLoopExercises {

    public static void main(String[] args) {


        //Example 3: 4 den 7 e kadar tum tamsayilari ekrana yazdiran kodu yaziniz
        for (int i = 4; i < 8; i++) {
            System.out.print(i + " ");   // output =  4 5 6 7
        }

        for (int i = 4; i < 8; i++) {
            System.out.println(i + " ");  // = 4 5 6 7 4
            //     5
            //     6
            //     7
            // Bu ikisini beraber calistirinca boyle cikti.

        }
        System.out.println();
        {

            //Example 1: 3 den 6 a kadar tamsayilarin toplamini bulan kodu yaziniz
            int sum = 0;
            for (int i = 3; i < 7; i++) {
                sum = sum + i;
            }
            System.out.println(sum);

        }
        System.out.println();
        {
        }
        // Ex 1 den 99 a kadar olan tek sayilarin toplamini yazan kodu yaziniz.
        int sum1 = 0;
        for (int n = 1; n < 100; n = 2 * n - 1) {
            sum1 = sum1 + n;
        }
        System.out.println(sum1);

        //  Aşağıdaki çarpım tablosunu oluşturmak için kod yazınız.
        //  3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30

        int num = 3;
        for (int i2 = 1; i2 < 11; i2++) {
            System.out.print(num + "x" + i2 + "=" + num * i2);
        }

        //60 tan 11'e kadar 4 ile bölünebilen ve 6 ile bölünebilen tüm tam sayıları aynı satırda iki
        //ardışık tam sayı arasında boşluk bırakarak yazınız.
        int a = 60;
               for (int i = a; i > 10; i--) {
            if (i % 4 == 0 && i % 6 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}