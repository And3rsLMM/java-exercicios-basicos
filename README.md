# Java B�sico
Este reposit�rio foi criado com o objetivo de conter todas as resolu��es dos desafios B�sicos da [Forma��o Java Developer](https://web.dio.me/track/formacao-java-developer) da plataforma de ensino [DIO](www.dio.me).

##### Autor e repositorio original dos desafios
- Instrutor [Gleyson Sampaio](https://github.com/glysns)
- [Repositorio](https://github.com/digitalinnovationone/trilha-java-basico/tree/main)

## Desafios Propostos

### Simulando uma Conta Bancaria atrav�s do Terminal/Console
Vamos exercitar todo o conte�do apresentado no m�dulo de Sintaxe codificando o seguinte cen�rio.

1. Crie o projeto `ContaBanco` que receber� dados via terminal contendo as caracter�sticas de conta em banco conforme atributos abaixo:
2. Dentro do projeto, crie a classe `ContaTerminal.java` para realizar toda a codifica��o do nosso programa.

###### Revise sobre regras de declara��o de vari�veis

| Atributo  | Tipo     | Exemplo   
| --------- | ---------| ------- 
| Numero    | Inteiro  | 1021 
| Agencia   | Texto    | 067-8
| Nome Cliente | Texto    | MARIO ANDRADE
| Saldo | Decimal |237.48


###### Revise sobre terminal, main args e a classe Scanner
2. Permita que os dados sejam inseridos via terminal sendo que o usu�rio receber� a mensagem de qual informa��o ser� solicitada, exemplo:

* Programa: "Por favor, digite o n�mero da Ag�ncia !"
* Usu�rio: 1021 *(depois ENTER para o pr�ximo campo)* 

###### Revise sobre concatena��o e classe String com m�todo concat

3. Depois de todas as informa��es terem sido inseridas, o sistema dever� exibir a seguinte mensagem:

*"Ol� [Nome Cliente], obrigado por criar uma conta em nosso banco, sua ag�ncia � [Agencia], conta [Numero] e seu saldo [Saldo] j� est� dispon�vel para saque".*

Os campos em [ ] devem ser alterados pelas informa��es que forem inseridas pelos usu�rios.

### Controle de Fluxo
Vamos exercitar todo o conte�do apresentado no m�dulo de Controle de Fluxo codificando o seguinte cen�rio.

O sistema dever� receber dois par�metros via terminal que representar�o dois n�meros inteiros, com estes dois n�meros voc� dever� obter a quantidade de intera��es (for) e realizar a impress�o no console (System.out.print) dos n�meros incrementados, exemplo:

* Se voc� passar os n�meros 12 e 30, logo teremos uma intera��o (for) com 18 ocorr�ncias para imprimir os n�meros, exemplo: `"Imprimindo o n�mero 1"`, `"Imprimindo o n�mero 2"` e assim por diante.
* Se o primeiro par�metro for MAIOR que o segundo par�metro, voc� dever� lan�ar a exce��o customizada chamada de `ParametrosInvalidosException` com a segunda mensagem: "O segundo par�metro deve ser maior que o primeiro"   


1. Crie o projeto `DesafioControleFluxo`
2. Dentro do projeto, crie a classe `Contador.java` para realizar toda a codifica��o do nosso programa.
3. Dentro do projeto, crie a classe `ParametrosInvalidosException` que representar� a exce��o de neg�cio no sistema. 

### Abstraindo um Iphone usando POO
Modelagem e diagrama��o da representa��o em UML e C�digo no que se refere ao componente iPhone.

Com base no v�deo de lan�amento do iPhone conforme link abaixo, elabore em uma ferramenta de UML de sua prefer�ncia a diagrama��o das classes e interfaces com a proposta de representar os pap�is do iPhone de: Reprodutor Musicial,  Aparelho Telef�nico e Navegador na Internet. Em seguida crie as classes e interfaces no formato de arquivos .java

[Lan�amento iPhone 2007](https://www.youtube.com/watch?v=9ou608QQRq8)

- Minutos relevantes do 00:15 at� 00:55

###### Comportamentos esperados:
* Repodutor Musicial: tocar, pausar, selecionarMusica
* Aparelho Telef�nico: ligar, atender, iniciarCorrerioVoz
* Navegador na Internet: exibirPagina, adicionarNovaAba, atualizarPagina

## Como usar os codigo?

* Fa�a o clone deste reposit�rio
* cada arquivo resolu��o pode ser encontrado em sua respectiva pasta dentro da pasta Desafios
* Rode os arquivos .java contendo a classe Main
