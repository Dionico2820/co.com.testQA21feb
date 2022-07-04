package co.com.testQA21feb.tasks;

import co.com.testQA21feb.interactions.Esperar;
import co.com.testQA21feb.interactions.PestaniaDos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.testQA21feb.userinterface.EliminarWebTablesUser.BTN_ELEMENTS_Eliminar;
import static co.com.testQA21feb.userinterface.IntroDemoSiteUser.BTN_DEMO_SITE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IntroDemoSite implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_DEMO_SITE),
                Esperar.unTiempo(10000),
                PestaniaDos.a("ToolsQA"),

                Esperar.unTiempo(5000)

        );
    }
    public static IntroDemoSite enPagina() {return instrumented(IntroDemoSite.class);}
}
