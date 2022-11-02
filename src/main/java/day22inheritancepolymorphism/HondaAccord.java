package day22inheritancepolymorphism;

public class HondaAccord extends Honda {

    /*
   1-  Biz class olusturdugumuzda JAva bize otomatik olarak gorunmez bir constructor verir.
    Cunku Java, Class in bir kalip template oldugunu ve object olusturmak icin meydana getirildigini ve object olusturmak
    icin constructor in sart oldugunu bilir.
    2- Javanin otomatik olarak olusturdugu bu gorunmez constructora default constructor denir.
    3- Biz kendimiz herhangi bir constructor olusturdugumuzda Java, default constructor i siler.
    4- Bir Classta birden fazla Constructor olabilir. Fakat bu constructorlarin parametreleri farkli olmalidir.
    5- "this" key word bu class anlamindadir. "this.price" demek bu class taki "price isimli variable demektir.
       "this.price" syntaxi Constructor larin icinde kullanilir.
       6- Constructor kullanarak variable lar uzerinde yapilan degisiklikler sadece object uzerindeki variable larin degerini degistirir.
       Classtaki variable degerlerini degistiremez.
     */
    // Bu gorunmeyen constructor dir = public HondaAccord() {} // gorunmez Constructor in gorunur halidir. (Constructor bir asci gibidir. Object olusturmaya yarar.)

    public int price;
    public int year;
    public String make;
    public String model;


    public HondaAccord() {


    }

    public HondaAccord(int price) {
        this.price=price;


    }

    public HondaAccord(int price,int year) {  // farkli Constructorlar farkli objeler uretmeye yardimci olur. Java cok esnektir.
        //super("white", 540000); // java kizdi. bir ust parent ta yok ki . Hondaya gidip koymak lazim bunu
        this.price=price;
        this.year=year;
        System.out.println("Honda Accord Constructor");


    }
    public HondaAccord(int price, int year, String make, String model){
        this.price=price;
        this.year=year;
        this.make=make;
        this.model=model;



    }
}
