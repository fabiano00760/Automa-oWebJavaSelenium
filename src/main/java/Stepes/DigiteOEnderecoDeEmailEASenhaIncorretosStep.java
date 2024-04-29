package Stepes;

import F.Driver.FDriver;
import Pages.DigiteOEnderecoDeEmailEASenhaIncorretosPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class DigiteOEnderecoDeEmailEASenhaIncorretosStep {
    DigiteOEnderecoDeEmailEASenhaIncorretosPage digiteOEnderecoDeEmailEASenhaIncorretosPage;
    WebDriver driver;


    public DigiteOEnderecoDeEmailEASenhaIncorretosStep() {
        this.driver = FDriver.getDrive();
        this.digiteOEnderecoDeEmailEASenhaIncorretosPage = new DigiteOEnderecoDeEmailEASenhaIncorretosPage() ;
    }



    @And("preencho o campo endereço de email incorreto {string}")
    public void preencho_o_campo_endereço_de_email_incorreto(String email) {
        digiteOEnderecoDeEmailEASenhaIncorretosPage.campoEMailIncorreto(email);
    }

    @When("preencho o campo Password incorreto {string}")
    public void preencho_o_campo_password_incorreto(String senha) {
        digiteOEnderecoDeEmailEASenhaIncorretosPage.senhaIncorreta(senha);

    }

    @Then("valido mensagem de erro")
    public void valido_mensagem_de_erro() {
        digiteOEnderecoDeEmailEASenhaIncorretosPage.validarMessagemErrro();

    }


    @Then("valido mensagem de erro email e senha")
    public void validoMensagemDeErroEmailESenha() {
        digiteOEnderecoDeEmailEASenhaIncorretosPage.validarMessagemErroSenhaEemail();
    }
}
