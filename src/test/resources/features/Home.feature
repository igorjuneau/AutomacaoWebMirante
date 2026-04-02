#language: pt

@Home
Funcionalidade: Home

  Contexto:
    Dado que estou no site blogdoagi

  @Home_001
  Cenario: Clicar em Produtos Emprestimos
    Dado que estou na tela de Home
    E clico no botao Produtos
    E clico no botao Emprestimos
    Quando clico no botao emprestimo consignado
    Então verifico que a tela de Emprestimos Consignados foi carregada com sucesso

  @Home_002 
  Cenario: Verificar o Banner Tudo Sobre Emprestimo
    Dado que estou na tela de Home
    Quando rolo a tela para baixo 10x
    Então verifico que as tres imagens foram carregadas
