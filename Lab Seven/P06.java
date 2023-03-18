package javalaab07;

public class P06 {
  public static void main(String[] args) {
    Square sq = new Square();
    sq.printrectangle();
    sq.printsquare();
  }
}

class Shape {

  public void printshape() {
    System.out.println("This is Shape");
  }
}

class Rectangle extends Shape {

  public void printrectangle() {
    System.out.println("This is Rectangular Shape");
  }
}

class Circle extends Shape {

  public void printcircle() {
    System.out.println("This is Circular Shape");
  }
}

class Square extends Rectangle {

  public void printsquare() {
    System.out.println("Square is a Rectangle");
  }
}