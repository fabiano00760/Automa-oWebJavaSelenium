package Pages;

import F.Driver.FDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class CaseTestePage {

    WebDriver driver;

    public CaseTestePage() {
        this.driver = FDriver.getDrive();
    }


    public void paginaInicia() {
        WebElement elemento = driver.findElement(By.xpath("(//a[@href='/test_cases'])[1]"));

        // Verificando se o elemento está visível na tela
        boolean visivel = elemento.isDisplayed();
        System.out.println("O elemento está visível? " + visivel);
    }

    public void BtnCasoTeste() {
        driver.findElement(By.xpath("(//a[@href='/test_cases'])[1]")).click();
    }


    public void pageCasoTesteComSucesso() throws InterruptedException {
        try {
        // Esperar até que o frame esteja disponível (aumente o tempo limite se necessário)
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("dismiss-button")));


            WebElement botao = driver.findElement(By.xpath("//*[@id=\"dismiss-button\"]/div"));

            botao.click();

        // Voltar ao contexto padrão (fora do frame)
        driver.switchTo().defaultContent();

        } catch (Exception e) {
            System.out.println(e);
        }
            WebElement elemento = driver.findElement(By.xpath("//b[contains(.,'Test Cases')]"));
            // Verificando se o elemento está visível na tela
            boolean visivel = elemento.isDisplayed();
            System.out.println("O elemento está visível? " + visivel);
            elemento.getText().contains("TEST CASES");
            System.out.println(elemento);

    }
}