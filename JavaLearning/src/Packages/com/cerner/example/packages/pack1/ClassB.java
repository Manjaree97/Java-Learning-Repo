package Packages.com.cerner.example.packages.pack1;

public class ClassB {
  ClassA classA = new ClassA();

  public String string = classA.string;
  String string2 = classA.string2;

  // Not allowed since private to ClassA
//  String string3 = classA.string3;
}
