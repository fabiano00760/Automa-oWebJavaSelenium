package Pages;

import F.Driver.FDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DigiteOEnderecoDeEmailEASenhaIncorretosPage {
    WebElement webElement;
    WebDriver driver;

    public DigiteOEnderecoDeEmailEASenhaIncorretosPage() {
        this.driver = FDriver.getDrive();
    }


    public void validarTelaLogin(){
        driver.findElement(By.xpath("//a[contains(.,'Delete Account')]")).getText().contains("Delete Account");
    }

    public void LoginBTNConectase() {
        driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();
    }

    public void campoEMailIncorreto(String email) {
        driver.findElement(By.xpath("(//input[contains(@name,'email')])[1]")).sendKeys(email);
    }

    public void senhaIncorreta(String senha) {
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(senha);
    }

    public void validarMessagemErrro() {

        boolean mensageErro = driver.findElement(By.xpath("//p[contains(.,'Your email or password is incorrect!')]")).getText().contains("Your email or password is incorrect!");

        Assert.assertTrue(mensageErro);

        // Verificar se a mensagem está presente na página
        try {
            WebElement mensagemElement = driver.findElement(By.xpath("//p[contains(.,'Your email or password is incorrect!')]"));
            mensagemElement.isDisplayed();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
