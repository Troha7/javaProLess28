package ua.hillelit.lms.decorator.sandwichStore;

import ua.hillelit.lms.decorator.sandwichStore.decoratorSarvice.Cheese;
import ua.hillelit.lms.decorator.sandwichStore.decoratorSarvice.Meat;
import ua.hillelit.lms.decorator.sandwichStore.sandwiches.Sandwich;
import ua.hillelit.lms.decorator.sandwichStore.sandwiches.WhiteBreadSandwich;

public class SandwichMaker {

    public static void main(String[] args) {

        Sandwich cheeseSandwich = new Cheese(new WhiteBreadSandwich());
        System.out.println(cheeseSandwich.getDescription() + " " + cheeseSandwich.price());

        Sandwich meatSandwich = new Meat(cheeseSandwich);
        System.out.println(meatSandwich.getDescription() + " " + meatSandwich.price());
    }
}
