package co.com.testQA21feb.interactions;

import co.com.testQA21feb.model.datospersonales.DatosPersonalesBuilder;
import co.com.testQA21feb.tasks.DatosPersonales;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarA {

//    public static Login iniciarSesion(LoginBuilder createLogin) {
//        return instrumented(Login.class, createLogin.build());
//    }

        public static DatosPersonales datosPerso(DatosPersonalesBuilder createDatosPersonales){
            return instrumented(DatosPersonales.class, createDatosPersonales.build());
            //OJO con el build, redactarlo de nuevo en caso que falle
        }

//
//    public static Logout CerrarSesion(LogoutBuilder createLogout) {
//        return instrumented(Logout.class, createLogout.build());
//    }

//    public static Compra compra(LoginBuilder createLogin) {
//        return instrumented(Compra.class, createLogin.build());
//    }

}
