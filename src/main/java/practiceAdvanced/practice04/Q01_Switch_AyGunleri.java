package practiceAdvanced.practice04;

import java.util.Scanner;

public class Q01_Switch_AyGunleri {

     /*

Girilen yil ve ay numarasına göre ayin kaç gün olduğunu yazdiran bir kod yazınız.
    Girdi yıl: 2000 ay: 2      Çıktı: 29

*/
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

         System.out.println("Bir yil giriniz");  // Switch statement 3 ve daha fazla olasilik oldugu durumlarda daha uygundur
         int yil=input.nextInt();

         System.out.println("Bir ay numarasini giriniz");
         int ay = input.nextInt();

         int gun;   // ileride atama yapacagim icin sadece bir conteyner olusturuyorum. icine bir veri koymadan

         // 1., 3., 5., 7.,8., 10. ve 12. aylar 31 gun
         // 4., 6, 9. ve 11 aylar 30 gun
         // ve 2 ay ise artik yil olup olmadigina bakilacak

         switch (ay){
             case 1: case 3:
             case 5: case 7:
             case 8: case 10:
             case 12:
                 gun = 31;
                 System.out.println("Girdiginiz ayin gun sayisi: "+gun);
                 break;
             case 4: case 6:
             case 9: case 11:
                 gun=30;
                 System.out.println("Girdiginiz ayin gun sayisi: "+gun);
                 break;
             case 2:
                 if(((yil%4==0 && yil%100!=0) || yil%400==0)){
                     gun=29;
                     System.out.println("Girdiginiz ayin gun sayisi: "+gun);
                 }else {
                     gun=28;
                     System.out.println("Girdiginiz ayin gun sayisi: "+gun);
                 }
                 break;
             default:
                 System.out.println("Gecerli bir ay numarasi giriniz");

         }
     }
}