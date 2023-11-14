package n2exercici1;

import java.io.*;


public class Main {

    public static void main(String[] args) {

        try {

            Person person = new Person("Pere", "Camps", 34);

            if (person.getClass().isAnnotationPresent(SerializeJSON.class)) {
                SerializeJSON serializeJSON = person.getClass().getAnnotation(SerializeJSON.class);

                serialize(person, serializeJSON.directory());

            }

        } catch(IOException e)
        {
            System.out.println(e.getMessage());
        }

    }

    public static void serialize(Person person, String directory) throws IOException {

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(directory + "/person.json"));
        out.writeObject(person);
        out.close();
    }


}
