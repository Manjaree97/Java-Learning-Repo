package objectCreation;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ObjectCreation {

    public static void main(String[] args) {

        //Object creation using new keyword
//        Associate a1 = new Associate();
//        a1.display();
//        Associate a2 = new Associate(1,"xyz", true);
//        a2.display();
//        a2.changeCompany("Google");
//        a1.display();

//        //Using new Instance method of Class class
//        try {
//            Class<?> cls = Class.forName("com.cerner.Associate");
//            Associate obj = (Associate) cls.newInstance();
//            obj.display();
//        } catch (IllegalAccessException e) {
//            System.out.println("**IllegalAccessException**");
//            e.printStackTrace();
//        } catch (InstantiationException e) {
//            System.out.println("**InstantiationException**");
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            System.out.println("**ClassNotFoundException**");
//            e.printStackTrace();
//        }
//
        //Using NewInstance of Constructor class
        try {
            Constructor<Associate> parametrizedConstructor = Associate.class.getDeclaredConstructor(int.class,String.class, boolean.class);
            Associate associate = parametrizedConstructor.newInstance(1,"abc", true);
            associate.display();
            Constructor<Associate> emptyConstructor = Associate.class.getDeclaredConstructor();
            emptyConstructor.setAccessible(true);
            associate = emptyConstructor.newInstance();
            associate.display();
        } catch (InstantiationException e) {
            System.out.println("**InstantiationException**");
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            System.out.println("**IllegalAccessException**");
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            System.out.println("**InvocationTargetException**");
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            System.out.println("**NoSuchMethodException**");
            e.printStackTrace();
        }
//
//        //Using Class Loader
//        try {
//            Associate classLoaderObj = (Associate) ClassLoader.getSystemClassLoader().loadClass("com.cerner.Associate").newInstance();
//            classLoaderObj.display();
//        } catch (InstantiationException e) {
//            System.out.println("**InstantiationException**");
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            System.out.println("**IllegalAccessException**");
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            System.out.println("**ClassNotFoundException**");
//            e.printStackTrace();
//        }
//
//        //Using clone()
//        CloneableClass obj1 = new CloneableClass();
//        System.out.println(obj1);
//        System.out.println(obj1.display());
//
//        CloneableClass obj2 = new CloneableClass();
//        System.out.println(obj2);
//        System.out.println(obj2.display());
//
//        try {
//            CloneableClass obj3 = (CloneableClass) obj1.clone();
//            System.out.println(obj3);
//            System.out.println(obj3.display());
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
//        CloneableClass obj4 = new CloneableClass();
//        System.out.println(obj4);
//        System.out.println(obj4.display());
//
//        //Using Deserialization
//        Associate object = new Associate(2, "abc", false);
//        /*-----------------Serialization--------*/
//        try {
//            FileOutputStream fos = new FileOutputStream("Associate.txt");
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
//            oos.writeObject(object);
//            oos.close();
//        } catch (FileNotFoundException e) {
//            System.out.println("**FileNotFoundException**");
//            e.printStackTrace();
//        } catch (IOException e) {
//            System.out.println("**IOException**");
//            e.printStackTrace();
//        }
//        object = null;
//        /*-----------------Deserialization--------*/
//        FileInputStream file; // reading an object from a file
//        try {
//            file = new FileInputStream("Associate.txt");
//            ObjectInputStream is = new ObjectInputStream(file);
//            object = (Associate)is.readObject();        //deserialize object
//            is.close();                     //closes the ObjectInputStream
//            file.close();                   //closes the file
//        } catch (FileNotFoundException e) {
//            System.out.println("**FileNotFoundException**");
//            e.printStackTrace();
//        } catch (IOException e) {
//            System.out.println("**IOException**");
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            System.out.println("**ClassNotFoundException**");
//            e.printStackTrace();
//        }
//
//        System.out.println("Object after deserialization -> ");
//        assert object != null;
//        object.display();



    }
}
