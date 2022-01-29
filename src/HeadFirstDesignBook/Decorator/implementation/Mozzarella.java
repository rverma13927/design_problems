package HeadFirstDesignBook.Decorator.implementation;

import HeadFirstDesignBook.Decorator.Pizza;

public class Mozzarella extends ToppingDecorator{

    public Mozzarella(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", mozzarella";
    }

    @Override
    public double getCost() {
        return super.getCost() +0.5;
    }
}
