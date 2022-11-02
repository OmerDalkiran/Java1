package practiceAdvanced.practice03;

import java.util.ArrayList;
import java.util.List;

public class Q06_MountainArray {

    /*
Bir Array'in Mountain Array olup olmadığını kontrol eden bir kod yazınız.
Mountain Array: Element değerleri bir noktaya kadar sürekli artıp o noktadan sonra sürekli azalan Array.
 */
    public static void main(String[] args) {



            int arr[]={0,2,5,3,1};
            List<Integer> numbers = new ArrayList<>();
            for(int w:arr) {
                numbers.add(w);
            }
            int counter = 0;
            int enBuyuk = numbers.get(0);
            for (int w : numbers) {
                if (enBuyuk >= w) continue;
                enBuyuk = w;
            }
            int enBuyukIndex=numbers.indexOf(enBuyuk);
            int enSonIndex=(numbers.size()-1);
            System.out.println("son eleman="+ (numbers.size()-1));
            System.out.println("enBuyukIndex ="+enBuyukIndex);
            for (int i = 0; i < enBuyukIndex; i++) {
                if (numbers.get(i + 1) > numbers.get(i)) continue;
                counter++;
            }
            for (int j = enSonIndex; j >enBuyukIndex; j--) {
                if (numbers.get(j) < numbers.get(j-1)) continue;
                counter++;
            }
            System.out.println(counter==0 ? "Dizi Mountain Array' dir." :"Dizi Mountain Array degildir");
        }

    }



