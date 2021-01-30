package GarbageCollection;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.List;

public class GarbageCollectionDemo {
    GarbageCollectionDemo i;
    String name;
    private static int activeInstanceCount = 0;

    public String getName() {
        return name;
    }
    GarbageCollectionDemo(String name) {
        this.name = name;
        activeInstanceCount++;
        System.out.println("Object created, count = "+activeInstanceCount);
    }
    public static void main(String[] args)
    {
        GarbageCollectionDemo obj1 = new GarbageCollectionDemo("obj1");
        obj1=null;
        System.gc();
        GarbageCollectionDemo obj2 = new GarbageCollectionDemo("obj2");
        obj2=null;
        Runtime.getRuntime().gc();

        GarbageCollectionDemo t1 = new GarbageCollectionDemo("t1");
        GarbageCollectionDemo t2 = new GarbageCollectionDemo("t2");

        // Object of t1 gets a copy of t2
        t1.i = t2;

        // Object of t2 gets a copy of t1
        t2.i = t1;

        // Till now no object eligible
        // for garbage collection
        t1 = null;

        //now two objects are eligible for
        // garbage collection
        t2 = null;

        // calling garbage collector
        System.gc();

    }
//    public void finalize()
//    {
//        activeInstanceCount--;
//        System.out.println("Garbage Collected, active instances = "+activeInstanceCount);
//    }
    @Override
    public void finalize() throws Throwable {
        activeInstanceCount--;
        super.finalize();
        this.finalize(this);

    }

    public void finalize(GarbageCollectionDemo obj)
    {
        System.out.println("Garbage collector called for -> "+obj.getName()+ "  Active Instances -> "+activeInstanceCount);
    }
}

class GCInformation {

    public static void main(String[] args) {
        try {
            List<GarbageCollectorMXBean> gcMxBeans = ManagementFactory.getGarbageCollectorMXBeans();

            for (GarbageCollectorMXBean gcMxBean : gcMxBeans) {
                System.out.println(gcMxBean.getName());
                System.out.println(gcMxBean.getObjectName());
            }

        } catch (RuntimeException re) {
            throw re;
        } catch (Exception exp) {
            throw new RuntimeException(exp);
        }
    }
}