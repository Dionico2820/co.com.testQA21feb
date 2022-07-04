package co.com.testQA21feb.stepdefinitions.webtables;

import co.com.testQA21feb.interactions.HomePage;
import co.com.testQA21feb.tasks.EliminarWebTables;
import co.com.testQA21feb.tasks.IntroDemoSite;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

public class WebTableStep {

    @Given("^que el abre pagina (.*)$")
    public void queDavidAbrePagina(String tituloPestania) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                HomePage.enPagina()
        );
       OnStage.theActorInTheSpotlight().attemptsTo(
               IntroDemoSite.enPagina()
       );
    }

    @When("^el elimina Alden de Web Tables$")
    public void elRellenaDatosDeWebTables() {

        OnStage.theActorInTheSpotlight().attemptsTo(
                EliminarWebTables.enPagina()
        );
    }

    @Then("^se vera mensaje de Web Tables ELIMINADA$")
    public void seVeraMensajeDeWebTablesELIMINADA() {




    }


}
