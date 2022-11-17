package day31maps;

import java.util.HashMap;

public class HashMap02 {

    /*

    1)Siz "HashMap<String, Double> salaries = new HashMap<>();" kodu yazdığınızda Java memory'de 16 kutu(bucket) içeren bir yapı oluşturur ve
      bu yapıdaki her bir kutuya index verir. Index'ler 0'dan 15'e kadardır.
    2)Siz "salaries.put("QA", 110000.00);" kodunu yazdığınızda Java key için bir HashCode oluşturur, bu HashCode'u 15'e böler ve kalanı index olarak kullanır.
      Ve bu elemanı o index'e yerleştirir.
    3)Yerleştirirken 4'lü bir yapı oluşturur, bu yapının ilk bölümüne "HashCode"u ikinci bölümüne "Key"i, üçüncü bölümüne "Value" u ve dördüncü bölümüne
      "pointer"ı koyar. Bu çok bölümlü yapı LinkedList'lerdeki Node'dur. Yani HashMap, bucket'lara koyduğu data'yı LinkedList olarak depolar.
    4)Java "null" için hep HashCode olarak "zero" üretir, o yüzden key null olduğunda eleman ilk bucket'a yerleştirilir. Bundan dolayı key'si null olan
      elemanlar Map'in içinde genellikle ilk sırada gözükürler.
    5)Java normalde HashCode'ları unique yapar ama bazen trafik kazası gibi farklı iki eleman için aynı HashCode üretilebilir. Buna "HashCollision" denir.
      HashCollision meşhur bir Java development problemidir. Bu problemle karşılaşıldığında developer'lar bu problemi çözmek için kodlar yazarlar, ama bu
      Core Java'nın konusu değildir.


 */



    public static void main(String[] args) {

        // Map calisma mekanizmasi

        HashMap<String, Double> salaries = new HashMap<>();

        salaries.put("QA", 110000.00);
    }

}
