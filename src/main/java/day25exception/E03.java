package day25exception;

public class E03 {

    public static void main(String[] args) {

        String str = "Ali";
        getNumOfChars(str);//3

        String s = "";
        getNumOfChars(s);//0

        String t = null;
        getNumOfChars(t);//NullPointerException
        //eğer length() method'unda null kullanırsanız "NullPointerException" ı alırsınız


    }

    //Bir String'de bulunan karakterlerin sayısını bulabilmek için bir method oluşturunuz.
    public static void getNumOfChars(String str){

        try {
            System.out.println(str.length());
        }catch (NullPointerException e){
            System.out.println("length() method'unda bir problem oluştu ==> "+e.getMessage());
            e.getStackTrace();
            //bu methodu kullandığınız zaman System.out.println(); kullanmanıza gerek yok.
        }

    }

}