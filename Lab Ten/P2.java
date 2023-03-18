package Lab Ten;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Fruit obj = new Fruit();
        System.out.print("Enter The Price : ");
        double price = input.nextDouble();
        System.out.print("Enter The Weight(Kg) : ");
        double weight = input.nextDouble();
        obj.fruitPrice(price, weight);
    }
}

class FruitException extends Exception {

    String ob;

    FruitException(String ob) {
        super(ob);
    }
}

class Fruit {

    void fruitPrice(double price, double weight) throws Exception {
        double pk = price / weight;
        try {
            if (pk < 50) {
                throw new Exception("Available fruit");
            } else if (pk > 500) {
                throw new Exception("Rare Fruit");
            } else {
                System.out.println("Total Price " + price * weight);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
