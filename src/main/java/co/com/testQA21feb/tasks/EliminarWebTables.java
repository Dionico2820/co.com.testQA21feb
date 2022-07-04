package co.com.testQA21feb.tasks;

import co.com.testQA21feb.interactions.Esperar;
import co.com.testQA21feb.interactions.EsperarElemento;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.testQA21feb.userinterface.EliminarWebTablesUser.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EliminarWebTables implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                EsperarElemento.esClickable(BTN_ELEMENTS_Eliminar),
                Scroll.to(BTN_ELEMENTS_Eliminar),
                Click.on(BTN_ELEMENTS_Eliminar),
                EsperarElemento.esClickable(BTN_WEB_TABLES),
                Scroll.to(BTN_WEB_TABLES),
                Click.on(BTN_WEB_TABLES),
                Click.on(BTN_ELIMINAR_TABLE_Kierra),
                Click.on(BTN_ELIMINAR_TABLE_Alden),

                Esperar.unTiempo(5000)
        );
    }
    public static EliminarWebTables enPagina() {
        return instrumented(EliminarWebTables.class);}
}
