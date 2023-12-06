package tasks;

import navigation.OpenCartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import userinterfaces.ProductPage;

public class AddItemsGlue implements Task {

    private final OpenCartPage openCartPage;

    public static Performable toOpenCartPage() {
        return Task.where("{0} opens the Opencart page",
                Open.browserOn().the(OpenCartPage.class)
        );
    }

    public static Performable addFirstItemToCart() {
        return Task.where("{0} adds the first item to the cart",
                Click.on(ProductPage.ADD_TO_CART_1)
        );
    }

    public static Performable addSecondItemToCart() {
        return Task.where("{0} adds the second item to the cart",
                Click.on(ProductPage.ADD_TO_CART_2)
        );
    }

    public AddItemsGlue(OpenCartPage openCartPage) {
        this.openCartPage = openCartPage;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(openCartPage),
                Click.on(ProductPage.ADD_TO_CART_1),
                Click.on(ProductPage.ADD_TO_CART_2)
        );
    }
}

