package co.com.testQA21feb.tasks;


import co.com.testQA21feb.interactions.Esperar;
import co.com.testQA21feb.interactions.EsperarCarga;
import co.com.testQA21feb.interactions.EsperarElemento;
import co.com.testQA21feb.model.datospersonales.CreateDatosPersonales;
import javafx.scene.control.Tab;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;

import java.security.Key;

import static co.com.testQA21feb.userinterface.DatosPersonalesUser.*;

public class DatosPersonales implements Task {

    private CreateDatosPersonales createDatosPersonales;

    public DatosPersonales(CreateDatosPersonales createDatosPersonales) {
        this.createDatosPersonales = createDatosPersonales;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                EsperarElemento.esClickable(BOX_NAME),
                Click.on(BOX_NAME),
                Enter.theValue(createDatosPersonales.getName()).into(BOX_NAME),
                Click.on(BOX_MAIL),
                Enter.theValue(createDatosPersonales.getMail()).into(BOX_MAIL),
                Click.on(BOX_Current_Address),
                Enter.theValue(createDatosPersonales.getCurrentAdress()).into(BOX_Current_Address),
//                Hit.the(Keys.TAB).into(BOX_Current_Address),
//                Click.on(BOX_Permanent_Adress),
//                Enter.theValue(createDatosPersonales.getPermanentAdress()).into(BOX_Permanent_Adress),
//                Click.on(BTN_SUBMIT),
                Esperar.unTiempo(2000)

        );
    }

}
