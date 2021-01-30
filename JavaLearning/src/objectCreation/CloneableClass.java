package objectCreation;

public class CloneableClass implements Cloneable{

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    int i;
    static int j = 10;

    CloneableClass() {
        i = j++;
    }

    public String display() {
        return "Value of i :" + i;
    }
}