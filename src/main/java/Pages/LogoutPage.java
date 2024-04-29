package Pages;

import F.Driver.FDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogoutPage {

    static WebDriver driver;

    public LogoutPage() {
        this.driver = FDriver.getDrive();
    }

    public static void valido_se_foi_para_a_tela_inicial_de_login() {
       WebElement loginToYourAccount = driver.findElement(By.xpath("//h2[contains(.,'Login to your account')]"));
       loginToYourAccount.getText().contains("Login to your account");

        boolean telaInicial =  driver.findElement(By.xpath("//h2[contains(.,'New User Signup!')]")).getText().contains("New User Signup!");

        Assert.assertTrue(telaInicial);

        // Verificar se a mensagem está presente na página
        try {
            WebElement mensagemElement = driver.findElement(By.xpath("//h2[contains(.,'New User Signup!')]"));
            mensagemElement.isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException ignored) {
        }




    }

    public void clico_No_Btn_Logout_Do_Usuario() {
        driver.findElement(By.xpath("//a[@href='/logout']")).click();
    }
}
