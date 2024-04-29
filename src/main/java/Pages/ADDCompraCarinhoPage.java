package Pages;

import F.Driver.FDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class ADDCompraCarinhoPage {

    WebDriver driver;


    public ADDCompraCarinhoPage() {
        this.driver = FDriver.getDrive();
    }

    public void AddCompraCarrinho() throws InterruptedException {

        // Inicializando o objeto JavascriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Realizando a rolagem da página para baixo com o botão do mouse
        Actions actions = new Actions(driver);
        //  actions.clickAndHold().moveByOffset(0, 100).release().perform();
        // Encontre a imagem sobre a qual você deseja passar o mouse
        WebElement image = driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/img"));
        // Rolando a página até que o elemento seja visível
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", image);

        // Mova o mouse para a imagem
        actions.moveToElement(image).perform();

        // Aguarde um tempo para o elemento "Add to Cart" estar disponível
        Thread.sleep(200); // Aguarde 2 segundos (pode ser ajustado conforme necessário)

        // Encontre o botão "Add to Cart"
        WebElement addToCartButton = driver.findElement(By.xpath("(//a[@class='btn btn-default add-to-cart'])[2]"));

        // Clique no botão "Add to Cart"
        addToCartButton.click();

        // Aguarde um tempo para o carrinho ser atualizado (você pode melhorar isso com uma espera explícita)
        Thread.sleep(1500); // Aguarde 15 segundos (pode ser ajustado conforme necessário)

         WebElement ok = driver.findElement(By.xpath("//h4[contains(.,'Added!')]"));
         ok.isDisplayed();
         ok.getText().contains("Added!");

         Thread.sleep(500);
         driver.findElement(By.xpath("//button[contains(.,'Continue Shopping')]")).click();

    }
}
