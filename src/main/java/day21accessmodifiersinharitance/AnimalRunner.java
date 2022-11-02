package day21accessmodifiersinharitance;

public class AnimalRunner {

    public static void main(String[] args) {
        /*
        1- Inheritance sayesinde
        i-code tekrarlarindan kurtuluruz.
        ii-code maintanence i kolay olur. (tamir ve bakimi)
       iii-child class lari daha atomic yapmis oluruz.

        2- Bir Class i baska bir class in child class i yapmak icin "extends" keyword u kullanilir.
        ilk yazilan child ikinci yazilan parent class olur.

        3- Child class objectleri Parent classtan metod ve variable lari kullanabilirler.
        4- Parent class objectleri Child Class dan method ve variable kullanamazlar
        5- Object Class her Classin parentedir ve Javada parent i olmayan tek class object classtir.
        6- Bir metod yada variable private ise inheritance yapilamaz, child tarafindan kullanilmaz
        7- Can the private methods be  inherited? no.
        default method ve variables ayni package taki child class lar tarafindan kullanilabilir
                  (  demek > inherit edilebilir demek yani )
        8- 4 Tip inheritance vardir.
          Multilevel ( accepted by JAva)
          Hierarchical Inheriance : bir parent icin coklu child, java bunu kabul eder.
          Multiple inheritance : java doesnt support multiple inheritance
          single inheritance : accepted by java. 1 child class icin 1 parent class

          */

        Cat c1 = new Cat();
        c1.eat();
        c1.drink();
        c1.meow();

        Dog d1 = new Dog();
        d1.bark();
        d1.eat();
        d1.drink();

        Bird b1= new Bird();
        b1.eat();
        b1.drink();
        b1.tweet();



    }
}
