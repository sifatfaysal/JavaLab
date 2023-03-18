package javalaab07;

public class P01 {
    public static void main(
            String[] args) {
        ParentClass p = new ParentClass();
        ChildClass c = new ChildClass();
        p.parentmethod();
        c.childmethod();
        c.parentmethod();
    }
}

class ParentClass {

    public void parentmethod() {
        System.out.println(
                "This is Parent Class");
    }
}

class ChildClass extends ParentClass {

    public void childmethod() {
        System.out.println(
                "This is Child Class");
    }
}