package practiceAdvanced.practice08;

public class Q05_Array_HarfKullanimSayisi {
    /*

  Girilen String'de hangi harfin kaç kere kullanıldığını yazan bir kod yazınız.

  Input: String str = "Java is so Good";
  Output: String strOutput = "J1 a2 v1 i1 s2 o3 G1 d1";
   */
    public static void main(String[] args) {
        String str = " Java is so Good";
        String[] arr=str.split("");
        String cikti = "";

        for(String w:arr){
            int sayac = 0;
            for(String u:arr){
                if(w.equalsIgnoreCase(u)){
                    sayac++;
                }
            }
            if(!cikti.contains(w)){
                cikti+=w+sayac+" ";
            }
        }
        System.out.println(cikti);

    }

}