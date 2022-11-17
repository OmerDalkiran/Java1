package assignments.GroupQuestions;

public class CivataSomun {

    public static void main(String[] args) {
        /*
        Q.5: Have on hand some nuts of different sizes and bolts to fit those nuts.
             How do you write an algorithm to map bolts to nuts.
             Elinizde bir miktar farklı boylarda somun ve bu somunlara uyacak civatalar olsun.
             Civataları somunlara eşlemek için nasıl bir algoritma yazarsınız.

          Somun  = {1, 6, 3, 5, 2};
          Civata = {1, 2, 3, 6, 5};

   */

        int[] somun = {1, 6, 3, 5, 2};
        int[] civata = {1, 2, 3, 6, 5};

        for (int i = 0; i < somun.length; i++) {

            for (int j = 0; j < civata.length; j++) {
                if (somun[i] == civata[j]) {
                    System.out.println("Somunun " + i + ". indexi =" + "civatanin " + j + ". indexine esittir.");
                }
            }
        }
       /*
        Q.similiar:
             Elinizde bir miktar kilit ve onlara  uyacak anahtarlar olsun.
             Anahtarlari kilitlere eşlemek için nasıl bir algoritma yazarsınız.

          kilitNo   = {382, 600, 34, 544, 2205};
          AnahtarNo = {34, 2205, 382, 600, 544};

             */
        System.out.println();

        int[] kilitNo = {382, 600, 34, 544, 2205};
        int[] anahtarNo = {34, 2205, 382, 600, 544};

        for (int k = 0; k < kilitNo.length; k++) {

            for (int s = 0; s < anahtarNo.length; s++) {

                if (kilitNo[k] == anahtarNo[s]) {

                    System.out.println("Kilit indexi = " + k + " olan kilitin anahtari," + "anahtar no.su " + s + ". indexteki anahtardir.");

                }
            }

                }
            }
        }
