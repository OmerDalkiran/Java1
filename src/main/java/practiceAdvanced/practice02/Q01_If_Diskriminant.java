package practiceAdvanced.practice02;

import java.util.Scanner;

public class Q01_If_Diskriminant {

      /* Günün sorusu: if statement
      katsayıları verilen iki bilinmeyenli denklemin kökleriniz bulunuz.

        ax^2 + bx + c;

        Çözüm adımları
        kullanıcıdan a,b,c yi alın.
        Diskriminant formulü: (-b +/- karekök(delta)) / (2a)
        Delta = bb - 4ac
        Delta > 0 => 2 tane kök vardır x1=(-b + kök(d)) / (2a)  , x2= (-b - kök(d)) / (2*a)
        Delta = 0 => 1 tane kök vardır x = -b/2a
        Delta < 0 ise kök yoktur.
   */

        public static void main(String[] args) {

            Scanner input= new Scanner(System.in);
            System.out.println("Denklemin a, b ve c sayılarını sırayla giriniz.");
            double a = input.nextInt();
            double b = input.nextInt();
            double c = input.nextInt();

            double delta = b*b-4*a*c;    // b^2-4*a*c

            if(delta>0){
                double x1 = (-b + Math.sqrt(delta))/(2*a);
                double x2 = (-b - Math.sqrt(delta))/(2*a);
                System.out.println("Denkleminiz " + a + "x²+" + b + "x+" + c+"=0");
                System.out.println("Denklemin iki kökü vardır: x1="+x1+" x2="+x2);
            }else if (delta==0){
                double x = -b/(2*a);
                System.out.println("Denkleminiz " + a + "x²+" + b + "x+" + c);
                System.out.println("Denklemin bir kökü vardır: x="+x);
            }else {
                System.out.println("Denkleminiz " + a + "x²+" + b + "x+" + c);
                System.out.println("Denklemin bir kökü yoktur.");
            }

            double t =Math.sqrt(2);
            System.out.println(t);


        }
    }

