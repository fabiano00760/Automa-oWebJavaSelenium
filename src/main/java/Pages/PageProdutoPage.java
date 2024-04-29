package Pages;

import F.Driver.FDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class PageProdutoPage {
    WebDriver driver;

    public static void VerificarItemNaLista(WebDriver driver) {
        driver = FDriver.getDrive();
    }

    public static boolean verificarItemNaLista(String itemProcurado, List<WebElement> itens) {
        for (WebElement item : itens) {
            if (item.getText().equals(itemProcurado)) {
                return true;
            }
        }
        return false;
    }

    public PageProdutoPage() {
        this.driver = FDriver.getDrive();
    }


    public void btnProduto() {


        WebElement btnProduto = driver.findElement(By.xpath("(//a[@href='/products'])[1]"));
        btnProduto.isDisplayed();
//        try {
//            WebElement popape = driver.findElement(By.xpath("//svg[@fill='#5F6368']"));
//            if (popape.isDisplayed()) {
//                popape.click();
//            } else {
//                System.out.println("elemnto não encontrado");
//
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//

    }

    public void btnProduto1() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("(//a[@href='/products'])[1]")).click();
        Thread.sleep(3000);

    }


    public void pageTodosProdutos() {

        try {
            WebElement telaTodosProdutos = driver.findElement(By.xpath("//h2[@class='title text-center']"));
            telaTodosProdutos.isDisplayed();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void listaDeProdutos() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // URLs dos produtos
        String[] urlsProdutos = {
                "/brand_products/Polo",
                "/brand_products/H&M",
                "/brand_products/Madame",
                "/brand_products/Mast & Harbour",
                "/brand_products/Babyhug",
                "/brand_products/Allen Solly Junior",
                "/brand_products/Kookie Kids",
                "/brand_products/Biba"
        };

        // Encontrando todos os elementos da lista de produtos
        List<WebElement> listaProdutos = driver.findElements(By.xpath("//div[contains(@class,'brands_products')]"));

        // Iterando sobre cada URL de produto
        for (String urlProduto : urlsProdutos) {
            // Encontrando o produto na lista
            WebElement produto = null;
            for (WebElement element : listaProdutos) {
                if (element.findElement(By.xpath(".//a[@href='" + urlProduto + "']")) != null) {
                    produto = element;
                    break;
                }
            }

            // Validando o nome do produto
            if (produto != null) {
                String nomeProduto = produto.findElement(By.xpath(".//a[@href='" + urlProduto + "']")).getText();
                if (!nomeProduto.isEmpty()) {
                    System.out.println("Nome do produto: " + nomeProduto);
                } else {
                    System.out.println("Nome do produto não encontrado para URL: " + urlProduto);
                }
            } else {
                System.out.println("Produto não encontrado para URL: " + urlProduto);
            }
        }
    }

    public void primeiroProduto() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[@href='/brand_products/Polo']")).click();

    }

    public void detalheDoPrimeiroProduto() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement primeiroProduto = driver.findElement(By.xpath("//h2[contains(.,'Brand - Polo Products')]"));
        primeiroProduto.getText().contains("BRAND - POLO PRODUCTS");
        primeiroProduto.isDisplayed();
    }

    public void detalheVisiveisNomeProdutos() {
        // Localiza a lista de elementos
        List<WebElement> itens = driver.findElements(By.xpath("(//div[contains(.,'(6)Polo\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t (5)H&M\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t (5)Madame\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t (3)Mast & Harbour\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t (4)Babyhug\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t (3)Allen Solly Junior\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t (3)Kookie Kids\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t (5)Biba')])[6]"));

        // Itens procurados
        List<String> itensProcurados = Arrays.asList("POLO", "H&M", "MADAME", "MAST & HARBOUR", "BABYHUG", "ALLEN SOLLY JUNIOR", "KOOKIE KIDS", "BIBA");



        // Verifica se cada item procurado está presente na lista
        for (String itemProcurado : itensProcurados) {
           // PageProdutoPage verificaLista = new PageProdutoPage();
            boolean encontrado = verificarItemNaLista(itemProcurado, itens);

            // Exibe o resultado
            if (encontrado) {
                System.out.println("O item \"" + itemProcurado + "\" está presente na lista.");
            } else {
                System.out.println("O item \"" + itemProcurado + "\" NÃO está presente na lista.");
            }
        }

    }
}