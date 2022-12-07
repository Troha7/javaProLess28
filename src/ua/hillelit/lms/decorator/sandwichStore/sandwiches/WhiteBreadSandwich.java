package ua.hillelit.lms.decorator.sandwichStore.sandwiches;

import java.math.BigDecimal;

public class WhiteBreadSandwich extends Sandwich{

    @Override
    public BigDecimal price() {
        return new BigDecimal(3.0);
    }

    @Override
    public String getDescription() {
        return "White Bread " + super.getDescription();
    }
}
