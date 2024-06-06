# ExercicioLP
Repositório criado a fim de organizar e entregar ytarefas da disciplina de Linguagem de Progração e Lab II do curo de Banco de dados.

Este projeto implementa várias soluções:

1. **Formulário JavaFX:** Implementa um formulário em JavaFX onde o usuário pode interagir com campos de entrada para criar, atualizar ou excluir informações sobre cachorros.

2. **Testes de Métodos:** Inclui testes para os métodos do projeto, garantindo que eles funcionem conforme o esperado.

3. **Banco de Dados:** Implementa um banco de dados para a classe Cachorro, permitindo que as operações CRUD (criar, ler, atualizar, deletar) sejam realizadas diretamente no banco de dados. Os dados são exibidos em uma TableView para o usuário.

### O fluxo geral:

- O usuário interage com os campos de entrada no formulário para criar, atualizar ou excluir um cachorro.
- Quando um desses botões é clicado, o método correspondente (criarCachorro(), atualizarCachorro(), deletarCachorro()) é chamado.
- Dentro desses métodos, aplicamos as funções apropriadas no CachorroDAO para realizar as operações no banco de dados.
- Depois de realizar a operação no banco de dados com sucesso, atualizamos a TableView para refletir as mudanças.

