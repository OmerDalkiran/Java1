package day23inheritancepolymorphism;

public class Cat extends Mammal{

  public void   meow(){

      System.out.println("Cats meow");



  }

    @Override
    public int add(int a, int b) {
        return a+b+1;  // primitive return type varsa sakinha override yaparken return type dokunmayin
    }

    @Override
    public Integer multiply(int a, int b) {
        return a*b+1;
    }

    @Override
    public Animal create() {
        return new Mammal();

    }
 // Asagidaki method " overriding method
    @Override   //  @Override annotaton ini kullanarak Javanin yaptigimiz Override islemini kontrol etmesini saglariz
                // yani ben bir is yaptim, kalite konrol yap demek
    public void eat() {
       // super.eat(); // parent a git eat i  kullan demek bu. ama ben bunu istemiyorumki !!
        System.out.println("Cats eat");




         /*
         1 Override yaparken sadece metodun body si degistirilir.
         2 Asla method un imzasina dokunulmaz.   yani  eat()
         3 Override yaparken inheritance olmak zorundadir. ( interview da override yapmanin on sarti nedir? inheritance tir
         4 Override yaparken "access modifier lar belli kurallara gore farklilastirilabilirler.
            i) Private methodlar override edilemezler
            ii) Chil class taki override edilen method'un access modifier i parent classtaki
                methodun access modifier i ile ayni veya daha genis olmalidir. Cocuk babayi sinirlandiramaz.
                Baba istanbulda gezmek istiyor. Cocuk diyor ki lafimi olur Turkiyede gez der gibi protected-public
                ama tersi public-protected olursa = BAba diyor Turkiyede gezmek istiyorum Cocuk istanbulda gez diyor babasina.

            iii) Default methodlar ayni package icindeyse override edilebilirler. Farkli package ten override edilemezler.
         5 Parent class taki metodun return type i void ise return type degistirilemez. Eger degistirilirse problem olur
         6 Parent class taki metodun return type i primitive ise return type degistirilemez.
         7 Wrapper class larda metodun return type i primitive ise return type degistirilemez.

         8 Parent class taki metodun return type i Parent class ise,  "return type" child lardan biri olabilir.
           note 1: Child classtaki return type , parent class takinden genis olanaz.
           note 2: Aralarinda parent-child iliskisi olmayan classlar overriding te return type degisiminde kullanilamazlar.
           Mesela ; "Short" integer dan kucuktur fakat aralarinda parent-child iliskisi olmadigindan integer yerine short
                   kullanamazsiniz.

                   is a :  child tan parenta giderken  /  has a : parenttan -childa giderken
           9 Child<Prent ==>IS-A (Her kedi hayvandır ama her hayvan kedi değildir.
            HAS-A ==> Hayvanlar kedileri içerir ama kediler tüm hayvanları içermez.

            10 final methodlar override edilemezle , cunku overriding de method body degistirilir.
             fakat final method body degistirilmesine musaade etmez
           11 Polymorphism       = overloading    + overriding tir
              coklu yapi,bicim   = asiri yukleme  + uzerinde degistirme
              note: polymorphism nedir derlerse overloading ve overriding i anlatin.

           12 Overloading ve overriding arasindaki farklar nelerdir?
             i) overloading icin inheritance gerekmez fakat overriding icin gerekir.
              Overloading bir classin icinde oluyor. orada parent yok, child yok. overriding te parenttan alip degistiriyorsunuz.
             ii) Private methodlar overload edilebilir. Private lar override edilemezler.
               (overload bir classin icinde oldugu icin)
             iii) final methodlar overload edilebilir, override edilebilirler.
                 (overloading te body ye dokunma zorunlulugu olmadigi icin. )
             iv) overloading static morphism olarak ; overriding dynamic polimorphism olarak adlandirilir.
                 cuku static methodlar overload edilebilir, override edilemez.
             v) "Overloading"te method signature degisi, ama overriding te method signature a dokunulmaz.


        */

    }
}
