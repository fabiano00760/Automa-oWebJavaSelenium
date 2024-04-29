package Stepes;

import F.Driver.FDriver;
import Pages.LoginComSucessoPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class LoginComSucessoStep {

    LoginComSucessoPage loginComSucesso;
    WebDriver driver;

    public LoginComSucessoStep() {
        this.loginComSucesso = new LoginComSucessoPage();
        this.driver = FDriver.getDrive();
    }


    @When("preencho o campo Password {string}")
    public void preencho_o_campo_password(String senha) {
        loginComSucesso.CompoPassword(senha);
    }


    @Then("loguin Realizado com sucesso")
    public void loguin_realizado_com_sucesso() {
        loginComSucesso.validarTelaLogin();

    }


    @And("clico no btn Login Conta")
    public void clicoNoBtnLoginConta() {
        loginComSucesso.LoginBTNConectase();
    }
}
