package com.packagedemo.package1;

class Protection {
  private int $privateVar;
  protected int $protectedVar;
  int $defaultVar; // variable with default access
  public int $publicVar;

  public Protection() {
    $privateVar = 1;
    $protectedVar = 2;
    $defaultVar = 3;
    $publicVar = 4;

    System.out.println("Protection Constructor");
    System.out.println("private var value: " + $privateVar);
    System.out.println("protected var value: " + $protectedVar);
    System.out.println("defaultVar var value: " + $defaultVar);
    System.out.println("publicVar var value: " + $publicVar);
  }
}
