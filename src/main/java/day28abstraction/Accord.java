package day28abstraction;

public class Accord implements Engine, Ac, Hood {


    @Override
    public void eco() {
        System.out.println("uses eco engine");

    }

    @Override
    public void gas() {
        System.out.println("uses gas");
    }

    @Override
    public void tsi() {
        System.out.println("uses tsi technology");
    }

    @Override
    public void digital() {
        System.out.println("uses digital AC");

    }

    @Override
    public void climate() {

        System.out.println("uses climate technology");
    }

    @Override
    public void steel() {
        System.out.println("hood is made of steel" );

    }
}
