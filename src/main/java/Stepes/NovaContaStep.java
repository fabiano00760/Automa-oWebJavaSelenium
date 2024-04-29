package Stepes;


import F.Driver.FDriver;
import Pages.NovaContaPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class NovaContaStep {

    NovaContaPage novaContaPage;
    WebDriver driver;

    public NovaContaStep() {
        this.novaContaPage =new NovaContaPage();
        this.driver = FDriver.getDrive();

    }

    @Given("que eu esteja na pagina home {string}")
    public void que_eu_esteja_na_pagina_home(String url) {
        driver.get(url);
    }
    @Given("preencho o campo Email Address {string}")
    public void preencho_o_campo_email_address(String email) {
        novaContaPage.campoEmail(email);

    }
    @When("preencho o campo senha {string}")
    public void preencho_o_campo_senha(String senha) {
        novaContaPage.senha(senha);

    }
    @When("clico no btn Login")
    public void clico_no_btn_login() {
        novaContaPage.CampoBtninscrever_se();

    }
    @Then("Tela login com sucesso")
    public void tela_login_com_sucesso() {
        novaContaPage.ValidarTele();

    }


    @When("no capo login preencho o campo de Cadastro de novo usuário! o nome {string}")
    public void noCapoLoginPreenchoOCampoDeCadastroDeNovoUsuárioONome(String novo) {
        novaContaPage.campoNome(novo);
        
        
    }

    @And("preencho o campo endereço de email {string}")
    public void preenchoOCampoEndereçoDeEmail(String email) {
        novaContaPage.campoEmail(email);
    }

    @And("clico no btn inscrever-se")
    public void clicoNoBtnInscreverSe() {
        novaContaPage.signup();
        
    }

    @Then("logo com sucesso")
    public void logoComSucesso() {
        novaContaPage.ValidarTeleCadastro();
    }

    @And("preencho o campo endereço de email novo cadastro {string}")
    public void preenchoOCampoEndereçoDeEmailNovoCadastro(String email) {
        novaContaPage.campoEmailNovoUsuario(email);

    }
}
