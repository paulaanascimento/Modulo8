# Lista de Exercícios
<div align="justify">
  
## Exercício 1
  
- Crie uma classe Funcionario que obedeça à descrição abaixo:
    
    - A classe possui os atributos nome, sobrenome, horasTrabalhadas e valorPorHora
    
    - O método nomeCompleto deve escrever na tela o atributo nome concatenado ao atributo sobrenome  
    
    - O método calcularSalario faz o cálculo de quanto o funcionário irá receber no mês, multiplicando o atributo horasTrabalhadas pelo atributo valorPorHora. Em seguida, escreve o valor na tela  
    
    - O método incrementarHoras adiciona um valor passado por parâmetro ao valor já existente no atributo horasTrabalhadas

- Crie o método main e instancie a classe Funcionário criada, criando um objeto novoFuncionario do tipo Funcionario:
    - Atribua o valor “Luis” ao atributo nome.
    - Atribua o valor “Silva” ao atributo sobrenome.
    - Atribua o valor 10 ao atributo horasTrabalhadas
    - Atribua o valor 25.50 ao atributo valorPorHora.
    - Chame o método nomeCompleto.
    - Chame o método calcularSalario.
    - Adicione 8 ao atributo horasTrabalhadas utilizando o método incrementarHoras.
    - Chame novamente o método calcularSalario.
    - Crie um ArrayList e instancie outros 9 funcionários com diferentes atributos a esse ArrayList
    - Exiba os valores do ArrayList criado

## Exercício 2
- Construa a classe Livros em Kotlin, que obedeça à descrição abaixo:
  - A classe possui os atributos titulo, qtdPaginas e paginasLidas

  - Crie ainda o método verificarProgresso que deverá calcular a porcentagem de leitura do livro até o momento. Para isso, deverá usar os valores dos atributos qtdPaginas e paginasLidas, através da formula: porcentagem = paginasLidas * 100 / qtdPaginas. O valor da porcentagem deverá ser mostrado na tela conforme a mensagem “Você já leu X por cento do livro”, onde o valor de X é o valor calculado pela fórmula apresentada anteriormente

- Crie uma classe TestarLivros no mesmo pacote da classe Livros da questão anterior. Essa classe possuirá apenas o método main que servirá para testar a classe Livros. As seguintes ações devem ser realizadas:

  - Crie um objeto livrofavorito do tipo Livro.
  - Altere o atributo titulo para “O Pequeno Príncipe”
  - Altere o atributo qtdPaginas para 98
  - Escreva na tela a mensagem: “O livro X possui Y páginas”, onde no lugar de X deverá aparecer o valor do atributo titulo e, no lugar de Y deverá aparecer o valor do atributo qtdPaginas.
  - Altere a quantidade de paginasLidas para 20
  - Chame o método verificarProgresso
  - Altere a quantidade de paginasLidas para 50;
  - Chame o método verificarProgresso
  - Instancie outros 10 livros no método main e chame os métodos desenvolvidos, conforme o exemplo anterior.

## Exercício 3
- Contrua um programa que possa exibir a duração do filme em horas com a seguinte mensagem “O filme TITULO possui X horas e Y minutos de duração". Por exemplo, dado o filme com título Titanic que possui 194 minutos de duração, a mensagem que deverá ser exibida para o usuário será: “O filme Titanic possui 3 horas e 14 minutos de duração”.

- Após isso teste a classe Filme criada anteriormente:
  - Crie um objeto filme1 do tipo Filme.
  - Altere o atributo título para “Os Vingadores”.
  - Altere o atributo duracaoEmMinutos para 142.
  - Chame o método exibirDuracaoEmHoras() para mostrar quantas horas o filme possui.
  - Crie um objeto filme2 do tipo Filme.
  - Altere o atributo título do filme2 para “Hotel Transilvânia”.
  - Altere o atributo duracaoEmMinutos do filme2 para 93.
  - Chame o método exibirDuracaoEmHoras() do filme2 para mostrar quantas horas o filme possui.
  - Exiba a mensagem: “Os filmes em cartaz são X e Y”, onde no lugar de X, deverá aparecer o título do filme1 e no lugar de Y deverá aparecer o título do filme2.
  - Instancie outros 5 filmes e faça as mesmas ações descritas acima, porém utilizando novos valores (você pode adicionar os filmes em um vetor caso queira)
<div>
