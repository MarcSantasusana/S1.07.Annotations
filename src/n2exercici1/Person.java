package n2exercici1;

import java.io.Serializable;

@SerializeJSON(directory = "src/n2exercici1")
public class Person implements Serializable {

    private String name;
    private String surname;

    private int age;

    public Person(String name, String surname, int age)
    {
        this.name = name;
        this.surname = surname;
        this.age = age;

    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
