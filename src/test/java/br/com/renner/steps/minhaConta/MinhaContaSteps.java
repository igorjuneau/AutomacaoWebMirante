package br.com.mirante.steps.minhaConta;


import br.com.mirante.interactions.minhaConta.MinhaContaInteractions;
import io.cucumber.java.pt.*;

public class MinhaContaSteps {
    MinhaContaInteractions webSanity = new MinhaContaInteractions();

    public MinhaContaSteps() {
    }
    @Dado("Que clico no avatar da conta")
    public void queClicoNoAvatarDaConta() {
        webSanity.selecionoAvatarConta();
    }
    @Dado("Clico em minha conta")
    public void clicoEmMinhaConta() {
        webSanity.selecionoMinhaConta();
    }
    @Dado("Clico em enderecos")
    public void clicoEmEnderecos() {
        webSanity.acessarEndereco();
    }
    @Dado("Clico na area Adicionar novo endereco")
    public void clicoNaAreaAdicionarNovoEndereço() {
        webSanity.acessarNovoEndereco();
    }
    @Quando("Preencho os campos obrigatorios")
    public void preenchoOsCamposObrigatorios() {
        webSanity.preencherFormularioEndereco();
    }
    @Quando("Clico em adicionar novo endereco")
    public void clicoEmAdicionarNovoendereco() {
        webSanity.clicarEmAdicionarEndereco();
    }
    @Então("uma mensagem de confirmacao deve ser exibida")
    public void umaMensagemDeConfirmacaoDeveSerExibida() {
        webSanity.validoMensagem();
    }
    @Quando("Clico em deletar endereco")
    public void clicoEmDeletarEndereco() {
        webSanity.excluirEndereco();
    }
    @Quando("verifico que o endereco principal nao tem o icone excluir")
    public void semIconeDeletarEndereco() {
        webSanity.semIconeDeletarEndereco();
    }
    @Então("uma mensagem de exclusao deve ser exibida")
    public void umaMensagemDeExluisaoDeveSerExibida() {
        webSanity.validoMensagemExcluirEndereco();
    }
    @Dado("Clico na area editar endereco")
    public void clicoNaAreaEditarEndereco() {
        webSanity.selecionarEditarEndereco();
    }
    @Quando("Altero os dados")
    public void alteroOsDados() {
        webSanity.editarCampos();
    }
    @Quando("clico em salvar endereco")
    public void clicoEmSalvarEndereco() {
        webSanity.salvarEdicao();
    }
    @Entao("uma mensagem de alteracao deve ser exibida")
    public void umaMensagemDeAlteracaoDeveSerExibida() {
        webSanity.validoMensagemEditarEndereco();
    }
    @Dado("Clico em meus dados")
    public void clicoEmMeusDados() {
        webSanity.clicoEmMeusDados();
    }
    @Quando("Altero as informacoes pessoais")
    public void alteroAsInformacoesPessoais() {
        webSanity.alterarTelefone();
    }
    @Quando("clico em salvar alteracoes")
    public void clicoEmSalvarAlteracoes() {
        webSanity.clicarBotaoAutMyData();
    }
    @Entao("uma mensagem de atualizacao de dados deve ser exibida")
    public void umaMensagemDeAtualizacaoDeDadosDeveSerExibida() {
        webSanity.validoMensagem();
    }
    @Dado("Clico em alterar senha")
    public void alterarSenha() {
        webSanity.selecionarAlterarSenha();
    }
    @Quando("Preencho os campos com a senha atual e a nova senha")
    public void preencherAlterarSenha() {
        webSanity.preencherCampoSenha();
    }
    @Entao("Deve aparecer uma mensagem de alteração de senha")
    public void validoMensagemAlteracaoSenha() {
        webSanity.validoMensagemAtualizarSenha();
    }
    @Quando("Preencho os campos com a senha anterior")
    public void preencherSenhaAnterior() {
        webSanity.voltarSenhaAnterior();
    }
    @Quando("Clico em vale troca")
    public void clicoValeTroca() {
        webSanity.selecionarValeTroca();
    }
    @Entao("O saldo encontrado conforma com o valor esperado")
    public void validoSaldoValeTroca() {
        webSanity.validoSaldoValeTroca();
    }
    @Quando("Clico em Cashback")
    public void clicoEmCashback() {
        webSanity.clicoEmCashback();
    }
    @Entao("O saldo do cashback deve estar disponivel para verificacao")
    public void validoSaldoCashBack() {
        webSanity.validoSaldoCashBack();
    }
}
