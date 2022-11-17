package practiceAdvanced.practice09;

public class Q01_NotOrtalamasi {

    public static void main(String[] args) {

//	4 öğrencinin not ortalamasını sırasıyla 6, 4, 3 ve 5 sınav olacak şekilde hesaplayan bir method yazınız.

        // Varargs kullanilir burada.
        // Bizim girdigimiz data kadar array olusturdugu icin bizim yerimize. Variable Arguments demek.
        // iki tanede parametre girsem 5 tanede girsem calisir





        avarageNotes("Ali", 96,96,98,99.4,80,78);
        avarageNotes("Tom", 56,45,78,89);
        avarageNotes("tim", 90,98,97);
        avarageNotes("Jane",99,99,73,34,78);



    }
  //public  static void  ortalamaHesapla(int age, int grade, String name, double... notes){ // en sonda 3 nokta varargs demek
  public  static void  avarageNotes(String name, double... notes){
                                   // not dedigim su anda bir array. int icine koyamazsin

      double sum = 0;


for ( double w : notes){

    sum+=w ;             // tek tek w den suma aldigi degerlerle toplami artirir.

}
      System.out.println(name+ "'s avarage note is = " + String.format("%.2f",sum/notes.length)); // 94.91428571428571 bunu  94.91 e cevirmek icin kullandik.
/*
Ali's avarage note is = 91.23
Tom's avarage note is = 67.00
tim's avarage note is = 95.00
Jane's avarage note is = 76.60
 */

  }
}
