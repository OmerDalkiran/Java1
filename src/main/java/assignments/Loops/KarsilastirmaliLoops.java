package assignments.Loops;

public class KarsilastirmaliLoops {
    public static void main(String[] args) {
        //60 tan 11'e kadar 4 ile bölünebilen ve 6 ile bölünebilen tüm tam sayıları aynı satırda iki
        //ardışık tam sayı arasında boşluk bırakarak yazınız.
        int a = 60;
        //1.yol
        for (int i = a; i > 10 ; i--){
            if (i%4==0 && i%6==0){
                System.out.print(i + " ");
            }

        }
        System.out.println();

        //2.yol
        while(a>10){
            if (a%4==0 && a%6==0){
                System.out.print(a + " ");
            }
            a--;
        }
        System.out.println();

        // 3.yol
        do {
            if (a%4==0 && a%6==0){
                System.out.print(a + " ");
            }
            a--;

        } while (a>10);
        System.out.println(a);



        System.out.println();

              // Bir String’ de tekrarlanan karakterleri yazdırmak için kod yazınız.
              //  Örneğin; accessories  ==> ces

        String str= "accessories";

        for (int i = 0; i <str.length() ; i++) {
            char c= str.charAt(i);


           if(str.indexOf(c)!=str.lastIndexOf(c)){

               System.out.print(c);
           }

        }


    }
}
