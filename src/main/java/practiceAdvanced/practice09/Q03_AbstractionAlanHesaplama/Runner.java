package practiceAdvanced.practice09.Q03_AbstractionAlanHesaplama;

public class Runner {

    //Dikdörtgen ve üçgenin alanlarını hesaplayan bir kod yazınız.(abstraction kullanın)

    public static void main(String[] args) {
        Ucgen ucgen = new Ucgen();


        ucgen.alanHesaplamaMetodu(4,2);
        System.out.println(ucgen.alanHesaplamaMetodu(4,2));
        System.out.println(new Dikdortgen().alanHesaplamaMetodu(5,4));

        Dikdortgen dikdortgen = new Dikdortgen();



    }




}
