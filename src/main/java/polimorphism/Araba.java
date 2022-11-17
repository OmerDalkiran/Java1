package polimorphism;

public class Araba {

    public void motor(){
        System.out.println("Arabalar farkli markalarda motor kullanirlar");
    }








    public void yakitTuketimi(){
        System.out.println("arabalar motor gucu ve yakit turune gore yakit tuketirler");
    }



    public int multiply(int a, int b, int c) {
        return a * b * c;

    }
    public Integer multiply(int a, int b) {
        return a * b;
    }

    public Araba Speed(){
        return new Araba();


    }
}
