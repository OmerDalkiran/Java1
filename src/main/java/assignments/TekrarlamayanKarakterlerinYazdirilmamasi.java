package assignments;

public class TekrarlamayanKarakterlerinYazdirilmamasi {
    public static void main(String[] args) {

        // Size verilen bir Stringte tekrarsiz karakterleri yazdirin.
        // Hellooo Ali ==> He Ai olacak.

        String s = "Hellooo Ali";
        for (int i = 0; i < s.length(); i++) {

            //  if(s.indexOf())  boyle yazilinca bir yerlerden bir seyin indexini almamiz lazim.
            char c = s.charAt(i);             //  onun icin de bundan once bir char olusturmamiz gerek
            // bu kod bize karakteri alacak. c nin icine koyacak.
            // Sonra ben diyorum ki bu karakterin ilk gorunumunun indexi esitse son gorunumunun
            // indexine , o zaman c yi yazdir diycem
            if (s.indexOf(c) == s.lastIndexOf(c)) {
                System.out.print(c);  // eger burasi loopun disinda olursa yazdirmiyor, dikkat.

            }
        }
        int a = 20 ; int b = 8 ; int c = a % b ;
        System.out.println(c);
    }
}
