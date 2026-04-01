#language: pt

@Sacola2 @Regressivo
Funcionalidade: Sacola2

  Contexto:
    Dado que estou no site camicado hml
    E Que clico no avatar de login
    Quando Realizo login com e-mail e senha validos "PF"
    Entao Login deve ser efetuado com sucesso e com iniciais "BR"

  @Sacola_001
  Cenario: Adição de um produto que tenha 3 SKU's à sacola

  @Sacola_002
  Cenario: Favoritar produtos
    Dado que pesquiso pelo produto "talher"
    Quando Clico no botao favoritar item
    Entao verifico que o item foi favoritado
    E Clico no botao favoritar item

  @Sacola_003
  Cenario: Validar redirecionamento botão Avise-me Vitrine Sugestão

  @Sacola_004
  Cenario: Validar funcionalidade Vitrine Sugestão

  @Sacola_005
  Cenario: Validar redirecionamento botão Avise-me vitrine Lista Camicado

  @Sacola_006
  Cenario: Validar funcionalidade vitrine Lista Camicado

  @Sacola_007
  Cenario: Validar redirecionamento botão Avise-me Vitrine Favoritos

  @Sacola_008
  Cenario: Validar regra para apresentar vitrine Favoritos

  @Sacola_009
  Cenario: Validar funcionalidade Vitrine Favoritos
    Dado que estou na pagina Favoritos
    Entao verifico a vitrine de Favoritos

  @Sacola_010
  Cenario: Validar o resumo na “sacola” com produtos 1P e 3P

  @Sacola_012
  Cenario: Validar o resumo no “checkout” com produtos 1P e 3P

  @Sacola_013
  Cenario: Validar o resumo na “confirmação de pedido” com produtos 1P e 3P

  @Sacola_014
  Cenario: Validar o resumo na “sacola” com produtos 1P, 3P e CP

  @Sacola_015
  Cenario: Validar o resumo na “checkout” com produtos 1P, 3P e CP

  @Sacola_016
  Cenario: Validar o resumo na “confirmação de pedido” com produtos 1P, 3P e CP

  @Sacola_017
  Cenario: Validar o resumo na “sacola” com produtos 1P e 3P e “cupom de desconto de frete”

  @Sacola_018
  Cenario: Validar o resumo na “checkout” com produtos 1P e 3P e “cupom de desconto de frete”

  @Sacola_019
  Cenario: Validar o resumo na “confirmação do pedido” com produtos 1P e 3P e “cupom de desconto de frete”

  @Sacola_020
  Cenario: Validar o resumo na “sacola” com produtos 1P e 3P e “cashback”

  @Sacola_021
  Cenario: Validar o resumo na “checkout” com produtos 1P e 3P e “cashback”

  @Sacola_022
  Cenario: Validar o resumo na “confirmação do pedido” com produtos 1P e 3P e “cashback”

  @Sacola_023
  Cenario: Validar o resumo na “sacola” com produtos 1P e 3P e “régua de frete”

  @Sacola_024
  Cenario: Validar o resumo na “checkout” com produtos 1P e 3P e “régua de frete”

  @Sacola_025
  Cenario: Validar o resumo na “confirmação do pedido” com produtos 1P e 3P e “régua de frete”

  @Sacola_026
  Cenario: Validar o resumo na “sacola” com produtos 1P e 3P na “Loja Interna"

  @Sacola_027
  Cenario: Validar o resumo na “checkout” com produtos 1P e 3P na “Loja Interna"

  @Sacola_028
  Cenario: Validar o resumo na “confirmação do pedido” com produtos 1P e 3P na “Loja Interna"

  @Sacola_029
  Cenario: Validar o resumo na “sacola” com produtos 1P e 3P e “B2B"

  @Sacola_030
  Cenario: Validar o resumo na “checkout” com produtos 1P e 3P e “B2B"

  @Sacola_031
  Cenario: Validar o resumo na “confirmação do pedido” com produtos 1P e 3P e “B2B"

  @Sacola_032
  Cenario: Validar o resumo na “sacola” com produtos 1P e 3P e “Intelipost"

  @Sacola_033
  Cenario: Validar o resumo na “checkout” com produtos 1P e 3P e “Intelipost"

  @Sacola_034
  Cenario: Validar o resumo na “checkout” com produtos 1P e 3P e “Intelipost"

  @Sacola_035
  Cenario: Validar o modal de sacola vazia pelo botão "voltar para home"
    Dado que acesso a sacola
    E verifico que a sacola esta vazia
    Quando seleciono o icone de Home
    Então verifico que estou na tela de Home

  @Sacola_036
  Cenario: Validar o modal de sacola vazia pelo fechar da modal "X"

  @Sacola_037
  Cenario: Validar o fechamento da modal de sacola vazia clicando fora da modal

  @Sacola_038
  Cenario: Banner editorial Compre Junto
    Dado que pesquiso pelo produto "taça"
    E acesso o produto na posição "1" na lista de resultados de busca
    Quando devo ver a tela de PDP
    Entao verifico que o menu comprar junto e apresentado na PDP

  @Sacola_039
  Cenario: Banner Destaque Compre Junto
    Dado que pesquiso pelo produto "taça"
    E acesso o produto na posição "1" na lista de resultados de busca
    Quando devo ver a tela de PDP
    Entao verifico que o menu comprar junto e apresentado na PDP
    E as imagens em destaque sao apresentadas no banner