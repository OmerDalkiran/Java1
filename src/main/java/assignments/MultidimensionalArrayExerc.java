package assignments;

public class MultidimensionalArrayExerc {
    public static void main(String[] args) {

        // Bir String Multidimensional Arrayde icinde i olan elemanlari concole'a yazdiriniz.

        String ddr1[][] = {{"learn", "java", "it"}, {"is", "easy"}};

        for (String[] w : ddr1){

            for (String k : w) {

                if(k.contains("r")) {

                    System.out.println(k + " kelimesinde r vardir.");
                }
            }
        }

        // Bir String Multidimensional Array de icinde 2 olan numaralari yazdiriniz.

        String rkm [][] = {{"234", "564", "572", }, {"231", "54", "541"}, {"09", "621"}};

        for(String[] w : rkm){

            for(String k : w){

                if(k.contains("2")){

                    System.out.println(k + "numarasinda iki vardir.");
                }
            }
        }
        // Bir String Multidimensional Array de icinde "ana" olan kelimeleri yazdiriniz.

        String kod [][]= {{"banane", "sana", "ona"}, {"dana"}, {"cana"}, {"hayvana", "bak"}};

        for(String[] w : kod){

            for(String k : w){

                if(k.contains("ana"));

                System.out.println(k + "  kelimesi ana icerir");

            }


        }

    }
}
