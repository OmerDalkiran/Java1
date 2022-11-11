package assignments.abdullahla;

import java.util.Scanner;

public class MetindeVarmi {


        public static <execute> void main(String[] Args) {

            Scanner input = new Scanner(System.in);
            System.out.println("Lutfen textin icinde aranmasini istediginiz bir kelime giriniz");


            String kelime = input.next();
            String text = "Artvin'in Borçka ilçesine bağlı Camili köyünde evleri ahırları kahverengi kokarca " +
                    "böceği sardı. Köylünün kabusu olan böceğin yaydığı koku rahatsız ederken, aynı zamanda sebze ve " +
                    "meyvelerde verimin düşmesine neden oldu. Yaşanan olayla ilgili açıklamalarda bulunan Artvin Valisi " +
                    "Yılmaz Doruk ise Bilindiği gibi, kokarca dediğimiz bu böcek Gürcistan'dan geldi. Bu böcek, " +
                    "tarım alanlarımız için tehdit. Çaya zarar veremiyor ama fındık ve meyveler üzerinde etkisi " +
                    "var dedi";
            boolean b1;
            b1=text.contains(kelime);

            if(b1==true){


                System.out.println("Aradiginiz kelime bu textte vardir.");

                }else {
                System.out.println("Aradiginiz kelime maalesef bu textte yoktur");
            }

        }

    }

