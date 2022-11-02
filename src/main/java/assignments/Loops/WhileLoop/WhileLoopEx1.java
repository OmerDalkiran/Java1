package assignments.Loops.WhileLoop;

public class WhileLoopEx1 {
    public static void main(String[] args) {

        //60 tan 11'e kadar 4 ile bölünebilen ve 6 ile bölünebilen tüm tam sayıları aynı satırda iki
        //ardışık tam sayı arasında boşluk bırakarak yazınız.

        int a = 60;
        while(a>10){
            if (a%4==0 && a%6==0){
                System.out.print(a + " ");
            }
            a--;
        }
    }
}
