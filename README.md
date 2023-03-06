# Invest+
Documentação da API

API para o controle de investimentos
## Endpoints
- [Transações](#Transações)
    - [Inserir Transação](#Inserir-Transação)
- [Reserva de Emergência](#Reserva-de-Emergência)
    - [Inserir média de gastos mensais](#Inserir-média-de-gastos-mensais)
    - [Mostrar quantidade sugerida para reserva](#Mostrar-quantidade-sugerida-para-reserva)
    - [Mostrar valor da reserva atual](#Mostrar-valor-da-reserva-atual)
- [Proventos](#Proventos)
    - [Filtrar](#Filtrar)
    - [Listar](#Listar)
- [Objetivos](#Objetivos)
    - [Mostrar total investido no mês](#Mostrar-total-investido-no-mês)
    - [Mostrar restante ou excedente da meta mensal](#Mostrar-restante-ou-excedente-da-meta-mensal)
- [Verificar Investimentos](#Verificar-Investimentos)
    - [Mostrar total investido](#Mostrar-total-investido)  
    - [Filtrar investimentos](#Filtrar-investimentos)  

---

### Transações
`POST` /invest+/api/transacao

| Parâmetro | Tipo | Obrigatório | Descrição |
| :--- | :--- | :--- | :--- |
| Compra/Venda | boolean | sim | Seleciona se a transação é de venda ou compra de ativo|
| Corretora | string | sim | Corretora na qual a transação foi efetuada|
| Data da Transação | date | sim | Data em que a transação foi efetuada|
| Categoria | string | sim | Categoria do ativo|
| Valor | float | sim | Valor da transação em R$|

**Exemplo de corpo do request**

```js
{
    "compra_venda": true,
    "corretora": "XP",
    "data_transacao": "10-10-2020",
    "categoria": "Ações",
    "valor": 1000.00
}
```

**Códigos de Resposta**

| Código | Descrição |
| :--- | :--- |
| 201 | Transação criada com sucesso |
| 400 | Erro na requisição |
| 500 | Erro interno do servidor |

---

### Reserva de Emergência

### Inserir média de gastos mensais

`POST` /invest+/api/reserva

| Parâmetro | Tipo | Obrigatório | Descrição |
| :--- | :--- | :--- | :--- |
| Valor | float | sim | Valor da média de gastos mensais|


**Exemplo de corpo do request**

```js
{
    "valor": 1000.00
}
```

**Códigos de Resposta**

| Código | Descrição |
| :--- | :--- |
| 201 | Média de gastos mensais inserida com sucesso |
| 400 | Erro na requisição |
| 500 | Erro interno do servidor |

---

### Mostrar quantidade sugerida para reserva

`GET` /invest+/api/reserva


**Códigos de Resposta**

| Código | Descrição |
| :--- | :--- |
| 200 | Quantidade sugerida para reserva retornada com sucesso |
| 400 | Erro na requisição |
| 500 | Erro interno do servidor |


---

### Mostrar valor da reserva atual

`GET` /invest+/api/reserva


**Códigos de Resposta**

| Código | Descrição |
| :--- | :--- |
| 200 | Valor da reserva atual retornada com sucesso |
| 400 | Erro na requisição |
| 500 | Erro interno do servidor |

---

### Proventos

### Filtrar

`GET` /invest+/api/proventos

| Parâmetro | Tipo | Obrigatório | Descrição |
| :--- | :--- | :--- | :--- |
| Categoria | string | não | Categoria do ativo|
| Corretora | string | não | Corretora na qual a transação foi efetuada|
| Data da Transação | date | não | Data em que a transação foi efetuada|

**Códigos de Resposta**

| Código | Descrição |
| :--- | :--- |
| 200 | Proventos filtrados com sucesso |
| 400 | Erro na requisição |
| 500 | Erro interno do servidor |

---

### Listar

`GET` /invest+/api/proventos


**Códigos de Resposta**

| Código | Descrição |
| :--- | :--- |
| 200 | Proventos listados com sucesso |
| 400 | Erro na requisição |
| 500 | Erro interno do servidor |

---

### Objetivos

### Mostrar total investido no mês

`GET` /invest+/api/objetivos


**Códigos de Resposta**

| Código | Descrição |
| :--- | :--- |
| 200 | Total investido no mês retornado com sucesso |
| 400 | Erro na requisição |
| 500 | Erro interno do servidor |

---

### Mostrar restante ou excedente da meta mensal

`GET` /invest+/api/objetivos


**Códigos de Resposta**

| Código | Descrição |
| :--- | :--- |
| 200 | Restante ou excedente da meta mensal retornado com sucesso |
| 400 | Erro na requisição |
| 500 | Erro interno do servidor |

---

### Verificar Investimentos

### Mostrar total investido

`GET` /invest+/api/investimentos


**Códigos de Resposta**

| Código | Descrição |
| :--- | :--- |
| 200 | Total investido retornado com sucesso |
| 400 | Erro na requisição |
| 500 | Erro interno do servidor |

---

### Filtrar investimentos

`GET` /invest+/api/investimentos

| Parâmetro | Tipo | Obrigatório | Descrição |
| :--- | :--- | :--- | :--- |
| Categoria | string | não | Categoria do ativo|
| Corretora | string | não | Corretora na qual a transação foi efetuada|

**Códigos de Resposta**

| Código | Descrição |
| :--- | :--- |
| 200 | Investimentos filtrados com sucesso |
| 400 | Erro na requisição |
| 500 | Erro interno do servidor |

---
