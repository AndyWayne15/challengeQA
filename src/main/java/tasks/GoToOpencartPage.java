package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class GoToOpencartPage implements Task {

    private static String url;

    public GoToOpencartPage(String url) {
        GoToOpencartPage.url = url;
    }

    @NotNull
    @Contract(value = "_ -> new", pure = true)
    public static GoToOpencartPage on(String url) {
        GoToOpencartPage.url = url;
        return new GoToOpencartPage(url);
    }

    @Override
    @Step("{0} goes to Opencart home page")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(url)
        );
    }
}
