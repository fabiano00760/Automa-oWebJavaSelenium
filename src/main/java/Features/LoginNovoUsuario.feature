@web
Feature: Login Novo Usuario

  Scenario: Novo conta
    Given que eu esteja na pagina home "https://www.automationexercise.com/login"
    When no capo login preencho o campo de Cadastro de novo usuário! o nome "Fabiano"
    And preencho o campo endereço de email novo cadastro "fabiano00760@outlook.com"
    And clico no btn inscrever-se
    Then logo com sucesso

  Scenario:informaçao de Conta
    Given que eu esteja na pagina home "https://www.automationexercise.com/login"
    When no capo login preencho o campo de Cadastro de novo usuário! o nome "Fabiano"
    And preencho o campo endereço de email new user singnup "fabiano00760@outlook.com"
    And clico no btn inscrever-se
    Then logo com sucesso
    When no capo login preencho o campo de senha  de novo usuario "Edu00760"
    And preencho o campo endereço de data de nascimento
    And preencho o campo Primeiro nome "junio"
    And preencho o campo Sobrenome  "costa"
    And preencho o campo Empresa  "inmetrics"
    And preencho o campo Endereço "rua teste de teste testando"
    And preencho o campo Endereco dois "rua teste de teste testando"
    And seleciono o pais
    And preencho o campo Estado "sao paulo"
    And preencho o campo Cidade "sao paulo"
    And preencho o campo cep "4815-1301"
    And preencho o campo Número de telemóvel "5511982576455"
    And clico em criar uma conta
    Then logo com sucesso tela de cadastro

  Scenario: Login com Sucesso
    Given que eu esteja na pagina home "https://www.automationexercise.com/login"
    When preencho o campo endereço de email "fabiano00760@yahoo.com"
    And  preencho o campo Password "edu00760"
    And  clico no btn Login Conta
    Then loguin Realizado com sucesso

  Scenario: Digite o endereço de e-mail e a senha incorretos

    Given que eu esteja na pagina home "https://www.automationexercise.com/login"
    When preencho o campo endereço de email incorreto "fabiano00760@yahoo.com"
    And  preencho o campo Password incorreto "Edu00760"
    And  clico no btn Login Conta
    Then valido mensagem de erro

    Scenario: Logout Usuario
      Given que eu esteja na pagina home "https://www.automationexercise.com/login"
      And preencho o campo endereço de email "fabiano00760@yahoo.com"
      And  preencho o campo Password "edu00760"
      And  clico no btn Login Conta
      When loguin Realizado com sucesso
      And clico no btn logout do usuario
      Then valido se foi para a tela inicial de login

Scenario: Emeail ja existente
  Given que eu esteja na pagina home "https://www.automationexercise.com/login"
  When no capo login preencho o campo de Cadastro de novo usuário! o nome "Fabiano"
  And preencho o campo endereço de email new user singnup "fabiano00760@yahoo.com"
  And clico no btn inscrever-se
  Then valido mensagem de erro "Email Address already exist!"