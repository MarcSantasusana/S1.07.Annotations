package n3exercici1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args)
    {
        try {

            Person person = new Person("Pere", "Camps", 34);

            String methodWithAnnotation = "";

            System.out.println("Methods from Person class using Java Reflection: \n");

            for (Method method : person.getClass().getDeclaredMethods()) {

                System.out.println(method.getName());

                if (method.isAnnotationPresent(SerializeJSON.class)) {

                    SerializeJSON serializeJSON = method.getAnnotation(SerializeJSON.class);
                    method.invoke(person, serializeJSON.directory());

                    methodWithAnnotation = method.getName();

                }
            }

            System.out.println("\nMethod with SerializeJSON annotation: \n");
            System.out.println(methodWithAnnotation);

        } catch(InvocationTargetException | IllegalAccessException e)
        {
            System.out.println(e.getMessage());
        }

    }

}
