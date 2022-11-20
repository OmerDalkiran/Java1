package netMaasHesaplama;

public class NetMaasHesaplama implements Vergi1,MaasArtir {

    @Override
    public double yillikEkstra(int calismaYili) {
        return calismaYili * 100;


    }

    @Override
    public double aylikEkstra(int calismaSaati) {
        if (calismaSaati - 160 > 0) {
            return (calismaSaati - 160) * 10;
        } else {
            return 0;

        }
    }

    @Override
    public double vergi1(double brutMaas, int calismaYili) {
        if (calismaYili >= 10) {
            return brutMaas * 30 / 100;
        } else {
            return brutMaas * 20 / 100;
        }
    }


    public double netMaas(double brutmaas, int calismaYili, int calismaSaati){
        return brutmaas+yillikEkstra(calismaYili)+aylikEkstra(calismaSaati)-vergi1(brutmaas,calismaYili);
    }
}
