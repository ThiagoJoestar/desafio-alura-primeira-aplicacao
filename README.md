## Desafio Alura primeira aplicação em Java

**Esse desafio é parte do curso Java e Orientação a Objetos T6 - ONE Alura + Oracle**

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white) 

### Descrição do desafio:

Apresentaremos um projeto para nos desafiar e, ao longo das aulas, iremos resolver e fazer sugestões de como trabalhar. Assim, iremos consolidar os conhecimentos com tudo o que aprendemos no curso.

No IntelliJ, a ideia é controlarmos nossa conta bancária virtual e nomearemos os métodos como `recebeTransferencia()`, `fazTransferencia()`, `enviaPix()` ou `recebePix()`, por exemplo. Mas poderemos nomear como acharmos melhor.

A proposta é iniciarmos os dados do cliente como um extrato, e em seguida, teremos quatro opções de operações com a linha para inserir a opção desejada:

```
***********************
Dados iniciais do cliente:

Nome: Jacqueline Oliveira
Tipo conta: Corrente
Saldo inicial: R$ 2500,00
***********************

Operações

1- Consultar saldos
2- Receber valor
3- Transferir valor
4- Sair

Digite a opção desejada:
```
Se apertarmos a tecla "1", iremos consultar o saldo e mostraremos o valor atual de `R$ 2500.0`, mas se apertarmos "2", exibiremos um segundo campo para escrevermos: `Informe o valor a receber:`.

Inseriremos o valor que iremos depositar, como `700` por exemplo, e, ao apertarmos "Enter", mostraremos o saldo atualizado de `R$ 3200.0`.
```
//omitido

Digite a opção desejada:
2

Informe o valor a receber:
700

Saldo atualizado R$ 3200.
```

Mas se formos fazer uma transferência ou um saque com a tecla "3", teremos o campo `Informe o valor que deseja transferir:`. Se digitarmos `1000`, exibiremos o saldo atualizado de `R$ 2200.0`.
```
//omitido

Digite a opção desejada:
3

Informe o valor que deseja transferir:
1000

Saldo atualizado R$ 2200.0
```
Por fim, para encerrarmos a aplicação, bastará apertarmos a tecla "4" em `Digite a opção desejada:`. Mas se digitarmos um número inválido como "9" por exemplo, receberemos a mensagem `Opção inválida.`

Se temos dois mil e duzentos reais e tentarmos transferir um valor maior que este, como 500, teremos uma mensagem de que o saque não pode ser realizado:

`Não há saldo suficiente para fazer essa transferência.`

Com este projeto, conseguiremos praticar tudo o que aprendemos no curso, como declaração de variável, condicional e loop.

Nossa sugestão é que faça por etapas passando por cada detalhe e testando, como em um checklist:

-Inicializar dados do cliente
-Menu de opções
-Visualização do saldo
-Enviar valor
-Receber valor

