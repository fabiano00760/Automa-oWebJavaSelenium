@web
Feature: Login Novo Usuario

  Scenario: Novo conta
    Given que eu esteja na pagina home "https://www.automationexercise.com/login"
    When no capo login preencho o campo de Cadastro de novo usuário! o nome "Fabiano"
    And preencho o campo endereço de email novo cadastro "fabiano00760@live.com"
    And clico no btn inscrever-se
    Then logo com sucesso

  @inforConta
  Scenario:informaçao de Conta
    Given que eu esteja na pagina home "https://www.automationexercise.com/login"
    When no capo login preencho o campo de Cadastro de novo usuário! o nome "Fabiano"
    And preencho o campo endereço de email new user singnup "fabiano00760@live.com"
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

  @logComSucesso
  Scenario: Login com Sucesso
    Given que eu esteja na pagina home "https://www.automationexercise.com/login"
    When preencho o campo endereço de email "fabiano00760@yahoo.com"
    And  preencho o campo Password "edu00760"
    And  clico no btn Login Conta
    Then loguin Realizado com sucesso

  @EmailSenhaIncorreto
  Scenario: Digite o endereço de e-mail e a senha incorretos

    Given que eu esteja na pagina home "https://www.automationexercise.com/login"
    When preencho o campo endereço de email incorreto "fabiano00760@yahoo.com"
    And  preencho o campo Password incorreto "Edu00760"
    And  clico no btn Login Conta
    Then valido mensagem de erro

  @LogoutUsuario
  Scenario: Logout Usuario
    Given que eu esteja na pagina home "https://www.automationexercise.com/login"
    And preencho o campo endereço de email "fabiano00760@yahoo.com"
    And  preencho o campo Password "edu00760"
    And  clico no btn Login Conta
    When loguin Realizado com sucesso
    And clico no btn logout do usuario
    Then valido se foi para a tela inicial de login

  @EmailJaExistente
  Scenario: Emeail ja existente
    Given que eu esteja na pagina home "https://www.automationexercise.com/login"
    When no capo login preencho o campo de Cadastro de novo usuário! o nome "Fabiano"
    And preencho o campo endereço de email new user singnup "fabiano00760@yahoo.com"
    And clico no btn inscrever-se
    Then valido mensagem de erro

  @PageDeVerificaaoDeCasosTeste
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

  @VerificarProdutosEPageDeDetalheDoProd
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

  @FaleConosco
  Scenario: Fale Conosco
    Given que eu esteja na pagina home "https://www.automationexercise.com"
    And Clico no BTN Contact us
    Then preencho o campo Nome "Fabiano"
    And o campo Email "fabiano00760@yahoo.com"
    And eo objetivo Da mensagem "fala sobre os documentos a serem enviados"
    And Escrevo a mensagem no campo "agradeço pelo analise"
    And clico no BTN Escoler arquivo e seleciono o arquivo
    And Clico no Submit
    And valido mensagem de sucesso e clico em Home
    When clico no btn

  @CompraCarrinho
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
