package glue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actors.OnStage;
import tasks.GoToOpencartPage;
import userinterfaces.CheckoutPage;

public class GuestCheckoutSteps {

    @Given("El usuario está en la página del carrito de Opencart")
    public void elUsuarioEstáEnLaPáginaDelCarritoDeOpencart() {
        OnStage.theActorCalled("Usuario").attemptsTo(
                GoToOpencartPage.on("http://opencart.abstracta.us/")
        );
    }

    @When("El usuario completa el Checkout como invitado")
    public void elUsuarioCompletaElCheckoutComoInvitado() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Click.on(CheckoutPage.GUEST_BUTTON),
                Click.on(CheckoutPage.CONTINUE_BUTTON),
                Enter.theValue("Andres").into(CheckoutPage.FIRST_NAME_FIELD),
                Enter.theValue("Diaz").into(CheckoutPage.LAST_NAME_FIELD),
                Enter.theValue("andresdiaz@gmail.com").into(CheckoutPage.EMAIL_FIELD),
                Enter.theValue("0963660202").into(CheckoutPage.TELEPHONE_FIELD),
                Enter.theValue("Quito").into(CheckoutPage.CITY_FIELD),
                Enter.theValue("17011").into(CheckoutPage.POSTAL_FIELD),
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

    @Then("El usuario finaliza la compra hasta la confirmación")
    public void elUsuarioFinalizaLaCompraHastaLaConfirmación() {
        // Se podria agregar verificaciones adicionales en este campo de ser necesario.
    }
}
