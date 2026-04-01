package br.com.mirante.interactions.minhaConta;

import br.com.mirante.pages.minhaConta.MinhaContaPage;
import br.com.mirante.toolbox.RennerTools;
import org.junit.Assert;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

import static br.com.renner.steps.hook.WebSetup.*;
import static br.com.renner.toolbox.RennerTools.*;

public class MinhaContaInteractions extends MinhaContaPage {

    private static final int TIME_OUT = 20;

    public MinhaContaInteractions() {
    }

    public void fecharCashBack() {
        var modal = seleniumRobotsTool.getElement(cashbackModal())
                .getShadowRoot()
                .findElement(botaoGenerico());
        aguardoElementoClicavel(modal);
        modal.click();
    }

    public void selecionoAvatarConta() {
        seleniumRobotsTool.waitObject(header(), TIME_OUT);

        seleniumRobotsTool.getElement(header())
                .getShadowRoot()
                .findElement(iconePerfilLogado())
                .click();
        tirarPrint(scenario);
    }

    public void selecionoMinhaConta() {
        seleniumRobotsTool.waitObject(header(), TIME_OUT);

        verificarCashBack(this::fecharCashBack);

        aguardoElementoClicavel(seleniumRobotsTool.getElement(logoutTooltip())
                .getShadowRoot()
                .findElement(minhaContaTextLabel()));

        seleniumRobotsTool.getElement(logoutTooltip())
                .getShadowRoot()
                .findElement(minhaContaTextLabel())
                .click();
        tirarPrint(scenario);
    }


    public void acessarEndereco() {
        aguardoElementoClicavel(btnCadastrase);
        seleniumRobotsTool.waitObject(enderecoOption(), TIME_OUT);
        seleniumRobotsTool.getElement(enderecoOption())
                .click();
        seleniumRobotsTool.waitObject(cardsNewAddress(), TIME_OUT);
        tirarPrint(scenario);
    }

    public void acessarNovoEndereco() {
        seleniumRobotsTool.waitObject(cardsNewAddress(), TIME_OUT);

        aguardoElementoClicavel(seleniumRobotsTool.getElement(cardsNewAddress())
                .getShadowRoot()
                .findElement(buttonAddAddress()));
        seleniumRobotsTool.getElement(cardsNewAddress())
                .getShadowRoot()
                .findElement(buttonAddAddress())
                .click();
        tirarPrint(scenario);

    }

    public void preencherFormularioEndereco() {
        String cep = RennerTools.getJsonData("CEP");
        String endereco = RennerTools.getJsonData("Endereco");
        String numero = RennerTools.getJsonData("Numero");
        String bairro = RennerTools.getJsonData("Bairro");
        String cidade = RennerTools.getJsonData("Cidade");
        String estado = RennerTools.getJsonData("Estado");


        aguardoElementoClicavel(
                seleniumRobotsTool.getElement(addressForm())
                        .getShadowRoot()
                        .findElement(cepField())
                        .getShadowRoot()
                        .findElement(inputGenerico())
        );
        seleniumRobotsTool.getElement(addressForm())
                .getShadowRoot()
                .findElement(cepField())
                .getShadowRoot()
                .findElement(inputGenerico())
                .sendKeys(cep);

        seleniumRobotsTool.waitObject(cardsNewAddress(), TIME_OUT);

        aguardoElementoClicavel(
                seleniumRobotsTool.getElement(addressForm())
                        .getShadowRoot()
                        .findElement(enderecoField())
                        .getShadowRoot()
                        .findElement(inputGenerico())
        );
        seleniumRobotsTool.getElement(addressForm())
                .getShadowRoot()
                .findElement(enderecoField())
                .getShadowRoot()
                .findElement(inputGenerico())
                .sendKeys(endereco);
        seleniumRobotsTool.waitObject(cardsNewAddress(), TIME_OUT);

        aguardoElementoClicavel(
                seleniumRobotsTool.getElement(addressForm())
                        .getShadowRoot()
                        .findElement(numeroField())
                        .getShadowRoot()
                        .findElement(inputGenerico())
        );
        seleniumRobotsTool.getElement(addressForm())
                .getShadowRoot()
                .findElement(numeroField())
                .getShadowRoot()
                .findElement(inputGenerico())
                .sendKeys(numero);
        seleniumRobotsTool.waitObject(cardsNewAddress(), TIME_OUT);
        tirarPrint(scenario);
        aguardoElementoClicavel(
                seleniumRobotsTool.getElement(addressForm())
                        .getShadowRoot()
                        .findElement(bairroField())
                        .getShadowRoot()
                        .findElement(inputGenerico())
        );
        seleniumRobotsTool.getElement(addressForm())
                .getShadowRoot()
                .findElement(bairroField())
                .getShadowRoot()
                .findElement(inputGenerico())
                .sendKeys(bairro);
        seleniumRobotsTool.waitObject(cardsNewAddress(), TIME_OUT);

        aguardoElementoClicavel(
                seleniumRobotsTool.getElement(addressForm())
                        .getShadowRoot()
                        .findElement(cidadeField())
                        .getShadowRoot()
                        .findElement(inputGenerico())
        );
        seleniumRobotsTool.getElement(addressForm())
                .getShadowRoot()
                .findElement(cidadeField())
                .getShadowRoot()
                .findElement(inputGenerico())
                .sendKeys(cidade);
        seleniumRobotsTool.waitObject(cardsNewAddress(), TIME_OUT);

        aguardoElementoClicavel(
                seleniumRobotsTool.getElement(addressForm())
                        .getShadowRoot()
                        .findElement(estadoDropdown())
                        .getShadowRoot()
                        .findElement(inputGenerico())
        );
        seleniumRobotsTool.getElement(addressForm())
                .getShadowRoot()
                .findElement(estadoDropdown())
                .getShadowRoot()
                .findElement(inputGenerico())
                .sendKeys(estado);
        tirarPrint(scenario);

    }

    public void clicarEmAdicionarEndereco() {
        aguardoElementoClicavel(btnCadastrase);
        seleniumRobotsTool.waitObject(cardsNewAddress(), TIME_OUT);

        var botaoAdicionarEndereco = seleniumRobotsTool.getElement(addressForm())
                .getShadowRoot()
                .findElement(submitButton());

        scrollAteElemento(botaoAdicionarEndereco);
        aguardoElementoClicavel(botaoAdicionarEndereco);
        botaoAdicionarEndereco.click();
        tirarPrint(scenario);
    }

    public void excluirEndereco() {
        aguardoElementoClicavel(btnCadastrase);
        aguardoElementoClicavel(
                seleniumRobotsTool.getElement(secondAddressCard())
                        .getShadowRoot()
                        .findElement(secondCtaIconButton())
                        .getShadowRoot()
                        .findElement(botaoGenerico())

        );

        seleniumRobotsTool.getElement(secondAddressCard())
                .getShadowRoot()
                .findElement(secondCtaIconButton())
                .getShadowRoot()
                .findElement(botaoGenerico())
                .click();

        aguardoElementoClicavel(
                seleniumRobotsTool.getElement(deleteAddressButton())
                        .getShadowRoot()
                        .findElement(botaoGenerico())
        );

        seleniumRobotsTool.getElement(deleteAddressButton())
                .getShadowRoot()
                .findElement(botaoGenerico())
                .click();
        tirarPrint(scenario);
    }

    public void validoMensagemExcluirEndereco() {
        aguardoElementoClicavel(
                seleniumRobotsTool.getElement(headerToast())
                        .getShadowRoot()
                        .findElement(textoGenerico()));

        Assert.assertEquals(seleniumRobotsTool.getElement(headerToast())
                        .getShadowRoot()
                        .findElement(textoGenerico()).getText(),
                RennerTools.getJsonData("TextoExcluirEndereco"));

    }

    public void selecionarEditarEndereco() {
        seleniumRobotsTool.waitObject(cardsAddressCard(), TIME_OUT);
        seleniumRobotsTool.getElement(cardsAddressCard())
                .getShadowRoot()
                .findElement(ctaIconButton())
                .getShadowRoot()
                .findElement(botaoGenerico())
                .click();
        tirarPrint(scenario);
    }

    public void editarCampos() {
        String cep = RennerTools.getJsonData("CEP");
        String endereco = RennerTools.getJsonData("Endereco");
        String numero = RennerTools.getJsonData("Numero");
        String bairro = RennerTools.getJsonData("Bairro");
        String cidade = RennerTools.getJsonData("Cidade");
        String estado = RennerTools.getJsonData("Estado");

        seleniumRobotsTool.waitObject(cardsNewAddress(), TIME_OUT);
        aguardoElementoClicavel(
                seleniumRobotsTool.getElement(addressForm())
                        .getShadowRoot()
                        .findElement(cepField())
                        .getShadowRoot()
                        .findElement(inputGenerico())
        );
        seleniumRobotsTool.getElement(addressForm())
                .getShadowRoot()
                .findElement(cepField())
                .getShadowRoot()
                .findElement(inputGenerico())
                .sendKeys(cep);

        seleniumRobotsTool.waitObject(cardsNewAddress(), TIME_OUT);
        aguardoElementoClicavel(
                seleniumRobotsTool.getElement(addressForm())
                        .getShadowRoot()
                        .findElement(enderecoField())
                        .getShadowRoot()
                        .findElement(inputGenerico()));
        seleniumRobotsTool.getElement(addressForm())
                .getShadowRoot()
                .findElement(enderecoField())
                .getShadowRoot()
                .findElement(inputGenerico())
                .sendKeys(endereco);

        seleniumRobotsTool.waitObject(cardsNewAddress(), TIME_OUT);
        aguardoElementoClicavel(
                seleniumRobotsTool.getElement(addressForm())
                        .getShadowRoot()
                        .findElement(numeroField())
                        .getShadowRoot()
                        .findElement(inputGenerico()));
        seleniumRobotsTool.getElement(addressForm())
                .getShadowRoot()
                .findElement(numeroField())
                .getShadowRoot()
                .findElement(inputGenerico())
                .sendKeys(numero);

        seleniumRobotsTool.waitObject(cardsNewAddress(), TIME_OUT);
        aguardoElementoClicavel(
                seleniumRobotsTool.getElement(addressForm())
                        .getShadowRoot()
                        .findElement(bairroField())
                        .getShadowRoot()
                        .findElement(inputGenerico()));
        seleniumRobotsTool.getElement(addressForm())
                .getShadowRoot()
                .findElement(bairroField())
                .getShadowRoot()
                .findElement(inputGenerico())
                .sendKeys(bairro);

        seleniumRobotsTool.waitObject(cardsNewAddress(), TIME_OUT);
        aguardoElementoClicavel(
                seleniumRobotsTool.getElement(addressForm())
                        .getShadowRoot()
                        .findElement(cidadeField())
                        .getShadowRoot()
                        .findElement(inputGenerico())
        );
        seleniumRobotsTool.getElement(addressForm())
                .getShadowRoot()
                .findElement(cidadeField())
                .getShadowRoot()
                .findElement(inputGenerico())
                .sendKeys(cidade);

        seleniumRobotsTool.waitObject(cardsNewAddress(), TIME_OUT);
        aguardoElementoClicavel(
                seleniumRobotsTool.getElement(addressForm())
                        .getShadowRoot()
                        .findElement(estadoDropdown())
                        .getShadowRoot()
                        .findElement(inputGenerico())
        );
        seleniumRobotsTool.getElement(addressForm())
                .getShadowRoot()
                .findElement(estadoDropdown())
                .getShadowRoot()
                .findElement(inputGenerico())
                .sendKeys(estado);
        tirarPrint(scenario);

    }

    public void salvarEdicao() {
        aguardoElementoClicavel(btnCadastrase);

        seleniumRobotsTool.waitObject(addressForm(), TIME_OUT);
        aguardoElementoClicavel(seleniumRobotsTool.getElement(addressForm())
                .getShadowRoot()
                .findElement(submitButton()));
        seleniumRobotsTool.getElement(addressForm())
                .getShadowRoot()
                .findElement(submitButton())
                .click();
        tirarPrint(scenario);
    }

    public void validoMensagemEditarEndereco() {

        aguardoElementoClicavel(
                seleniumRobotsTool.getElement(headerToast())
                        .getShadowRoot()
                        .findElement(textoGenerico()));
        Assert.assertEquals(seleniumRobotsTool.getElement(headerToast())
                        .getShadowRoot()
                        .findElement(textoGenerico()).getText(),
                RennerTools.getJsonData("TextoEditarEndereco"));
    }


    public void clicoEmMeusDados() {
        aguardoElementoClicavel(btnCadastrase);
        seleniumRobotsTool.waitObject(dadosOption(), TIME_OUT);
        seleniumRobotsTool.getElement(dadosOption())
                .click();
        tirarPrint(scenario);
    }

    public void alterarTelefone() {

        generatePhoneNumber();
        String telefone = RennerTools.getJsonData("Telefone");

        var campoTelefone = seleniumRobotsTool.getElement(userMyDataCpf())
                .getShadowRoot()
                .findElement(autMyDataCpfPhoneNumber())
                .getShadowRoot()
                .findElement(inputGenerico());

        scrollAteElemento(campoTelefone);
        aguardoElementoClicavel(campoTelefone);
        campoTelefone.click();
        campoTelefone.clear();
        campoTelefone.sendKeys(telefone);

        String valorAtual = campoTelefone.getAttribute("value");
        Assert.assertEquals(telefone, valorAtual);
        tirarPrint(scenario);
    }

    public void clicarBotaoAutMyData() {
        seleniumRobotsTool.waitObject(userMyDataCpf(), TIME_OUT);

        scrollAteElemento(
                seleniumRobotsTool.getElement(userMyDataCpf())
                        .getShadowRoot()
                        .findElement(autMyDataButton())
        );

        aguardoElementoClicavel(
                seleniumRobotsTool.getElement(userMyDataCpf())
                        .getShadowRoot()
                        .findElement(autMyDataButton())
        );
        seleniumRobotsTool.getElement(userMyDataCpf())
                .getShadowRoot()
                .findElement(autMyDataButton())
                .click();
        tirarPrint(scenario);
    }

    public void validoMensagem() {
        aguardoElementoClicavel(
                seleniumRobotsTool.getElement(headerToast())
                        .getShadowRoot()
                        .findElement(textoGenerico()));
        Assert.assertEquals(seleniumRobotsTool.getElement(headerToast())
                        .getShadowRoot()
                        .findElement(textoGenerico()).getText(),
                RennerTools.getJsonData("TextoSucesso"));
    }

    public void selecionarAlterarSenha() {

        verificarCashBack(this::fecharCashBack);
        aguardoElementoClicavel(seleniumRobotsTool.getElement(logoutTooltip())
                .getShadowRoot()
                .findElement(alterarSenhaTextLabel()));

        seleniumRobotsTool.getElement(logoutTooltip())
                .getShadowRoot()
                .findElement(alterarSenhaTextLabel())
                .click();
        tirarPrint(scenario);
    }

    public void preencherCampoSenha() {
        String senha = RennerTools.getJsonData("Senha");
        String novaSenha = RennerTools.getJsonData("NovaSenha");

        aguardoElementoClicavel(
                seleniumRobotsTool.getElement(changePasswordForm())
                        .getShadowRoot()
                        .findElement(senhaField())
                        .getShadowRoot()
                        .findElement(inputGenerico()));
        seleniumRobotsTool.getElement(changePasswordForm())
                .getShadowRoot()
                .findElement(senhaField())
                .getShadowRoot()
                .findElement(inputGenerico())
                .sendKeys(senha);

        aguardoElementoClicavel(
                seleniumRobotsTool.getElement(changePasswordForm())
                        .getShadowRoot()
                        .findElement(novaSenhaInput())
                        .getShadowRoot()
                        .findElement(inputGenerico()));
        seleniumRobotsTool.getElement(changePasswordForm())
                .getShadowRoot()
                .findElement(novaSenhaInput())
                .getShadowRoot()
                .findElement(inputGenerico())
                .sendKeys(novaSenha);
        tirarPrint(scenario);
        aguardoElementoClicavel(
                seleniumRobotsTool.getElement(changePasswordForm())
                        .getShadowRoot()
                        .findElement(confirmarNovaSenhaInput())
                        .getShadowRoot()
                        .findElement(inputGenerico()));
        seleniumRobotsTool.getElement(changePasswordForm())
                .getShadowRoot()
                .findElement(confirmarNovaSenhaInput())
                .getShadowRoot()
                .findElement(inputGenerico())
                .sendKeys(novaSenha);

        var botaoAlterarSenha = seleniumRobotsTool.getElement(changePasswordForm())
                .getShadowRoot()
                .findElement(botaoGenerico());

        scrollAteElemento(botaoAlterarSenha);
        aguardoElementoClicavel(botaoAlterarSenha);
        botaoAlterarSenha.click();

    }

    public void validoMensagemAtualizarSenha() {

        aguardoElementoClicavel(
                seleniumRobotsTool.getElement(toastType())
                        .getShadowRoot()
                        .findElement(textoGenerico()));
        Assert.assertEquals(seleniumRobotsTool.getElement(toastType())
                .getShadowRoot()
                .findElement(textoGenerico()).getText(), RennerTools.getJsonData("TextoAtualizarSenha"));
    }

    public void voltarSenhaAnterior() {
        String senha = RennerTools.getJsonData("NovaSenha");
        String novaSenha = RennerTools.getJsonData("Senha");

        aguardoElementoClicavel(
                seleniumRobotsTool.getElement(changePasswordForm())
                        .getShadowRoot()
                        .findElement(senhaField())
                        .getShadowRoot()
                        .findElement(inputGenerico()));
        seleniumRobotsTool.getElement(changePasswordForm())
                .getShadowRoot()
                .findElement(senhaField())
                .getShadowRoot()
                .findElement(inputGenerico())
                .sendKeys(senha);

        aguardoElementoClicavel(
                seleniumRobotsTool.getElement(changePasswordForm())
                        .getShadowRoot()
                        .findElement(novaSenhaInput())
                        .getShadowRoot()
                        .findElement(inputGenerico()));
        seleniumRobotsTool.getElement(changePasswordForm())
                .getShadowRoot()
                .findElement(novaSenhaInput())
                .getShadowRoot()
                .findElement(inputGenerico())
                .sendKeys(novaSenha);
        tirarPrint(scenario);
        aguardoElementoClicavel(
                seleniumRobotsTool.getElement(changePasswordForm())
                        .getShadowRoot()
                        .findElement(confirmarNovaSenhaInput())
                        .getShadowRoot()
                        .findElement(inputGenerico()));
        seleniumRobotsTool.getElement(changePasswordForm())
                .getShadowRoot()
                .findElement(confirmarNovaSenhaInput())
                .getShadowRoot()
                .findElement(inputGenerico())
                .sendKeys(novaSenha);

        var botaoAlterarSenha = seleniumRobotsTool.getElement(changePasswordForm())
                .getShadowRoot()
                .findElement(botaoGenerico());

        scrollAteElemento(botaoAlterarSenha);
        aguardoElementoClicavel(botaoAlterarSenha);
        botaoAlterarSenha.click();

    }

    public void selecionarValeTroca() {
        var selecionoValeTroca =
                seleniumRobotsTool.getElement(logoutTooltip())
                        .getShadowRoot()
                        .findElement(valeTrocaTextLabel());
        aguardoElementoClicavel(selecionoValeTroca);
        selecionoValeTroca.click();
        tirarPrint(scenario);
    }

    public void validoSaldoValeTroca() {
        aguardoElementoClicavel(
                seleniumRobotsTool.getElement(boxPageInfo())
                        .getShadowRoot()
                        .findElement(TextLabelVTText()));
    }

    public void clicoEmCashback() {
        aguardoElementoClicavel(btnCadastrase);

        scrollAteElemento(seleniumRobotsTool.getElement(cashbackTitleBox())
                .getShadowRoot()
                .findElement((cashbackAccountOption()))
        );
        tirarPrint(scenario);
        clickCashbackButton();
    }

    public void validoSaldoCashBack() {
        aguardoElementoClicavel(
                seleniumRobotsTool.getElement(titleBoxSaldoCashback())
                        .getShadowRoot()
                        .findElement(cashBackValue()));
        String cashBackText = seleniumRobotsTool.getElement(titleBoxSaldoCashback())
                .getShadowRoot()
                .findElement(cashBackValue())
                .getText();
        double cashBackValue = Double.parseDouble(cashBackText.replace("R$", "").replace(",", ".").trim());
        Assert.assertTrue(cashBackValue >= 0);
    }

    public void semIconeDeletarEndereco() {
        aguardoElementoClicavel(btnCadastrase);

        boolean addressCardEncontrado = false;
        try {
            seleniumRobotsTool.getElement(oneAddressCard());
            addressCardEncontrado = true;
        } catch (Exception e) {
            addressCardEncontrado = false;
        }

        boolean ctaIconButtonEncontrado = false;
        if (addressCardEncontrado) {
            try {
                seleniumRobotsTool.getElement(oneAddressCard())
                        .getShadowRoot()
                        .findElement(oneCtaIconButton());
                ctaIconButtonEncontrado = true;
            } catch (Exception e) {
                ctaIconButtonEncontrado = false;
            }
        }
        tirarPrint(scenario);
    }
}