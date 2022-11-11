package day27exceptions;

public class IllegalGradeException extends Exception{

    // Java okuyarak anlamadigi icin Exception classin cocugu
    // yaptik ki bu classimizin exception oldugunu anlasin java
    // Eger Exception class a extend edersek, classimiz "compile time exception" olur.
    public IllegalGradeException(String message){ // mesaj parametresi kullanabilmek icin bunu ekledik


        super(message); // parenta git o sana mesaji halledecek demek bu


    }


}
