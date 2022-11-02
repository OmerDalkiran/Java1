package practiceAdvanced.practice04;

public class Q07_Variable_ArtirmaAzaltma {

    public static void main(String[] args) {


        int x = 20;
        int y = 15;


        System.out.println(x);         // 20
        System.out.println(x++ + ++y); // 36

        System.out.println(x);        // 21  post increment once x i alip uyguluyor.
                                      // JAva boyle calisiyor. once artirma yapiyor sonra topluyor demek.


        int z = 5;
        int sonuc = ++z + z++ + z++ + --z  + z-- +z;
                  // 6 +  6   + 7  +  7   + 7   + 6 =39

        System.out.println(sonuc); // 39
    }
}
