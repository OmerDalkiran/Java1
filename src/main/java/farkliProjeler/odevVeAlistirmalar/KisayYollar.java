package farkliProjeler.odevVeAlistirmalar;

import java.util.Scanner;

public class KisayYollar {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String pwd= "123adgtt?b  /%$)";
//        if ((pwd.replace(" ","").length()>7)){
//            System.out.println("Gecerli sifre");
//
//        } else if ((pwd.length()>pwd.replaceAll(" \\S","").length())) {
//            System.out.println("sifrede bosluk karakteri kullanmayiniz");
//        }


//        String sifre = "a1c3d4f56";
//
//        boolean bv = sifre.length() > sifre.replace(" ","").length(); // bosluk varmi?
//
//        boolean uy = sifre.replace(" ","").length()>7;       //  bosluksuz 8 basamakli mi?
//
//        String s = (bv) ? ("Sifrede bosluk kullanmayin" ):(uy ? "Gecerli Sifre": "Gecersiz Sifre");
//        System.out.println("s = " + s);

        /*
		 1)  \\d    Tum rakamlar
		 	 \\D 	Tum rakam disi karakterler

		 2) \\w  ==>  A->Z    a->z    0->9 _   karakterlerinin tamamini icerir.
		 	\\W  ==>  A->Z    a->z    0->9 _   bunlarin disidaki karakterlerinin tamamini icerir.

		 3) \\s  ==>  space
		 	\\S  ==>  space disindaki her sey
		 */
        String s4 = "Code1 yazarak2 ogrenilir3!!!";
        System.out.println(s4.replaceAll("\\d", "*")); //Code* yazarak* ogrenilir*
        System.out.println(s4.replaceAll("\\D", "*")); //****1********2**********3
        System.out.println(s4.replaceAll("\\w", "*")); //***** ******** **********
        System.out.println(s4.replaceAll("\\W", "*")); //Code1*yazarak2*ogrenilir3
        System.out.println(s4.replaceAll("\\s", "*")); //Code1*yazarak2*ogrenilir3
        System.out.println(s4.replaceAll("\\S", "*")); //***** ******** **********

        // 2. Soru:Kullanicidan ismini ,soy ismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin
//        A********  B********
//        **** **** **** 1234
//

        System.out.println("Isminizi giriniz");
        String isim = input.nextLine();
        System.out.println("soyisminizi giriniz");
        String soyisim = input.nextLine();
        System.out.println("Kredi Karti Numaranizi giriniz");
        String Kkn = input.nextLine();


        String EkranI = isim.substring(0, 1) + isim.substring(1).replaceAll("\\w", "*");
        String EkranSi = soyisim.substring(0, 1) + soyisim.substring(1).replaceAll("\\w", "*");
        String EkranKkn = Kkn.substring(0,5).replaceAll("\\w", "*")+" " +Kkn.substring(5,10).replaceAll("\\w","*")+" "+
                Kkn.substring(10,14).replaceAll("\\w","*")+" "+Kkn.substring(Kkn.length()-4);



        System.out.println("EkranI = " + EkranI);
        System.out.println("EkranSi = " + EkranSi);
        System.out.println("EkranKkn = " + EkranKkn);
    }
}
