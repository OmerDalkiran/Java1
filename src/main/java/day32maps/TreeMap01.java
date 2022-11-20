package day32maps;

import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMap01 {
    /*


     */

    public static void main(String[] args) {

        TreeMap<String, Double> salaries = new TreeMap<>();

        salaries.put("Tom Hanks", 3000.00);
        salaries.put("Mary Star", 1000.00);
        salaries.put("Jimmy Jones", 5000.00);
        salaries.put("Kevin Bidgeman", 6000.00);

        System.out.println(salaries);
        // {Jimmy Jones=5000.0, Kevin Bidgeman=6000.0, Mary Star=1000.0, Tom Hanks=3000.0}

        // tail map  verilen key word ten sonuna kadar yazdirir
        SortedMap<String,Double> map1 =  salaries.tailMap("Kevin Bidgeman");
        System.out.println(map1);
        // {Kevin Bidgeman=6000.0, Mary Star=1000.0, Tom Hanks=3000.0}


        SortedMap<String,Double> map2 = salaries.tailMap("Kevin Bidgeman", false);
        System.out.println(map2);  // false dedigimiz icin verdiginiz key haric sona kadar yazdirir
                                 // {Mary Star=1000.0, Tom Hanks=3000.0}


       NavigableMap<String,Double> map3 = salaries.subMap("Kevin Bidgeman",true,"Tom Hanks", false);
        System.out.println(map3); // {Kevin Bidgeman=6000.0, Mary Star=1000.0}  baslangici ve bitisi dahil etmek yada haric eylemek icin

        Map.Entry<String , Double> map4 = salaries.lowerEntry("Mary Star") ; // Lower Mary den bir oncekini verir.
        System.out.println(map4); // Kevin Bidgeman=6000.0  ==> alfabetic siraya gore


       // LowerEntry ("Paris Hilton"dan bir oncesini verir, Paris Hilton olmasa da sanki vaarmis gibi alfabetic siraya gore yani
        Map.Entry<String , Double> map5 = salaries.lowerEntry("Mary Star") ;


        salaries.higherEntry("Mary Star"); // Mary den bir sonrakini veriyor.
        Map.Entry<String , Double> map6 = salaries.higherEntry("Mary Star") ;



        salaries.ceilingEntry("Mary Star"); // ceiling entry var olan key ile kullanilirsa o key i verir; var olmayan key kullanilirsa bir sonrakini verir.
        Map.Entry<String , Double> map7 = salaries.ceilingEntry("Mary Star") ;

        //ceilingEntry(); var olan key ile kullanilirsa o key'i verir. Var olmayan bir key ile kullanilirsa bir sonrakini verir
        Map.Entry<String, Double>  map8 = salaries.ceilingEntry("Mary Star");
        System.out.println(map8);// Mary Star=1000.0

        Map.Entry<String, Double>  map9 = salaries.ceilingEntry("Paris Hilton");
        System.out.println(map9);// Tom Hanks=3000.0

        Map.Entry<String , Double> map10 = salaries.floorEntry("Mary Star") ;
        System.out.println(map10);  // Mary Star=1000.0


        Map.Entry<String, Double>  map11 = salaries.floorEntry("Paris Hilton");
        System.out.println(map11);// Mary Star=1000.0

        // salaries.  yazdiktan sonra cikan metodlari kullanip ogren ins
    }
}
