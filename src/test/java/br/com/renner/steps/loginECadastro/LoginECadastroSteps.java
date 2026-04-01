package br.com.mirante.steps.loginECadastro;

import br.com.mirante.interactions.loginECadastro.LoginECadastroInteractions;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class LoginECadastroSteps {
    LoginECadastroInteractions webSanity = new LoginECadastroInteractions();

    public LoginECadastroSteps() {
    }
    @Dado("que estou no site camicado hml")
    public void validaSiteHml() throws Exception {
        webSanity.validaUrlHml();
    }
    @Dado("que estou na pagina de campanha")
    public void validaSiteHmlCamp() throws Exception {
        webSanity.acessarUrlCampanha();
    }
    @Dado("que estou na pagina de categorias")
    public void validaSiteHmlCateg() throws Exception {
        webSanity.acessarUrlCategoria();
    }
    @Dado("que estou na pagina de MarketPlace")
    public void validaSiteHmlMarket() throws Exception {
        webSanity.acessarUrlMarketPlace();
    }
    @Dado("que estou na pagina de departamento")
    public void validaSiteHmlDepart() throws Exception {
        webSanity.acessarUrlDepartamento();
    }
    @Dado("que estou na pagina de ambientes")
    public void validaSiteHmlAmbient() throws Exception {
        webSanity.acessarUrlAmbiente();
    }
    @Dado("que estou na pagina minha conta")
    public void validaSiteHmlMinCont() throws Exception {
        webSanity.acessarUrlMinhaConta();
    }
    @Dado("que estou na pagina Favoritos")
    public void validaSiteHmlFav() throws Exception {
        webSanity.acessarUrlFavoritos();
    }
    @Dado("que estou na pagina sacola")
    public void validaSiteHmlSac() throws Exception {
        webSanity.acessarUrlSacola();
    }
    @Dado("que estou na pagina institucional")
    public void validaSiteHmlInst() throws Exception {
        webSanity.acessarUrlInstitucional();
    }
    @Dado("que estou no site camicado prd")
    public void validaSiteProd() throws Exception {
        webSanity.validaUrlPrd();
    }
    @Dado("Que clico no avatar de login")
    public void clicoNaOpcaoEntreOuCadastreSe() {
        webSanity.selecionoAvatarLogin();
    }
    @Quando("Realizo login com e-mail e senha validos {string}")
    public void realizoLoginPROD(String tipo) throws Exception {
        webSanity.realizoLogin(tipo);
    }
    @Quando("Realizo login com e-mail e senha invalidos {string}")
    public void realizoLogininPROD(String tipo) throws Exception {
        webSanity.realizoLoginInv(tipo);
    }
    @Entao("Login deve ser efetuado com sucesso e com iniciais {string}")
    public void validoLoginPROD(String inicais) {
        webSanity.validoLogin(inicais);
    }
    @Quando("Preencho os dados basicos e senha {string} e realizo o cadastro")
    public void preenchoCamposCadastro(String tipo) throws Exception {
        if (tipo.equals("PF")) {
            webSanity.preenchoCamposCadastroPF();
        } else {
            webSanity.preenchoCamposCadastroPJ();
        }
    }
    @Quando("Preencho os dados basicos e senha {string} invalidos e tento realizar o cadastro")
    public void preenchoCamposCadastroDadosInvalidos(String tipo) throws Exception {
        if (tipo.equals("PF")) {
            webSanity.preenchoCamposCadastroInvalidoPF();
        } else {
            webSanity.preenchoCamposCadastroInvalidoPJ();
        }
    }
    @E("Clico na opção Cadastre-se")
    public void clicoNaOpcaoCadastraSe() {
        webSanity.selecionoCadastreSe();
    }
    @Quando("Clico na opcao esqueci minha senha e Preencho com um CPF")
    public void esqueciMinhaSenha() throws Exception {
        webSanity.esqueciMinhaSenha();
    }
    @Entao("Deve aparecer uma mensagem de recuperacao de senha")
    public void validoMensagemRecuperacaoSenha() {
        webSanity.validoMensagemRecuperacaoSenha();
    }
    @Entao("Deve aparecer uma mensagem de senha ou e-mail invalidos")
    public void validoMensagemSenhaouEmailInvalido() {
        webSanity.validoSenhaouEmailInvalido();
    }
    @Quando("Clico na opcao de fazer login com google")
    public void loginSocialGoogle() {
        webSanity.loginSocialGoogle();
    }
    @Quando("Clico na opcao de fazer login com facebook")
    public void loginSocialFacebook() {
        webSanity.loginSocialFacebook();
    }
    @Entao("Deve aparecer uma mensagem de dado invalido")
    public void validoMensagemdeDadoInvalido() {
        webSanity.validoMensagemdeDadoInvalido();
    }
    @Entao("Deve abrir uma janela para fazer login com google")
    public void validoJanelaLoginGoogle() {
        webSanity.validoJanelaLoginGoogle();
    }
    @Entao("Deve abrir uma janela para fazer login com facebook")
    public void validoJanelaLoginFacebook() {
        webSanity.validoJanelaLoginFacebook();
    }
}
