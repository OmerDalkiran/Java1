package practiceAdvanced.practice09.Q04_MaasHesaplama_Interface;

public class MaasHesapla implements MaasArtir,Vergi {


    @Override
    public double yillikEkstra(int calismaYili) {
        System.out.println("Yillik ekstra = " +calismaYili*100);
        return calismaYili*100;



    }

    @Override
    public double saatlikEkstra(int calismaSaati) {


        if(calismaSaati-160>0){

            System.out.println("calismaSaati = " + calismaSaati);
            return (calismaSaati-160)*10;
        }else {
            return 0;
        }


    }

    @Override
    public double vergi(double brutMaas, int calismaYili) {
       // return 0; vergimizi hesaplayacagiz
        if(calismaYili>=10){
            return brutMaas*30/100;

        }else {
            return brutMaas*20/100;
        }

    }

    public double netMaas(double brutMaas,int calismaYili, int calismaSaati){

        return brutMaas+ yillikEkstra(calismaYili)+ saatlikEkstra(calismaSaati)-vergi(brutMaas,calismaYili);
        // brutmaasima yillik ekstre ekliyorum, yillik ekstra neyle calisiyor, (calisma yiliyla)

    }
}
