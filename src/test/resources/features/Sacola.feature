#language: pt

@Sacola @Regressivo
Funcionalidade: Sacola

  Contexto:
    Dado que estou no site camicado hml
    E Que clico no avatar de login
    Quando Realizo login com e-mail e senha validos "PF"
    Entao Login deve ser efetuado com sucesso e com iniciais "BR"

  @Sacola_001
  Cenario: Consultar frete por CEP
    Dado que pesquiso pelo produto "talher"
    E acesso o produto na posição "1" na lista de resultados de busca
    E devo ver a tela de PDP
    E Clico no icone de adicionar a sacola
    E Verifico se o produto foi adicionado a sacola
    Quando simulo o frete com CEP valido
    Entao deve aparecer Frete Camicado Normal
    E Removo o item da sacola
    Entao uma mensagem de sacola vazia deve aparecer

  @Sacola_002
  Cenario: Adicionar um item na sacola
    Dado que pesquiso pelo produto "talher"
    E acesso o produto na posição "1" na lista de resultados de busca
    E devo ver a tela de PDP
    E Clico no icone de adicionar a sacola
    E Verifico se o produto foi adicionado a sacola
    E Removo o item da sacola
    Entao uma mensagem de sacola vazia deve aparecer

  @Sacola_003
  Cenario: Excluir um item da sacola
    Dado que pesquiso pelo produto "talher"
    E acesso o produto na posição "1" na lista de resultados de busca
    E devo ver a tela de PDP
    E Clico no icone de adicionar a sacola
    E Verifico se o produto foi adicionado a sacola
    Quando Removo o item da sacola
    Entao uma mensagem de sacola vazia deve aparecer

  @Sacola_004
  Cenario: Diferentes métodos de entrega
    Dado que pesquiso pelo produto "talher"
    E acesso o produto na posição "1" na lista de resultados de busca
    E devo ver a tela de PDP
    E Clico no icone de adicionar a sacola
    E Verifico se o produto foi adicionado a sacola
    E clico em continuar
    Quando seleciono o frete expresso
    E clico para ir para pagamento
    Entao deve aparecer o frete expresso no resumo da compra
    E volto para a sacola
    E Removo o item da sacola
    Entao uma mensagem de sacola vazia deve aparecer

  @Sacola_005
  Cenario: Cotação de Entrega Frete Normal
    Dado que pesquiso pelo produto "talher"
    E acesso o produto na posição "1" na lista de resultados de busca
    E devo ver a tela de PDP
    E Clico no icone de adicionar a sacola
    E Verifico se o produto foi adicionado a sacola
    E clico em continuar
    Quando seleciono o frete normal
    E clico para ir para pagamento
    Entao deve aparecer o frete normal no resumo da compra
    E volto para a sacola
    E Removo o item da sacola
    Entao uma mensagem de sacola vazia deve aparecer

  @Sacola_006
  Cenario: Cotação de Entrega Frete Expresso
    Dado que pesquiso pelo produto "talher"
    E acesso o produto na posição "1" na lista de resultados de busca
    E devo ver a tela de PDP
    E Clico no icone de adicionar a sacola
    E Verifico se o produto foi adicionado a sacola
    E clico em continuar
    Quando seleciono o frete expresso
    E clico para ir para pagamento
    Entao deve aparecer o frete escolhido no resumo da compra
    E volto para a sacola
    E Removo o item da sacola
    Entao uma mensagem de sacola vazia deve aparecer

  @Sacola_007
  Cenario: Adicionar Produtos na Sacola e Atingir o Frete Grátis
    Dado que pesquiso pelo produto "talher"
    E acesso o produto na posição "1" na lista de resultados de busca
    E devo ver a tela de PDP
    E Clico no icone de adicionar a sacola
    E Verifico se o produto foi adicionado a sacola
    E verifico que obtive frete gratis
    E Removo o item da sacola
    Entao uma mensagem de sacola vazia deve aparecer

  @Sacola_008
  Cenario: Adicionar Produtos na Sacola e Aumentar a Quantidade até Atingir o Frete Grátis
    Dado que pesquiso pelo produto "talher"
    E acesso o produto na posição "1" na lista de resultados de busca
    E devo ver a tela de PDP
    Quando Clico no botao comprar item
    E Verifico se o produto foi adicionado a sacola
    E Clico no icone de adicionar mais unidades do produto na sacola
    E verifico que obtive frete gratis
    E Removo o item da sacola
    Entao uma mensagem de sacola vazia deve aparecer

  @Sacola_009
  Cenario: Adicionar Produtos na Sacola e não Atingir o Frete Grátis
    Dado que pesquiso pelo produto "talher"
    E acesso o produto na posição "1" na lista de resultados de busca
    E devo ver a tela de PDP
    Quando Clico no botao comprar item
    E Verifico se o produto foi adicionado a sacola
    E verifico que nao obtive frete gratis
    E Removo o item da sacola
    Entao uma mensagem de sacola vazia deve aparecer

  @Sacola_010
  Cenario: Ver Regras Para Atingir o Frete Grátis
    Dado que pesquiso pelo produto "talher"
    E acesso o produto na posição "1" na lista de resultados de busca
    E devo ver a tela de PDP
    Quando Clico no botao comprar item
    E Verifico se o produto foi adicionado a sacola
    E verifico as regras para o frete gratis
    E Removo o item da sacola
    Entao uma mensagem de sacola vazia deve aparecer

  @Sacola_011
  Cenario: Cotação de Entrega Frete Agendado
    Dado que pesquiso pelo produto "talher"
    E acesso o produto na posição "1" na lista de resultados de busca
    E devo ver a tela de PDP
    E Clico no icone de adicionar a sacola
    E Verifico se o produto foi adicionado a sacola
    E clico em continuar
    Quando seleciono o frete agendado
    E clico para ir para pagamento
    Entao deve aparecer o frete escolhido no resumo da compra
    E volto para a sacola
    E Removo o item da sacola
    Entao uma mensagem de sacola vazia deve aparecer

  @Sacola_012
  Cenario: Cotação de Entrega Retire em Loja
    Dado que pesquiso pelo produto "talher"
    E acesso o produto na posição "1" na lista de resultados de busca
    E devo ver a tela de PDP
    E Clico no icone de adicionar a sacola
    E Verifico se o produto foi adicionado a sacola
    E clico em continuar
    Quando seleciono retire em loja
    E clico para ir para pagamento
    Entao deve aparecer o frete escolhido no resumo da compra
    E volto para a sacola
    E Removo o item da sacola
    Entao uma mensagem de sacola vazia deve aparecer

  @Sacola_013
  Cenario: Validar valores no resumo exibido na Sacola / Entrega
    Dado que pesquiso pelo produto "talher"
    E acesso o produto na posição "1" na lista de resultados de busca
    E devo ver a tela de PDP
    E Clico no icone de adicionar a sacola
    E Verifico se o produto foi adicionado a sacola
    E clico em continuar
    Quando seleciono o frete normal
    E clico para ir para pagamento
    Entao devem aparecer os valores no resumo da compra
    E volto para a sacola
    E Removo o item da sacola
    Entao uma mensagem de sacola vazia deve aparecer

  @Sacola_014
  Cenario: Validar informações de cashback exibido na Sacola / Entrega
    Dado que pesquiso pelo produto "talher"
    E acesso o produto na posição "1" na lista de resultados de busca
    E devo ver a tela de PDP
    E Clico no icone de adicionar a sacola
    E Verifico se o produto foi adicionado a sacola
    E clico em continuar
    Quando seleciono o frete normal
    E clico para ir para pagamento
    Entao deve aparecer a informacao de cashback no resumo da compra
    E volto para a sacola
    E Removo o item da sacola
    Entao uma mensagem de sacola vazia deve aparecer

  @Sacola_015
  Cenario: Validar aplicação de cupom na Sacola / Entrega

  @Sacola_016
  Cenario: Validar valor de produto em promoção na Sacola / Entrega

  @Sacola_017
  Cenario: Validar adição de endereço na tela de Entrega
    Dado que pesquiso pelo produto "talher"
    E acesso o produto na posição "1" na lista de resultados de busca
    E devo ver a tela de PDP
    E Clico no icone de adicionar a sacola
    E Verifico se o produto foi adicionado a sacola
    E clico em continuar
    Quando clico em adicionar novo endereco
    Entao verifico que a tela de adicao de endereco esta disponivel
    E Removo o item da sacola
    E uma mensagem de sacola vazia deve aparecer

  @Sacola_018
  Cenario: Validar edição de endereço na tela de Entrega
    Dado que pesquiso pelo produto "talher"
    E acesso o produto na posição "1" na lista de resultados de busca
    E devo ver a tela de PDP
    E Clico no icone de adicionar a sacola
    E Verifico se o produto foi adicionado a sacola
    E clico em continuar
    Quando clico em editar endereco
    Entao verifico que a tela de edicao de endereco esta disponivel
    E Removo o item da sacola
    E uma mensagem de sacola vazia deve aparecer

  @Sacola_019
  Cenario: Validar endereço principal na tela de Entrega
    Dado que pesquiso pelo produto "talher"
    E acesso o produto na posição "1" na lista de resultados de busca
    E devo ver a tela de PDP
    E Clico no icone de adicionar a sacola
    E Verifico se o produto foi adicionado a sacola
    Quando clico em continuar
    Entao verifico que o endereco principal nao tem o icone excluir
    E Removo o item da sacola
    E uma mensagem de sacola vazia deve aparecer

  @Sacola_020
  Cenario: Régua do Frete Ver regras
    Dado que pesquiso pelo produto "talher"
    E acesso o produto na posição "1" na lista de resultados de busca
    E devo ver a tela de PDP
    Quando Clico no botao comprar item
    E Verifico se o produto foi adicionado a sacola
    E verifico as regras para o frete gratis
    E Removo o item da sacola
    Entao uma mensagem de sacola vazia deve aparecer

  @Sacola_021
  Cenario: Entrar para comprar com 1 click

  @Sacola_022
  Cenario: Validar funcionamento de compra rápida

  @Sacola_023
  Cenario: Continuar comprando produtos da lista de presente

  @Sacola_024
  Cenario: Continuar comprando produtos da lista de favoritos
    Dado que estou na pagina Favoritos
    Quando clico no primeiro produto da tela
    E Clico no icone de adicionar a sacola
    Entao Verifico se o produto foi adicionado a sacola
    E Removo o item da sacola
    E uma mensagem de sacola vazia deve aparecer

  @Sacola_025
  Cenario: Continuar comprando produtos marketplace
    E que estou na pagina de MarketPlace
    Dado que pesquiso pelo produto "taça"
    Quando acesso o produto na posição "1" na lista de resultados de busca
    E devo ver a tela de PDP
    Então tento clicar na categoria anterior do produto na PDP

  @Sacola_026
  Cenario: Continuar comprando CP

  @Sacola_027
  Cenario: Continuar comprando produtos da página "Home" em que foi direcionado
    Dado que pesquiso pelo produto "talher"
    E acesso o produto na posição "1" na lista de resultados de busca
    E devo ver a tela de PDP
    Quando Clico no icone de adicionar a sacola
    E Verifico se o produto foi adicionado a sacola
    E Removo o item da sacola
    Entao uma mensagem de sacola vazia deve aparecer

  @Sacola_028
  Cenario: Continuar comprando produtos da página "Busca" em que foi direcionado
    Dado que pesquiso pelo produto "talher"
    E acesso o produto na posição "1" na lista de resultados de busca
    E devo ver a tela de PDP
    Quando Clico no icone de adicionar a sacola
    E Verifico se o produto foi adicionado a sacola
    E Removo o item da sacola
    Entao uma mensagem de sacola vazia deve aparecer

  @Sacola_029
  Cenario: Continuar comprando produtos da página "Categoria" em que foi direcionado
    E que estou na pagina de categorias
    Dado que pesquiso pelo produto "talher"
    Quando acesso o produto na posição "1" na lista de resultados de busca
    E devo ver a tela de PDP
    Quando Clico no icone de adicionar a sacola
    E Verifico se o produto foi adicionado a sacola
    E Removo o item da sacola
    Entao uma mensagem de sacola vazia deve aparecer

  @Sacola_030
  Cenario: Continuar comprando produtos da vitrine
    Dado que estou na tela de Home
    Quando rolo a tela para baixo 11x
    Entao encontro a Vitrine Mais Vendidos
    Quando clico no primeiro produto da vitrine
    E Clico no icone de adicionar a sacola
    Entao Verifico se o produto foi adicionado a sacola
    E Removo o item da sacola
    E uma mensagem de sacola vazia deve aparecer

  @Sacola_031
  Cenario: Continuar comprando produto Camicado
    Dado que pesquiso pelo produto "talher"
    E acesso o produto na posição "1" na lista de resultados de busca
    E devo ver a tela de PDP
    E Clico no icone de adicionar a sacola
    Entao Verifico se o produto foi adicionado a sacola
    Quando que pesquiso pelo produto "talher"
    E acesso o produto na posição "1" na lista de resultados de busca
    E devo ver a tela de PDP
    E Clico no icone de adicionar a sacola
    E clico em continuar
    E seleciono o frete normal
    E clico para ir para pagamento
    Entao devem aparecer os valores no resumo da compra
    E volto para a sacola
    Quando Removo o item da sacola
    Entao uma mensagem de sacola vazia deve aparecer

  @Sacola_032
  Cenario:Validar pedido MKT + Camicado

  @Sacola_033
  Cenario:Validar pedido CP + MKT

  @Sacola_034
  Cenario:Validar pedido CP + Camicado

  @Sacola_035
  Cenario:Validar pedido lista de presente (produto)

  @Sacola_036
  Cenario:Validar pedido MKT + CP + Camicado

  @Sacola_037
  Cenario:Validar pedido lista de presente (experiência)

  @Sacola_038
  Cenario:Validar pedido MKT

  @Sacola_039
  Cenario:Validar pedido Camicado + CP

  @Sacola_040
  Cenario:Validar pedido Camicado

  @Sacola_041
  Cenario:Validar pedido de lista de presente (produto) como anfitrião

  @Sacola_042
  Cenario:Validar pedido de lista de presente (experiência) como anfitrião

  @Sacola_043
  Cenario:Validar pedido CP