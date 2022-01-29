package HeadFirstDesignBook.Decorator.implementation;

import HeadFirstDesignBook.Decorator.Pizza;


// Implements the Pizza interface with only the required
// methods from the interface
// Every Pizza made will start as a PlainPizza

public class PlainPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Thin dough";
    }

    @Override
    public double getCost() {
        System.out.println("Cost of Dough: "+ 4);
        return 4.00;
    }
}
