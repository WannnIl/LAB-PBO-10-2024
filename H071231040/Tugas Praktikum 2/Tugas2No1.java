// import java.util.Scanner;

class Person {
    String name;
    int age;
    boolean isMale;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    void setAge(int age) {
        this.age = age;
    }

    int getAge() {
        return this.age;
    }

    void setGender(boolean isMale) {
        this.isMale = isMale;
    }

    String getGender() {
        return (isMale ? "Male" : "Female");
    }
}

public class Tugas2No1 {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);

        // String nama = input.nextLine();
        // int umur = input.nextInt();
        // boolean laki = input.nextBoolean();

        Person obj = new Person();

        obj.setName("Cholyn");
        obj.setAge(19);
        obj.setGender(true);

        System.out.println("Hello, My Name is " + obj.getName());
        System.out.println("I'm " + obj.getAge() + " years old");

        if (obj.getGender() == "Male") {
            System.out.println("I've balls and that makes me a " + obj.getGender());
        } 
        else if (obj.getGender() == "Female") {
            System.out.println("I've righteous heart and that makes me a " + obj.getGender());
        }

        // input.close();
    }
}
