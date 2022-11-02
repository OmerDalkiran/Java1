package practiceAdvanced.practice04;

public class Q03_Arras_OrtalamadanBuyuk {

    public static void main(String[] args) {

        // Elementlerin ortalamasindan buyuk elementleri yazdir.
        int [] arr={5,9,15,1,0,11,3};

        int sum=0;
        for( int w: arr){

            sum += w;

        }
        double ortalama= sum/arr.length;
        System.out.println(ortalama);

        for(int w: arr){
            if(w>ortalama){
                System.out.print(w+" ");
            }
        }
    }
}
