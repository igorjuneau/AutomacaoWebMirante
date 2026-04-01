#language: pt

@InformCashback @Regressivo @local
Funcionalidade: InformCashback

  Contexto:
    Dado que estou no site camicado hml

  @InformCashback_001
  Cenario: Validar a exibição do informativo de cashback em todos os status de pedidos 1P realizados com meios de pagamentos válidos para acúmulo
    
  @InformCashback_002
  Cenario: Validar a exibição do informativo de cashback em todos os status de pedidos mistos realizados com meios de pagamentos válidos para acúmulo
    
  @InformCashback_003
  Cenario: Validar a exibição do informativo de cashback em todos os status de pedidos Awin realizados com meios de pagamentos válidos para acúmulo
    
  @InformCashback_004
  Cenario: Validar que o clique no botão "Consultar regras de Cashback” redireciona para url cadastrada
    
  @InformCashback_005
  Cenario: Validar que ao desativar a flag geral de acúmulo, após o fechamento do pedido, o informativo de cashback deverá ser exibido
    
  @InformCashback_006
  Cenario: Validar a não exibição do informativo de cashback para pedidos não elegíveis a acúmulo de cashback
    
  @InformCashback_007
  Cenario: Validar a não exibição do informativo de cashback para pedidos cancelados
    
  @InformCashback_008
  Cenario: Validar a não exibição do informativo de cashback para pedidos cancelados

  @InformCashback_009
  Cenario: Validar que ao desativar a flag geral de acúmulo o informativo de cashback não será exibido nos detalhes do pedido





