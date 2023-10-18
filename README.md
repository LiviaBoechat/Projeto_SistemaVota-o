# Sistema de Votação

Boas-vindas ao repositório do exercício Sistema de Votação

Para realizar o exercício, atente-se a cada passo descrito a seguir e se tiver **qualquer dúvida**, nos envie no _Slack_ da turma! #vqv 🚀

Aqui, você vai encontrar os detalhes de como estruturar o desenvolvimento do seu exercício a partir desse repositório, utilizando uma branch específica e um _Pull Request_ para colocar seus códigos.

## Termos e acordos
Ao iniciar este exercício, você concorda com as diretrizes do [Código de Conduta e do Manual da Pessoa Estudante da Trybe](https://app.betrybe.com/learn/student-manual/codigo-de-conduta-da-pessoa-estudante).

## Entregáveis

<details>
  <summary>🤷🏽‍♀️ Como entregar</summary><br />

Para entregar o seu exercício, você deverá criar um _Pull Request_ neste repositório.

Lembre-se que você pode consultar nosso conteúdo sobre [Git & GitHub](https://app.betrybe.com/learn/course/5e938f69-6e32-43b3-9685-c936530fd326/module/fc998c60-386e-46bc-83ca-4269beb17e17/section/fe827a71-3222-4b4d-a66f-ed98e09961af/day/1a530297-e176-4c79-8ed9-291ae2950540/lesson/2b2edce7-9c49-4907-92a2-aa571f823b79) e nosso [Blog - Git & GitHub](https://blog.betrybe.com/tecnologia/git-e-github/) sempre que precisar!
</details>

<details>
  <summary>👨‍💻 O que deverá ser desenvolvido</summary><br />

Eba! Com suas habilidades excepcionais em Java, surgiu para você um desafio empolgante: desenvolver um sistema de votação eletrônico! É isso mesmo, você será o grande arquiteto digital da democracia!

Imagine só: esse sistema maravilhoso irá possibilitar o cadastro de todos os nossos candidatos e eleitores, além de coordenar o processo de votação. E tem mais, você será capaz de verificar os resultados a qualquer momento, sejam eles parciais ou o grande resultado final. Incrível, não é?

Mas para essa aventura ficar ainda mais emocionante, nós temos três etapas principais que precisamos seguir, formando uma sequência ordenada de desafios a serem superados:

1. Cadastrar pessoas candidatas
2. Cadastrar pessoas eleitoras
3. Iniciar processo votação

O objetivo deste exercício é praticar a lógica de programação em um contexto de programação orientada a objetos e entender como esses conceitos permitem que escrevamos código mais claro, mais flexível e mais fácil de manter.

</details>

<details>
  <summary><strong>:memo: Habilidades a serem trabalhadas</strong></summary>

Neste exercício, verificamos se você é capaz de:

1. Compreender os conceitos fundamentais da Programação Orientada a Objetos (POO) e como a linguagem Java aplica esses conceitos.
2. Entender a importância de conceitos como classes, objetos, métodos, encapsulamento, herança, polimorfismo, interfaces e classes abstratas na POO.
3. Aplicar os conceitos de POO na prática, através da codificação em Java.
4. Analisar códigos Java escritos por outros, identificando o uso de conceitos de POO e entendendo como eles contribuem para a organização e clareza do código.
5. Criar novos programas Java utilizando os conceitos de POO, organizando o código de maneira lógica e eficiente.
6. Avaliar a eficácia de diferentes abordagens de programação em Java, considerando fatores como legibilidade, eficiência e facilidade de manutenção.

Desta forma, o exercício visa desenvolver as habilidades de programação orientada a objetos dos participantes, desde o nível de conhecimento até a capacidade de avaliar e criar seus próprios códigos em Java.

</details>

## Orientações

<details>

   <summary><strong>‼ Antes de começar a desenvolver </strong></summary>


1. Clone o repositório

- Use o comando: `git clone <url do repositório>`
- Entre na pasta do repositório que você acabou de clonar:
    - `cd <nome do repositório>`

2. Instale as dependências

    - `mvn install`  

3. Crie uma branch a partir da branch `main`

- Verifique que você está na branch `main`
    - Exemplo: `git branch`
- Se você não estiver, mude para a branch `main`
    - Exemplo: `git checkout main`
- Agora, crie uma branch à qual você vai submeter os `commits` do seu exercício:
    - Você deve criar uma branch no seguinte formato: `nome-sobrenome-nome-do-exercício`;
    - Exemplo: `git checkout -b maria-soares-lessons-learned`

4. Crie na raiz do exercício os arquivos que você precisará desenvolver:

- Verifique que você está na raiz do exercício:
    - Exemplo: `pwd` -> o retorno vai ser algo tipo _/Users/maria/code/**sd-0x-project-lessons-learned**_
- Crie os arquivos index.html e style.css:
    - Exemplo: `touch index.html style.css`

5. Adicione as mudanças ao _stage_ do Git e faça um `commit`

- Verifique que as mudanças ainda não estão no _stage_:
    - Exemplo: `git status` (devem aparecer listados os novos arquivos em vermelho)
- Adicione o novo arquivo ao _stage_ do Git:
    - Exemplo:
        - `git add .` (adicionando todas as mudanças - _que estavam em vermelho_ - ao stage do Git)
        - `git status` (devem aparecer listados os arquivos em verde)
- Faça o `commit` inicial:
    - Exemplo:
        - `git commit -m 'iniciando o exercício. VAMOS COM TUDO :rocket:'` (fazendo o primeiro commit)
        - `git status` (deve aparecer uma mensagem tipo _nothing to commit_ )

6. Adicione a sua branch com o novo `commit` ao repositório remoto

- Usando o exemplo anterior: `git push -u origin maria-soares-lessons-learned`

7. Crie um novo `Pull Request` _(PR)_

- Vá até a página de _Pull Requests_ do [repositório no GitHub](https://github.com/tryber/sd-0x-project-lessons-learned/pulls)
    - Clique no botão verde _"New pull request"_
    - Clique na caixa de seleção _"Compare"_ e escolha a sua branch **com atenção**
- Coloque um título para o seu _Pull Request_
    - Exemplo: _"Cria tela de busca"_
- Clique no botão verde _"Create pull request"_

- Adicione uma descrição para o _Pull Request_, um título nítido que o identifique, e clique no botão verde _"Create pull request"_

 <img width="1335" alt="Exemplo de pull request" src="https://user-images.githubusercontent.com/42356399/166255109-b95e6eb4-2503-45e5-8fb3-cf7caa0436e5.png">

- Volte até a [página de _Pull Requests_ do repositório](https://github.com/tryber/sd-0x-project-lessons-learned/pulls) e confira que o seu _Pull Request_ está criado

</details>

<details>

<summary><strong>⌨️ Durante o desenvolvimento</strong></summary>

Faça `commits` das alterações que você fizer no código regularmente, pois assim você garante visibilidade para o time da Trybe e treina essa prática para o mercado de trabalho :) ;

- Lembre-se de sempre após um (ou alguns) `commits` atualizar o repositório remoto;
- Os comandos que você utilizará com mais frequência são:
    - `git status` _(para verificar o que está em vermelho - fora do stage - e o que está em verde - no stage)_;
    - `git add` _(para adicionar arquivos ao stage do Git)_;
    - `git commit` _(para criar um commit com os arquivos que estão no stage do Git)_;
    - `git push -u origin nome-da-branch` _(para enviar o commit para o repositório remoto na primeira vez que fizer o `push` de uma nova branch)_;
    - `git push` _(para enviar o commit para o repositório remoto após o passo anterior)_.

</details>

<details>
<summary><strong>🎛 Checkstyle</strong></summary>

Para garantir a qualidade do código, vamos utilizar neste exercício o `Checkstyle`. Assim o código estará alinhado com as boas práticas de desenvolvimento, sendo mais legível e de fácil manutenção! Para poder rodar o `Checkstyle` certifique-se de ter executado o comando `mvn install` dentro do repositório.

Para rodá-los localmente no repositório, execute os comandos abaixo:

```bash
mvn checkstyle:check
```

Se a análise do `Checkstyle` encontrar problemas no seu código, tais problemas serão mostrados no seu terminal. Se não houver problema no seu código, nada será impresso no seu terminal.

Você pode também instalar o plugin do `Checkstyle` na sua `IDE`. Para isso, volte na primeira seção do conteúdo.

⚠️ **PULL REQUESTS COM ISSUES NO `Checkstyle` NÃO SERÃO AVALIADAS. ATENTE-SE PARA RESOLVÊ-LAS ANTES DE FINALIZAR O DESENVOLVIMENTO!** ⚠️

</details>

<details>
<summary><strong>🛠 Testes</strong></summary>


Para executar todos os testes basta rodar o comando:
```bash
mvn test
```

Para executar apenas uma classe de testes:
```bash
mvn test -Dtest="TestClassName"
```

</details>

## Requisitos

## 1 - Implemente a classe abstrata Pessoa

<details>
    <summary>Implemente a classe abstrata Pessoa, criando os atributos, getters e setters</summary>


No projeto já existe um arquivo com a classe `com.betrybe.sistemadevotacao.Pessoa`. Nessa classe, você deve garantir que: 
 1. Ela é uma classe abstrata, de forma que ela será utilizada como base para implementação de outras classes, mas não será instanciada por si.
 2. Ela possui o atributo protegido `nome` do tipo String.
 3. Ela possui os _getters_ e _setters_ correspondentes ao atributo.
  - Note que estes métodos não são abstratos, mesmo que a classe seja.

</details>

## 2 - Implemente a classe PessoaCandidata

<details>
    <summary>Implemente a classe abstrata PessoaCandidata, incluindo atributos, métodos e herança </summary>

A classe `PessoaCandidata` herda da classe `Pessoa`, ficando responsável por representar a pessoa candidata. Essa classe é formada por:
1. Atributos:
    - `nome`: herdado da classe `Pessoa`;
    - `numero`: atributo do tipo **primitivo** inteiro que armazena o número identificador para voto;
    - `votos`: atributo do tipo **primitivo** inteiro que armazena o número de votos recebidos pela pessoa candidata.
2. Métodos:
    - getters e setters referentes aos atributos.
    - `receberVoto`: método responsável por adicionar 1 ao atributo `votos` para representar a quantidade de votos recebidos pela pessoa candidata. O método não retorna nada.
3. Construtor: seu construtor recebe dois parâmetros, o `nome` e o `numero`, e os armazena nos respectivos atributos. O método construtor também inicializa o atributo `votos` com o valor zero.

Note que todos os métodos da classe em questão são públicos.

</details>

## 3 - Implemente a classe PessoaEleitora

<details>
    <summary>Implemente a classe abstrata PessoaEleitora</summary>

A classe `PessoaEleitora` herda da classe `Pessoa`, ficando responsável por representar a pessoa eleitora. Garanta que:
1. Além do(s) atributo(s) herdado(s), ela deve possuir um atributo privado adicional `cpf` do tipo String, que armazena o CPF da pessoa eleitora. 
2. A classe deve possuir os _getters_ e _setters_ correspondentes aos atributos.

Note que todos os métodos dessa classe são públicos.

</details>

## 4 - Implementar a classe GerenciamentoVotacao com atributos

<details>
    <summary>Implemente a classe que fará o gerenciamento do processo de votação e seus atributos</summary>

Neste requisito, você deve iniciar a implementação da classe `GerenciamentoVotacao` é responsável por gerenciar a votação e o cadastro de pessoas candidatas e pessoas eleitoras. A classe deve implementar a interface `GerenciamentoVotacaoInterface`, já disponibilizada com o projeto.

Por enquanto você não precisa completar os métodos da interface, apenas deverá criar três atributos privados:
- `pessoasCandidatas`: responsável por manter uma lista das pessoas candidatas cadastradas, ou seja, de objetos instanciados da classe `PessoaCandidata`;
- `pessoasEleitoras`: responsável por manter uma lista das pessoas eleitoras cadastradas, ou seja, de objetos instanciados da classe `PessoaEleitora`;
- `cpfsComputados`: responsável por manter uma lista com os CPFs das pessoas eleitoras que já votaram, ou seja, de Strings.

Para criar os três atributos acima, você deve utilizar a classe `ArrayList`. Nós aprenderemos mais sobre essa classe posteriormente, mas utilizaremos essa classe aqui porque ela pode receber novos objetos de uma forma mais simples e eficiente do que com os _arrays_ nativos do Java. Um exemplo de uso:

```java
ArrayList<String> fruits = new ArrayList<String>();
fruits.add("maça");
fruits.add("uva");
System.out.println(cars.get(1)); // Imprime "uva"
```

Para mais informações, você pode consultar o site da [W3Schools](https://www.w3schools.com/java/java_arraylist.asp), ou a [documentação](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/ArrayList.html) oficial.

</details>

## 5 - Implementar os métodos de cadastro da classe GerenciamentoVotacao

<details>
    <summary>Implemente os métodos de cadastro da classe GerenciamentoVotacao</summary>

Neste requisito, você deve implementar os métodos da classe `GerenciamentoVotacao` referentes a cadastro, conforme abaixo:

- **Método** `cadastrarPessoaCandidata`: esse método público deve receber dois parâmetros: o `nome` (String) e o `numero` (inteiro) da pessoa candidata. Neste método você deve:
   - Verificar se o número da pessoa candidata já está cadastrado na lista `pessoasCandidatas` e, caso esteja, imprimir a mensagem `Número da pessoa candidata já utilizado!` no console;
   - Caso contrário, instanciar um objeto da classe `PessoaCandidata` utilizando os valores recebidos;
   - Por fim, adicionar o novo objeto na lista `pessoasCandidatas` (Dica: utilize o método `.add` da classe `ArrayList`).
- **Método** `cadastrarPessoaEleitora`: esse método público deve receber dois parâmetros: o `nome` (String) e o `cpf` (String) da pessoa candidata. Neste método você deve:
    - Verificar se o CPF da pessoa já está cadastrado na lista `pessoasEleitoras` e, caso esteja, imprimir a mensagem `Pessoa eleitora já cadastrada!` no console;
    - Caso contrário, instanciar um objeto da classe `PessoaEleitora` utilizando os valores recebidos
    - Por fim, adicionar o novo objeto na lista;
    `pessoasCandidatas` .

</details>

## 6 - Implementar os métodos de votação da classe GerenciamentoVotacao

<details>
    <summary>Implemente os métodos de votação da classe GerenciamentoVotacao</summary>

Neste requisito, você deve implementar os métodos da classe `GerenciamentoVotacao` referentes à votação, conforme abaixo:

- **Método** `votar`: esse método público deve receber dois parâmetros: o `cpfPessoaEleitora` e o `numeroPessoaCandidata`. Nesse método você deve:
   - Verificar se o CPF da pessoa eleitora já está inserido na lista `cpfsComputados` e, caso esteja, deve imprimir a mensagem `Pessoa eleitora já votou!` no console;
   - Caso contrário, deve percorrer o array `pessoasCandidatas` para encontrar o objeto da pessoa candidata que tenha o número passado pelo parâmetro `numeroPessoaCandidata`. Quando encontrar o objeto que representa a pessoa candidata, deverá chamar o método `receberVoto` desse objeto.
   - Por fim, deve inserir o CPF da pessoa eleitora na lista `cpfsComputados`, de forma que essa pessoa eleitora não possa votar novamente 
- **Método** `mostrarResultado`: esse método público é responsável por imprimir no console o resultado da eleição, seja o resultado parcial ou o final. Ele não recebe nenhum parâmetro. No método, você deve:
   - Verificar se já existe algum voto computado e, caso não, mostrar a mensagem `É preciso ter pelo menos um voto para mostrar o resultado.`. Você pode utilizar a lista de CPFs para verificar o total de votos.
   - Caso já tenha votos computados, imprimir no console o nome de cada pessoas candidata com a quantidade de votos que ela recebeu e o percentual de votos recebidos. Além disso, mostrar o total de votos computados. Exemplo de saída:
```text
Nome: Maria - 2 votos ( 67% )
Nome: José - 1 votos ( 33% )
Total de votos: 3
```

Nota: no cálculo da porcentagem, arredonde o valor para inteiro utilizando o método estático `round` da classe `Math` do Java.

</details>

## 7 - Implementar a classe Principal

<details>
    <summary>Implementar a classe Principal, responsável por interagir com a pessoa usuária</summary>

Neste requisito você irá implementar a classe `Principal`, que fará a execução de todo o processo de cadastro e votação.

Será preciso criar um menu com três etapas:
- Cadastro de pessoas candidata;
- Cadastro de pessoas eleitoras;
- Votação.

Para implementar o sistema, a classe `Principal` deve conter o método `main`, que utilizará a classe `GerenciamentoVotacao` para realizar as diferentes etapas.

Você poderá utilizar laços de repetição para processar cada etapa.

### Cadastro de pessoas candidatas

O menu de cadastro de pessoas candidatas deverá ter o seguinte formado:

```text
Cadastrar pessoa candidata?
1 - Sim
2 - Não
Entre com o número correspondente à opção desejada:
```

Se a pessoa usuária entrar com o valor 1 (que indica que ela quer cadastrar uma pessoa candidata), a mensagem `Entre com o nome da pessoa candidata:` deverá ser impressa no console.

Em seguida, após inserir o nome da pessoa candidata e pressionar enter, aparecerá a mensagem `Entre com o número da pessoa candidata:` no console. Depois que a pessoa usuária inserir o número da pessoa candidata, o sistema deverá retornar ao estado inicial do menu. 

Supondo que o nome da primeira pessoa candidata seja "Maria" e o seu número para votar seja "1", então um exemplo do conteúdo do console depois de cadastrar a primeira pessoa candidata será:

```text
Cadastrar pessoa candidata?
1 - Sim
2 - Não
Entre com o número correspondente à opção desejada:
1
Entre com o nome da pessoa candidata:
Maria
Entre com o número da pessoa candidata:
1
Cadastrar pessoa candidata?
1 - Sim
2 - Não
Entre com o número correspondente à opção desejada:
```

Esse ciclo se repete até não haver mais pessoas candidatas para serem cadastradas. Quando isso acontecer, a pessoa usuária entrará com a opção 2 do menu, o que vai parar o primeiro laço. O segundo laço, que representa a etapa de cadastro de pessoas eleitoras, deve ser iniciado logo na sequência.

⚠️🔴**IMPORTANTE: para facilitar o uso da classe `Scanner` do Java, cadastra-se apenas o primeiro nome da pessoa candidata — ou seja, Maria, e não Maria Silva ou Maria Clara.** 🔴⚠️

### Cadastro de pessoas candidatas

Após finalizar o cadastro de pessoas candidatas, passamos para o cadastro de pessoas eleitoras. O menu deverá ter o seguinte formato:

```text
Cadastrar pessoa eleitora?
1 - Sim
2 - Não
Entre com o número correspondente à opção desejada:
```

Se a pessoa usuária entrar com o valor 1 (que indica que ela quer cadastrar uma pessoa eleitora), então a mensagem `Entre com o nome da pessoa eleitora:` será impressa no console. Em seguida, depois de inserir o nome da pessoa eleitora e pressionar enter, aparecerá no console a mensagem `Entre com o CPF da pessoa eleitora:`.

Depois que a pessoa usuária inserir o CPF da pessoa eleitora, o sistema deve retornar ao estado inicial do menu. Supondo que o nome da primeira pessoa eleitora seja "João", portador do CPF "123.456.789-00", um exemplo do conteúdo do console após cadastrá-la será:

```text
Cadastrar pessoa eleitora?
1 - Sim
2 - Não
Entre com o número correspondente à opção desejada:
1
Entre com o nome da pessoa eleitora:
João
Entre com o cpf da pessoa eleitora:
123.456.789-00
Cadastrar pessoa eleitora?
1 - Sim
2 - Não
Entre com o número correspondente à opção desejada:
 ```

Esse ciclo se repete até o esgotamento das pessoas eleitoras a serem cadastradas. Ao final desse cadastro, a pessoa usuária entrará com a opção 2 do menu, o que vai parar o segundo laço e iniciar o terceiro, marcando o início da votação.

### Votação

Após finalizar o cadastro de pessoas eleitoras, entramos na etapa de votação. O menu deve ter o seguinte formato:

```text
 Entre com o número correspondente à opção desejada:
 1 - Votar
 2 - Resultado Parcial
 3 - Finalizar Votação
```

Se a pessoa usuária entrar com o valor 1 (que indica que ela quer computar um voto), a mensagem `Entre com o cpf da pessoa eleitora:` deverá ser impressa no console. Em seguida, após inserir o CPF da pessoa eleitora e pressionar enter, deverá aparecer a mensagem `Entre com o número da pessoa candidata:` no console. Feito isso, o voto deve ser computado, e o sistema retorna ao estado inicial do menu. Supondo que o CPF da primeira pessoa eleitora seja "123.456.789-00", e o número da pessoa candidata seja 1, então um exemplo do conteúdo do console após realizar um voto será:

```text
 Entre com o número correspondente à opção desejada:
 1 - Votar
 2 - Resultado Parcial
 3 - Finalizar Votação
 1
 Entre com o cpf da pessoa eleitora:
123.456.789-00
 Entre com o número da pessoa candidata:
 1
 Entre com o número correspondente à opção desejada:
 1 - Votar
 2 - Resultado Parcial
 3 - Finalizar Votação
```

Se a pessoa escolher a opção 2 ("Resultado parcial"), o resultado parcial deverá ser mostrado, mas a votação continua. Já se a pessoa escolher a opção 3, deverá ser mostrado o resultado final, e a execução termina.

</details>

<details>

<summary><strong> 🗣 Nos dê feedbacks sobre o exercício!</strong></summary>

Ao finalizar e submeter o exercício, não se esqueça de avaliar sua experiência preenchendo o [formulário](https://be-trybe.typeform.com/to/ZTeR4IbH#cohort_hidden=CH28-JAVA&template=betrybe/java-0x-projeto-sistema-de-votacao).
**Leva menos de 3 minutos!**

</details>

---

<!-- mdi versão 1.0 exercício como projeto ⚠️ não exclua esse comentário -->
