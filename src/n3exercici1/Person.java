package n3exercici1;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;


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

    @SerializeJSON(directory = "src/n3exercici1")
    public void serialize(String directory) throws IOException {

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(directory + "/person.json"));
        out.writeObject(this);
        out.close();
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
