import java.util.Scanner;
//=============================================================================
public class Person {

    private String name;
    private int age;


    public String getName() {
        return name;
    }

    public String toString() {
       return(name + " " + age);
    }


    public int getAge() {
        return age;
    }

    public Person(String initialName, int age) {
        this.age = age;
        this.name = initialName;
    }
    public void incrementAge(){
        this.age++;
    }
}