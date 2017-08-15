package com.packagedemo.package1;

public class Derived extends com.packagedemo.package1.Protection {
  Derived() {
    System.out.println("Derived Constructor");

    // Line number 8 should not compile as private variable is
    // accessible only in the class where it is declared
    System.out.println("private var value: " + $privateVar);

    // Below line should compile as Derived class is child of
    // Protected and it is in the same package as Protection class
    System.out.println("protected var value: " + $protectedVar);

    // Below line should also compile as default access works
    // in the same package classes as well as derived classes
    System.out.println("defaultVar var value: " + $defaultVar);

    // Below line should compile anywhere as public modifiers
    // are accessible to all classes.
    System.out.println("publicVar var value: " + $publicVar);
  }
}
