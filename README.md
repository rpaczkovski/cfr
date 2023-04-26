## Chain of Responsibility em Java com Spring Boot
Este é um exemplo simples de como implementar o padrão de projeto Chain of Responsibility em Java com Spring Boot. O projeto é composto por um conjunto de classes que simulam um processo de enriquecimento de dados de uma Location, no qual cada classe tem a responsabilidade de realizar uma etapa específica do processo e, se necessário, passar a responsabilidade para a próxima classe.

O projeto também inclui um endpoint REST para receber uma requisição POST com um campo string chamado "location", que é o objeto de entrada para o processo de enriquecimento.

### Como executar

Para executar o projeto, é necessário ter o Java e o Maven instalados. Após clonar o repositório, navegue até o diretório raiz do projeto e execute o seguinte comando:

```bash
mvn spring-boot:run
```
Isso irá compilar o projeto e executá-lo, permitindo que você faça chamadas ao endpoint REST.

### Como utilizar o endpoint REST

O endpoint REST é /enrich e é um método POST que espera um corpo de requisição JSON com um campo chamado "location". O exemplo abaixo mostra um objeto JSON de exemplo:

```json
{
  "location": "Exemplo de Localização"
}
```

O endpoint retornará um objeto JSON com a string de resposta enriquecida.

Mais informações
Para saber mais sobre o padrão de projeto Chain of Responsibility e como ele é implementado em Java, consulte os seguintes recursos:

- [Chain of Responsibility em Refactoring Guru](https://refactoring.guru/design-patterns/chain-of-responsibility)
- [Chain of Responsibility em Tutorials Point](https://www.tutorialspoint.com/design_pattern/chain_of_responsibility_pattern.htm)