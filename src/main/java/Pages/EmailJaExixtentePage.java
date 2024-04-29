package Pages;


import F.Driver.FDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EmailJaExixtentePage {

    static WebDriver driver;

    public EmailJaExixtentePage() {
        driver = FDriver.getDrive();
    }

    public void mensagemDeErro(String mensagem) {
        driver.findElement(By.xpath("//p[contains(.,'Email Address already exist!')]")).getText().contains("Email Address already exist!");

        WebElement mensagemErro = driver.findElement(By.xpath("//p[contains(.,'Email Address already exist!')]"));
        mensagemErro.getText().contains("Email Address already exist!");

        boolean telaInicial = driver.findElement(By.xpath("//p[contains(.,'Email Address already exist!')]")).getText().contains("Email Address already exist!");

        Assert.assertTrue(telaInicial);

        // Verificar se a mensagem está presente na página
        try {
            WebElement mensagemElement = driver.findElement(By.xpath("//p[contains(.,'Email Address already exist!')]"));
            mensagemElement.isDisplayed();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
