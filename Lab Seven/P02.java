package javalaab07;

public class P02 {
  public static void main(String[] args) {

    PClass p = new PClass();
    CClass c = new CClass();

    p.parentmethod();
    c.childmethod();
    c.parentmethod();
  }
}

class PClass {

  protected void parentmethod() {
    System.out.println("This is parent class");
  }
}

class CClass extends PClass {

  public void childmethod() {
    System.out.println("This is child class");
  }
}