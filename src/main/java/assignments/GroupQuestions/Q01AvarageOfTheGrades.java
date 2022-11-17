package assignments.GroupQuestions;

public class Q01AvarageOfTheGrades {

    public static void main(String[] args) {
         /*Arrays-1 question
         Lecture notes for a class are given.
         Find the sum and average of these grades
        input={30,56,56,75,95,100,30,80,50}
         */

        double arr[]={30,56,56,75,95,100,30,80,50};
        double sum=0.0;
        for (double w:arr){
            sum+=w;
        }
        System.out.println("sum = " + sum);
        double avarage=sum/arr.length;
        System.out.println("ortalama = " + avarage);


        //Ex. 2. Another class has {5,7,8,2,5}
        //Find the sum and the avarage

        double [] brr = {5,7,8,2,5};
        double sum1 = 0;

        for( double w : brr){
            sum1+=w;

        }
        System.out.println("Sum= " + sum1);
        double average1 =sum1/brr.length;
        System.out.println(average1);
    }
}

