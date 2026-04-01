#language: pt

@Home @Regressivo
Funcionalidade: Home

  Contexto:
    Dado que estou no site camicado hml

  @Home_001
  Cenario: Banner com Duas Imagens
    Dado que estou na tela de Home
    Quando rolo a tela para baixo 5x
    Então verifico que a tela Home possui Banner com Duas Imagens

  @Home_002 
  Cenario: Banner com Cinco Imagens
    Dado que estou na tela de Home
    Quando rolo a tela para baixo 11x
    Então verifico que a tela Home possui Banner com Cinco Imagens

  @Home_003
  Cenario: Imagem Inválida
    Dado que estou na tela de Home
    Quando rolo a tela para baixo 11x
    Então verifico que existem imagens indisponíveis

  @Home_004 
  Cenario: Troca de banner para a Esquerda
    Dado que estou na tela de Home
    E rolo a tela para baixo 17x
    E encontro o Banner Servicos Exclusivos
    Quando clico no botão para mudar a imagem para Esquerda

  @Home_005 
  Cenario: Troca de banner para a Direita
    Dado que estou na tela de Home
    E rolo a tela para baixo 17x
    E encontro o Banner Servicos Exclusivos
    Quando clico no botão para mudar a imagem para Esquerda
    Então clico no botão para mudar a imagem para Direita

  @Home_006 
  Cenario: Header transparente e banner B2B
    Dado que estou na tela de Home

  @Home_007
  Cenario: Visualização dos demais banners da home
    Dado que estou na tela de Home
    Entao visualizo os Banners da Home

  @Home_008
  Cenario: Vitrine mais vendidos
    Dado que estou na tela de Home
    Quando rolo a tela para baixo 11x
    Entao encontro a Vitrine Mais Vendidos
