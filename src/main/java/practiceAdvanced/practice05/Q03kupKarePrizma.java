package practiceAdvanced.practice05;

public class Q03kupKarePrizma {

    //Küp, kare, prizma ve dikdörtgen prizmanın hacmini hesaplayan bir method oluşturunuz.(Method overloading kullanınız)

    // Bunu methodoeverloading kullanarak yapacagiz.

    public static void main(String[] args) {


        Hacim hacim= new Hacim();
        hacim.hacimHesapla(5);  // Kupun Hacmi =125
        hacim.hacimHesapla(5,6);


        hacim.hacimHesapla(2);
        hacim.hacimHesapla(3,6);
        hacim.hacimHesapla(3,4,78);



    }

}
