package LabFive;

import java.util.Scanner;

public class L5A {

  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.print("Enter The (Company) Array Size : ");
      int len = input.nextInt();
      Icecream iceArray[] = new Icecream[len];
      String company, type;
      double price;
      for (int i = 0; i < len; i++) {
        System.out.println("\nInput The Details for Icecream 0" +
          (i + 1) + " : ");
        input.nextLine();
        System.out.print("Icecream Type : ");
        type = input.nextLine();
        System.out.print("Icecream Company : ");
        company = input.nextLine();
        System.out.print("Icecream Price : ");
        price = input.nextDouble();
        iceArray[i] = new Icecream(type, company, price);
        iceArray[i].setIcecreamType(type);
        iceArray[i].setIcecreamCompany(company);
        iceArray[i].setIcecreamPrice(price);
      }
      input.nextLine();
      System.out.print("\nEnter the company name to search: ");
      company = input.nextLine();
      System.out.println("Below are the icecreams manufactured by the company " + company);
      SearchByCompany(iceArray, len, company);
    }
  }

  public static void print(Object str) {
    System.out.println(str);
  }

  public static void SearchByCompany(Icecream[] icecreams, int l,
    String com) {
    for (int i = 0; i < l; i++) {
      if (icecreams[i].getIcecreamCompany().equals(com)) {
        System.out.println(icecreams[i].getIcecreamType());
        System.out.println(icecreams[i].getIcecreamCompany());
        System.out.println(icecreams[i].getIcecreamPrice());
      }
    }
  }
}

class Icecream {

  private String IceCreamType, IceCreamCompany;
  private double IceCreamPrice;

  Icecream() {}

  public Icecream(String IceCreamType, String IceCreamCompany,
    double IceCreamPrice) {
    this.IceCreamType = IceCreamType;
    this.IceCreamCompany = IceCreamCompany;
    this.IceCreamPrice = IceCreamPrice;
  }

  public String to_string() {
    String total_content = IceCreamType + " " + IceCreamCompany +
      " " + IceCreamPrice;
    return total_content;
  }

  public boolean equal(Icecream ice) {
    if (this.IceCreamType == ice.IceCreamType) {
      return true;
    } else {
      return false;
    }
  }

  public int compareTo(Icecream ice) {
    if (this.IceCreamPrice > ice.IceCreamPrice) {
      return 1;
    } else if (this.IceCreamPrice < ice.IceCreamPrice) {
      return -1;
    } else {
      return 0;
    }
  }

  public void setIcecreamType(String icecreamType) {
    this.IceCreamType = icecreamType;
  }

  public String getIcecreamType() {
    return IceCreamType;
  }

  public void setIcecreamCompany(String IceCreamCompany) {
    this.IceCreamCompany = IceCreamCompany;
  }

  public String getIcecreamCompany() {
    return IceCreamCompany;
  }

  public void setIcecreamPrice(double IceCreamPrice) {
    this.IceCreamPrice = IceCreamPrice;
  }

  public double getIcecreamPrice() {
    return IceCreamPrice;
  }
}