package InstanceOfOperator;

import java.util.List;

interface Learning {}
interface JavaLearning extends Learning {}
class JavaLearningMaterial {}
class ReflectionDemo extends JavaLearningMaterial {}

public class InstanceOfDemo extends JavaLearningMaterial implements JavaLearning {

    public static void main(String args[]) {

        //used to test whether the object is an instance of the specified type(class or subclass or interface). Returns true or false
        InstanceOfDemo obj1 = new InstanceOfDemo();
        System.out.println("obj1 instanceof InstanceOfDemo-> " + (obj1 instanceof InstanceOfDemo));

        InstanceOfDemo obj2 = new InstanceOfDemo();
        System.out.println("obj2 instanceof JavaLearning-> " + (obj2 instanceof JavaLearning));

        //Instanceof With Superinterface
        System.out.println("obj2 instanceof Learning-> " + (obj2 instanceof Learning));

        //object of subclass type is also a type of parent class
        InstanceOfDemo obj3 = new InstanceOfDemo();
        System.out.println("obj3 instanceof JavaLearningMaterial-> " + (obj3 instanceof JavaLearningMaterial));

        //A parent object is not an instance of Child
        JavaLearningMaterial parentObj = new JavaLearningMaterial();
        System.out.println("parentObj instanceof InstanceOfDemo-> " + (parentObj instanceof InstanceOfDemo));

        //instanceof operator with any variable that has null value, it returns false
        obj1 = null;
        System.out.println("obj1 instanceof JavaLearningMaterial-> " + (obj1 instanceof JavaLearningMaterial));
        System.out.println("obj1 instanceof InstanceOfDemo-> " + (obj1 instanceof InstanceOfDemo));

        //if we use instanceof operator, downcasting is possible
        //InstanceOfDemo demoObj = new JavaLearningMaterial();//Compilation error
        //InstanceOfDemo demoObj=(InstanceOfDemo)new JavaLearningMaterial();//Compiles successfully but ClassCastException is thrown at runtime
        JavaLearningMaterial downCastObj=new JavaLearningMaterial();
        //JavaLearningMaterial downCastObj=new InstanceOfDemo();
        InstanceOfDemo.downCast(downCastObj);

        //instanceof operator cannot be used if there is no relationship between the object that is being compared and the type it is being compared with.
        InstanceOfDemo obj4 = new InstanceOfDemo();
      //  System.out.println("obj4 instanceof ReflectionDemo " + (obj4 instanceof ReflectionDemo));

        // instanceof operator with the Object type will always evaluate to true
        System.out.println("obj4 instanceof Object-> " + (obj4 instanceof Object));
    }

    static void downCast(JavaLearningMaterial obj) {
        if (obj instanceof InstanceOfDemo) {
            InstanceOfDemo d = (InstanceOfDemo) obj;//downcasting
            System.out.println("downcasting performed");
        }
    }

    //Instance tests and casts depend on inspecting the type information at runtime. Therefore, we can't use instanceof along with erased generic types.
//    public static <T> void sort(List<T> collection) {
//        if (collection instanceof List<String>) {
//            // sort strings differently
//        }
//    }
}