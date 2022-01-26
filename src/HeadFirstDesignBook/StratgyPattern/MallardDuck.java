package HeadFirstDesignBook.StratgyPattern;

import HeadFirstDesignBook.StratgyPattern.implementation.FlyWithWings;
import HeadFirstDesignBook.StratgyPattern.implementation.Quack;

public class MallardDuck extends Duck{


    public MallardDuck() {
        flyBehaviour= new FlyWithWings();
        quackBehaviour= new Quack();
    }

    @Override
    void display() {
        System.out.println("I am mallard");
    }
}
