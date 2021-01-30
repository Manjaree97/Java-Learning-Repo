package Methods;

public class Main {

    //user defined method
    public static int add(int n1, int n2)
    {
        int sum=n1+n2;
        return sum;
    }

    //static method
    static void show()
    {
        System.out.println("It is an example of static method.");
    }

    public static void main(String[] args) {
        // using the max() method of Math class
        //System.out.println("The maximum number between 9 and 7 is: " + Math.max(9,7)); //predefined method

//        int ans = add(5,5); //called user defined method
//        System.out.println("The sum of number is= " + ans);

        show(); //calling static method

    }
}
