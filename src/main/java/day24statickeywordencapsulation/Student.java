package day24statickeywordencapsulation;


// encapsulation ; kapsule koymak demek
// Datayi dis etkenlerden korumak icin de encapsulation yapariz.
// Data hiding tir. Nicin peki datayi gizlersiniz?
// DAta yi nasil gizlersiniz?- Accsess modifier i "private" yaparak gizleriz
// Private oldugu zaman data sadece "Class"in icindeyken gorunur.
// DAta yi gizledikten sonra baska classlardan okumak stersen ne yaparsin?
    /*
    Get metodlar olusturarak gizledigimizdatalari okunur hale getirebiliriz.
    (by using "Getters"- get metodlari demek)
    "set methodlar olusturarak gizledigimiz datalari degistirebiliriz.
    (by using "Setters"- set metodlar demek
     */


public class Student {

    public  String stdName = "Tom Hanks";
    private String stdID = "TH202201";
    private double gpa = 3.8;
    private boolean retired = false;   // 3 tane gizli data olusturdum.


    // get methodu nasil olusturulur? Bosluga saga tikla/ Generartor dan getter i sec .
     // Variable in data type i ile get metodun return type i ayni olmalidir.
     // Get metodlari isimlendirirken "get" + variable name yapitoruz. Sadece boolean da "is" basina eklenir.

    public String getStdID() {  // hey java bana studentID yi ver demek bu
        return stdID;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean isRetired() {
        return retired;
    }

    public void setStdID(String stdID) { // return typelar hep voidtir.
        this.stdID = stdID;
    }

    public void setGpa(double gpa) {  // VAriable in ismi neyse parametrenin de ismi genelde o olur.
        this.gpa = gpa;
    }

    public void setRetired(boolean retired) {
        this.retired = retired;
    }


}
