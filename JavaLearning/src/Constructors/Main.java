public class Main {
    int i,j;

    // No-argument constructor
    Main(){
        i = 5;
        System.out.println("The Value of i is:  " + i);
    }

    // Parameterized constructor
    Main(int k){
        i=k;
        System.out.println("The Value of i is:  " + i);
    }

    // Overloading Constructor
    Main(int i,int j){
        System.out.println("The Value of i is:  " + i+ " and j is:  "+ j);
    }

    public static void main(String[] args) {
     //   Main obj = new Main();      // calling the constructor without any parameter
     //  Main obj1 = new Main(10);
       Main obj2 = new Main(20,30);

    }
}
