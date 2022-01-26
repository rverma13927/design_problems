package HeadFirstDesignBook.StratgyPattern.implementation;

import HeadFirstDesignBook.StratgyPattern.FlyBehaviour;

public class FlyWithWings implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Hi am iam flying with wings");
    }
}
