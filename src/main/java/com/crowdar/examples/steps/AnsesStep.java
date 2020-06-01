package com.crowdar.examples.steps;

import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.pages.AnsesHomePage;
import com.crowdar.examples.pages.AnsesSearchResulPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java8.An;
import org.testng.Assert;

public class AnsesStep extends PageSteps {

    @Given("La Persona esta en la pagina del Anses")
    public void laPersonaEstaEnLaPaginaDelAnses() {
        Injector._page(AnsesHomePage.class).ir();
    }

    @When("La Persona busca la palabra (.*)")
    public void laPersonaBusvaLaPalabraValor(String criterio) {
        Injector._page(AnsesHomePage.class).completarBuscarCriterio(criterio);
        Injector._page(AnsesHomePage.class).enterBuscarCriterio();
    }


    @Then("El Cliente verifica que los resultados se muestren corectamente (.*)")
    public void elClienteVerificaQueLosResultadosSeMuestrenCorectamenteResultado(String criterio) {

        Assert.assertTrue(Injector._page(AnsesSearchResulPage.class).verificarValor(criterio));
    }

    @When("La Persona selecciona el menu  (.*)")
    public void laPersonaSeleccionaElMenuValor(String valor) {
        Injector._page(AnsesHomePage.class).clickMenu(valor);
    }

    @Then("El Cliente verifica que la pagina es la correcta (.*)")
    public void elClienteVerificaQueLaPaginaEsLaCorrectaResultado(String resultado) {
        Assert.assertTrue(Injector._page(AnsesSearchResulPage.class).verificarMenu(resultado));
    }
}