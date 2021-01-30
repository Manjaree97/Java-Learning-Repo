public class InstanceMethodExample {
    public static void main(String[] args) {
        //Creating an object of the class
        InstanceMethodExample obj = new InstanceMethodExample();
        //Invoking instance method
        System.out.println("The sum is: " + obj.add(5, 5));
    }

    // Instance method
    public int add(int a, int b) {
        int sum = a + b;
        return sum;
    }
}