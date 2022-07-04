package co.com.testQA21feb.tasks;

import co.com.testQA21feb.interactions.Esperar;
import co.com.testQA21feb.interactions.EsperarElemento;
import co.com.testQA21feb.interactions.PestaniaDos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;


import static co.com.testQA21feb.userinterface.DatosPersonalesUser.BOX_NAME;
import static co.com.testQA21feb.userinterface.TextBoxUser.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class TextBox implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_DEMO_SITE),
                Esperar.unTiempo(10000),
                //Pestania dos Ojo debe ser tipo String. revisar el feature debe ser igual al String
                PestaniaDos.a("ToolsQA"),
                //OJO Pestaña_dos... revisar feature y verificar que sea String (Título de la pestaña)
                Scroll.to(BTN_ELEMENTS),
                EsperarElemento.esClickable(BTN_ELEMENTS),
                Click.on(BTN_ELEMENTS),
                Click.on(BTN_TEXT_BOX),
                Esperar.unTiempo(2000)



                );
    }
    public static TextBox enPagina() {
        return instrumented(TextBox.class);}
}
