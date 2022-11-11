package day27exceptions;

public class IllegalNameException extends RuntimeException {
    // ilk once olusturdugumuz class i parenta bagliyoruz extends le.
    //sonra construction olusturuyoruz
    public IllegalNameException (String message){


        super(message); // parenta diyorum ki bu mesaji exceptiona yapistir. Genelde boyle yapariz.

    }
}
