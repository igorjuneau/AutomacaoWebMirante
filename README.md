🚀 Projeto de Automação: Sanity Web - Blog Agibank

> [!IMPORTANT]
> ### ⚠️ AVISO DE PROPRIEDADE E ÉTICA PROFISSIONAL
> Este repositório é público exclusivamente para fins de **portfólio e avaliação**. 
> A cópia total ou parcial deste código para uso em desafios ou processos seletivos é **estritamente proibida**. 
> O histórico de commits e originalidade é monitorado. Use este material apenas como referência de estudo.

---

Este projeto consiste em uma suíte de testes automatizados para o Blog do Agibank, focando em garantir a integridade das principais funcionalidades da interface através de Sanity Checks. A arquitetura foi desenhada para ser escalável, de alta manutenção e com total separação de responsabilidades.


🛠️ Tecnologias e Ferramentas

Linguagem: Java 11

Framework de Automação: Selenium WebDriver (v4.25.0)

Framework de BDD: Cucumber (v7.0.0)

Gerenciador de Dependências: Maven

Padrão de Projeto: Page Objects com Camada de Interação (DSL)

Relatórios: Cucumber Reports (HTML, JSON, XML)

Ferramentas Auxiliares: WebDriverManager, JavaFaker e Rest-Assured


🏗️ Arquitetura do Projeto

O projeto segue o princípio de Separation of Concerns (SoC), organizando o código para facilitar a leitura e manutenção:

src/test/resources/features: Cenários de teste escritos em Gherkin (BDD).

pages: Repositório de seletores (By) centralizados por tela.

interactions: Camada que contém a lógica de negócio e interações complexas (cliques, preenchimento, scroll).

steps: Código de ligação (glue code) que conecta o BDD às Interações.

runner: Classe principal para execução e configuração dos relatórios.

setup/hook: Gerenciamento do ciclo de vida do Driver (instanciação e encerramento).


🧪 Cenários de Teste Abrangidos

A suíte atual foca nos fluxos críticos do blog:

Busca de Conteúdo: Validação da funcionalidade de pesquisa para artigos específicos (Ex: Imposto de Renda e Pix Parcelado).

Navegação em Menus: Interação com menus suspensos dinâmicos (Produtos > Empréstimos).

Integridade Visual: Validação de carregamento de títulos, imagens e elementos de interface.


🚀 Como Executar os Testes

Pré-requisitos

Java JDK 11 instalado.

Maven configurado no PATH do sistema.

Google Chrome instalado.

Execução via Terminal

Para executar os testes com a tag @Home (conforme configurado no WebRunnerTest):

Bash
mvn test -Drunner.class=Web

Relatórios de Execução

Após o término, os relatórios detalhados (com screenshots em caso de falha) ficam disponíveis em:
./reports/cucumber.html


🎡 Integração Contínua (CI/CD)

O projeto está integrado ao GitLab CI, garantindo que a qualidade seja validada a cada alteração de código. O arquivo .gitlab-ci.yml gerencia o pipeline automaticamente:

Build: Validação de compilação e dependências.

Test: Execução da suíte em modo Headless (Docker).

Artifacts: Armazenamento dos relatórios de teste por 7 dias para auditoria.


💡 Diferenciais Técnicos e Resiliência

Estratégia de Cliques: Implementação de JavascriptExecutor e Action Chains para superar limitações do clique nativo em elementos sobrepostos ou dinâmicos.

Wait Strategy: Uso de Explicit Waits (WebDriverWait) para sincronização precisa com o tempo de resposta do servidor.

Captura de Evidências: Sistema de captura automática de screenshots em cenários de falha (FAILED).

Seletores Robustos: Preferência por CSS Selectors e XPaths estruturais para evitar quebras por mudanças menores no layout (Tema Astra).


🗺️ Roadmap e Próximos Passos

[ ] Implementação de Testes de Contrato e API com Rest-Assured.

[ ] Configuração de execução paralela para redução do tempo de pipeline.

[ ] Integração de notificações de status no Slack/Teams.

[ ] Implementação de Testes de Regressão Visual.

👨‍💻 Autor
Igor Vieira – Quality Engineer

"Automação sem estratégia é apenas código. Qualidade é o foco." 🏍️💨

