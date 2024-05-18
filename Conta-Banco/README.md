## Desafio Simulando Uma Conta Bancária Através Do Terminal/Console

- eu tinha que cria uma simple cadastro local de criação de uma conta. onde o usuario digitava seu dados e recebia uma mensagem de confirmação.
- tinha que usar o Scanner para que o usuário conseguisse digita no termianl os dados

## Tipo de erro.
- logo quando eu rodava o sistema dava um erro de "Resource leak: 'scanner' is never closed".
- Em Java, é uma boa prática fechar recursos que utilizam I/O, como Scanner, para liberar os recursos do sistema associados a ele.
- Para corrigir este problema eu coloquei um scanner.close() no final da aplicação.
