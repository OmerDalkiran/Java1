package assignments.GroupQuestions;

public class Q02AvarageOfTheGoodSts {

    public static void main(String[] args) {
         /*Arrays-2.soru
     bir sinifa ait ders notlari verilmis,basarili ogrencilerin not ortalamalarini bulunuz
     50 ve yukari not alan ogrenciler basarili sayilmaktadir
     input ={50,44,65,95,85,30,20,90,30}
   */
        double[] arr ={50,44,65,95,85,30,20,90,30};
        double sum=0;
        int counter=0;

        for (double w:arr){
            if (w<50){
                continue;

            }else {
                sum+=w;
                counter++;
            }
        }
        System.out.println("sum = " + sum);
        double ortalama=sum/counter;
        System.out.println("ortalama = " + ortalama);
    }
}

