package navigation;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class OpenCartPage extends PageObject {
    public static Target OPEN_CART = Target.the("OpenCart page").locatedBy("http://opencart.abstracta.us/");

    public void openCartPage() {
        getDriver().get(String.valueOf(OPEN_CART));
    }
}
