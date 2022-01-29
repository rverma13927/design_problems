package HeadFirstDesignBook.Decorator.implementation;

import HeadFirstDesignBook.Decorator.Pizza;

public class TomatoSauce extends ToppingDecorator{
    public TomatoSauce(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ",tomatosauce";
    }

    @Override
    public double getCost() {
        System.out.println("Cost of Sauce: " + .35);
        return super.getCost() + 0.8;
    }
}
