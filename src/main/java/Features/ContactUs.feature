@Contatenos

Feature: contate-os

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
    When clico no btn Home