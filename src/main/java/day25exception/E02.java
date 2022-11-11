package day25exception;

public class E02 {

    public static void main(String[] args) {
        String arr[] = {"Ali", "Can", "Veli", "Han"};
        getElementFromArray(arr,2); // Veli
        getElementFromArray(arr,4); //  ArrayIndexOutOfBoundsException

    }
        // Bir String Array den index girerek eleman elde edebilmek icin bir metod olusturun.

    public static void getElementFromArray (String arr[],int idx){

        try{

            System.out.println(arr[idx]);
        }catch (ArrayIndexOutOfBoundsException e){   // cikan hata bulogunu biz catch'in yanindaki parantezin icine yaziyoruz.

            System.err.println(" Array indexte bir problem meydana geldi"); // kirmizi renkte yazdirmak icin err le yazdiriyoruz.
                                                                     // Hata mesajini direkt gormek icin. diger mesajlardan farkli olmasi icin.
            System.err.println(" Array indexte bir problem meydana geldi==>" + e.getMessage());
            // Array indexte bir problem meydana geldi==>Index 4 out of bounds for length 4
            e.printStackTrace(); // Dev ler buna ihtiyac duyarlar.   Exception ile ilgili detayli teknik mesaj verir.

        }





           // bunu try'in hemen altina koyuyoruz. System.out.println(arr[idx]);  //  1- bir method olusturduk ve
            // metodun ne yapacagini soyledik javaya. Java git
            // bir string arrayden index li elemani yazdir.


    }

}
