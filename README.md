
# Desafio Internal Talent

Este projeto é um desafio que utiliza Java 17 e Spring Boot para criar uma API para gerenciar clientes, produtos e pedidos. Além disso, testes podem ser realizados no Postman.

## Criação do Cliente

Para criar um cliente, faça uma solicitação POST com o seguinte JSON:

```json
{
 "nome": "marcelo",
 "cpf": "00000000000"
}
```

## Criação do Produto

Para criar um produto, faça uma solicitação POST com o seguinte JSON:

```json
{
 "descricao": "carro",
 "preco": 50000
}
```

## Criação do Pedido

Para criar um pedido, faça uma solicitação POST com o seguinte JSON:

```json
{
  "cliente": 1,
  "total": 50000,
  "items": [{"produto": 1, "quantidade": 1}]
}
```

## Consultar Pedido

Para consultar um pedido, você pode fazer uma solicitação GET.

![Consultar Pedido](https://github.com/adolfobjj/internalTalent/assets/47535842/30a34593-27e8-4717-b4d0-7e1343421215)
```
