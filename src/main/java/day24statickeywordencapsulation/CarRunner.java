package day24statickeywordencapsulation;

public class CarRunner {
    public static void main(String[] args) {


        Car car1 =new Car();
        Car car2 =new Car();
        Car car3 =new Car();
        Car car4 =new Car();

        /*
        1) Static keyword, class'a bağlanmış class elemanlarıdır.
        static variable/method class'a bağlıdır.
2) Static class elemanları, tüm objelerin ortak elemanıdır.
3) Static'ler üzerinde yapılan her değişiklik, tüm objeleri etkiler ve tüm objeler tarafından görülür.
4) Static class elemanlarına, class üzerinden ulaşılır. Objeler, static'lere ulaşmak için kullanılmaz.
        Kullanılırsa hata vermez, fakat tavsiye edilmez.
         */

        System.out.println(car1.counter);//1

        System.out.println(car1.price);//1

        System.out.println(car2.counter);//2
        System.out.println(car2.price);//1

        System.out.println(car3.counter);//3
        System.out.println(car3.price);//1

        System.out.println(car4.counter);//4
        System.out.println(car4.price);//1
    }
}
