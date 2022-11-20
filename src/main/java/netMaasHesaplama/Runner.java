package netMaasHesaplama;
public class Runner {

    public static void main(String[] args) {
        NetMaasHesaplama musa = new NetMaasHesaplama();
        double musaAbininMaasi =musa.netMaas(15000,3,190);
        System.out.println("Musa Beyin Maasi= "+musaAbininMaasi ); // Musa Beyin Maasi= 12600.0

    }
}
