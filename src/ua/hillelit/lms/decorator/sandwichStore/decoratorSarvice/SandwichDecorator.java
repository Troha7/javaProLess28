package ua.hillelit.lms.decorator.sandwichStore.decoratorSarvice;

import ua.hillelit.lms.decorator.sandwichStore.sandwiches.Sandwich;

import java.math.BigDecimal;

public abstract class SandwichDecorator extends Sandwich {

    @Override
    public abstract BigDecimal price();
}
