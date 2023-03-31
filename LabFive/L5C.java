package LabFive;

import java.util.Scanner;

public class L5C {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.print("[^]Enter The First Fraction (01) : \n");
      Fraction f1 = new Fraction();
      System.out.print("Enter Numerator Of (01) : ");
      int nume1 = input.nextInt();
      System.out.print("Enter Denominator Of (01) : ");
      int den1 = input.nextInt();
      f1.SetNume(nume1);
      f1.SetDen(den1);
      System.out.print("\n[^]Enter The First Fraction (02) : \n");
      System.out.print("Enter Numerator Of (02) : ");
      int nume2 = input.nextInt();
      System.out.print("Enter Denominator Of (02) : ");
      int den2 = input.nextInt();
      Fraction f2 = new Fraction(nume2, den2);
      System.out.println("\nThe First Fraction Is : " +
        f1.ToString());
      System.out.println("The Sec Fraction Is : " +
        f2.ToString());
      f1.Add(f2);
      System.out.println("\nThe Sum Is : " + f1.ToString());
      f1.SetNume(nume1);
      f1.SetDen(den1);
      f1.sub(f2);
      f1.ToString();
      System.out.println("The Sub Is : " + f1.ToString());
      f1.SetNume(nume1);
      f1.SetDen(den1);
      f1.multiplication(f1);
      f1.ToString();
      System.out.println("The Multi Is : " + f1.ToString());
      f1.SetNume(nume1);
      f1.SetDen(den1);
      f1.division(f2);
      f1.ToString();
      System.out.println("The Div Is : " + f1.ToString());
      f1.SetNume(nume1);
      f1.SetDen(den1);
    }
  }
}

class Fraction {

  private int nume;
  private int den;

  Fraction() {}

  public Fraction(int nume, int den) {
    this.den = den;
    this.nume = nume;
  }

  public int GetDen() {
    return this.den;
  }

  public int GetNume() {
    return this.nume;
  }

  public void SetDen(int den) {
    this.den = den;
  }

  public void SetNume(int nume) {
    this.nume = nume;
  }

  public String ToString() {
    String details = Integer.toString(this.nume);
    details += "/" + Integer.toString(this.den) + " ";
    return details;
  }

  public void Add(Fraction fract) {
    this.nume = this.nume * fract.den + this.den * fract.nume;
    this.den = fract.den * this.den;
  }

  public void sub(Fraction fract) {
    this.nume = this.den * fract.nume - this.nume * fract.den;
    this.den = fract.den * this.den;
  }

  public void multiplication(Fraction fraction) {
    this.nume = this.nume * fraction.nume;
    this.den = fraction.den * this.den;
  }

  public void division(Fraction fract) {
    this.nume = this.nume * fract.den;
    this.den = fract.nume * this.den;
  }
}