package Stepes;

import F.Driver.FDriver;
import Pages.ADDCompraCarinhoPage;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;

public class ADDCompraCarinhoStep {

    WebDriver driver ;

    ADDCompraCarinhoPage addCompraCarinhoPage = new ADDCompraCarinhoPage();

    @And("seleciono produto para p carrinho ADD to Cart")
    public void selecionoProdutoParaPCarrinhoADDToCart() throws InterruptedException {
        addCompraCarinhoPage.AddCompraCarrinho();

    }



}
