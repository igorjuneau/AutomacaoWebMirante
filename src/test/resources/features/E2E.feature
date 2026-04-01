#language: pt

@E2E @Regressivo
Funcionalidade: E2E

  Contexto:
    Dado que estou no site camicado hml

  @E2E_001
  Cenario: Validar criação de lista de presentes

  @E2E_002
  Cenario: Validar busca por lista de presentes existente

  @E2E_003
  Cenario: Fluxo de compra 1P de Entrega Normal Crédito parcelado

  @E2E_004
  Cenario: Fluxo de compra 3P de Entrega Normal Crédito parcelado

  @E2E_005
  Cenario: Fluxo de compra gerando Cashback

  @E2E_006
  Cenario: Fluxo de compra 1P de Entrega Normal PIX
    E Que clico no avatar de login
    Quando Realizo login com e-mail e senha validos "PIX"
    Entao Login deve ser efetuado com sucesso e com iniciais "BP"
    Dado Pesquiso um produto pela SKU "SKU1"
    E Acesso a PDP do primeiro produto
    E Adiciono o produto a sacola
    E Verifico se o produto foi adicionado a sacola
    E clico em continuar
    Quando seleciono o frete normal
    E clico para ir para pagamento
    Entao deve aparecer o frete normal no resumo da compra
    E Finalizo a compra com PIX
    E Pedido boleto deve ser finalizado com sucesso

  @E2E_007
  Cenario: Fluxo de compra 1P de Entrega Normal Vale troca
    E Que clico no avatar de login
    Quando Realizo login com e-mail e senha validos "PIX"
    Entao Login deve ser efetuado com sucesso e com iniciais "BP"
    Dado Pesquiso um produto pela SKU "SKU1"
    E Acesso a PDP do primeiro produto
    E Adiciono o produto a sacola
    E Verifico se o produto foi adicionado a sacola
    E clico em continuar
    Quando seleciono o frete normal
    E clico para ir para pagamento
    Entao deve aparecer o frete normal no resumo da compra
    E Finalizo a compra com Vale troca
    E Pedido VT deve ser finalizado com sucesso

  @E2E_008
  Cenario: Fluxo de compra 1P de Entrega Normal Boleto
    E Que clico no avatar de login
    Quando Realizo login com e-mail e senha validos "PIX"
    Entao Login deve ser efetuado com sucesso e com iniciais "BP"
    Dado Pesquiso um produto pela SKU "SKU1"
    E Acesso a PDP do primeiro produto
    E Adiciono o produto a sacola
    E Verifico se o produto foi adicionado a sacola
    E clico em continuar
    Quando seleciono o frete normal
    E clico para ir para pagamento
    Entao deve aparecer o frete normal no resumo da compra
    E Finalizo a compra com Boleto
    E Pedido boleto deve ser finalizado com sucesso

  @E2E_009
  Cenario: Fluxo de compra 1P de Entrega Normal Cartão Renner
    E Que clico no avatar de login
    Quando Realizo login com e-mail e senha validos "PF"
    Entao Login deve ser efetuado com sucesso e com iniciais "BR"
    Dado Pesquiso um produto pela SKU "SKU1"
    E Acesso a PDP do primeiro produto
    E Adiciono o produto a sacola
    E Verifico se o produto foi adicionado a sacola
    E Finalizo a compra com cartao Renner
    Entao Pedido deve ser finalizado com sucesso

  @E2E_010
  Cenario: Fluxo de compra 1P de Entrega Normal Meu Cartão
    E Que clico no avatar de login
    Quando Realizo login com e-mail e senha validos "PIX"
    Entao Login deve ser efetuado com sucesso e com iniciais "BP"
    Dado Pesquiso um produto pela SKU "SKU1"
    E Acesso a PDP do primeiro produto
    E Adiciono o produto a sacola
    E Verifico se o produto foi adicionado a sacola
    E clico em continuar
    Quando seleciono o frete normal
    E clico para ir para pagamento
    Entao deve aparecer o frete normal no resumo da compra
    E Finalizo a compra com cartao de credito
    E Pedido deve ser finalizado com sucesso

  @E2E_011
  Cenario:Fluxo de compra de pedido misto
    E Que clico no avatar de login
    Quando Realizo login com e-mail e senha validos "PF"
    Entao Login deve ser efetuado com sucesso e com iniciais "BR"
    Dado Pesquiso um produto pela SKU "SKU1"
    E Acesso a PDP do primeiro produto
    E Adiciono o produto a sacola
    E Pesquiso um produto pela SKU "SKU2"
    E Acesso a PDP do primeiro produto
    E Adiciono o produto a sacola
    E Pesquiso um produto pela SKU "SKU3"
    E Acesso a PDP do primeiro produto
    E Adiciono o produto a sacola
    E Verifico se o produto foi adicionado a sacola
    E Aumento a quantidade do primeiro para 3
    E Finalizo a compra com Boleto
    Entao Pedido boleto deve ser finalizado com sucesso

  @E2E_012
  Cenario: Comprar presente de Lista e resgatar o valor do produto

  @E2E_013
  Cenario: Comprar presente de Lista e entregar o produto na loja

  @E2E_014
  Cenario: Comprar presente de Lista e entregar o produto no endereço do cliente


