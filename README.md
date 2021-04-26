# Exercícios de herança e encapsulamento no Java

## Exercício 1

a) Criar uma classe data com os atributos dia, mês e ano, realizando os testes para saber se é uma data válida.

b) Usando herança, criar as classes Pessoa, Aluno e Funcionário

c) Usando Delegação, criar na classe Pessoa o atributo Data de Nascimento do tipo Data (classe do item a)

d) Na classe Aluno deverá existir um atributo Data da Matricula que deverá ser do tipo Data (classe do item a)

e) Na classe Funcionário deverá existir um atributo Data de Admissão que deverá ser do tipo Data (classe do item a)

f) Criar uma classe Teste com um menu para cadastrar aluno e funcionário.

## Exercício 2

Uma universidade deseja modificar a estrutura de sua base de dados. Para isso, ela quer construir a
hierarquia das pessoas que frequentam o estabelecimento com a ajuda de uma representação do tipo
OO (orientado objeto). A universidade deseja conservar o nome de todas as pessoas e dispõe de
uma função que lhe permite de inicializar e de modificar este membro dado. A universidade é
frequentada por estudantes e empregados. As fichas dos estudantes devem conter seu nome, seu
estatuto (aluno especial, tempo parcial, tempo integral) e sua média. Além do mais, é necessário
prever funções que poderão modificar o estatuto e a média. Os empregados são divididos em duas
categorias: o corpo docente (demonstrador, monitor, professor) e o discente (escritório e
manutenção). Para todos os empregados, nós devemos prever um campo salário e uma função que
permita fixar os salários. Escreva, em linguagem JAVA, as declarações das classes que permitem
representar esta hierarquia.

## Exercício 3

Escreva uma classe chamada Contador, que tem um atributo estático que é incrementado sempre que a classe for instanciada. Crie métodos para zerar, incrementar e retornar o valor do contador. Desenvolva um programa para testar essa classe.

## Exercício 4

Escreva uma classe Calculadora que tenha os seguintes métodos: somar, subtrair, multiplicar, dividir (dois números), elevar à potência n e calcular o fatorial de um número. Desenvolva um programa para testar essa classe.

## Exercício 5

Escreva a classe ConversaoUnidadesTempo com métodos estáticos para conversão aproximada das unidades de tempo.

## Exercício 6

Escreva um método recursivo e	estático que calcule e retorne o N-ésimo termo da sequência Fibonacci. Alguns números desta sequência são: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89...
Escreva um método recursivo e estático que receba um	número inteiro positivo N e calcule o somatório dos números de 1 a N.

## Exercício 7

Elabore uma classe ContaBancaria com os seguintes atributos:
	• nomeCliente
	• numConta
	• saldo

E os seguintes métodos:
	• sacar (o saldo não pode ficar negativo)
	• depositar

Elabore uma classe ContaPoupanca
	• atributo diaRendimento
	• método calcularNovoSaldo, recebe taxa de rendimento da poupança e atualiza o saldo

ContaEspecial
	• atributo limite
	• sobrescreva o método sacar com a nova lógica necessária

Crie uma classe Teste que contenha a seguinte lógica:
	• Criar contas
	• Sacar um valor das contas
	• Depositar
	• Mostrar um novo saldo a partir de um rendimento
	• Mostrar os dados da conta do cliente





