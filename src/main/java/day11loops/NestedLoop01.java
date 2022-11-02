package day11loops;

public class NestedLoop01 {

    public static void main(String[] args) {

        /*
            Example 1: Asagidaki ciktiyi verecek kodu yaziniz
            1.Example:Type code to get the output like  (Asagidaki ciktiyi verecek kodu yaziniz.)
               WEEK loop unun icin Day Loop u var. Dongu icinde baska donguler varsa "Nested Loop denir.
               once distakinin kodu yazilir.

                        Week: 1
                          Day: 1
                          Day: 2
                          Day: 3
                          .....
                        Week: 2
                          Day: 1
                          Day: 2
                          Day: 3
                          ....
                        Week: 3
                          Day: 1
                          Day: 2
                          Day: 3
                          ....
         */
        for (int i = 1; i < 4; i++) {

            System.out.println("Week: " + i);

            for (int k = 1; k < 8; k++) {

                System.out.println("Day: " + k);


                // Ex 2 : Type code to get the output like  (Asagidaki ciktiyi verecek kodu yaziniz.)

        /*
Month: 1
Week:  1     Day:1  Day:2  Day:3  Day:4  Day:5  Day:6  Day:7
Week:  2     Day:1  Day:2  Day:3  Day:4  Day:5  Day:6  Day:7
Week:  3     Day:1  Day:2  Day:3  Day:4  Day:5  Day:6  Day:7
Week:  4     Day:1  Day:2  Day:3  Day:4  Day:5  Day:6  Day:7

Month: 2
Week:  1     Day:1  Day:2  Day:3  Day:4  Day:5  Day:6  Day:7
Week:  2     Day:1  Day:2  Day:3  Day:4  Day:5  Day:6  Day:7
Week:  3     Day:1  Day:2  Day:3  Day:4  Day:5  Day:6  Day:7
Week:  4     Day:1  Day:2  Day:3  Day:4  Day:5  Day:6  Day:7

Month: 3
Week:  1     Day:1  Day:2  Day:3  Day:4  Day:5  Day:6  Day:7
Week:  2     Day:1  Day:2  Day:3  Day:4  Day:5  Day:6  Day:7
Week:  3     Day:1  Day:2  Day:3  Day:4  Day:5  Day:6  Day:7
Week:  4     Day:1  Day:2  Day:3  Day:4  Day:5  Day:6  Day:7

         */
            }
            System.out.println();
        }
                for (int i = 1; i < 13; i++) {
                    System.out.print("\n" + "\n" + "Month: " + i );

                    for (int k = 1; k < 5; k++) {
                        System.out.print("\n"+ "Week:  " + k + "     ");

                        for (int m = 1; m < 8; m++) {
                            System.out.print("Day:" + m + "  ");
                        }
                    }
                }
            }
        }



