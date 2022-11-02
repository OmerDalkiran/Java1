package day18arraylistspassbyvalue;

public class PassByValue01 {

    /*
       1)Java variable ların orjinal değerlerini korumak ister.
       2)Variable method lar içinde kullanıldığında, Java method un içine orjinal değeri koymaz, o değerin kopyasını
       üretir ve method a o kopyayı yollar. Method kopya üstünde değişiklik yapar, dolayısıyla variable ın orjinal
       değeri korunmuş olur. Bu sisteme " Pass By Value " denir.

       Note : Java " Pass By Value " kullanır. "Pass By Referance" kullanmaz.
       Note : Bazı programlama dilleri orjinal değeri koruma altına almamıştır. Bu işi developer lara bırakmıştır.
       Bu tarz diller "Pass By Referance" kullanır.
       Bazi islemleri yaparken orijinal degeri korumak cok onemlidir.
       Java  orijinal degeri degistirmemeye gore kurulmustur Buna default value denir.
       methodlar main methodun disinda olusturulur.

       Static metod olan main metodun icindeki hersey static olmalidir.

     */



    public static void main(String[] args) {
        int x = 5;//Gomlek                      //Java orjinal değeri korur.
        System.out.println(x);//5

        //static method olan "main" un içindeki herşey static olmalıdır.

        change(x);//Ogrenci gomleği
        System.out.println(x);//Gomlek
        int ucret = 100 ;
        int kopya = indirim(ucret);    //Bunların yerine  ucret = indirim(ucret) yazılırsa orjinal değer değişir.
        System.out.println(kopya);     //
        System.out.println(ucret);
    }

    public static void change(int a){//void olduğu için return kullanmadık
        System.out.println(a*3);
    }
    //void dışındaki "return" type larda method body si içinde "return" keyword kullanılmalıdır.
    public static int indirim(int gomlekUcreti){
        return gomlekUcreti - 10;

    }
}

