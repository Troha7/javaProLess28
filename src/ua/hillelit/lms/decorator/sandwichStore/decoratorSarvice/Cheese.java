package ua.hillelit.lms.decorator.sandwichStore.decoratorSarvice;

import ua.hillelit.lms.decorator.sandwichStore.sandwiches.Sandwich;

import java.math.BigDecimal;

public class Cheese extends SandwichDecorator {

    Sandwich currentSandwich;

    public Cheese(Sandwich currentSandwich) {
        this.currentSandwich = currentSandwich;
    }

    @Override
    public String getDescription() {
        return currentSandwich.getDescription() + " + " + getClass().getSimpleName();
    }

    @Override
    public BigDecimal price() {
        return currentSandwich.price().add(new BigDecimal(0.5));
    }
}
