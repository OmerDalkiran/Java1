package day22inheritancepolymorphism;

public class CatRunner {
/*
// Note :  Javada Object olusturken Constructorlar Parent tan Childa dogru calistirilir.
Java en ust parent constructora cikabilmek icin super kodunu kullanir.
"super code u her constructor in ilk satirinda gizli olarak blunur. super kodunu isterseniz gorunur
sekildede yazabilirsiniz, java kizmaz.

// Note : Her Constructer ilk satirinda gorunmeyen super(); ==>kodu vardir.
// super(); ==> Parent'taki Constructer'i cagirmak icin kullanilir.
// Java ya göre bir Child Class'in olusturulmus olmasi icin bir Parent Class olmasi lazim

1)Java da Object olustururken Constructor'lar Parent'dan Child'a dogru calistirilir.
2)Java en ust parent constructor'a cikabilmek icin "super()" kodunu kullanir.
3)"super()" kodu her constructor'in "ilk satirinda" "gizli" olarak bulunur.
4)"super()" kodunu isterseniz gorunur sekilde de yazabilirsiniz, Java kizmaz.
5)"super()" kodunu gorunur sekilde de yazarsaniz sakin haaa ilk satir disinda bir satira koymayiniz, hata verir.
6)"super()" kodu Parent Class'dan constructor cagirmaya yarar.
 */

    public static void main(String[] args) {

        Cat cat1 = new Cat();


    }
}
