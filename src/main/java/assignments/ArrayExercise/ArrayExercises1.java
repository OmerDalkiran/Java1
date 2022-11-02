package assignments.ArrayExercise;

import java.util.Arrays;

public class ArrayExercises1 {
    public static void main(String[] args) {

        int[] teachersAges = new int[5];  // [0,0,0,0,0]

        teachersAges[0] = 52;
        teachersAges[1] = 45;
        teachersAges[2] = 65;
        teachersAges[3] = 40;
        teachersAges[4] = 50;

        int topyas = 0;
        for( int w : teachersAges) {  // w "while" in kisaltilmasi
            topyas = topyas + w;      // Buradaki loop u java while in icinde kendisi yapiyor.
        }
        System.out.println(topyas); //252


        System.out.println(Arrays.toString(teachersAges)); //  [52, 45, 65, 40, 50]
        // Array deki herhangi bir elementi nasil yazdririm?
        System.out.println(teachersAges[4]);  // 50

        // Arraydeki en kucuk ve en buyuk elementlerin toplamini yazdir.
        // once "sort" metodu ile kucukten buyuge siralayacagiz.
        Arrays.sort(teachersAges);
        System.out.println(Arrays.toString(teachersAges));  // [40, 45, 50, 52, 65] kuckten buyuge "SORT"ladiktansonra yazdiriyor.

        int ilkyas = teachersAges[0];
        int sonyas = teachersAges[teachersAges.length - 1];

        System.out.println(ilkyas + sonyas); // 105

        // Pekii, ARRAY in icindeki butun ogretmenlerin yaslarinin toplamini nasil buluruz?
        int sum = 0;
        for (int teachersAge : teachersAges) { //  for(int i = 0; i < teachersAges.length; i++){ bunun yerine yazildi
            sum = sum + teachersAge;

        }
        System.out.println(sum);  // 252

        // for-each METHOD unu kullanarak nasil hesaplanir?
        int topyas1 = 0;
        for( int w : teachersAges) {  // w "while" in kisaltilmasi
            topyas1 = topyas1 + w;
        }
        System.out.print(topyas1); // 252


           // Aile fertlerinin yas toplami nedir?
        int[] aileAges = new int[4];

        aileAges[0]=50;
        aileAges[1]=46;
        aileAges[2]=23;
        aileAges[3]=16;

        int i, sum1=0;
        for(i=0; i<aileAges.length; i++){
            sum1=sum1+aileAges[i];
        }
        System.out.println(sum1); //135

        // ya da for-each loop la
        int aileToplYas = 0;

        for(int w : aileAges){
            aileToplYas=aileToplYas+w;

        }
        System.out.println(aileToplYas); //135

        // Arkadaslarin toplam yaslari nedir?
        int[] arkAges = new int[5];
        arkAges[0]=53;
        arkAges[1]=56;
        arkAges[2]=60;
        arkAges[3]=35;
        arkAges[4]=45;

        int topArkAges=0;
        for(int w : arkAges){
            topArkAges=topArkAges+w;
        }
        System.out.println(topArkAges); //249
        }
    }

