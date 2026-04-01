#language: pt

@PDP @Regressivo
Funcionalidade: PDP

  Contexto:
    Dado que estou no site camicado hml

  @PDP_001 
  Cenario: Seletores Fixos e Flutuantes
    Dado que pesquiso pelo produto "talher"
    Quando acesso o produto na posição "1" na lista de resultados de busca
    E devo ver a tela de PDP
    Entao devo ver o botao de quantidade
    E devo ver o botao de Adicionar a Sacola

  @PDP_002
  Cenario: Consulta de frete
    Dado que pesquiso pelo produto "faca"
    E acesso o produto na posição "1" na lista de resultados de busca
    E devo ver a tela de PDP
    Quando simulo o frete com CEP valido PDP
    Entao deve aparecer Frete Camicado Normal PDP

  @PDP_003 
  Cenario: Informacoes sobre o Produto
    Dado que pesquiso pelo produto "talher"
    Quando acesso o produto na posição "1" na lista de resultados de busca
    E devo ver a tela de PDP
    Entao valido as informações do produto

  @PDP_004 
  Cenario: Envio do Produto Para sacola
    Dado que pesquiso pelo produto "faca"
    E acesso o produto na posição "1" na lista de resultados de busca
    E devo ver a tela de PDP
    Quando Clico no icone de adicionar a sacola
    E Verifico se o produto foi adicionado a sacola
    E Removo o item da sacola
    Entao uma mensagem de sacola vazia deve aparecer

  @PDP_005
  Cenario: Vitrine Compre junto
    Dado que pesquiso pelo produto "taça"
    E acesso o produto na posição "1" na lista de resultados de busca
    Quando devo ver a tela de PDP
    Entao verifico que o menu comprar junto e apresentado na PDP

  @PDP_006
  Cenario: Validar que o clique em uma categoria ou subcategoria redireciona para a respectiva página Categoria do Produto
    Dado que pesquiso pelo produto "taça"
    E acesso o produto na posição "1" na lista de resultados de busca
    E devo ver a tela de PDP
    Quando clico na categoria do produto na PDP
    Então o sistema retorna para a pagina de produtos PDP

  @PDP_007 
  Cenario: Validar que a Categoria ou Subcategoria da Página Atual nao é Clicável Categoria do Produto
    Dado que pesquiso pelo produto "taça"
    Quando acesso o produto na posição "1" na lista de resultados de busca
    E devo ver a tela de PDP
    Então tento clicar na categoria anterior do produto na PDP

  @PDP_008 
  Cenario: Validar que o clique em uma categoria ou subcategoria redireciona para a respectiva página Categoria
    Dado que pesquiso pelo produto "taça"
    E acesso o produto na posição "1" na lista de resultados de busca
    E devo ver a tela de PDP
    Quando clico na categoria do produto na PDP
    Então o sistema retorna para a pagina de produtos PDP

  @PDP_009 
  Cenario: Validar que a Categoria ou Subcategoria da Página Atual nao é Clicável Categoria
    E que estou na pagina de categorias
    Dado que pesquiso pelo produto "taça"
    Quando acesso o produto na posição "1" na lista de resultados de busca
    E devo ver a tela de PDP
    Então tento clicar na categoria anterior do produto na PDP

  @PDP_010 
  Cenario: Validar que o clique em uma categoria ou subcategoria redireciona para a respectiva página Campanha
    E que estou na pagina de campanha
    Dado que pesquiso pelo produto "taça"
    E acesso o produto na posição "1" na lista de resultados de busca
    E devo ver a tela de PDP
    Quando clico na categoria do produto na PDP
    Então o sistema retorna para a pagina de produtos PDP

  @PDP_011 
  Cenario: Validar que a Categoria ou Subcategoria da Página Atual nao é Clicável Campanha
    E que estou na pagina de campanha
    Dado que pesquiso pelo produto "taça"
    Quando acesso o produto na posição "1" na lista de resultados de busca
    E devo ver a tela de PDP
    Então tento clicar na categoria anterior do produto na PDP

  @PDP_012 
  Cenario: Validar que o clique em uma categoria ou subcategoria redireciona para a respectiva página Departamento
    E que estou na pagina de departamento
    Dado que pesquiso pelo produto "taça"
    E acesso o produto na posição "1" na lista de resultados de busca
    E devo ver a tela de PDP
    Quando clico na categoria do produto na PDP
    Então o sistema retorna para a pagina de produtos PDP

  @PDP_013 
  Cenario: Validar que a Categoria ou Subcategoria da Página Atual nao é Clicável Departamento
    E que estou na pagina de departamento
    Dado que pesquiso pelo produto "taça"
    Quando acesso o produto na posição "1" na lista de resultados de busca
    E devo ver a tela de PDP
    Então tento clicar na categoria anterior do produto na PDP

  @PDP_014
  Cenario: Video na Galeria de Imagens -- Não Automatizável depende de criação de cenário em hml01
  @PDP_015
  Cenario: Produtos Agrupados -- Não Automatizável depende de ação humana em hml01