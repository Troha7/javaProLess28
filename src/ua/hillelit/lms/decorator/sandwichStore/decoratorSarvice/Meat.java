package ua.hillelit.lms.decorator.sandwichStore.decoratorSarvice;

import ua.hillelit.lms.decorator.sandwichStore.sandwiches.Sandwich;

import java.math.BigDecimal;

public class Meat extends SandwichDecorator {

    Sandwich currentSandwich;

    public Meat(Sandwich currentSandwich) {
        this.currentSandwich = currentSandwich;
    }

    @Override
    public String getDescription() {
        return currentSandwich.getDescription() + " + " + getClass().getSimpleName();
    }

    @Override
    public BigDecimal price() {
        return currentSandwich.price().add(new BigDecimal(1.0));
    }
}
