#language: pt

@Home
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
