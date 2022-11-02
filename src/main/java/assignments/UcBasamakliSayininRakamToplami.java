package assignments;

public class UcBasamakliSayininRakamToplami {

    public static void main(String[] args) {
        // Uc basamakli sayinin rakmalari toplamini yazan kodu bulunuz.

        int num = -748393;  // 34
        num = Math.abs(num);

        int sum = 0;

        for(int i=num; i>0; i=i/10){

            sum=sum+i%10;
        }
        System.out.println(sum);
    }
}
