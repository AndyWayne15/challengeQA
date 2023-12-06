package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
public class CheckoutPage  extends PageObject {
    public static final Target GUEST_BUTTON = Target.the("guest_button")
            .locatedBy("//*[@id=\"collapse-checkout-option\"]/div/div/div[1]/div[2]/label/input");
    public static final Target CONTINUE_BUTTON = Target.the("continue_button")
            .locatedBy("//*[@id=\"button-account\"]");

    public static final Target FIRST_NAME_FIELD = Target.the ("fist name")
            .locatedBy("//*[@id=\"input-payment-firstname\"]");

    public static final Target LAST_NAME_FIELD = Target.the("last name")
            .locatedBy("//*[@id=\"input-payment-lastname\"]");

    public static final Target EMAIL_FIELD = Target.the("email field")
            .locatedBy("//*[@id=\"input-payment-email\"]");

    public static final Target TELEPHONE_FIELD = Target.the("phone field")
            .locatedBy("//*[@id=\"input-payment-telephone\"]");

    public static final Target ADDRESS_LINE_FIELD = Target.the("address line 1")
            .locatedBy("//*[@id=\"input-payment-address-1\"]");

    public static final Target CITY_FIELD = Target.the("city field")
            .locatedBy("//*[@id=\"input-payment-city\"]");

    public static final Target POSTAL_FIELD = Target.the("post field")
            .locatedBy("//*[@id=\"input-payment-postcode\"]");

    public static final Target COUNTRY_DROPDOWN = Target.the("country dropdown")
            .locatedBy("//*[@id=\"input-payment-country\"]");

    public static final Target REGION_DROPDOWN = Target.the("region dropdown")
            .locatedBy("//*[@id=\"input-payment-zone\"]");

    public static final Target CONTINUE_TO_DELIVERY = Target.the("continue to shipping button")
            .locatedBy("//*[@id=\"button-guest\"]");

    public static final Target CONTINUE_TO_PAYMENT_BUTTON = Target.the("continue to payment method")
            .locatedBy("//*[@id=\"button-shipping-method\"]");

    public static final Target ACCEPT_TERMS = Target.the("accept terms and conditions")
            .locatedBy("//*[@id=\"collapse-payment-method\"]/div/div[3]/div/input[1]");

    public static final Target CONTINUE_TO_CONFIRM_ORDER = Target.the ("continue to confirm order")
            .locatedBy("//*[@id=\"button-payment-method\"]");
    public static final Target CONFIRM_ORDER = Target.the("confirm the purchase")
            .locatedBy("//*[@id=\"button-confirm\"]");

}