package assignments.GroupQuestions;

import java.util.Arrays;

public class Q07AddingGradesToAllSts {
    /*
            Grades are given for a class (1-100), the instructor of the course completes the grade
            of the student with the highest grade to 100 and adds points to all students as much as the
            point added to this student. List the grades of the students after the addition.

             string of notes={70,80,90,65,75,90,69,72,87,90,75}
             output={80,90,100,75,85,100,79,82,97,100,85}
     */


    public static void main(String[] args) {

        int [] arr = {70,80,90,65,75,90,69,72,87,90,75};
        System.out.println(Arrays.toString(arr));

        int max = arr[0];

        for (int i=0; i<arr.length; i++) {

            if (arr[i] > max) {
                max =arr[i];

            }
        }
        System.out.println("The highest Grade is =" + max );

        int  addedNote = 0;
        addedNote=100-max;
        System.out.println("Added Note is = " + addedNote);


        for (int i = 0; i < arr.length; i++) {
            arr[i]+= addedNote;
        }
        System.out.println("Added version of notes = " + Arrays.toString(arr));
    }


}
/*
[70, 80, 90, 65, 75, 90, 69, 72, 87, 90, 75]
The highest Grade is =90
Added Note is = 10
Added version of notes = [80, 90, 100, 75, 85, 100, 79, 82, 97, 100, 85]

 */