#language:pt
@acessar_varios_componentes_html
Funcionalidade: Acessar varios componentes html

  Contexto:
    Dado que o usuario acessou o arquivo Campo de treinamento

      #Questao 1
    Cenario: validar todas as informacoes
      Quando o usuario clicar em cadastrar
      Entao as informacoes serao apresentadas

      #Questao 2
    Cenario: validar o nome
      Quando o usuario cadastrar seu nome
      Entao se o nome estiver em branco ocorrera um erro

    Cenario: validar o sobrenome
      Quando o usuario cadastrar seu sobrenome
      Entao se o sobrenome estiver em branco ocorrera um erro

    Cenario: validar o sexo
      Quando o usuario cadastrar seu sexo
      Entao se o sexo estiver em branco ocorrera um erro

      #Questao 3a
    Cenario: validar alert
      Quando o usuario clicar em alert
      Entao o alert deve ser mostrado

      #Questao 3b
    Cenario: validar confirm
      Quando o usuario clicar em confirmar
      Entao a mensagem de confirmacao sera mostrada

      #Questao 3c
    Cenario: validar cancelar confirm
      Quando o usuario clicar em cancelar
      Entao a mensagem negado devera ser mostrada

      #Questao 3d
    Cenario: validar prompt
      Quando o usuario clicar em prompt
      Entao ele confirmara seu numero

