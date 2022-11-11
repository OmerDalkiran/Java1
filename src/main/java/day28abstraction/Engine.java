package day28abstraction;

public interface Engine {

    // public void eco(){
    //   System.out.println("Eco engine");  body yi silmek lazim.


    // interface lerde abstract metod olustururken abstract key word kullanmaya gerek yoktur. cunku java o methodun abstract oldugunu bilir.
    // public abstract void eco();


    // public yazmaya da gerek yok. cunku interfacelerdeki metodlar otomatik olarak public kabul edilir
    //public void eco();

    //  2- interfacelerdeki tum metodlar abstract oldugu icin "fully abstraction " denir .
    // Abstract classlarda abstract method ve concrete method bir arada kullanildigi icin "Abstract Class"lara "fully abstraction denmez.

    void eco();  // == public abstract void eco();

    void gas(); // public tir ve abstracttir.

    void tsi(); // public tir ve abstracttir.

    // Bir method abstract ise childlar icin mecburidir.


    public default int add(int a, int b) { // interface in icinde ancak "default" keyword kullanarak body si olan metodlar uretebilirsiniz.

        return a+b;

    }

    public static  String update (String str){ // static keyword kullanarak ta uretilir.

        return str+"!";  // static kullanirsak static olur. gokteki ay gibidir.
        // Interfacelerin icinde concrete metod olusturursaniz ya default yada static keyword kullaniriz
        // static metodlar class a yapistirilan metodlardi.
        // default olursa non-static olur. objelere ulasmak icin ...

    }

}



