package GenericClasses;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class GenericDAO<T extends Entity>{
    //T stands for "Type"
    private T t;

    public void save(T entity) { this.t = entity; } // code to save entity details to database

    public T get() {
        return t; // code to get details from database and return a T object
    }

    public static void main (String[] args) {

        GenericDAO<Doctor> doctorDAO = new GenericDAO<>();
        Doctor doctor = new Doctor(1, "abc");
        doctorDAO.save(doctor);

        Doctor fetchedDoctor = doctorDAO.get();
        System.out.println("Id: " + fetchedDoctor.id + "\nName: "+ fetchedDoctor.name);

        GenericDAO<Nurse> nurseDAO = new GenericDAO<>();
        Nurse nurse = new Nurse(1, "xyz");
        nurseDAO.save(nurse);

        Nurse fetchedNurse = nurseDAO.get();
        System.out.println("Id: " + fetchedNurse.id + "\nName: "+ fetchedNurse.name);
        Number n = new Integer(2);
//        GenericDAO<Number> numberDAO = new GenericDAO<>();
//        numberDAO.save(n);
//        List<Number> numbers = new ArrayList<Integer>();
    }
}

class Entity{
    int id;
    String name;
}
class Doctor extends Entity{

    Doctor(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
class Nurse extends Entity{
    int id;
    String name;
    Nurse(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Color<R, G, B> {
    R red;
    G green;
    B blue;

    public Color(R red, G green, B blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }
}

class WindowApp<T extends JFrame & Runnable> {
    T theApp;

    public WindowApp(T app) {
        theApp = app;
    }
}