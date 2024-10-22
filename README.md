# Projeto de Controle de Fluxo em Java

Este projeto foi desenvolvido como parte de um desafio de projeto da Digital Innovation One (DIO), com o objetivo de praticar o controle de fluxo em Java. O projeto valida dois números inteiros fornecidos pelo usuário e lança uma exceção personalizada caso a validação falhe.

## Funcionalidade do Projeto

- O programa solicita dois números inteiros do usuário.
- Verifica se o segundo número é maior que o primeiro.
- Se o segundo número for menor ou igual ao primeiro, o programa lança uma exceção personalizada `InvalidParametersException`.
- Se a condição for válida, o programa exibe uma contagem incremental de 1 até a diferença entre os dois números.

## Estrutura do Projeto

O projeto é composto por:

1. **InvalidParametersException**: Exceção personalizada para sinalizar entradas inválidas.
2. **Accountant**: A classe principal que implementa a lógica de controle de fluxo e validação.

### Pacotes

- `dio.exceptions`: Contém a classe `InvalidParametersException`.
- `dio.main`: Contém a classe principal `Accountant`, que executa o programa.

### Exemplo de Execução

Caso o usuário insira dois números válidos, por exemplo, 3 e 7, o programa exibirá o seguinte resultado:

```sql
Enter the first parameter:
3
Enter the second parameter:
7
Printing number 1
Printing number 2
Printing number 3
Printing number 4
```

Se o segundo número for menor ou igual ao primeiro, o programa exibirá a seguinte mensagem de erro:

```sql
Enter the first parameter:
5
Enter the second parameter:
2
The second parameter must be greater than the first
```
