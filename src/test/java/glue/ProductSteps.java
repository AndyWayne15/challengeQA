package glue;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.waits.WaitUntil;
import tasks.AddItemsGlue;
import tasks.GoToOpencartPage;
import userinterfaces.ProductPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ProductSteps {

    @Given("El usuario está en la página de inicio de Opencart")
    public void elUsuarioEstáEnLaPáginaDeInicioDeOpencart() {
        OnStage.theActorCalled("Usuario").attemptsTo(
                GoToOpencartPage.on("http://opencart.abstracta.us/")
        );
    }

    @When("El usuario agrega el primer artículo al carrito")
    public void elUsuarioAgregaElPrimerArtículoAlCarrito() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AddItemsGlue.addFirstItemToCart()
        );
    }

    @And("El usuario agrega el segundo artículo al carrito")
    public void elUsuarioAgregaElSegundoArtículoAlCarrito() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AddItemsGlue.addSecondItemToCart()
        );
    }

    @Then("Los dos artículos están en el carrito de compras")
    public void losDosArtículosEstánEnElCarritoDeCompras() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(ProductPage.CART_BUTTON, isVisible()).forNoMoreThan(2).seconds(),
                Click.on(ProductPage.CART_BUTTON)
        );
    }
}
