package assignments.Loops.ForLoops;

public class ForLoop2 {
    public static void main(String[] args) {

        // Ex 5: 10dan 9oa kadar olan tek sayilari yazdiriniz.
        for(int i=10; i<91; i++){

            System.out.print(i+" ");
        }

         // Ex 6 10dan 90 a kadar olan sayilarin toplamini yazdiriniz/
        int i, sum=0;
        for(i=10; i<91; i++){


            sum+=i;
        }
        System.out.println("\n"+sum);


        // Ex 7: 10 dan 90a kadar olan tek sayilarin toplamini yazdiriniz.

        int s, sum2=0;
        for(s=10; s<91; s++){

            if((s%2==1)){
                sum2+=s;

            }

        }
        System.out.println("\n"+sum2);
       // Ex 8 10dan 90a kadar cift saylarin toplamini yazdiriniz
        int cSayi, sum3=0;
                for(cSayi=10; cSayi<91; cSayi++){

                    if((cSayi%2==0)){
                        sum3+=cSayi;

                    }
                }
        System.out.println(sum3);

                // 1den 20 ye kadar 3e bolunen sayilarin toplamini yaziniz.
        int t, sum4=0;
        for(t=1; t<20; t++){
            if((t%3==0)){
                sum4+=t;
            }
        }
        System.out.println(sum4);

        // Ex.3 for loop kullanarak 40 tan 100 e kadar olan sayilarin toplamini yazdiriniz.
        int sum1 = 0;
        for (int l = 40; l < 101; l++) {
            sum1 = sum1 + i;
        }
        System.out.println("\n" + sum1); // 2501
    }
}
