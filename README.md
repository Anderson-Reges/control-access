<h1 align="center">CONTROL-ACCESS</h1>

O control-access é um controle de acesso inteligente. que ao ser finalizado, deve apresentar um relatório que divida as pessoas que acessaram em três categorias:

Pessoas menores de 18 anos,
Pessoas adultas (entre 18 e 49 anos), e
Pessoas a partir de 50 anos.

Esse sistema apresenta um menu no console, indicando a opção de acesso e opção de finalizar o sistema mostrando o relatório.

A imagem abaixo mostra o fluxo que o programa deve seguir:

![SistemaFluxograma](img/controle-acesso.png)

## Exemplo

O menu inicia nesse formato:

    ```
    Entre com o número correspondente à opção desejada:
    1 - Acessar o estabelecimento
    2 - Finalizar sistema e mostrar relatório
    ```
Se a pessoa usuária entrar com o valor 1 (que indica que ela quer acessar o estabelecimento), então a mensagem `Entre com a idade:` será impressa no console. Em seguida, depois de inserir a idade da pessoa cliente e pressionar enter, aparecerá uma das mensagens listadas abaixo:

  - `Pessoa cliente menor de idade, catraca liberada!`: se a idade da pessoa inserida for menor que 18 anos.

  - `Pessoa adulta, catraca liberada!`: se a idade da pessoa inserida for igual ou maior que 18 anos, e menor ou igual a 49 anos.

  - `Pessoa adulta a partir de 50, catraca liberada!`: se a idade da pessoa inserida for a partir de 50 anos.

Depois que a mensagem for impressa, então deverá retornar ao estado inicial do menu. Esse ciclo se repete até a opção 2 ser escolhida, o que indica que a pessoa usuária quer finalizar o expediente e imprimir o relatório.

Um exemplo da saida do relatório seria assim:
```
----- Quantidade -----
menores: 20
adultas: 150
a partir de 50: 30

----- Percentual -----
menores: 10.0%
adultas: 75.0%
a partir de 50: 15.0%

TOTAL: 200
```

### Languagens/Frameworks/Ferramentas

[![My Skills With Front-End](https://skillicons.dev/icons?i=java,maven)](https://skillicons.dev)

## 🚀 Instalando o projeto

Para instalar o projeto, siga estas etapas:

```
mvn install
```
