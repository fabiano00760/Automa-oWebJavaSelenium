package Pages;

import F.Driver.FDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;

import java.time.Duration;

public class FaleConoscoPage {
    WebDriver driver;

    public FaleConoscoPage() {
        this.driver = FDriver.getDrive();
    }

    public void BTNContactUs() {
        driver.findElement(By.xpath("//a[contains(.,'Contact us')]")).click();
    }


    public void CampoNome(String nome) {
        driver.findElement(By.xpath("//input[@name='name']")).sendKeys(nome);
    }

    public void CampoEmail(String email) {
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(email);
    }

    public void campoSubjet(String objetivo) {
        driver.findElement(By.xpath("//input[@data-qa='subject']")).sendKeys(objetivo);
    }

    public void campoMensagem(String mensagem) {
        driver.findElement(By.xpath("//textarea[contains(@id,'message')]")).sendKeys(mensagem);
    }

    public void escolherArquivo() throws InterruptedException, AWTException {

//
        // Aguarde até que o seletor de arquivo esteja disponível
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='file']")));

        // Localizar o botão que permite selecionar o arquivo
        WebElement uploadButton = driver.findElement(By.xpath("//input[contains(@name,'file')]"));

        // Enviar o caminho do arquivo diretamente para o elemento de upload
        String filePath = "C:\\Users\\fabiano\\Downloads\\Fabiano+Currículo (1).docx";
        uploadButton.sendKeys(filePath);


    }

    public void btnSubmit() {
        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }

    public void mesagemSucesso() throws InterruptedException {
        Thread.sleep(2000);
        // Lidar com a caixa de diálogo do sistema
        Alert alert = driver.switchTo().alert();
        alert.accept(); // Pressione OK para prosseguir


        driver.findElement(By.xpath("//div[@class='status alert alert-success'][contains(.,'Success! Your details have been submitted successfully.')]")).getText().contains("Success! Your details have been submitted successfully.");


        // Localize o elemento que contém a mensagem
        WebElement messageElement = driver.findElement(By.xpath("//div[@class='status alert alert-success'][contains(.,'Success! Your details have been submitted successfully.')]"));

        // Capture o texto do elemento
        String messageText = messageElement.getText();

        // Mensagem esperada
        String expectedMessage = "Success! Your details have been submitted successfully.";

        // Verifique se o texto capturado corresponde à mensagem esperada
        if (messageText.equals(expectedMessage)) {
            System.out.println("A mensagem está corretamente exibida na tela.");
        } else {
            System.out.println("A mensagem não está corretamente exibida na tela.");
        }

    }

    public void BTNHome() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='btn btn-success'][contains(.,'Home')]")));
        driver.findElement(By.xpath("//a[@class='btn btn-success'][contains(.,'Home')]")).click();
    }
}
