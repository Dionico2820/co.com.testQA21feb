package co.com.testQA21feb.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class EliminarWebTablesUser {

        public static final Target BTN_ELEMENTS_Eliminar=Target.the("Boton de ELEMENTS").locatedBy("(//*[@class='card-up'])[1]");
        public static final Target BTN_WEB_TABLES= Target.the("Boton para menu WEB TABLES").locatedBy("//*[@class='text' and contains(.,'Web Tables')]");
        public static final Target BTN_ELIMINAR_TABLE_Kierra= Target.the("Boton para menu ELIMINAR TABLES Kierra").locatedBy("//*[@id='delete-record-3']");
        public static final Target BTN_ELIMINAR_TABLE_Alden= Target.the("Boton para menu ELIMINAR TABLES Alden").locatedBy("//*[@id='delete-record-2']");
}
