package practiceAdvanced.practice07;

import java.util.Scanner;

public class Q03_AtbashCode {

    public static void main(String[] args) {

        /*
      Kullanıcıdan aldığınız bir metni 'Atbash Code' yöntemi ile şifreleyen bir kod yazınız.
      Ortadoğuda kullanılan en eski şifreleme biçimlerinden biridir.
      Arami alfabesinin tersten yazılması ile oluşturulan bir kodlayıcıya sahiptir.

      Örn: A-->Z, B-->Y ...
      "abcdefghijklmnopqrstuvwxyz";
      "zyxwvutsrqponmlkjihgfedcba";

     */

        Scanner input = new Scanner(System.in);
        System.out.println(" Bir kelime giriniz");

        String str3 = input.nextLine();

        String str1 = "abcdefghijklmnopqrstuvwxyz";
        String str2 = "zyxwvutsrqponmlkjihgfedcba";

        for (int i = 0; i < str3.length(); i++) {
            for (int j = 0; j < str1.length(); j++) {  // Bu da str 1 in uzunlugu kadar tarama yapmasi ve calismasi lazim.
                if (str3.charAt(i) == str1.charAt(j)) {   // esitse str2 deki karakteri bana ver anlmaminda
                    System.out.print(str2.charAt(j));
                }
            }
        }

        System.out.println(" Bir kelime giriniz");
        String st = input.nextLine();
        for (int i = 0; i < st.length(); i++) {
            int index = 'z' - st.charAt(i);     // aldigim karakterin ascii degerini z den cikariyoruz
            System.out.println((char) ('a' + index));
        }
    }
}

