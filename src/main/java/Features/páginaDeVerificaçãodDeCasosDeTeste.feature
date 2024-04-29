@CasoTestes
Feature: página de verificação de casos de teste

  Scenario Outline: página de verificação de casos de teste
    Given que eu esteja na pagina home <url>
    When preencho o campo endereço de email <email>
    And preencho o campo Password <senha>
    And clico no btn Login Conta
    Then loguin Realizado com sucesso
    And Verifique se a página inicial está visível com sucesso
    Then Clique no botão Casos de Teste
    When Verifique se o usuário foi navegado para a página de casos de teste com sucesso
    Examples:
      | url                                        | email                    | senha      |
      | "https://www.automationexercise.com/login" | "fabiano00760@yahoo.com" | "edu00760" |

