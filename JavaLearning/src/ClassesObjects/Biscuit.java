package ClassesObjects;

import java.util.Date;

public class Biscuit implements Cloneable {
    //properties
    String shape;
    String text;
    int calories;
    
    //methods
    public static void bake() {
    	System.out.println("Biscuit ..");
    }
    public static void pack() {
    System.out.println("Wrap..");	
    }  

     /**
     * main method
     * @param args
     * @throws CloneNotSupportedException
     */
    public static void main(String[] args) throws CloneNotSupportedException { 
    	Biscuit goodDay = new Biscuit();
    	goodDay.calories=300;
    	goodDay.shape="Round";
    	goodDay.text="NIL";
    
    	System.out.println(goodDay.hashCode());
    	System.out.println(goodDay.getClass());
    	///clone() throws CloneNotSupportedException for userdefined classes, so this class implements Clonable interface
    	Biscuit parle = (Biscuit)goodDay.clone(); 
    	System.out.println(parle.toString());
    	System.out.println(parle.hashCode());
   	
    	Biscuit crackjack = new Biscuit();
    	crackjack.calories=200;
    	System.out.println("equals Method--"+ crackjack.equals(goodDay));
  	
// Clone example with an inbuilt class in java   	
    	Date date = new Date();
        System.out.println(date.toString());
        Date date2 = (Date) date.clone();
        System.out.println(date2.toString());   
	}
}
