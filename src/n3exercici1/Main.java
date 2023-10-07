package n3exercici1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args)
    {
        try {

            Person person = new Person("Pere", "Camps", 34);

            for (Method method : person.getClass().getDeclaredMethods()) {

                if (method.isAnnotationPresent(SerializeJSON.class)) {

                    SerializeJSON serializeJSON = method.getAnnotation(SerializeJSON.class);
                    method.invoke(person, serializeJSON.directory());

                }
            }

        } catch(InvocationTargetException | IllegalAccessException e)
        {
            System.out.println(e.getMessage());
        }

    }

}
