package userinterfaces;
import net.serenitybdd.screenplay.targets.Target;

public class ProductPage{

    public static final Target ADD_TO_CART_1 = Target.the("Agregar producto uno").
            locatedBy("//*[@id=\"content\"]/div[2]/div[1]/div/div[3]/button[1]");

    public static final Target ADD_TO_CART_2 = Target.the("Agregar producto dos").
            locatedBy("//*[@id=\"content\"]/div[2]/div[2]/div/div[3]/button[1]");

    public static final Target CART_BUTTON = Target.the("cart button").
            locatedBy("//*[@id=\"cart\"]/button");

    public static final Target CHECKOUT_BUTTON = Target.the("checkout button").
            locatedBy("//*[@id=\"cart\"]/ul/li[2]/div/p/a[2]/strong/i");

}

