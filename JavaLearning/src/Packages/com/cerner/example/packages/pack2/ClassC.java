package Packages.com.cerner.example.packages.pack2;

import Packages.com.cerner.example.packages.pack1.ClassA;
import Packages.com.cerner.example.packages.pack1.ClassB;

public class ClassC {
  ClassA classA = new ClassA();
  ClassB classB = new ClassB();

  String stringA = classA.string;
  String stringB = classB.string;

  /*
    Not allowed since protected access
    only allows access within same package
  */
//  String string2 = classA.string2;

  /*
    Not allowed since private to ClassA
  */
//  String string3 = classA.string3;
}
