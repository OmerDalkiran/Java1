package day22inheritancepolymorphism;

import java.util.concurrent.Callable;

public class Runner {
    public static void main(String[] args) {
         // Inheritance ta datalar nasil cagrilir onu ogrendik.

        // Inheriance da objeler secilirken Java objectin data tipine bakar.
        // Oncelikle istediginiz variable'i object'in data type i olan Class da arar.
        // O class ta bulamazsa Parent class a bakar. Hicbir parent class ta bulamazsa hata verir.


        Cat cat1= new Cat();

        System.out.println(cat1.a); // 14
        System.out.println(cat1.b);  //34
        System.out.println(cat1.c); //45
       // System.out.println(cat1.d); yok  java: cannot find variable d


        Mammal cat2 = new Cat();
        System.out.println(cat2.a); //13


        Animal cat3 = new Cat();
        System.out.println(cat3.a); // 12


        // Object olustururken Object in data type i Child classlardan secilemez.

        // Inheritance da methodlar secilirken JAva Constructor a bakar. Oncelikle istediginiz metodu Constructor i
        // kullanilan class tan alir.
        Cat cat4 = new Cat();
        cat4.eat();  // Cat eat
        cat4.drink();


        Mammal cat5 = new Cat();
        cat5.eat(); // Mammal eat


        Animal cat6 = new Animal();
        cat6.eat();  // Animal eat









    }
}
