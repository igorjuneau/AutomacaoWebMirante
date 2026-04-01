#language: pt

@LoginECadastro @Regressivo
Funcionalidade: Login e Cadastro

  Contexto:
    Dado que estou no site camicado hml

  @LoginECadastro_001
  Cenario: Login PF Sucesso
    Dado Que clico no avatar de login
    Quando Realizo login com e-mail e senha validos "PF"
    Entao Login deve ser efetuado com sucesso e com iniciais "BR"

  @LoginECadastro_002
  Cenario: Login PJ Sucesso
    Dado Que clico no avatar de login
    Quando Realizo login com e-mail e senha validos "PJ"
    Entao Login deve ser efetuado com sucesso e com iniciais "B"

  @LoginECadastro_003
  Cenario: Login PF Credenciais invalidas
    Dado Que clico no avatar de login
    Quando Realizo login com e-mail e senha invalidos "PF"
    Entao Deve aparecer uma mensagem de senha ou e-mail invalidos

  @LoginECadastro_004
  Cenario: Login PJ Credenciais invalidas
    Dado Que clico no avatar de login
    Quando Realizo login com e-mail e senha invalidos "PJ"
    Entao Deve aparecer uma mensagem de senha ou e-mail invalidos

  @LoginECadastro_005
  Cenario: Login com Dados invalidos
    Dado Que clico no avatar de login
    Quando Realizo login com e-mail e senha invalidos "PF"
    Entao Deve aparecer uma mensagem de senha ou e-mail invalidos

  @LoginECadastro_006
  Cenario: Cadastro PF Sucesso
    Dado Que clico no avatar de login
    E Clico na opção Cadastre-se
    Quando Preencho os dados basicos e senha "PF" e realizo o cadastro
    Entao Login deve ser efetuado com sucesso e com iniciais "CT"

  @LoginECadastro_007
  Cenario: Cadastro PJ Sucesso
    Dado Que clico no avatar de login
    E Clico na opção Cadastre-se
    Quando Preencho os dados basicos e senha "PJ" e realizo o cadastro
    Entao Login deve ser efetuado com sucesso e com iniciais "C"

  @LoginECadastro_008
  Cenario: Esqueci minha senha
    Dado Que clico no avatar de login
    Quando Clico na opcao esqueci minha senha e Preencho com um CPF
    Entao Deve aparecer uma mensagem de recuperacao de senha

  @LoginECadastro_009
  Cenario: Login social Google
    Dado Que clico no avatar de login
    Quando Clico na opcao de fazer login com google
    Entao Deve abrir uma janela para fazer login com google

  @LoginECadastro_010
  Cenario: Cadastro Com Dados Inválidos
    Dado Que clico no avatar de login
    E Clico na opção Cadastre-se
    Quando Preencho os dados basicos e senha "PF" invalidos e tento realizar o cadastro
    Entao Deve aparecer uma mensagem de dado invalido
