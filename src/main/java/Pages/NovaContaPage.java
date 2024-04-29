package Pages;

import F.Driver.FDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class NovaContaPage {

    WebDriver driver;

    public NovaContaPage() {
        this.driver = FDriver.getDrive();
    }

    public void senha(String senha){
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(senha);
    }


    public void campoEmail(String email) {
        driver.findElement(By.xpath("(//input[contains(@type,'email')])[1]")).sendKeys(email);
    }

    public void CampoBtninscrever_se() {
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
    }

    public void ValidarTele() {

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//b[contains(.,'Enter Account Information')]")).getText().contains("ENTER ACCOUNT INFORMATION");
    }


    public void validarTelaCadastroDeNovoUsuario(String novo) {
        driver.findElement(By.xpath("//h2[contains(.,'New User Signup!')]")).getText().contains("New User Signup!");
    }

    public void signup() {
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
    }

    public void ValidarTeleCadastro() {
        driver.findElement(By.xpath("//b[contains(.,'Enter Account Information')]")).getText().contains("ENTER ACCOUNT INFORMATION");
    }

    public void campoNome(String nome) {
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys(nome);
    }

    public void campoEmailNovoUsuario(String email) {
        driver.findElement(By.xpath("(//input[@type='email'])[2]")).sendKeys(email);
    }
}



