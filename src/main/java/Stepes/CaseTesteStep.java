package Stepes;

import Pages.CaseTestePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class CaseTesteStep {
    WebDriver driver;
    CaseTestePage caseTestePage = new CaseTestePage();


    @And("Verifique se a página inicial está visível com sucesso")
    public void verifique_se_a_página_inicial_está_visível_com_sucesso() {
       caseTestePage.paginaInicia();
    }
    @Then("Clique no botão Casos de Teste")
    public void clique_no_botão_casos_de_teste() {
        caseTestePage.BtnCasoTeste();
    ;
    }
    @When("Verifique se o usuário foi navegado para a página de casos de teste com sucesso")
    public void verifique_se_o_usuário_foi_navegado_para_a_página_de_casos_de_teste_com_sucesso() throws InterruptedException {
        caseTestePage.pageCasoTesteComSucesso();

    }

}
