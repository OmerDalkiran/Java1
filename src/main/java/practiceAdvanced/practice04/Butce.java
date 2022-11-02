package practiceAdvanced.practice04;

public class Butce {


    public static int butce;   // baskalarini da etkiledigi icin static yaptik.
    public int harclik; // bu sadece beni etkiledigi icin non static diyoruz.

    public void harclikAl(int alinanHarclik){

        harclik+=alinanHarclik;
        butce -= alinanHarclik;

    }
    public void butcedenHarca(int harcanacakPara){
        butce-= harcanacakPara;

    }

    public void harclikHarca(int harclikHarcamasi){

        harclik-= harclikHarcamasi;

    }
    public void maasAl(int alinanMaas){

        butce += alinanMaas;


    }

}
