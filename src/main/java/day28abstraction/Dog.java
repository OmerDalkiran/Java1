package day28abstraction;

public abstract class Dog extends Mammal {

    @Override
    public void eat() {
        System.out.println("Dogs eat");

    }

    @Override
    public void move() {
        System.out.println("Dogs move");

    }
}
