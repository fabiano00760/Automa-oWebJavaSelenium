package Stepes;

import F.Driver.FDriver;
import Pages.PageProdutoPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.sql.Driver;

public class PageProdutoStep {

    PageProdutoPage pageProdutoPage;
    WebDriver driver;

    public PageProdutoStep() {
        this.pageProdutoPage = new PageProdutoPage();
        this.driver = FDriver.getDrive();
    }


    @And("Verifique se a pagina produtos inicial esta visivel com sucesso")
    public void verifique_se_a_pagina_produtos_inicial_esta_visivel_com_sucesso() {
        pageProdutoPage.btnProduto();

    }

    @And("Clique no botao Produtos")
    public void clique_no_botao_produtos() throws InterruptedException {
        pageProdutoPage.btnProduto1();

    }

    @When("Verifique se o usuario foi navegado para a pagina TODOS OS PRODUTOS com sucesso")
    public void verifique_se_o_usuario_foi_navegado_para_a_pagina_todos_os_produtos_com_sucesso() {
        pageProdutoPage.pageTodosProdutos();

    }

    @And("A lista de produtos esta visivel")
    public void a_lista_de_produtos_esta_visivel() {
        pageProdutoPage.listaDeProdutos();

    }

    @And("Clique em Ver Produto do primeiro produto")
    public void clique_em_ver_produto_do_primeiro_produto() throws InterruptedException {
        pageProdutoPage.primeiroProduto();

    }



    @And("O usuario e direcionado a pagina de detalhes do produto")
    public void o_usuario_e_direcionado_a_pagina_de_detalhes_do_produto() {
        pageProdutoPage.detalheDoPrimeiroProduto();

    }

    @Then("Verifique se os detalhes estao visiveis: nome do produto, categoria, preço, disponibilidade, condicao, marca")
    public void verifique_se_os_detalhes_estao_visiveis_nome_do_produto_categoria_preco_disponibilidade_condicao_marca() {
        pageProdutoPage.detalheVisiveisNomeProdutos();

    }



}
