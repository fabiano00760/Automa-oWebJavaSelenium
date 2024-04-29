package Stepes;

import F.Driver.FDriver;
import Pages.EmailJaExixtentePage;
import Pages.LogoutPage;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class EmailJaExistenteStep {
    WebDriver driver;
    EmailJaExixtentePage emailJaExixtentePage;

    public EmailJaExistenteStep() {
        this.emailJaExixtentePage = new EmailJaExixtentePage();
        this.driver = FDriver.getDrive();
    }

    @Then("valido mensagem de erro {string}")
    public void valido_mensagem_de_erro(String mensagem) {
        emailJaExixtentePage.mensagemDeErro(mensagem);

    }


}
