package HeadFirstDesignBook.Decorator;

import HeadFirstDesignBook.Decorator.implementation.Mozzarella;
import HeadFirstDesignBook.Decorator.implementation.PlainPizza;
import HeadFirstDesignBook.Decorator.implementation.ThreeCheesePizza;
import HeadFirstDesignBook.Decorator.implementation.TomatoSauce;

/**
 * https://www.newthinktank.com/2012/09/decorator-design-pattern-tutorial/
 */
public class PizzaMaker {
    public static void main(String[] args) {
        Pizza pizza = new Mozzarella(new TomatoSauce(new PlainPizza()));

        System.out.println(pizza.getCost());
        System.out.println(pizza.getDescription());

        Pizza pizza1 = new ThreeCheesePizza();
        System.out.println(pizza1.getCost());
        System.out.println(pizza1.getDescription());

    }
}
