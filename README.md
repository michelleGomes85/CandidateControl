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
