package practiceAdvanced.practice08;

public class Q04_Inheritance_Runner {
    public static void main(String[] args) {



        B obj1= new B();
        obj1.i=0;

        System.out.println(obj1.i);

        A objA= new A();
        objA.yazdir();


        new B();

        A obj2 = new B();

        obj2.yazdir();
    }


}
