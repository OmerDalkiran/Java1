package day32maps;

public class Students {

public String name;

public String email;

public int age;

public boolean success;

// bunlara bir constructor olusturalim. burada mause sag tikla , generator a git. Constructorlarin hepsini sec.


    @Override
    public String toString() {    // toString ==> object hakkindaki butun detaylari consola yazdirir
        return "Students{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", success=" + success +
                '}';
    }

    public Students(String name, String email, int age, boolean success) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.success = success;



    }
}

