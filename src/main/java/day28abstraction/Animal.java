package day28abstraction;

public abstract class Animal {


// body si olmayan metodlar abstract method olarak adlandirilir.
public abstract  void eat();




// "abstract class larda hem abstract metod hem de concrete method(non-abstract) kullanilabilir.
    public void drink(){

        System.out.println("Animals drink...");

    }

    // abstract move method olusturun.
    public abstract void move();


    }

