package farkliProjeler.maasHesaplama;
public class NetMaasHesapla implements MaasArtir,Vergi {
    @Override
    public double yillikExtra(int calismaYili) {
        System.out.println("Yillik Extra =" + calismaYili * 100);
        return calismaYili * 100;
    }
    @Override
    public double aylikExtra(int calismaSaati) {
        if (calismaSaati - 160 > 0) {
            System.out.println(("aylikExtra = ")+(calismaSaati - 160) * 10);
            return (calismaSaati - 160) * 10;
        } else {
            return 0;
        }
    }
    @Override
    public double vergi(double brutMaas, int calismaYili) {

        if (calismaYili >= 10) {
            System.out.println("Vergi ="+ brutMaas*30/100);
            return brutMaas * 30/100;
        } else {
            System.out.println("Vergi ="+ brutMaas*20/100);
            return brutMaas*20/100;
        }
    }
public double netMaas(double brutMaas, int calismaYili, int calismaSaati) {
return brutMaas+yillikExtra(calismaYili)+aylikExtra(calismaSaati)-vergi(brutMaas,calismaYili);

}

}
