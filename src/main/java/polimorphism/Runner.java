package polimorphism;

public class Runner {
    public static void main(String[] args) {




        Araba car = new Corolla();


        car.Speed();
        car.motor();
        car.yakitTuketimi();
        System.out.println(car.multiply(3,7));


    }


}
