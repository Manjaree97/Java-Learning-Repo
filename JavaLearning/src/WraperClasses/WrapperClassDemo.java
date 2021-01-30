package WraperClasses;

import java.util.ArrayList;
import java.util.List;

public class WrapperClassDemo {
    public static void main( String args[] ) {


        int  x = 33;
        Integer  y = new Integer(33);
        Integer  Z = new Integer("33");

        //explicit conversion
        int value=20;
        Integer explicitBox = Integer.valueOf(value);//converting int into Integer explicitly

        //Autoboxing
        Integer automaticBox = value; // Autoboxing will occur internally.

        System.out.println(value + " "  + explicitBox + " " + automaticBox);

        List<Integer> list = new ArrayList<>();
        list.add(1); // autoboxing

        //Unboxing
        int explicitUnbox = automaticBox.intValue();//converting Integer to int explicitly
        int automaticUnbox = automaticBox;//unboxing, now compiler will write a.intValue() internally

        System.out.println(value + " "  + explicitUnbox + " " + automaticUnbox);

        //Wrapping and UnWrapping in Java Classes
        byte b=10;
        short s=20;
        int i=30;
        long l=40;
        float f=50.0F;
        double d=60.0D;
        char c='a';
        boolean b2=true;

        //Autoboxing: Converting primitives into objects
        Byte byteobj=b;
        Short shortobj=s;
        Integer intobj=i;
        Long longobj=l;
        Float floatobj=f;
        Double doubleobj=d;
        Character charobj=c;
        Boolean boolobj=b2;

        //Printing objects
        System.out.println("\n---Printing object values---");
        System.out.println("Byte object: "+byteobj);
        System.out.println("Short object: "+shortobj);
        System.out.println("Integer object: "+intobj);
        System.out.println("Long object: "+longobj);
        System.out.println("Float object: "+floatobj);
        System.out.println("Double object: "+doubleobj);
        System.out.println("Character object: "+charobj);
        System.out.println("Boolean object: "+boolobj);

        //Unboxing: Converting Objects to Primitives
        byte bytevalue=byteobj;
        short shortvalue=shortobj;
        int intvalue=intobj;
        long longvalue=longobj;
        float floatvalue=floatobj;
        double doublevalue=doubleobj;
        char charvalue=charobj;
        boolean boolvalue=boolobj;

        //Printing primitives
        System.out.println("---Printing primitive values---");
        System.out.println("byte value: "+bytevalue);
        System.out.println("short value: "+shortvalue);
        System.out.println("int value: "+intvalue);
        System.out.println("long value: "+longvalue);
        System.out.println("float value: "+floatvalue);
        System.out.println("double value: "+doublevalue);
        System.out.println("char value: "+charvalue);
        System.out.println("boolean value: "+boolvalue);


        //Wrapper classes are immutable
        Integer immutableInt = new Integer(20); //initialize a object of Integer class with value as 20.
        System.out.println(immutableInt);
        operate(immutableInt);// method to change value of object.
        System.out.println(immutableInt); //value doesn't change shows that object is immutable.

    }
    private static void operate(Integer i) {
        i = i + 1;
    }
}
