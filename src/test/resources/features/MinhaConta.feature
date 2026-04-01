#language: pt

@MinhaConta @Regressivo
Funcionalidade: Minha Conta
  Contexto:
    Dado que estou no site camicado hml
    E Que clico no avatar de login
    Quando Realizo login com e-mail e senha validos "PF"
    Entao Login deve ser efetuado com sucesso e com iniciais "BR"

  @MinhaConta_001
  Cenario: Adicionar Endereço
    Dado Que clico no avatar da conta
    E Clico em minha conta
    E Clico em enderecos
    E Clico na area Adicionar novo endereco
    Quando Preencho os campos obrigatorios
    E Clico em adicionar novo endereco
    Então uma mensagem de confirmacao deve ser exibida

  @MinhaConta_002
  Cenario: Deletar Endereço
    Dado Que clico no avatar da conta
    E Clico em minha conta
    E Clico em enderecos
    Quando Clico em deletar endereco
    Então uma mensagem de exclusao deve ser exibida

  @MinhaConta_003
  Cenario: Não é Possível Deletar Endereço Principal
    Dado Que clico no avatar da conta
    E Clico em minha conta
    Quando Clico em enderecos
    Entao verifico que o endereco principal nao tem o icone excluir

  @MinhaConta_004
  Cenario: Editar Endereco
    Dado Que clico no avatar da conta
    E Clico em minha conta
    E Clico em enderecos
    E Clico na area editar endereco
    Quando Altero os dados
    E clico em salvar endereco
    Entao uma mensagem de alteracao deve ser exibida

  @MinhaConta_005
  Cenario: Alterar o cadastro
    Dado Que clico no avatar da conta
    E Clico em minha conta
    E Clico em meus dados
    Quando Altero as informacoes pessoais
    E clico em salvar alteracoes
    Entao uma mensagem de atualizacao de dados deve ser exibida

  @MinhaConta_006
  Cenario: Editar senha
    Dado Que clico no avatar da conta
    E Clico em alterar senha
    Quando Preencho os campos com a senha atual e a nova senha
    Entao Deve aparecer uma mensagem de alteração de senha
    E Que clico no avatar da conta
    E Clico em alterar senha
    Quando Preencho os campos com a senha anterior
    Entao Deve aparecer uma mensagem de alteração de senha

  @MinhaConta_007
  Cenario: Consultar vale troca
    Dado Que clico no avatar da conta
    Quando Clico em vale troca
    Entao O saldo encontrado conforma com o valor esperado

  @MinhaConta_008
  Cenario: Saldo cashback
    Dado Que clico no avatar da conta
    E Clico em minha conta
    Quando Clico em Cashback
    Entao O saldo do cashback deve estar disponivel para verificacao


