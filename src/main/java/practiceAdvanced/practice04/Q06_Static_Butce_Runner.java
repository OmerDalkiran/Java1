package practiceAdvanced.practice04;

public class Q06_Static_Butce_Runner {
    // Basit bir ev butcesi kodu yaziniz.

    public static void main(String[] args) {

     Butce baba = new Butce();
        System.out.println(Butce.butce);  // 0

     baba.maasAl(5000);
        System.out.println(Butce.butce);  // 5000

        System.out.println(baba.harclik);

        baba.harclikAl(500);
        System.out.println(Butce.butce);

        baba.harclikHarca(230);

        System.out.println("Baba Harclik "+ baba.harclik);

        baba.butcedenHarca(1200);
        System.out.println("Butce: "+ Butce.butce);


        Butce anne = new Butce();
        anne.maasAl(2000);
        anne.maasAl(3000);
        anne.harclikAl(200);
        anne.harclikHarca(100);

        Butce kiz= new Butce();
        kiz.harclikAl(500);
        kiz.harclikHarca(350);



        System.out.println("Butce: "+ Butce.butce);
        System.out.println("Anne Harclik "+ anne.harclik);
        System.out.println("Kizin Harcligi: " +kiz.harclik);
    }

}
