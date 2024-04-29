package Stepes;

import F.Driver.FDriver;
import Pages.LogoutPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.sql.Driver;

public class LogoutStep {

    LogoutPage logoutPage;
    WebDriver driver;

    public LogoutStep() {
       this.logoutPage = new LogoutPage();
        this.driver = FDriver.getDrive();
    }

    @And("clico no btn logout do usuario")
    public void clico_no_btn_logout_do_usuario() {
        logoutPage.clico_No_Btn_Logout_Do_Usuario();


    }

    @Then("valido se foi para a tela inicial de login")
    public void valido_se_foi_para_a_tela_inicial_de_login() {
        LogoutPage.valido_se_foi_para_a_tela_inicial_de_login();

    }
}
