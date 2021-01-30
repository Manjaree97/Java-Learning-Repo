package WraperClasses;

public class AutoboxedInteger {

    public static void main(String args[]) {
        Integer x = 400, y = 400;

        if (x == y)
            System.out.println("Same");
        else
            System.out.println("Not Same");

        x = 40;
        y = 40;
        if (x == y)
            System.out.println("Same");
        else
            System.out.println("Not Same");

        x= new Integer(40);
        y = new Integer(40);
        if (x == y)
            System.out.println("Same");
        else
            System.out.println("Not Same");
    }

}

