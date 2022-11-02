package day06nestedifswitch;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {

        //Type a code, get age from user and decide which stage on it
        //0 - 4 => baby
        //5 - 12 => child
        //13 - 20 => teenager
        //21 - 30 => adult
       // ...
        //...
        //else (not expected age)

        Scanner inputYas = new Scanner(System.in);

        System.out.println("Lutfen yasinizi giriniz");
        // yas degerleri  tam sayidir o yuzden bir tane conteirne

        int yas = inputYas.nextInt(); // simdi kullanicidan yasi aldik
        // next byte operatoru aldi yasin icine koydu
        if (yas < 0) {                      // 4 sifirdan kucuk olmadigi icin diger kodu calistirir
            System.out.println("Gecerli yas giriniz");
            // Requirement docs ta bulunur.

        } else if (yas <= 4) {    // <5 demek daha
            System.out.println("Bebek");

        } else if (yas <= 20) {   // <21 demek daha iyi
            System.out.println("Genc");

        } else if (yas <= 30) {  // <31 demek daha iyi ve ayni
            System.out.println("Yetiskin");

        } else if (yas > 31 && yas < 40) {
            System.out.println("Olgunluk yasina dogru gidiyorsunuz");

        } else if (yas == 40) {
            System.out.println("Olgunluk yasindasiniz.");

        } else if (yas > 40 && yas < 70) {
            System.out.println("Artik yavas yavas bu dunyadan elinizi eteginizi cekmeye baslayin");

        } else if (yas >= 70 && yas <= 100) {
            System.out.println("Eskidan yas 70 is bitmis derlerdi. Ama masallahiniz var sizin");

        } else if (yas >= 100 && yas <= 150) {
            System.out.println("Ne diyelim, Allah herkese bu kadar yasamayi nasip etmez.");

        } else {
            System.out.println("Su anda tanimlanmamis yas dilimindesiniz. Ya yasinizi yalnis girdiniz, " +
                    "ya da Guinnes Rekorlar kitabinin sizden haberi yok");
        }

    }
}
                 //BVA diyorlar Boundry Value Analyze Test (Sinir degerleri analiz testi)
        // harf girerse int harfi kabul etmez hata verir. byte oldugu icin ancak 127 ye
        // girilir.  - yas degeri girilirse product ownera sorulacak.








