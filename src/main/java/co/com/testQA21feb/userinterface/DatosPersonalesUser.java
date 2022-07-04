package co.com.testQA21feb.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DatosPersonalesUser {
    public static final Target BOX_NAME=Target.the("CAJA para NAme").located(By.id("userName"));
    public static final Target BOX_MAIL=Target.the("CAJA para Email").located(By.id("userEmail"));
    public static final Target BOX_Current_Address
=Target.the("CAJA para Current Address").located(By.id("currentAddress"));
    public static final Target BOX_Permanent_Adress =Target.the("Boton para PermanentAdress").locatedBy("(//*[@id='permanentAddress'])[1]");
    public static final Target BTN_SUBMIT=Target.the("Boton enviar").locatedBy("//*[@class='btn btn-primary']");


}
