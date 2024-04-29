package Stepes;

import F.Driver.FDriver;
import Pages.InformacaoContaPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class InformacaoContacadastroStep {

    InformacaoContaPage informacaoConta = new InformacaoContaPage();
    WebDriver driver ;

    public InformacaoContacadastroStep() {
        this.informacaoConta = new InformacaoContaPage();
        this.driver = FDriver.getDrive();
    }

    @When("no capo login preencho o campo de senha  de novo usuario {string}")
    public void no_capo_login_preencho_o_campo_de_senha_de_novo_usuario(String senha) {
        informacaoConta.senhaNovoUsuario(senha);

    }

    @And("preencho o campo endereço de data de nascimento")
    public void preencho_o_campo_endereço_de_data_de_nascimento() throws InterruptedException {
        informacaoConta.composDataDeNascimento();

    }

    @And("preencho o campo Primeiro nome {string}")
    public void preencho_o_campo_primeiro_nome(String nome) throws InterruptedException {
        informacaoConta.FirstName(nome);

    }

    @And("preencho o campo Sobrenome  {string}")
    public void preencho_o_campo_sobrenome(String sobrenome) throws InterruptedException {
        informacaoConta.LastName(sobrenome);

    }

    @And("preencho o campo Empresa  {string}")
    public void preencho_o_campo_empresa(String company) throws InterruptedException {
        informacaoConta.Company(company);

    }

    @And("preencho o campo Endereço {string}")
    public void preencho_o_campo_endereço(String Address) throws InterruptedException {
        informacaoConta.Address(Address);

    }

    @And("preencho o campo Endereco dois {string}")
    public void preencho_o_campo_endereco_dois(String Address2) throws InterruptedException {
        informacaoConta.Address2(Address2);

    }

    @And("seleciono o pais")
    public void seleciono_o_pais() throws InterruptedException {
        informacaoConta.pais();

    }

    @And("preencho o campo Estado {string}")
    public void preencho_o_campo_estado(String stade) throws InterruptedException {
        informacaoConta.stade(stade);

    }

    @And("preencho o campo Cidade {string}")
    public void preencho_o_campo_cidade(String cidade) throws InterruptedException {
        informacaoConta.cidade(cidade);

    }

    @And("preencho o campo cep {string}")
    public void preencho_o_campo_cep(String cep) throws InterruptedException {
        informacaoConta.cep(cep);

    }

    @And("preencho o campo Número de telemóvel {string}")
    public void preencho_o_campo_número_de_telemóvel(String fone) throws InterruptedException {
        informacaoConta.fone(fone);

    }

    @When("clico em criar uma conta")
    public void clico_em_criar_uma_conta() throws InterruptedException {
        informacaoConta.BtnCliarConta();


    }


    @Then("logo com sucesso tela de cadastro")
    public void logoComSucessoTelaDeCadastro() {
        informacaoConta.telaDecadastra();

    }

    @And("preencho o campo endereço de email new user singnup {string}")
    public void preenchoOCampoEndereçoDeEmailNewUserSingnup(String email) {
        informacaoConta.campoEmailNewUserSignup(email);
    }
}