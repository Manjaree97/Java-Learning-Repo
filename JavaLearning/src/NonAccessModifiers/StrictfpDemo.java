package NonAccessModifiers;

import java.lang.reflect.*;
public abstract strictfp class StrictfpDemo
{
    public   abstract void abstractMethod();
    public   void concreteMethod(){};

    public static void main(String args[]){
        Method methods[] = StrictfpDemo.class.getMethods();
        for(Method method : methods){
            System.out.println("Method Name::"+method.getName());
            System.out.println("Modifiers::"+Modifier.toString(method.getModifiers()));
            System.out.println();

        }
    }
}