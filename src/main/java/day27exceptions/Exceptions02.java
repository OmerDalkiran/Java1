package day27exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions02 {
    public static void main(String[] args) {


    }

    // bir tex file daki texti okuyan kodu yaziniz.
public static void readTheTextFromTheFile() throws IOException { // dosyayi bulamazsan beni ara. demek




    FileInputStream fis= new FileInputStream("src\\test\\java\\Java1\\src\\main\\java\\day27exceptions\\File1.txt");
      /*
            1)FileInputStream fis = new FileInputStream("src/main/java/day27exceptions/File1.txt");
              "new"den sonraki "FileInputStream" hata verir. Cunku; biz Java'ya verilen adresteki dosyaya git dedik, Java
                   iki endiseye kapildi
            i)Ya adres yanlissa
            ii)Ya verilen adreste dosya yoksa
              Biz "method isminde" sonra, "throws FileNotFoundException"(File bulunamadi hatasi yazarak, Java'ya bu iki endise duydugun durum
               olusursa "Exception at" dedik.

       2) while ((k = fis.read()) !=-1){} yazdigimizda "read()" method'u hata verir. Cunku biz Java'ya dosyadaki
        karakterleri oku dedik. Java bir endiseye kapildi
             i)Ya okumasi gereken karakterler Java'nin bilmedigi karakterlerse
        Biz method isminden sonra "throws IOException" yazarak, Java'ya bu durumla karsilastiginda "Excepiton at" dedik.

        3) Method isminden sonra "throws IOException" yazarsanız Java "throws FileNotFoundException" ı siler. Çünkü;
       "IOException", "FileNotFoundException" ı kapsar. "IOException", "FileNotFoundException" ın parent'ıdır, onun yaptığı
       her şeyi yapabilir, o yüzden "IOException" varken "FileNotFoundException" a gerek yoktur.
       "IOException =, "INPUT OUTPUT EXCEPTION demektir.
       4)Gordugunuz gibi "IOException" ve "FileNotFoundException" biz kod yazarken, daha "Run" butonuna basmadan ortaya cikti.
            Bu tarz Exception'lara "Compile Time Exception" denir, diger adlari "Checked Exception" dir.

           "Compile Time Exception" lar kesinlikle halledilmelidir(Exception Handling), halletmeden code yazmaya devam etmeyiniz.

     */
    // ya adres yanlissa yada bu adreste dosya yoksa

    int k=0;
    while ((k=fis.read()) !=-1) {  // rea metodu fis objesiyle calisiyor. txt dosyasina gelecek ve okuyacak. dosyadaki ilk karakteri aliyor.
        // J nin ascii degerini aliyor. 74 u k nin icine koyuyor. k=74 oldu. ben 74=degildir -1 oluyor ve

        System.out.print((char) k);

    }
    }

    //2. Way :
    public  static void readTheText(){


        try {
            FileInputStream fis= new FileInputStream("ssrc/main/java/day27exceptions/File1.txt"); // burasi adres yanlis oldgunda baska bir is yapsin' in yeri

            int k=0;
            while ((k=fis.read()) !=-1) {  // rea metodu fis objesiyle calisiyor. txt dosyasina gelecek ve okuyacak. dosyadaki ilk karakteri aliyor.
                // J nin ascii degerini aliyor. 74 u k nin icine koyuyor. k=74 oldu. ben 74=degildir -1 oluyor ve

                System.out.print((char) k);
            }
        } catch (FileNotFoundException e) { // Cild class ustte olur.

            System.out.println("Dosyanin adresi veya varligi ile ilgili bir problem var");
        } catch (IOException e) { // Parent classi otomatik olarak alt tarafa koydu.

            System.out.println("Dosyada okunamayan bir karakter var");;
        }



//        package day27exceptions;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//
//        public class Exceptions02 {
//
//    /*
//        1) FileInputStream fis = new FileInputStream("src/main/java/day27exceptions/File1.txt");
//           "new" den sonraki "FileInputStream" hata verir. Cunku; biz Java'ya verilen adresteki dosya' ya git dedik, Java
//           iki endise'ye kapildi i)Ya adres yanlissa   ii)Ya verilen adreste dosya yoksa.
//           Biz "method isminden" sonra, "throws FileNotFoundException" yazarak, Java'ya bu iki endise duydugun durum
//           olusursa "Exception At" dedik.
//
//        2) while((k = fis.read()) != -1){} yazdigimizda "read()" method'u hata verir. Cunku biz Java'ya dosya'daki
//          karakterleri oku dedik. Java bir endiseye kapildi i)Ya okumasi gereken karakterler Java'nin bilmedigi karakterlerse.
//          Biz method isminden sonra "throws IOException" yazarak, Java'ya bu durumla karsilastiginda "Exception At" dedik.
//
//        3) Method isminden sonra "throws IOException" yazarsaniz Java "throws FilNotFoundException" i siler. Cunku;
//           "IOException", "FileNotFoundException" i kapsar. "IOException", "FileNotFoundException" in parent'idir, onun yaptigi
//           herseyi yapabilir o yuzden "IOException" varken "FileNotFoundException"a gerek yoktur.
//
//           "IOException", "Input Output Exception" demektir.
//
//         4) Gordugunuz gibi "IOException" ve "FileNotFoundException" biz kod yazarken, daha "Run" butonuna basmadan ortaya cikti.
//            Bu tarz Exception'lara "Compile Time Exception" denir, diger adlari "Checked Exception" dir.
//
//           "Compile Time Exception" lar kesinlikle halledilmelidir(Exception Handling), halletmeden code yazmaya devam etmeyiniz.
//     */
//
//            public static void main(String[] args) throws IOException {
//                readTheTextFromTheFile();
//
//                readTheText();
//            }
//
//            //Bir text file'daki text'i okuyan kodu yaziniz.
//            //1.Way:
//            public static void readTheTextFromTheFile() throws IOException {
//                FileInputStream fis = new FileInputStream("src/main/java/day27exceptions/File1.txt");
//                int k = 0;
//                while((k = fis.read()) != -1){
//                    System.out.print((char)k);
//                }
//            }
//
//            //2.Way:
//            public static void readTheText() {
//                try {
//                    FileInputStream fis = new FileInputStream("src/main/java/day27exceptions/File1.txt");
//
//                    int k = 0;
//                    while((k = fis.read()) != -1){
//                        System.out.print((char)k);
//                    }
//
//                } catch (FileNotFoundException e) {
//                    System.out.println("Dosya'nin adresi veya varligi ile ilgili bir problem var.");
//                } catch (IOException e) {
//                    System.out.println("Dosya'da okunamayan bir character var");
                }
            }
