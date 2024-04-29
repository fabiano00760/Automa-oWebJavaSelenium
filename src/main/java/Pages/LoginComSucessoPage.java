package Pages;

import F.Driver.FDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginComSucessoPage {


    WebDriver driver;

    public LoginComSucessoPage() {
        this.driver = FDriver.getDrive();
    }

    public void CompoPassword(String senha) {
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(senha);
    }

    public void validarTelaLogin(){
        driver.findElement(By.xpath("//a[contains(.,'Delete Account')]")).getText().contains("Delete Account");
    }

    public void LoginBTNConectase() {
        driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();
    }
}
