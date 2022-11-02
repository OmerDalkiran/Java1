package assignments.Loops;

public class LoopDenemeler {

    public static void main(String[] args) {


        for (int i = 10; i < 30; i = i + 4) {

            System.out.print(i + "    ");  //      10    14    18    22    26

        }

        for (int i = 30; i > 10; i = i - 4) {

            System.out.println(i + "    ");


        }
        for (int i = 50; i < 1001; i = i * 2 + 10) {   //  50  110  230  470  950
            System.out.print(i + "  ");

        }
        {

            for (int i = 100000; i > -1; i = i - 10000) {
                System.out.print("\n" + i + "   ");
                // Output is this :
                // 100000
                //   90000
                //  80000
                //  70000
                //  60000
                //  50000
                //  40000
                //  30000
                //  20000
                //  10000
                //      0

            }
            System.out.println("");
        }
        for (int k = 1; k < 4; k++) {

            for (int l = 1; l < 5; l++) {
                System.out.print("+");
            }
            System.out.println("");  // +++
            // +++
            // +++

        }

        for (int k = 1; k < 7; k++) {

            for (int l = 1; l < 4; l++) {
                System.out.print("?");
            }
            System.out.println("");  // ???
                                     // ???
                                     // ???
                                    // ???
                                    // ???
                                    // ???
        }


    }
}
