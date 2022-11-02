package practiceAdvanced.practice03;

public class Q02_Ascii_AdiniYaz {
    /*

    //Adınızın içerdiği harfleri kullanmadan adınızı yazdıran bir kod yazınız.

     */


    public static void main(String[] args) {

        char ch1 = 'P'-1; // O
        char ch2 = 'N'-1; // M
        char ch3 = 'F'-1; // E
        char ch4 = 'Q'+1; // R

       // System.out.println(ch1+ch2+ch3+ch4); // 306
        System.out.println(""+ch1+ch2+ch3+ch4);  // OMER
    }
}
