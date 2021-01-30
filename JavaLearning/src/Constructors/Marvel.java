package Constructors;

public class Marvel implements Cloneable {
    String FavoriteCharacter;
    

    // Parametrized constructor
    Marvel(String name){
        FavoriteCharacter = name;
    }

    //constructor to initialize another object
    Marvel( Marvel obj){
        FavoriteCharacter = obj.FavoriteCharacter;
    }

    Marvel(){
    }

    void display(){
        System.out.println("Name of Marvel Character: "+FavoriteCharacter);
    }


    public static void main(String args[]) throws CloneNotSupportedException {
//        try{
            Marvel object = new Marvel("Captain America");
            Marvel copyByConstructor= new Marvel(object);  //copying value using constructor
            object.display();
//        System.out.println("Copy By Constructor Example");
//        copyByConstructor.display();

            Marvel copyByObject= new Marvel();
            copyByObject.FavoriteCharacter = object.FavoriteCharacter;  // copying value using Object
//        System.out.println("Copy By Object Example");
//        copyByObject.display();

            Marvel copyByClone= (Marvel)object.clone();    // copying value using Clone method
            System.out.println("Copy By Clone Example");
            copyByClone.display();
//        }catch (CloneNotSupportedException c){}

    }
}
