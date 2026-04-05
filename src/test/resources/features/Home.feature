#language: pt

@Home
Funcionalidade: Home

  Contexto:
    Dado que estou no site blogdoagi

  @Home_001
  Cenario: Buscar artigo sobre como declarar imposto de renda
    Dado que estou na tela de Home
    E clico na lupa de busca
    E digito Imposto de Renda no campo de busca
    Quando clico no artigo sobre o passo a passo do IR 2026
    Então a tela sobre do artigo é aberta

  @Home_002
  Cenario: Buscar artigo sobre pix parcelado
    Dado que estou na tela de Home
    E clico na lupa de busca
    E digito Pix Parcelado no campo de busca
    Quando clico no artigo sobre o pix parcelado como funcionara
    Então a tela sobre do artigo Pix é aberta

  @Home_003
  Cenario: Clicar em Produtos Emprestimos
    Dado que estou na tela de Home
    E clico no botao Produtos
    E clico no botao Emprestimos
    Quando clico no botao emprestimo consignado
    Então verifico que a tela de Emprestimos Consignados foi carregada com sucesso

  @Home_004
  Cenario: Verificar o Banner Tudo Sobre Emprestimo
    Dado que estou na tela de Home
    Quando rolo a tela para baixo 10x
    Então verifico que as tres imagens foram carregadas
