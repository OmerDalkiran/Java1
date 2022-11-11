package day27exceptions;

public class Exceptions03 {

    /*

    1) Java Exceptionlar olusturarak Developerlarin JAva kurallarina uymalarini temin etmistir.
              Aksi halde code yazamiyoruz.
    2) Bizde application uretirken kendi exceptionlarimizi olusturarak diger developerlarin
    bizim ortaya koydugumuz kurallara uymalarini temin ederiz. Mesela, hicbir isim kucuk harfle baslamaz.
    yada yas, 100 den buyuk yazilmamali. Exception duvarlari yeni devlere hepsini ogretim.
    3) Bizim urettigimiz Exceptionlara "custom exception" denir.
    4) Custom exception uretmek icin "extends RunTimeException" yapariz.
    5) Custom compiletimeexceptoon" uretmek icin " extends Exception" deriz.
     */
    public static void main(String[] args) throws IllegalGradeException {
      //  printGrades(120);  // Grade 0 dan az 100 den cok olamaz
        printGrades(60);  //60.0

        checkNameFormat("ali");  // Exception in thread "main" day27exceptions.IllegalNameException: Isimler buyuk harfle baslamalidir
    }
    // Ogrenci notlarini yazdiran bir metod olusturunuz.
    public  static void printGrades(double grade) throws IllegalGradeException {


        if(grade<0 || grade>100) {
            throw new IllegalGradeException("Grade 0 dan az 100 den cok olamaz");

        }else {
            System.out.println(grade);
        }

    }
    //Verilen ismiin ilk harfinin buyuk harf olmamasi durumunda exception atan exception yaziniz

    public static boolean checkNameFormat(String name){

        if (name.charAt(0)>='A' && name.charAt(0)<='Z') {

            return true;
        }else {
            throw new IllegalNameException("Isimler buyuk harfle baslamalidir");
        }
    }

}
