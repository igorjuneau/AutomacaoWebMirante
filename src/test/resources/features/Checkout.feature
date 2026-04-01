#language: pt

@Checkout @Regressivo
Funcionalidade: Checkout

  Contexto:
    Dado que estou no site camicado hml

  @Checkout_001
  Cenario: Finalizar pedido - 1P/Finalizao pedido Boleto
    E Que clico no avatar de login
    Quando Realizo login com e-mail e senha validos "PF"
    Entao Login deve ser efetuado com sucesso e com iniciais "BR"
    Dado Pesquiso um produto pela SKU "SKU1"
    E Acesso a PDP do primeiro produto
    E Adiciono o produto a sacola
    E Verifico se o produto foi adicionado a sacola
    E Finalizo a compra com Boleto
    Entao Pedido boleto deve ser finalizado com sucesso

  @Checkout_002
  Cenario: Finalizar pedido - 2P
    E Que clico no avatar de login
    Quando Realizo login com e-mail e senha validos "PF"
    Entao Login deve ser efetuado com sucesso e com iniciais "BR"
    Dado Pesquiso um produto pela SKU "SKU2"
    E Acesso a PDP do primeiro produto
    E Adiciono o produto a sacola
    E Verifico se o produto foi adicionado a sacola
    E Finalizo a compra com Boleto
    Entao Pedido boleto deve ser finalizado com sucesso

  @Checkout_003
  Cenario: Finalizar pedido - 1P +3P
    E Que clico no avatar de login
    Quando Realizo login com e-mail e senha validos "PF"
    Entao Login deve ser efetuado com sucesso e com iniciais "BR"
    Dado Pesquiso um produto pela SKU "SKU1"
    E Acesso a PDP do primeiro produto
    E Adiciono o produto a sacola
    E Pesquiso um produto pela SKU "SKU3"
    E Acesso a PDP do primeiro produto
    E Adiciono o produto a sacola
    E Verifico se o produto foi adicionado a sacola
    E Aumento a quantidade do primeiro para 3
    E Finalizo a compra com Boleto
    Entao Pedido boleto deve ser finalizado com sucesso

  @Checkout_004
  Cenario: Vale troca
    E Que clico no avatar de login
    Quando Realizo login com e-mail e senha validos "VT"
    Entao Login deve ser efetuado com sucesso e com iniciais "B"
    Dado Adiciono vale troca para o CPF "79965106000180" com valor "150"
    Dado Pesquiso um produto pela SKU "SKU1"
    E Acesso a PDP do primeiro produto
    E Adiciono o produto a sacola
    E Verifico se o produto foi adicionado a sacola
    E Finalizo a compra com Vale troca
    Entao Pedido VT deve ser finalizado com sucesso

  @Checkout_005
  Cenario: Cartao de credito
    E Que clico no avatar de login
    Quando Realizo login com e-mail e senha validos "VT"
    Entao Login deve ser efetuado com sucesso e com iniciais "B"
    Dado Pesquiso um produto pela SKU "SKU1"
    E Acesso a PDP do primeiro produto
    E Adiciono o produto a sacola
    E Verifico se o produto foi adicionado a sacola
    E Finalizo a compra com cartao de credito
    Entao Pedido deve ser finalizado com sucesso

  @Checkout_006
  Cenario: Finalizar pedido PIX
    E Que clico no avatar de login
    Quando Realizo login com e-mail e senha validos "PIX"
    Entao Login deve ser efetuado com sucesso e com iniciais "BP"
    Dado Pesquiso um produto pela SKU "SKU1"
    E Acesso a PDP do primeiro produto
    E Adiciono o produto a sacola
    E Verifico se o produto foi adicionado a sacola
    E Finalizo a compra com PIX
    Entao Pedido boleto deve ser finalizado com sucesso

  @Checkout_007
  Cenario: Validar fechamento de pedido pagando com Boleto
    E Que clico no avatar de login
    Quando Realizo login com e-mail e senha validos "PF"
    Entao Login deve ser efetuado com sucesso e com iniciais "BR"
    Dado Pesquiso um produto pela SKU "SKU1"
    E Acesso a PDP do primeiro produto
    E Adiciono o produto a sacola
    E Verifico se o produto foi adicionado a sacola
    E Finalizo a compra com Boleto
    Entao Pedido deve ser finalizado com sucesso

  @Checkout_008
  Cenario: Validar fechamento de pedido pagando com Pix
    E Que clico no avatar de login
    Quando Realizo login com e-mail e senha validos "PIX"
    Entao Login deve ser efetuado com sucesso e com iniciais "BP"
    Dado Pesquiso um produto pela SKU "SKU1"
    E Acesso a PDP do primeiro produto
    E Adiciono o produto a sacola
    E Verifico se o produto foi adicionado a sacola
    E Finalizo a compra com PIX
    Entao Pedido deve ser finalizado com sucesso

  @Checkout_009
  Cenario: Validar fechamento de pedido pagando com Cartão de Crédito
    E Que clico no avatar de login
    Quando Realizo login com e-mail e senha validos "VT"
    Entao Login deve ser efetuado com sucesso e com iniciais "B"
    Dado Pesquiso um produto pela SKU "SKU1"
    E Acesso a PDP do primeiro produto
    E Adiciono o produto a sacola
    E Verifico se o produto foi adicionado a sacola
    E Finalizo a compra com cartao de credito
    Entao Pedido deve ser finalizado com sucesso

  @Checkout_010
  Cenario: Validar fechamento de pedido pagando com Cartão de Crédito Salvo

  @Checkout_011
  Cenario: Validar fechamento de pedido pagando com Cartão mirante
    E Que clico no avatar de login
    Quando Realizo login com e-mail e senha validos "PF"
    Entao Login deve ser efetuado com sucesso e com iniciais "BR"
    Dado Pesquiso um produto pela SKU "SKU1"
    E Acesso a PDP do primeiro produto
    E Adiciono o produto a sacola
    E Verifico se o produto foi adicionado a sacola
    E Finalizo a compra com cartao de credito meu cartao
    Entao Pedido boleto deve ser finalizado com sucesso

  @Checkout_012
  Cenario: Validar fechamento de pedido pagando com Cartão mirante Salvo

  @Checkout_013
  Cenario: Validar fechamento de pedido pagando com Meu Cartão
    E Que clico no avatar de login
    Quando Realizo login com e-mail e senha validos "PF"
    Entao Login deve ser efetuado com sucesso e com iniciais "BR"
    Dado Pesquiso um produto pela SKU "SKU1"
    E Acesso a PDP do primeiro produto
    E Adiciono o produto a sacola
    E Verifico se o produto foi adicionado a sacola
    E Finalizo a compra com cartao de credito meu cartao
    Entao Pedido boleto deve ser finalizado com sucesso

  @Checkout_014
  Cenario: Validar fechamento de pedido pagando com Meu Cartão salvo

  @Checkout_015
  Cenario: Validar fechamento de pedido pagando com Vale Troca
    E Que clico no avatar de login
    Quando Realizo login com e-mail e senha validos "VT"
    Entao Login deve ser efetuado com sucesso e com iniciais "B"
    Dado Adiciono vale troca para o CPF "79965106000180" com valor "150"
    Dado Pesquiso um produto pela SKU "SKU1"
    E Acesso a PDP do primeiro produto
    E Adiciono o produto a sacola
    E Verifico se o produto foi adicionado a sacola
    E Finalizo a compra com Vale troca
    Entao Pedido VT deve ser finalizado com sucesso

  @Checkout_016
  Cenario: Validar fechamento de pedido pagando com Cartão Presente

  @Checkout_017
  Cenario: Validar fechamento de pedido pagando com Pix + Cartão Presente

  @Checkout_018
  Cenario: Validar fechamento de pedido pagando com Cartão de Crédito + Vale troca

  @Checkout_019
  Cenario: Validar fechamento de pedido pagando com Cartão mirante + Múltiplos vales troca

  @Checkout_020
  Cenario: Validar fechamento de pedido pagando com VT + CP + boleto

  @Checkout_021
  Cenario: Validar que se o usuário possuir Vale Troca a opção de pagar com Pix não é exibida

  @Checkout_022
  Cenario: Compra de produto 1P, forma de pagamento: Boleto
    E Que clico no avatar de login
    Quando Realizo login com e-mail e senha validos "PF"
    Entao Login deve ser efetuado com sucesso e com iniciais "BR"
    Dado Pesquiso um produto pela SKU "SKU1"
    E Acesso a PDP do primeiro produto
    E Adiciono o produto a sacola
    E Verifico se o produto foi adicionado a sacola
    E Finalizo a compra com Boleto
    Entao Pedido boleto deve ser finalizado com sucesso

  @Checkout_023
  Cenario: Compra de produto 1P, forma de pagamento: cartão de crédito
    E Que clico no avatar de login
    Quando Realizo login com e-mail e senha validos "VT"
    Entao Login deve ser efetuado com sucesso e com iniciais "B"
    Dado Pesquiso um produto pela SKU "SKU1"
    E Acesso a PDP do primeiro produto
    E Adiciono o produto a sacola
    E Verifico se o produto foi adicionado a sacola
    E Finalizo a compra com cartao de credito
    Entao Pedido VT deve ser finalizado com sucesso

  @Checkout_024
  Cenario: Compra de produto 1P, forma de pagamento: Meu Cartão
    E Que clico no avatar de login
    Quando Realizo login com e-mail e senha validos "PF"
    Entao Login deve ser efetuado com sucesso e com iniciais "BR"
    Dado Pesquiso um produto pela SKU "SKU1"
    E Acesso a PDP do primeiro produto
    E Adiciono o produto a sacola
    E Verifico se o produto foi adicionado a sacola
    E Finalizo a compra com cartao de credito meu cartao
    Entao Pedido boleto deve ser finalizado com sucesso


  @Checkout_025
  Cenario: Compra de produto 1P, forma de pagamento: Vale-Troca + Cartão de Crédito

  @Checkout_026
  Cenario: Compra de produto 2P, Forma de pagamento Boleto
    E Que clico no avatar de login
    Quando Realizo login com e-mail e senha validos "PF"
    Entao Login deve ser efetuado com sucesso e com iniciais "BR"
    Dado Pesquiso um produto pela SKU "SKU2"
    E Acesso a PDP do primeiro produto
    E Adiciono o produto a sacola
    E Verifico se o produto foi adicionado a sacola
    E Finalizo a compra com Boleto
    Entao Pedido boleto deve ser finalizado com sucesso

  @Checkout_027
  Cenario: Compra dos produtos: 1P e 3P, forma de pagamento: cartão de crédito
    E Que clico no avatar de login
    Quando Realizo login com e-mail e senha validos "PF"
    Entao Login deve ser efetuado com sucesso e com iniciais "BR"
    Dado Pesquiso um produto pela SKU "SKU1"
    E Acesso a PDP do primeiro produto
    E Adiciono o produto a sacola
    E Pesquiso um produto pela SKU "SKU3"
    E Acesso a PDP do primeiro produto
    E Adiciono o produto a sacola
    E Verifico se o produto foi adicionado a sacola
    E Aumento a quantidade do primeiro para 3
    E Finalizo a compra com cartao de credito
    Entao Pedido VT deve ser finalizado com sucesso

  @Checkout_028
  Cenario: Compra dos produtos: 1P e 3P, forma de pagamento: Meu Cartão
    E Que clico no avatar de login
    Quando Realizo login com e-mail e senha validos "PF"
    Entao Login deve ser efetuado com sucesso e com iniciais "BR"
    Dado Pesquiso um produto pela SKU "SKU1"
    E Acesso a PDP do primeiro produto
    E Adiciono o produto a sacola
    E Pesquiso um produto pela SKU "SKU3"
    E Acesso a PDP do primeiro produto
    E Adiciono o produto a sacola
    E Verifico se o produto foi adicionado a sacola
    E Aumento a quantidade do primeiro para 3
    E Finalizo a compra com cartao de credito meu cartao
    Entao Pedido boleto deve ser finalizado com sucesso

  @Checkout_029
  Cenario: Compra dos produtos: 1P e 3P, forma de pagamento: Vale-Troca + Meu Cartão

  @Checkout_030
  Cenario: Compra dos produtos: 1P e 3P, forma de pagamento: Boleto
    E Que clico no avatar de login
    Quando Realizo login com e-mail e senha validos "PF"
    Entao Login deve ser efetuado com sucesso e com iniciais "BR"
    Dado Pesquiso um produto pela SKU "SKU1"
    E Acesso a PDP do primeiro produto
    E Adiciono o produto a sacola
    E Pesquiso um produto pela SKU "SKU3"
    E Acesso a PDP do primeiro produto
    E Adiciono o produto a sacola
    E Verifico se o produto foi adicionado a sacola
    E Aumento a quantidade do primeiro para 3
    E Finalizo a compra com Boleto
    Entao Pedido boleto deve ser finalizado com sucesso

  @Checkout_031
  Cenario: Compra dos produtos: 1P , 3P e CP, forma de pagamento: cartão de crédito

  @Checkout_032
  Cenario: Compra dos produtos: 1P, 3P e CP, forma de pagamento: Meu Cartão

  @Checkout_033
  Cenario: Compra de CP, forma de pagamento: cartão de crédito

  @Checkout_034
  Cenario: Compra de CP, forma de pagamento: Meu Cartão

  @Checkout_035
  Cenario: Compra de 3P, forma de pagamento: cartão de crédito
    E Que clico no avatar de login
    Quando Realizo login com e-mail e senha validos "VT"
    Entao Login deve ser efetuado com sucesso e com iniciais "B"
    Dado Pesquiso um produto pela SKU "SKU3"
    E Acesso a PDP do primeiro produto
    E Adiciono o produto a sacola
    E Verifico se o produto foi adicionado a sacola
    E Finalizo a compra com cartao de credito
    Entao Pedido deve ser finalizado com sucesso

  @Checkout_036
  Cenario: Compra de 3P, forma de pagamento: Meu Cartão
    E Que clico no avatar de login
    Quando Realizo login com e-mail e senha validos "VT"
    Entao Login deve ser efetuado com sucesso e com iniciais "B"
    Dado Pesquiso um produto pela SKU "SKU3"
    E Acesso a PDP do primeiro produto
    E Adiciono o produto a sacola
    E Verifico se o produto foi adicionado a sacola
    E Finalizo a compra com cartao de credito meu cartao
    Entao Pedido deve ser finalizado com sucesso

  @Checkout_037
  Cenario: Compra de 3P, forma de pagamento: Vale-Troca + Cartão de Crédito

  @Checkout_038
  Cenario: Compra de produto de lista de presente, forma de pagamento: cartão de crédito

  @Checkout_039
  Cenario: Compra de produto de lista de presente, forma de pagamento: Vale-Troca + Cartão de Crédito

  @Checkout_040
  Cenario: Compra de produto, forma de pagamento: Vale-Troca + Cartão de Crédito

  @Checkout_041
  Cenario: Compra de produto , forma de pagamento: Vale-Troca
    E Que clico no avatar de login
    Quando Realizo login com e-mail e senha validos "VT"
    Entao Login deve ser efetuado com sucesso e com iniciais "B"
    Dado Adiciono vale troca para o CPF "79965106000180" com valor "150"
    Dado Pesquiso um produto pela SKU "SKU1"
    E Acesso a PDP do primeiro produto
    E Adiciono o produto a sacola
    E Verifico se o produto foi adicionado a sacola
    E Finalizo a compra com Vale troca
    Entao Pedido VT deve ser finalizado com sucesso

  @Checkout_042
  Cenario: Compra de produto , forma de pagamento: Pix
    E Que clico no avatar de login
    Quando Realizo login com e-mail e senha validos "PIX"
    Entao Login deve ser efetuado com sucesso e com iniciais "BP"
    Dado Pesquiso um produto pela SKU "SKU1"
    E Acesso a PDP do primeiro produto
    E Adiciono o produto a sacola
    E Verifico se o produto foi adicionado a sacola
    E Finalizo a compra com PIX
    Entao Pedido boleto deve ser finalizado com sucesso

  @Checkout_043
  Cenario: Validar múltiplos VTS (menor que o valor da compra) + cartão de crédito

  @Checkout_044
  Cenario: Validar múltiplos VTS (menor que o valor da compra) + Meu Cartão

  @Checkout_045
  Cenario: Validar único VT (menor que o valor da compra) + cartão de crédito

  @Checkout_046
  Cenario: Validar único VT (menor que o valor da compra) + Meu cartão

  @Checkout_047
  Cenario: Validar múltiplos CPs (menor que o valor da compra) + cartão de crédito

  @Checkout_048
  Cenario: Validar múltiplos CPs (menor que o valor da compra) + Meu Cartão

  @Checkout_049
  Cenario: Validar único CP (menor que o valor da compra) + cartão de crédito

  @Checkout_050
  Cenario: Validar único CP (menor que o valor da compra) + Meu cartão

  @Checkout_051
  Cenario: Validar modal de retirada em loja com localização ativa

  @Checkout_052
  Cenario: Validar modal de retirada em loja com localização desativada

  @Checkout_053
  Cenario: Validar busca dentro da modal de retirada em loja com localização ativa

  @Checkout_054
  Cenario: Validar busca dentro da modal de retirada em loja com localização desativada

  @Checkout_055
  Cenario: Validar regra de configuração da distancia de cada endereço apresentado na modal de retirada em loja

  @Checkout_056
  Cenario: Validar seleção da loja para retirada

  @Checkout_057
  Cenario: Validar atualização da modal ao alterar endereço de entrega

  @Checkout_058
  Cenario: Validar marcação e desmarcação do pin

  @Checkout_059
  Cenario: [NCKT] - Validar que é apresentado o titulo da pagina como endereço de cobrança para itens de lista de presente

  @Checkout_060
  Cenario: NCKT] - Validar que é apresentado o titulo da pagina como endereço de cobrança para itens de lista Experiencia

  @Checkout_061
  Cenario: Validar bandeira do cartão de crédito na confirmação do pedido - Visa
    E Que clico no avatar de login
    Quando Realizo login com e-mail e senha validos "VT"
    Entao Login deve ser efetuado com sucesso e com iniciais "B"
    Dado Pesquiso um produto pela SKU "SKU1"
    E Acesso a PDP do primeiro produto
    E Adiciono o produto a sacola
    E Verifico se o produto foi adicionado a sacola
    E Finalizo a compra com cartao de credito "visa"
    Entao Pedido deve ser finalizado com sucesso

  @Checkout_062
  Cenario: Validar bandeira do cartão de crédito - Visa
    E Que clico no avatar de login
    Quando Realizo login com e-mail e senha validos "VT"
    Entao Login deve ser efetuado com sucesso e com iniciais "B"
    Dado Pesquiso um produto pela SKU "SKU1"
    E Acesso a PDP do primeiro produto
    E Adiciono o produto a sacola
    E Verifico se o produto foi adicionado a sacola
    E Finalizo a compra com cartao de credito "visa"
    Entao Pedido deve ser finalizado com sucesso

  @Checkout_063
  Cenario: Validar bandeira do cartão de crédito na confirmação do pedido - Mastercard
    E Que clico no avatar de login
    Quando Realizo login com e-mail e senha validos "VT"
    Entao Login deve ser efetuado com sucesso e com iniciais "B"
    Dado Pesquiso um produto pela SKU "SKU1"
    E Acesso a PDP do primeiro produto
    E Adiciono o produto a sacola
    E Verifico se o produto foi adicionado a sacola
    E Finalizo a compra com cartao de credito "Master"
    Entao Pedido deve ser finalizado com sucesso

  @Checkout_064
  Cenario: Validar bandeira do cartão de crédito - Mastercard
    E Que clico no avatar de login
    Quando Realizo login com e-mail e senha validos "VT"
    Entao Login deve ser efetuado com sucesso e com iniciais "B"
    Dado Pesquiso um produto pela SKU "SKU1"
    E Acesso a PDP do primeiro produto
    E Adiciono o produto a sacola
    E Verifico se o produto foi adicionado a sacola
    E Finalizo a compra com cartao de credito "Master"
    Entao Pedido deve ser finalizado com sucesso

  @Checkout_065
  Cenario: Validar bandeira do cartão de crédito na confirmação do pedido - Hipercard
    E Que clico no avatar de login
    Quando Realizo login com e-mail e senha validos "VT"
    Entao Login deve ser efetuado com sucesso e com iniciais "B"
    Dado Pesquiso um produto pela SKU "SKU1"
    E Acesso a PDP do primeiro produto
    E Adiciono o produto a sacola
    E Verifico se o produto foi adicionado a sacola
    E Finalizo a compra com cartao de credito "Hiper"
    Entao Pedido deve ser finalizado com sucesso

  @Checkout_066
  Cenario: Validar bandeira do cartão de crédito - Hipercard
    E Que clico no avatar de login
    Quando Realizo login com e-mail e senha validos "VT"
    Entao Login deve ser efetuado com sucesso e com iniciais "B"
    Dado Pesquiso um produto pela SKU "SKU1"
    E Acesso a PDP do primeiro produto
    E Adiciono o produto a sacola
    E Verifico se o produto foi adicionado a sacola
    E Finalizo a compra com cartao de credito "Hiper"
    Entao Pedido deve ser finalizado com sucesso

  @Checkout_067
  Cenario: Validar bandeira do cartão de crédito na confirmação do pedido - Diners
    E Que clico no avatar de login
    Quando Realizo login com e-mail e senha validos "VT"
    Entao Login deve ser efetuado com sucesso e com iniciais "B"
    Dado Pesquiso um produto pela SKU "SKU1"
    E Acesso a PDP do primeiro produto
    E Adiciono o produto a sacola
    E Verifico se o produto foi adicionado a sacola
    E Finalizo a compra com cartao de credito "Diners"
    Entao Pedido deve ser finalizado com sucesso

  @Checkout_068
  Cenario: Validar bandeira do cartão de crédito - Diners
    E Que clico no avatar de login
    Quando Realizo login com e-mail e senha validos "VT"
    Entao Login deve ser efetuado com sucesso e com iniciais "B"
    Dado Pesquiso um produto pela SKU "SKU1"
    E Acesso a PDP do primeiro produto
    E Adiciono o produto a sacola
    E Verifico se o produto foi adicionado a sacola
    E Finalizo a compra com cartao de credito "Diners"
    Entao Pedido deve ser finalizado com sucesso

  @Checkout_069
  Cenario: Validar bandeira do cartão de crédito na confirmação do pedido - Discover
    E Que clico no avatar de login
    Quando Realizo login com e-mail e senha validos "VT"
    Entao Login deve ser efetuado com sucesso e com iniciais "B"
    Dado Pesquiso um produto pela SKU "SKU1"
    E Acesso a PDP do primeiro produto
    E Adiciono o produto a sacola
    E Verifico se o produto foi adicionado a sacola
    E Finalizo a compra com cartao de credito "Discover"
    Entao Pedido deve ser finalizado com sucesso

  @Checkout_070
  Cenario: Validar bandeira do cartão de crédito - Discover
    E Que clico no avatar de login
    Quando Realizo login com e-mail e senha validos "VT"
    Entao Login deve ser efetuado com sucesso e com iniciais "B"
    Dado Pesquiso um produto pela SKU "SKU1"
    E Acesso a PDP do primeiro produto
    E Adiciono o produto a sacola
    E Verifico se o produto foi adicionado a sacola
    E Finalizo a compra com cartao de credito "Discover"
    Entao Pedido deve ser finalizado com sucesso

  @Checkout_071
  Cenario: Validar bandeira do cartão de crédito na confirmação do pedido - Elo
    E Que clico no avatar de login
    Quando Realizo login com e-mail e senha validos "VT"
    Entao Login deve ser efetuado com sucesso e com iniciais "B"
    Dado Pesquiso um produto pela SKU "SKU1"
    E Acesso a PDP do primeiro produto
    E Adiciono o produto a sacola
    E Verifico se o produto foi adicionado a sacola
    E Finalizo a compra com cartao de credito "Elo"
    Entao Pedido deve ser finalizado com sucesso

  @Checkout_072
  Cenario: Validar bandeira do cartão de crédito - Elo
    E Que clico no avatar de login
    Quando Realizo login com e-mail e senha validos "VT"
    Entao Login deve ser efetuado com sucesso e com iniciais "B"
    Dado Pesquiso um produto pela SKU "SKU1"
    E Acesso a PDP do primeiro produto
    E Adiciono o produto a sacola
    E Verifico se o produto foi adicionado a sacola
    E Finalizo a compra com cartao de credito "Elo"
    Entao Pedido deve ser finalizado com sucesso


  @Checkout_073
  Cenario: Validar bandeira do cartão de crédito na confirmação do pedido - American express
    E Que clico no avatar de login
    Quando Realizo login com e-mail e senha validos "VT"
    Entao Login deve ser efetuado com sucesso e com iniciais "B"
    Dado Pesquiso um produto pela SKU "SKU1"
    E Acesso a PDP do primeiro produto
    E Adiciono o produto a sacola
    E Verifico se o produto foi adicionado a sacola
    E Finalizo a compra com cartao de credito "American"
    Entao Pedido deve ser finalizado com sucesso


  @Checkout_074
  Cenario: Validar bandeira do cartão de crédito - American express
    E Que clico no avatar de login
    Quando Realizo login com e-mail e senha validos "VT"
    Entao Login deve ser efetuado com sucesso e com iniciais "B"
    Dado Pesquiso um produto pela SKU "SKU1"
    E Acesso a PDP do primeiro produto
    E Adiciono o produto a sacola
    E Verifico se o produto foi adicionado a sacola
    E Finalizo a compra com cartao de credito "American"
    Entao Pedido deve ser finalizado com sucesso

  @Checkout_075
  Cenario: Validar bandeira do meu cartão com logo da visa na confirmação do pedido
    E Que clico no avatar de login
    Quando Realizo login com e-mail e senha validos "VT"
    Entao Login deve ser efetuado com sucesso e com iniciais "B"
    Dado Pesquiso um produto pela SKU "SKU1"
    E Acesso a PDP do primeiro produto
    E Adiciono o produto a sacola
    E Verifico se o produto foi adicionado a sacola
    E Finalizo a compra com cartao de credito "visa"
    Entao Pedido deve ser finalizado com sucesso

  @Checkout_076
  Cenario: Validar bandeira do meu cartão com logo da visa
    E Que clico no avatar de login
    Quando Realizo login com e-mail e senha validos "VT"
    Entao Login deve ser efetuado com sucesso e com iniciais "B"
    Dado Pesquiso um produto pela SKU "SKU1"
    E Acesso a PDP do primeiro produto
    E Adiciono o produto a sacola
    E Verifico se o produto foi adicionado a sacola
    E Finalizo a compra com cartao de credito "visa"
    Entao Pedido deve ser finalizado com sucesso

  @Checkout_077
  Cenario: Validar bandeira do meu cartão com logo da mastercard na confirmação do pedido
    E Que clico no avatar de login
    Quando Realizo login com e-mail e senha validos "VT"
    Entao Login deve ser efetuado com sucesso e com iniciais "B"
    Dado Pesquiso um produto pela SKU "SKU1"
    E Acesso a PDP do primeiro produto
    E Adiciono o produto a sacola
    E Verifico se o produto foi adicionado a sacola
    E Finalizo a compra com cartao de credito "Master"
    Entao Pedido deve ser finalizado com sucesso

  @Checkout_078
  Cenario: Validar bandeira do meu cartão com logo da mastercard
    E Que clico no avatar de login
    Quando Realizo login com e-mail e senha validos "VT"
    Entao Login deve ser efetuado com sucesso e com iniciais "B"
    Dado Pesquiso um produto pela SKU "SKU1"
    E Acesso a PDP do primeiro produto
    E Adiciono o produto a sacola
    E Verifico se o produto foi adicionado a sacola
    E Finalizo a compra com cartao de credito "Master"
    Entao Pedido deve ser finalizado com sucesso

  @Checkout_079
  Cenario: Validar ícone do cartão mirante na confirmação do pedido

  @Checkout_080
  Cenario: Validar ícone do cartão renner