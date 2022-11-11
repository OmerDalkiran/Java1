package day28abstraction;

public class Cat extends Mammal {



    // Bir metod parent class ta abstract ise, child class o metodu override edip
    // kullanmka zorundadir. bu yuzden herhangi bir fonksiyonuchild class icin mecburi yapmak isterseniz
    // o metodu abstrackt yapmalisiniz.



    // burada da override yapalim


    @Override
    public void eat() {
        System.out.println("cats eat");

    }

    @Override
    public void move() {
        System.out.println("Cats move");

    }
}
