public class InheritanceDemo {
  public static void main(String[] args) {
    System.out.println(">>pre"); // 1
    ChildHierarchy2 objChildHierarchy2 = new ChildHierarchy2();
    System.out.println(">>post"); // 9
  }
}

class Parent {
  public Parent() {
    System.out.println("This is Parent class"); // 4
  }

  {
    System.out.println("This is just an execution block in Parent class"); // 3
  }
}

class ChildHierarchy1 extends Parent {
  public ChildHierarchy1() {
    System.out.println("This is ChildHierarchy1 class"); // 6
  }

  static {
    System.out.println("This is static execution block in ChildHierarchy1 class"); // 2
  }

  {
    System.out.println("This is just an excution block in ChildHierarchy1 class"); // 5
  }
}

class ChildHierarchy2 extends ChildHierarchy1 {
  public ChildHierarchy2() {
    System.out.println("This is ChildHierarchy2 class"); // 8
  }

  {
    System.out.println("This is just an execution block in ChildHierarchy2 class"); // 7
  }
}
