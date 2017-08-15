package com.packagedemo.package2;
import com.packagedemo.package1;
class Derived2 extends Protection {
  public Derived2() {
    System.out.println("Derived2 Constructor");

    // Line number 8 should not compile as private variable is
    // accessible only in the class where it is declared
    System.out.println("private var value: " + $privateVar);

    // Below line should compile as Derived2 class is child of
    // Protected and although it is in different package as Protection class
    System.out.println("protected var value: " + $protectedVar);

    // Below line should not compile as default access works
    // only in the same package classes and as derived classes
    // in the same package.
    System.out.println("defaultVar var value: " + $defaultVar);

    // Below line should compile anywhere as public modifiers
    // are accessible to all classes.
    System.out.println("publicVar var value: " + $publicVar);
  }
}
