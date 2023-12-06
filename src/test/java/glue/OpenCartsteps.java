package glue;

import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.actors.OnStage;
import tasks.GoToOpencartPage;

public class OpenCartsteps {

    @Given("the user is on Opencart")
    public void theUserIsOnOpencart() {
        OnStage.theActorCalled("usuario").attemptsTo(
                GoToOpencartPage.on("http://opencart.abstracta.us/")
        );
    }
}
