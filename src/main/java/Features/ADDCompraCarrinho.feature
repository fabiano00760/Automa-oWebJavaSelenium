@CompraCarrinho
Feature:Adcionar compra no Carrinho de Campra

  Scenario Outline: Adcionar compra no Carrinho de Campra
    Given que eu esteja na pagina home <url>
    And preencho o campo endereço de email <email>
    And  preencho o campo Password <Password>
    When clico no btn Login Conta
    Then loguin Realizado com sucesso
    And Clique no botao Produtos
    And seleciono produto para p carrinho ADD to Cart







    Examples:
      | url                                        | email                    | Password   |
      | "https://www.automationexercise.com/login" | "fabiano00760@yahoo.com" | "edu00760" |
