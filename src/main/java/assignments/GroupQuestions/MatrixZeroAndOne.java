package assignments.GroupQuestions;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MatrixZeroAndOne {
    public static void main(String[] args) {
        /*
    Kullanıcıdan aldığınız bir sayi kadar satır ve sütun sayısına sahip alttaki rastgele 0 ve 1'lerden oluşan matriksi yazdırın.
    Input: 10
    Output:
            1 0 0 1 1 0 0 0 1 1
            0 0 1 0 1 0 1 0 0 0
            0 1 0 1 0 0 0 0 0 1
            1 1 1 0 0 0 0 1 1 1
            1 1 0 1 1 1 0 1 0 0
            1 0 0 0 1 1 0 0 0 0
            0 0 1 0 0 0 0 1 1 1
            1 1 0 1 0 1 0 0 1 0
            0 0 1 0 0 0 0 1 1 0
            1 1 1 0 0 1 1 1 1 0
 */

            int p;
            Scanner obj = new Scanner(System.in);
            System.out.print("Enter the number of the matrix dimension:");
            p = obj.nextInt();

            Random r=new Random();
            int[][] a=new int[p][p];
            for(int i=0;i<p;i++)
            {
                for(int j=0;j<p;j++)
                {
                    a[i][j]=r.nextInt(10);
                    System.out.print(a[i][j]+"\t");
                }

                System.out.print("\n");
            }




        String[][] names = { {"Sam", "Smith"}, {"Robert", "Delgro"}, {"James", "Gosling"}, };
            // how to initialize two dimensional array in Java using for loop

        int[][] board = new int[3][3];
        for (int i = 0; i < board.length; i++) {
         for (int j = 0; j < board[i].length; j++) {
         board[i][j] = i + j;
         }
         }
        System.out.println(Arrays.deepToString(board)); //[[0, 1, 2], [1, 2, 3], [2, 3, 4]]

        }
    }



