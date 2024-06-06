### O fluxo geral:

- O usuário interage com os campos de entrada no formulário para criar, atualizar ou excluir um cachorro.
- Quando um desses botões é clicado,o método correspondente (criarCachorro(), atualizarCachorro(), deletarCachorro()) é chamado.
- Dentro desses métodos,aplico as funções apropriadas no CachorroDAO para realizar as operações no banco de dados.
- Depois de realizar a operação no banco de dados com sucesso,atualizo a TableView para refletir as mudanças.