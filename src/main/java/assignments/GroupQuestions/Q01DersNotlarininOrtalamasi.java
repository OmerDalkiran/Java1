package assignments.GroupQuestions;

public class Q01DersNotlarininOrtalamasi {

    public static void main(String[] args) {
         /*Arrays-1.soru
        Bir sinifa ait ders notlari veriliyor
        Bu notlarin toplamini ve ortalamasini bulunuz
        input={30,56,56,75,95,100,30,80,50}
         */

        double arr[]={30,56,56,75,95,100,30,80,50};
        double sum=0.0;
        for (double w:arr){
            sum+=w;
        }
        System.out.println("sum = " + sum);
        double ortalama=sum/arr.length;
        System.out.println("ortalama = " + ortalama);
    }
}

