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

## Exercício 8

A Receita Federal possui um cadastro dos contribuintes. Cada contribuinte possui nome.

Escreva um programa para calcular o imposto a ser pago para 5 contribuintes.

Os contribuintes podem ser:

Pessoa Jurídica

O imposto corresponde a 10% da renda bruta da empresa.

Pessoa física(Renda bruta, Alíquota, Parcela a deduzir)

0 a 1400 0% R$0

1400,01 a 2100 10% R$100

2100,01 a 2800 15% R$270

2800,01 a 3600 25% R$500

3600,01 ou mais 30% R$700


## Exercício 9

Escreva uma classe FiguraGeometrica com atributos nome e cor. Escreva uma classe	
Figura2D e uma classe Figura3D. Ambas classes Figura2D e Figura3D são subclasses	
da classe FiguraGeometrica. Crie ainda as classes Circulo, Quadrado e Triangulo	
que estendem a classe Figura2D e crie também as classes Cubo e Cilindro
que estendem a classe Figura3D.

Escreva a interface DimensaoSuperficial que contém o método calcularArea. Escreva a interface DimensaoVolumetrica que contém o método calcularVolume. Aplique a interface DimensaoSuperficial em todas as subclasses de Figura2D e Figura3D e aplique a interface DimensaoVolumetrica nas subclasses de Figura3D, implementando seus métodos de acordo com as regras de cada figura geométrica(crie os atributos necessários).

Crie pelo menos uma instância de cada classe e adicione em um array do tipo FiguraGeometrica. Itere esse array, imprimindo na tela a area e o volume (quando aplicável). 

## Exercício 10

Uma empresa possui funcionários próprios e terceirizados. Para cada funcionário, deseja-se registrar nome, horas trabalhadas e valor por hora. Funcionários terceirizado possuem ainda uma despesa adicional. 

O pagamento dos funcionários corresponde ao valor da hora multiplicado pelas horas trabalhadas, sendo que os funcionários terceirizados ainda recebem um bônus correspondente a 110% de sua despesa adicional. 

Fazer um programa para ler os dados de N funcionários (N fornecido pelo usuário) e armazená-los em uma lista. Depois de ler todos os dados, mostrar nome e pagamento de cada funcionário na mesma ordem em que foram digitados.

## Exercício 11

Fazer um programa para ler os dados de N produtos (N fornecido pelo usuário). 

Ao final, mostrar a etiqueta de preço de cada produto na mesma ordem em que foram digitados.

Todo produto possui nome e preço. Produtos importados possuem uma taxa de alfândega, e produtos usados possuem data de fabricação. 

Para produtos importados, a taxa de alfândega deve será acrescentada ao preço final do produto.

## Exercício 12

Fazer um programa para ler os dados de N contribuintes (N fornecido pelo usuário), os quais podem ser pessoa física ou pessoa jurídica, e depois mostrar o valor do imposto pago por cada um, bem como o total de imposto arrecadado. 

Os dados de pessoa física são: nome, renda anual e gastos com saúde. Os dados de pessoa jurídica são nome, renda anual e número de funcionários. As regras para cálculo de imposto são as seguintes:

Pessoa física: pessoas cuja renda foi abaixo de 20000.00 pagam 15% de imposto. Pessoas com renda de 20000.00 em diante pagam 25% de imposto. Se a pessoa teve gastos com saúde, 50% destes gastos são abatidos no imposto. Exemplo: uma pessoa cuja renda foi 50000.00 e teve 2000.00 em gastos com saúde, o imposto fica: 

(50000 * 25%) - (2000 * 50%) = 11500.00

Pessoa jurídica: pessoas jurídicas pagam 16% de imposto. Porém, se a empresa possuir mais de 10 funcionários, ela paga 14% de imposto.
Exemplo: uma empresa cuja renda foi 400000.00 e possui 25 funcionários, o imposto fica:
400000 * 14% = 56000.00

