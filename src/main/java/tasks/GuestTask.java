package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userinterfaces.CheckoutPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GuestTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CheckoutPage.GUEST_BUTTON),
                Click.on(CheckoutPage.CONTINUE_BUTTON),
                SelectFromOptions.byVisibleText("Andres").from(CheckoutPage.FIRST_NAME_FIELD),
                SelectFromOptions.byVisibleText("Diaz").from(CheckoutPage.LAST_NAME_FIELD),
                SelectFromOptions.byVisibleText("andresdiaz@gmail.com").from(CheckoutPage.EMAIL_FIELD),
                SelectFromOptions.byVisibleText("0963660202").from(CheckoutPage.TELEPHONE_FIELD),
                SelectFromOptions.byVisibleText("Quito").from(CheckoutPage.CITY_FIELD),
                SelectFromOptions.byVisibleText("17011").from(CheckoutPage.POSTAL_FIELD),
                Click.on(CheckoutPage.COUNTRY_DROPDOWN),
                SelectFromOptions.byVisibleText("Ecuador").from(CheckoutPage.COUNTRY_DROPDOWN),
                Click.on(CheckoutPage.REGION_DROPDOWN),
                SelectFromOptions.byVisibleText("Pichincha").from(CheckoutPage.REGION_DROPDOWN),
                Click.on(CheckoutPage.CONTINUE_TO_DELIVERY),
                Click.on(CheckoutPage.CONTINUE_TO_PAYMENT_BUTTON),
                Click.on(CheckoutPage.ACCEPT_TERMS),
                Click.on(CheckoutPage.CONTINUE_TO_CONFIRM_ORDER),
                Click.on(CheckoutPage.CONFIRM_ORDER)
        );
    }

    public static GuestTask proceedAsGuest() {
        return instrumented(GuestTask.class);
    }
}
