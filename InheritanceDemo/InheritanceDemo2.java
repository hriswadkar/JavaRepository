public class InheritanceDemo2 {
  public static void main(String[] args) {
    Parent parent = new ChildHierarchy2();
  }
}

class Parent {
  public Parent() {
    System.out.println("Parent constructor");
  }
}

class ChildHierarchy1 extends Parent {
  public ChildHierarchy1() {
    super();
    System.out.println("ChildHierarchy1 constructor");
  }
}

class ChildHierarchy2 extends ChildHierarchy1 {
  public ChildHierarchy2() {
    super();
    System.out.println("ChildHierarchy2 constructor");
  }
}
