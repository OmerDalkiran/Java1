package day23inheritancepolymorphism;

public class Math extends Courses {
    public void practice() {

        System.out.println(" Solve problems ");

    }

    public Math() {
        super("x");

        System.out.println("Constructor1");

    }
    public Math(int a) {
        this();
        System.out.println("Constructor 2");


    }

}
