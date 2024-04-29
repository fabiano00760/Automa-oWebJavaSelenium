package Stepes;

import F.Driver.FDriver;
import Pages.FaleConoscoPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.awt.*;

public class FaleConoscoStep {
    WebDriver driver;
    FaleConoscoPage faleConoscoPage;

    public FaleConoscoStep() {
        this.driver = FDriver.getDrive();
        this.faleConoscoPage = new FaleConoscoPage();
    }

    @And("Clico no BTN Contact us")
    public void clico_no_btn_contact_us() {
        faleConoscoPage.BTNContactUs();

    }

    @Then("preencho o campo Nome {string}")
    public void preencho_o_campo_nome(String nome) {
        faleConoscoPage.CampoNome(nome);

    }

    @And("o campo Email {string}")
    public void o_campo_email(String email) {
        faleConoscoPage.CampoEmail(email);

    }

    @And("eo objetivo Da mensagem {string}")
    public void eo_objetivo_da_mensagem(String objetivo) {
        faleConoscoPage.campoSubjet(objetivo);


    }

    @And("Escrevo a mensagem no campo {string}")
    public void escrevo_a_mensagem_no_campo(String mensagem) {
        faleConoscoPage.campoMensagem(mensagem);


    }

    @And("clico no BTN Escoler arquivo e seleciono o arquivo")
    public void clico_no_btn_escoler_arquivo_e_seleciono_o_arquivo() throws InterruptedException, AWTException {
        faleConoscoPage.escolherArquivo();

    }

    @And("Clico no Submit")
    public void clico_no_submit() {
        faleConoscoPage.btnSubmit();

    }

    @And("valido mensagem de sucesso e clico em Home")
    public void valido_mensagem_de_sucesso_e_clico_em_home() throws InterruptedException {
        faleConoscoPage.
                mesagemSucesso();

    }



    @When("clico no btn Home")
    public void clico_no_btn_home() {
     faleConoscoPage.BTNHome();
    }


}
