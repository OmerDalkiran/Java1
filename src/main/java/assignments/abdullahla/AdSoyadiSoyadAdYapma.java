package assignments.abdullahla;

public class AdSoyadiSoyadAdYapma {
    public static void main(String[] args) {

        /*
    Her girdi satırı, tek boşluklarla ayrılmış bir veya birkaç sözcük içerir. Sözcükler değişmeden,
    her giriş satırındaki sözcüklerin sırasını tersine çevirmek için kod yazınız. Çıktınızın satırlarında
    sonunda veya başında boşluk olmamalıdır. Örnek; Kemal Can Kuzu, Kuzu Can Kemal'e dönüşecektir
 */

        String str = "omer dalkiran";
        String arr[] = str.split(" ");
        String strTers = "";

        for(int i=arr.length-1; i>=0; i--) {
            strTers += arr[i] + " ";
        }
        System.out.println(strTers.trim());



        for(int i=20; i>=0; i-=2 ){

            System.out.print(i+" ");
        }
    }
}
