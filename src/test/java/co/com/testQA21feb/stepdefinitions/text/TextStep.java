package co.com.testQA21feb.stepdefinitions.text;

import co.com.testQA21feb.interactions.HomePage;
import co.com.testQA21feb.interactions.IngresarA;
import co.com.testQA21feb.interactions.PestaniaDos;
import co.com.testQA21feb.model.datospersonales.DatosPersonalesBuilder;
import co.com.testQA21feb.tasks.TextBox;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;
import java.util.Map;

public class TextStep {

    @Given("^que el abre pagina (.*)$")
    public void queDavidAbrePagina(String tituloPestania) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                HomePage.enPagina()
        );
        OnStage.theActorInTheSpotlight().attemptsTo(
                TextBox.enPagina()
        );
//        OnStage.theActorInTheSpotlight().attemptsTo(
//                PestaniaDos.a(tituloPestania)
//        );

    }


    @When("^el rellena datos de TEXT BOX$")
    public void elRellenaDatosDeTEXTBOX(
           List<Map<String, String>>datos
    ) {

        OnStage.theActorInTheSpotlight().attemptsTo(
                IngresarA.datosPerso(DatosPersonalesBuilder.con()
                        .name(datos)
                        .mail(datos)
                        .currentAdress(datos)
                        .permanentAdress(datos))

                );
    }

    @Then("^se vera mensaje de TEXT OK$")
    public void seVeraMensajeDeTEXTOK() {




    }


}
