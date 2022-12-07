package ua.hillelit.lms.decorator.sandwichStore.sandwiches;

import java.math.BigDecimal;

public abstract class Sandwich {

    public abstract BigDecimal price();

    public String getDescription() {
        return "Sandwich";
    }
}
