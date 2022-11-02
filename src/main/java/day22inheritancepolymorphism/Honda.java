package day22inheritancepolymorphism;

public class Honda extends Car {


    public  String color ;
    public Honda(){
        super("white", 540000);  // Constructor cagirmada her paret a ugramak lazim, es gecemezsiniz.
        System.out.println("Honda Constructor");


    }

    public Honda(String color){
        this.color=color;



   }

}
