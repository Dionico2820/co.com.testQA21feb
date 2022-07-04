package co.com.testQA21feb.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class TextBoxUser {
    public static final Target BTN_DEMO_SITE=Target.the("Boton de DEMO SITE").locatedBy("(//*[contains(text(),'Demo Site')])[1]");
    public static final Target BTN_ELEMENTS=Target.the("Boton de ELEMENTS").locatedBy("(//*[@class='card-up'])[1]");
    public static final Target SCROLL_ELEMENTS=Target.the("Scroll hasta ELEMENTS").locatedBy("(//*[@class='header-wrapper'])[1]");
    public static final Target BTN_TEXT_BOX=Target.the("BOTON TEXT BOX").locatedBy("(//*[@id='item-0'])[1]");
}
