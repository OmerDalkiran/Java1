package practiceAdvanced.practice06;

public class Q03_Array_Simetrik {
    //Bir Array'in simetrik olup olmadığını kontrol eden bir method yazınız.
    public static void main(String[] args) {

        int[] arr = {1,2,3,2,1};


        System.out.println("Array simetrik mi? "+ simetrik(arr));
    }

    public static boolean simetrik(int[] arr){
        boolean sonuc = true;

        for(int i=0; i<arr.length;i++){
            if(arr[i] != arr[arr.length-1-i]){
                sonuc = false;
                break;
            }
        }
        return sonuc;
    }
}
