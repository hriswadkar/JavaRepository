package com.packagedemo.package1;

class SamePackage {
  public SamePackage() {
    System.out.println("SamePackage Constructor");

    // Create an object of Protection class
    Protection obj = new Protection();

    // Line number 9 should not compile as private variable is
    // accessible only in the class where it is declared
    System.out.println("private var value: " + obj.$privateVar);

    // Below line should compile as SamePackage class is
    // is in the same package as Protection class
    System.out.println("protected var value: " + obj.$protectedVar);

    // Below line should also compile as default access works
    // in the same package classes as well as derived classes
    System.out.println("defaultVar var value: " + obj.$defaultVar);

    // Below line should compile anywhere as public modifiers
    // are accessible to all classes.
    System.out.println("publicVar var value: " + obj.$publicVar);
  }
}
