package assignments.Loops;

public class LoopToplamBulan {
    public static void main(String[] args) {


        // Ex. 1 3 ten 7 ye kadar olan sayilarin toplamini bulduran kodu yaziniz.

        int sum = 0;
        for (int i = 3; i < 7; i++) {
            sum = sum + i;
            System.out.println(sum);
        }

        // Ex. 2  10 dan 100 e kadar olan cift sayilarin toplami nedir?

        int sum1 = 0;

        for (int i = 10; i < 101; i += 2) {
            sum1 = sum1 + i;


        }
        System.out.println(sum1);


        // Ex 3  10 dan 30 a kadar 5 e bolunen sayilarin toplamini bulan kodu yaziniz.

        int sum2 = 1;

        for (int i = 10; i < 31; i += 5) {

            sum2 = sum2 + i;
            System.out.print(sum2+ " ");
        }
        System.out.println("\n"+ sum2);



        int sum3=1;
        for(int i = 6; i>2; i--){

            sum3 = sum3*i;
            System.out.print(sum3+" ");
        }

    }
}

