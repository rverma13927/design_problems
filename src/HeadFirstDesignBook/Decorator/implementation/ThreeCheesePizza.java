package HeadFirstDesignBook.Decorator.implementation;

import HeadFirstDesignBook.Decorator.Pizza;

public class ThreeCheesePizza implements Pizza {
    private String description = "Mozzarella, Fontina, Parmesan Cheese Pizza";
    private double cost = 10.50;

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getCost() {
        return cost;
    }
}
