package HeadFirstDesignBook.Decorator.implementation;

import HeadFirstDesignBook.Decorator.Pizza;

public class ToppingDecorator implements Pizza {

    protected Pizza pizza;

    public ToppingDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription();
    }

    @Override
    public double getCost() {
        return pizza.getCost();
    }
}
