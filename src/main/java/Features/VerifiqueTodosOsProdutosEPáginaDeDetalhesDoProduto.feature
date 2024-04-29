@pageProduto

Feature: Page Produtos

  Scenario:Verifique Todos Os Produtos E Página De Detalhes Do Produto

    Given que eu esteja na pagina home "https://www.automationexercise.com/login"
    And preencho o campo endereço de email "fabiano00760@yahoo.com"
    And  preencho o campo Password "edu00760"
    And  clico no btn Login Conta
    And Verifique se a pagina produtos inicial esta visivel com sucesso
    And Clique no botao Produtos
    When Verifique se o usuario foi navegado para a pagina TODOS OS PRODUTOS com sucesso
    And A lista de produtos esta visivel
    And Clique em Ver Produto do primeiro produto
    And O usuario e direcionado a pagina de detalhes do produto
    Then Verifique se os detalhes estao visiveis: nome do produto, categoria, preço, disponibilidade, condicao, marca
