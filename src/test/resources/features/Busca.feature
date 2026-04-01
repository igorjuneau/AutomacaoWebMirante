#language: pt

@Busca @Regressivo
Funcionalidade: Busca

  Contexto:
    Dado que estou no site camicado hml

  @Busca_001
  Cenario: Visualizar e clique em produtos sugeridos no campo de busca na pagina Home
    Quando Clico na lupa de busca
    Entao Clico no primeiro produto na sugestao

  @Busca_002
  Cenario: Realizar busca de termo invalido pelo botao buscar na pagina Home
    Quando Pesquiso no input da busca "termo inexistente" e pressiono enter
    Então Verifico se a busca retorna mensagem de termo invalido

  @Busca_003
  Cenario: Realizar busca com enter na pagina Home
    Quando Pesquiso no input da busca "sku1" e pressiono enter
    E Acesso a PDP do primeiro produto
    Então Verifico se fui redirecionado para PDP

  @Busca_004
  Cenario: Realizar busca pelo botao buscar na pagina Home
    Quando Pesquiso no input da busca "sku1" e clico na lupa
    E Acesso a PDP do primeiro produto
    Então Verifico se fui redirecionado para PDP

  @Busca_005
  Cenario: Visualizar e clique em categorias sugeridas no campo de busca na pagina Home
    Quando Pesquiso no input da busca "panela" e clico na lupa
    E clico no botao filtrar
    Entao clico em categorias

  @Busca_006
  Cenario: Visualizar e clique no botao ver mais categorias sugeridas no campo de busca na pagina Home
    Quando Pesquiso no input da busca "panela" e clico na lupa
    E clico no botao filtrar
    Entao clico em categorias

  @Busca_007
  Cenario: Visualizar e clique em produtos sugeridos no campo de busca na pagina Busca
    Quando Clico na lupa de busca
    E visualizo as Sugestoes de produtos
    Então Clico no primeiro produto na sugestao

  @Busca_008
  Cenario: Realizar busca de termo invalido pelo botao buscar na pagina Busca
    Quando Clico na lupa de busca
    E Pesquiso no input da busca "combustivel" e pressiono enter
    Entao Verifico se a busca retorna mensagem de termo invalido

  @Busca_009
  Cenario: Realizar busca com enter na pagina Busca
    Quando Clico na lupa de busca
    E Pesquiso no input da busca "panela" e pressiono enter
    E Acesso a PDP do primeiro produto
    Então Verifico se fui redirecionado para PDP

  @Busca_010
  Cenario: Realizar busca pelo botao buscar na pagina Busca
    Quando Clico na lupa de busca
    E Pesquiso no input da busca "faca" e clico na lupa
    E Acesso a PDP do primeiro produto
    Então Verifico se fui redirecionado para PDP

  @Busca_011
  Cenario: Visualizar e clique em categorias sugeridas no campo de busca na pagina Busca
    Quando Clico na lupa de busca
    E Pesquiso no input da busca "panela" e clico na lupa
    E clico no botao filtrar
    Entao clico em categorias

  @Busca_012
  Cenario: Visualizar e clique em produtos sugeridos no campo de busca na pagina PDP
    Quando Pesquiso no input da busca "panela" e clico na lupa
    E Acesso a PDP do primeiro produto
    E Verifico se fui redirecionado para PDP
    E Clico na lupa de busca
    E visualizo as Sugestoes de produtos
    Então Clico no primeiro produto na sugestao

  @Busca_013
  Cenario: Realizar busca pelo botao buscar na pagina PDP
    Quando Pesquiso no input da busca "panela" e clico na lupa
    E Acesso a PDP do primeiro produto
    E Verifico se fui redirecionado para PDP
    Quando Pesquiso no input da busca "faca" e clico na lupa
    E Acesso a PDP do primeiro produto
    Então Verifico se fui redirecionado para PDP

  @Busca_014
  Cenario: Realizar busca de termo invalido pelo botao buscar na pagina PDP
    Quando Pesquiso no input da busca "panela" e clico na lupa
    E Acesso a PDP do primeiro produto
    E Verifico se fui redirecionado para PDP
    Quando Pesquiso no input da busca "combustivel" e pressiono enter
    Entao Verifico se a busca retorna mensagem de termo invalido

  @Busca_015
  Cenario: Realizar busca com enter na pagina PDP
    Quando Pesquiso no input da busca "panela" e clico na lupa
    E Acesso a PDP do primeiro produto
    E Verifico se fui redirecionado para PDP
    Quando Pesquiso no input da busca "panela" e pressiono enter
    E Acesso a PDP do primeiro produto
    Então Verifico se fui redirecionado para PDP

  @Busca_016
  Cenario: Visualizar e clique em categorias sugeridas no campo de busca na pagina PDP
    Quando Pesquiso no input da busca "panela" e clico na lupa
    E Acesso a PDP do primeiro produto
    E Verifico se fui redirecionado para PDP
    Quando Pesquiso no input da busca "panela" e clico na lupa
    E clico no botao filtrar
    Entao clico em categorias

  @Busca_017
  Cenario: Visualizar e clique no botao ver mais categorias sugeridas no campo de busca na pagina PDP
    Quando Pesquiso no input da busca "panela" e clico na lupa
    E Acesso a PDP do primeiro produto
    E Verifico se fui redirecionado para PDP
    Quando Pesquiso no input da busca "panela" e clico na lupa
    E clico no botao filtrar
    Entao clico em categorias

  @Busca_018
  Cenario: Visualizar e clique em produtos sugeridos no campo de busca na pagina Campanha
    E que estou na pagina de campanha
    Quando Clico na lupa de busca
    E visualizo as Sugestoes de produtos
    Então Clico no primeiro produto na sugestao

  @Busca_019
  Cenario: Realizar busca com enter na pagina Campanha
    E que estou na pagina de campanha
    Quando Pesquiso no input da busca "panela" e pressiono enter
    E Acesso a PDP do primeiro produto
    Então Verifico se fui redirecionado para PDP

  @Busca_020
  Cenario: Realizar busca de termo invalido pelo botao buscar na pagina Campanha
    E que estou na pagina de campanha
    Quando Pesquiso no input da busca "combustivel" e pressiono enter
    Entao Verifico se a busca retorna mensagem de termo invalido

  @Busca_021
  Cenario: Realizar busca pelo botao buscar na pagina Campanha
    E que estou na pagina de campanha
    Quando Pesquiso no input da busca "faca" e clico na lupa
    E Acesso a PDP do primeiro produto
    Então Verifico se fui redirecionado para PDP

  @Busca_022
  Cenario: Visualizar e clique em categorias sugeridas no campo de busca na pagina Campanha
    E que estou na pagina de campanha
    Quando Pesquiso no input da busca "panela" e clico na lupa
    E clico no botao filtrar
    Entao clico em categorias

  @Busca_023
  Cenario: Visualizar e clique no botao ver mais categorias sugeridas no campo de busca na pagina Campanha
    E que estou na pagina de campanha
    Quando Pesquiso no input da busca "panela" e clico na lupa
    E clico no botao filtrar
    Entao clico em categorias

  @Busca_024
  Cenario: Visualizar e clique em produtos sugeridos no campo de busca na pagina Categorias
    E que estou na pagina de categorias
    Quando Clico na lupa de busca
    E visualizo as Sugestoes de produtos
    Então Clico no primeiro produto na sugestao

  @Busca_025
  Cenario: Realizar busca de termo invalido pelo botao buscar na pagina Categorias
    E que estou na pagina de categorias
    Quando Pesquiso no input da busca "combustivel" e pressiono enter
    Entao Verifico se a busca retorna mensagem de termo invalido

  @Busca_026
  Cenario: Realizar busca com enter na pagina Categorias
    E que estou na pagina de categorias
    Quando Pesquiso no input da busca "panela" e pressiono enter
    E Acesso a PDP do primeiro produto
    Então Verifico se fui redirecionado para PDP

  @Busca_027
  Cenario: Realizar busca pelo botao buscar na pagina Categorias
    E que estou na pagina de categorias
    Quando Pesquiso no input da busca "faca" e clico na lupa
    E Acesso a PDP do primeiro produto
    Então Verifico se fui redirecionado para PDP

  @Busca_028
  Cenario: Visualizar e clique em categorias sugeridas no campo de busca na pagina Categorias
    E que estou na pagina de categorias
    Quando Pesquiso no input da busca "panela" e clico na lupa
    E clico no botao filtrar
    Entao clico em categorias

  @Busca_029
  Cenario: Visualizar e clique no botao ver mais categorias sugeridas no campo de busca na pagina Categorias
    E que estou na pagina de categorias
    Quando Pesquiso no input da busca "panela" e clico na lupa
    E clico no botao filtrar
    Entao clico em categorias

  @Busca_030
  Cenario:  Visualizar e clique em produtos sugeridos no campo de busca na pagina Departamento
    E que estou na pagina de departamento
    Quando Clico na lupa de busca
    E visualizo as Sugestoes de produtos
    Então Clico no primeiro produto na sugestao

  @Busca_031
  Cenario:Realizar busca de termo invalido pelo botao buscar na pagina Departamento
    E que estou na pagina de departamento
    Quando Pesquiso no input da busca "combustivel" e pressiono enter
    Entao Verifico se a busca retorna mensagem de termo invalido

  @Busca_032
  Cenario:Realizar busca com enter na pagina Departamento
    E que estou na pagina de departamento
    Quando Pesquiso no input da busca "panela" e pressiono enter
    E Acesso a PDP do primeiro produto
    Então Verifico se fui redirecionado para PDP

  @Busca_033
  Cenario:Realizar busca pelo botao buscar na pagina Departamento
    E que estou na pagina de departamento
    Quando Pesquiso no input da busca "faca" e clico na lupa
    E Acesso a PDP do primeiro produto
    Então Verifico se fui redirecionado para PDP

  @Busca_034
  Cenario:Visualizar e clique em categorias sugeridas no campo de busca na pagina Departamento
    E que estou na pagina de departamento
    Quando Pesquiso no input da busca "panela" e clico na lupa
    E clico no botao filtrar
    Entao clico em categorias

  @Busca_035
  Cenario:Visualizar e clique no botao ver mais categorias sugeridas no campo de busca na pagina Departamento
    E que estou na pagina de departamento
    Quando Pesquiso no input da busca "panela" e clico na lupa
    E clico no botao filtrar
    Entao clico em categorias

  @Busca_036
  Cenario:Realizar busca pelo botao buscar na pagina Ambientes
    E que estou na pagina de ambientes
    Quando Pesquiso no input da busca "faca" e clico na lupa
    E Acesso a PDP do primeiro produto
    Então Verifico se fui redirecionado para PDP

  @Busca_037
  Cenario:Realizar busca com enter na pagina Ambientes
    E que estou na pagina de ambientes
    Quando Pesquiso no input da busca "panela" e pressiono enter
    E Acesso a PDP do primeiro produto
    Então Verifico se fui redirecionado para PDP

  @Busca_038
  Cenario:Realizar busca de termo invalido pelo botao buscar na pagina Ambientes
    E que estou na pagina de ambientes
    Quando Pesquiso no input da busca "combustivel" e pressiono enter
    Entao Verifico se a busca retorna mensagem de termo invalido

  @Busca_039
  Cenario:Visualizar e clique em produtos sugeridos no campo de busca na pagina Ambientes
    E que estou na pagina de ambientes
    Quando Clico na lupa de busca
    E visualizo as Sugestoes de produtos
    Então Clico no primeiro produto na sugestao

  @Busca_040
  Cenario:Visualizar e clique em categorias sugeridas no campo de busca na pagina Ambientes
    E que estou na pagina de ambientes
    Quando Pesquiso no input da busca "panela" e clico na lupa
    E clico no botao filtrar
    Entao clico em categorias

  @Busca_041
  Cenario:Visualizar e clique no botao ver mais categorias sugeridas no campo de busca na pagina Ambientes
    E que estou na pagina de ambientes
    Quando Pesquiso no input da busca "panela" e clico na lupa
    E clico no botao filtrar
    Entao clico em categorias

  @Busca_042
  Cenario:Realizar busca pelo botao buscar na pagina Institucional
    E que estou na pagina institucional
    Quando Pesquiso no input da busca "faca" e clico na lupa
    E Acesso a PDP do primeiro produto
    Então Verifico se fui redirecionado para PDP

  @Busca_043
  Cenario:Realizar busca com enter na pagina Institucional
    E que estou na pagina institucional
    Quando Pesquiso no input da busca "panela" e pressiono enter
    E Acesso a PDP do primeiro produto
    Então Verifico se fui redirecionado para PDP

  @Busca_044
  Cenario:Realizar busca de termo invalido pelo botao buscar na pagina Institucional
    E que estou na pagina institucional
    Quando Pesquiso no input da busca "combustivel" e pressiono enter
    Entao Verifico se a busca retorna mensagem de termo invalido

  @Busca_045
  Cenario:Visualizar e clique em produtos sugeridos no campo de busca na pagina Institucional
    E que estou na pagina institucional
    Quando Clico na lupa de busca
    E visualizo as Sugestoes de produtos
    Então Clico no primeiro produto na sugestao

  @Busca_046
  Cenario:Visualizar e clique em categorias sugeridas no campo de busca na pagina Institucional
    E que estou na pagina institucional
    Quando Pesquiso no input da busca "panela" e clico na lupa
    E clico no botao filtrar
    Entao clico em categorias

  @Busca_047
  Cenario:Visualizar e clique no botao ver mais categorias sugeridas no campo de busca na pagina Institucional
    E que estou na pagina institucional
    Quando Pesquiso no input da busca "panela" e clico na lupa
    E clico no botao filtrar
    Entao clico em categorias

  @Busca_048
  Cenario:Visualizar e clique em produtos sugeridos no campo de busca na pagina Sacola
    E que estou na pagina sacola
    Quando Clico na lupa de busca
    E visualizo as Sugestoes de produtos
    Então Clico no primeiro produto na sugestao

  @Busca_049
  Cenario:Realizar busca pelo botao buscar na pagina Sacola
    E que estou na pagina sacola
    Quando Pesquiso no input da busca "faca" e clico na lupa
    E Acesso a PDP do primeiro produto
    Então Verifico se fui redirecionado para PDP

  @Busca_050
  Cenario:Realizar busca com enter na pagina Sacola
    E que estou na pagina sacola
    Quando Pesquiso no input da busca "panela" e pressiono enter
    E Acesso a PDP do primeiro produto
    Então Verifico se fui redirecionado para PDP

  @Busca_051
  Cenario:Realizar busca de termo invalido pelo botao buscar na pagina Sacola
    E que estou na pagina sacola
    Quando Pesquiso no input da busca "combustivel" e pressiono enter
    Entao Verifico se a busca retorna mensagem de termo invalido

  @Busca_052
  Cenario:Visualizar e clique em categorias sugeridas no campo de busca na pagina Sacola
    E que estou na pagina sacola
    Quando Pesquiso no input da busca "panela" e clico na lupa
    E clico no botao filtrar
    Entao clico em categorias

  @Busca_053
  Cenario:Visualizar e clique no botao ver mais categorias sugeridas no campo de busca na pagina Sacola
    E que estou na pagina sacola
    Quando Pesquiso no input da busca "panela" e clico na lupa
    E clico no botao filtrar
    Entao clico em categorias

  @Busca_054
  Cenario:Visualizar e clique em produtos sugeridos no campo de busca na pagina MinhaConta
    Dado Que clico no avatar de login
    Quando Realizo login com e-mail e senha validos "PF"
    Entao Login deve ser efetuado com sucesso e com iniciais "BR"
    E que estou na pagina minha conta
    Quando Clico na lupa de busca
    E visualizo as Sugestoes de produtos
    Então Clico no primeiro produto na sugestao

  @Busca_055
  Cenario:Realizar busca pelo botao buscar na pagina MinhaConta
    Dado Que clico no avatar de login
    Quando Realizo login com e-mail e senha validos "PF"
    Entao Login deve ser efetuado com sucesso e com iniciais "BR"
    E que estou na pagina minha conta
    Quando Pesquiso no input da busca "faca" e clico na lupa
    E Acesso a PDP do primeiro produto
    Então Verifico se fui redirecionado para PDP

  @Busca_056
  Cenario:Realizar busca com enter na pagina MinhaConta
    Dado Que clico no avatar de login
    Quando Realizo login com e-mail e senha validos "PF"
    Entao Login deve ser efetuado com sucesso e com iniciais "BR"
    E que estou na pagina minha conta
    Quando Pesquiso no input da busca "panela" e pressiono enter
    E Acesso a PDP do primeiro produto
    Então Verifico se fui redirecionado para PDP

  @Busca_057
  Cenario:Realizar busca de termo invalido pelo botao buscar na pagina MinhaConta
    Dado Que clico no avatar de login
    Quando Realizo login com e-mail e senha validos "PF"
    Entao Login deve ser efetuado com sucesso e com iniciais "BR"
    E que estou na pagina minha conta
    Quando Pesquiso no input da busca "combustivel" e pressiono enter
    Entao Verifico se a busca retorna mensagem de termo invalido

  @Busca_058
  Cenario:Visualizar e clique em categorias sugeridas no campo de busca na pagina MinhaConta
    Dado Que clico no avatar de login
    Quando Realizo login com e-mail e senha validos "PF"
    Entao Login deve ser efetuado com sucesso e com iniciais "BR"
    E que estou na pagina minha conta
    Quando Pesquiso no input da busca "panela" e clico na lupa
    E clico no botao filtrar
    Entao clico em categorias

  @Busca_059
  Cenario:Visualizar e clique no botao ver mais categorias sugeridas no campo de busca na pagina MinhaConta
    Dado Que clico no avatar de login
    Quando Realizo login com e-mail e senha validos "PF"
    Entao Login deve ser efetuado com sucesso e com iniciais "BR"
    E que estou na pagina minha conta
    Quando Pesquiso no input da busca "panela" e clico na lupa
    E clico no botao filtrar
    Entao clico em categorias

  @Busca_060
  Cenario:Visualizar e clique em produtos sugeridos no campo de busca na pagina Favoritos
    Dado Que clico no avatar de login
    Quando Realizo login com e-mail e senha validos "PF"
    Entao Login deve ser efetuado com sucesso e com iniciais "BR"
    E que estou na pagina Favoritos
    Quando Clico na lupa de busca
    E visualizo as Sugestoes de produtos
    Então Clico no primeiro produto na sugestao

  @Busca_061
  Cenario:Realizar busca de termo invalido pelo botao buscar na pagina Favoritos
    Dado Que clico no avatar de login
    Quando Realizo login com e-mail e senha validos "PF"
    Entao Login deve ser efetuado com sucesso e com iniciais "BR"
    E que estou na pagina Favoritos
    Quando Pesquiso no input da busca "combustivel" e pressiono enter
    Entao Verifico se a busca retorna mensagem de termo invalido

  @Busca_062
  Cenario:Realizar busca com enter na pagina Favoritos
    Dado Que clico no avatar de login
    Quando Realizo login com e-mail e senha validos "PF"
    Entao Login deve ser efetuado com sucesso e com iniciais "BR"
    E que estou na pagina Favoritos
    Quando Pesquiso no input da busca "panela" e pressiono enter
    E Acesso a PDP do primeiro produto
    Então Verifico se fui redirecionado para PDP

  @Busca_063
  Cenario:Realizar busca pelo botao buscar na pagina Favoritos
    Dado Que clico no avatar de login
    Quando Realizo login com e-mail e senha validos "PF"
    Entao Login deve ser efetuado com sucesso e com iniciais "BR"
    E que estou na pagina Favoritos
    Quando Pesquiso no input da busca "faca" e clico na lupa
    E Acesso a PDP do primeiro produto
    Então Verifico se fui redirecionado para PDP

  @Busca_064
  Cenario:Visualizar e clique em categorias sugeridas no campo de busca na pagina Favoritos
    Dado Que clico no avatar de login
    Quando Realizo login com e-mail e senha validos "PF"
    Entao Login deve ser efetuado com sucesso e com iniciais "BR"
    E que estou na pagina Favoritos
    Quando Pesquiso no input da busca "panela" e clico na lupa
    E clico no botao filtrar
    Entao clico em categorias

  @Busca_065
  Cenario:Visualizar e clique no botao ver mais categorias sugeridas no campo de busca na pagina Favoritos
    Dado Que clico no avatar de login
    Quando Realizo login com e-mail e senha validos "PF"
    Entao Login deve ser efetuado com sucesso e com iniciais "BR"
    E que estou na pagina Favoritos
    Quando Pesquiso no input da busca "panela" e clico na lupa
    E clico no botao filtrar
    Entao clico em categorias

  @Busca_066
  Cenario:Validar que produtos indisponíveis e esgotados não devem ser exibidos nas thumbs
    Quando Clico na lupa de busca
    Entao Clico no primeiro produto na sugestao

      #Cenario:[DESKTOP] Validar que caso o produto tenha mais de 5 variações de cores, deve exibir 4 thumbs e o botão "+cores" (falta massa)

      #Cenario:[MOBILE] Validar que caso o produto tenha mais de 3 variações de cores, deve exibir 2 thumbs e o botão "+cores" (falta massa)