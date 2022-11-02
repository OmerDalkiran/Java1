package practiceAdvanced.practice05;

public class HesapMakinesi {

    public void toplama (int... a){

        int sum= 0;

        for(int w:a){

            sum+= w;

        }
        System.out.println("Toplam ="+ sum);
    }

    public void cikarma(int a, int b){

        System.out.println("Fark "+ (a-b));


    }
    public void carpma(int... a){


        int carpim=1;
        for(int w : a){

        carpim*= w;

        }

        System.out.println("Carpim = " +carpim );
    }

    public void bolme(double a, double b){

        if(b==0){
            System.out.println("Bolen sayi sifir olamaz");
        }else {
            System.out.println("bolum= " + a/b);
        }

    }
}
