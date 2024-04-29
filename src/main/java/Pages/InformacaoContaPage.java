package Pages;
import F.Driver.FDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class InformacaoContaPage {

    WebDriver driver;

    public InformacaoContaPage() {
        this.driver = FDriver.getDrive();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    public void senhaNovoUsuario(String Name) {
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Name);
    }

    public void composDataDeNascimento() throws InterruptedException {

        // Selecionando dia
        WebElement selectElementDia = driver.findElement(By.xpath("//select[contains(@name,'days')]"));
        Select selectDia = new Select(selectElementDia);
        selectDia.selectByVisibleText("18");

        // Selecionando mês
        WebElement selectElementMes = driver.findElement(By.xpath("//select[contains(@name,'months')]"));
        Select selectMes = new Select(selectElementMes);
        selectMes.selectByVisibleText("February");

        // Selecionando ano
        WebElement selectElementAno = driver.findElement(By.xpath("//select[contains(@name,'years')]"));
        Select selectAno = new Select(selectElementAno);
        selectAno.selectByVisibleText("1986");


        WebElement caixaBox1 = driver.findElement(By.xpath("//input[contains(@name,'newsletter')]"));
        caixaBox1.click();
        WebElement caixaBox2 = driver.findElement(By.xpath("//input[@id='optin']"));
        caixaBox2.click();


        // Espera para verificar as alterações
        Thread.sleep(2000);
    }

    public void FirstName(String name) throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys(name);
        Thread.sleep(2000);

    }

    public void LastName(String sobrenome) throws InterruptedException {
        driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys(sobrenome);
        Thread.sleep(2000);
    }

    public void Company(String company) throws InterruptedException {
        driver.findElement(By.xpath("//input[@name='company']")).sendKeys(company);
        Thread.sleep(2000);
    }

    public void Address(String address) throws InterruptedException {
        driver.findElement(By.xpath("//input[@name='address1']")).sendKeys(address);
        Thread.sleep(2000);
    }

    public void Address2(String address2) throws InterruptedException {
        driver.findElement(By.xpath("//input[@data-qa='address2']")).sendKeys(address2);
        Thread.sleep(2000);
    }

    public void pais() throws InterruptedException {
        Thread.sleep(3000);
        WebElement pais = driver.findElement(By.xpath("//select[@id='country']"));
        Select selectAno = new Select(pais);
        selectAno.selectByVisibleText("United States");
        pais.isDisplayed();
        Thread.sleep(3000);
        pais.click();
    }

    public void stade(String stade) throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='state']")).sendKeys(stade);
        Thread.sleep(2000);

    }

    public void cidade(String cidade) throws InterruptedException {
        driver.findElement(By.xpath("//input[@name='city']")).sendKeys(cidade);
        Thread.sleep(2000);
    }

    public void cep(String cep) throws InterruptedException {
        driver.findElement(By.xpath("//input[@name='zipcode']")).sendKeys(cep);
        Thread.sleep(2000);

    }

    public void fone(String fone) throws InterruptedException {
        driver.findElement(By.xpath("//input[@data-qa='mobile_number']")).sendKeys(fone);
        Thread.sleep(2000);
    }

    public void BtnCliarConta() throws InterruptedException {
        driver.findElement(By.xpath("//input[@data-qa='mobile_number']")).click();
        Thread.sleep(1000);
    }

    public void telaDecadastra() {
        try {
            Thread.sleep(5000);
            driver.findElement(By.xpath("//b[contains(.,'Account Created!')]")).getText().contains("ACCOUNT CREATED!");
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public void campoEmailNewUserSignup(String email) {
        driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys(email);
    }
}


