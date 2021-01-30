package objectCreation;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassAndClassLoaders {

    public static void main(String[] args) {
        Associate a1 = new Associate();
        a1.display();
        // Getting hold of Class object created
        // by JVM.
        Class c1 = a1.getClass();

        // Printing type of object using c1.
        System.out.println(c1.getName());

        // getting all methods in an array
        Method m[] = c1.getDeclaredMethods();
        for (Method method : m)
            System.out.println(method.getName());

        // getting all fields in an array
        Field f[] = c1.getDeclaredFields();
        for (Field field : f)
            System.out.println(field.getName());

        //Get class Loaders

        // String class is loaded by bootstrap loader, and
        // bootstrap loader is not Java object, hence null
        System.out.println(String.class.getClassLoader());

        // Associate class is loaded by Application loader
        System.out.println(Associate.class.getClassLoader());

    }
}
