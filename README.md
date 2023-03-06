# Invest
Documentação da API
API para o controle de investimentos
## Endpoints
- Transações
    - [Inserir Transação](#Inserir-Transação)
- Reserva de Emergência
    - Inserir média de gastos mensais
    - *Mostrar quantidade sugerida para reserva
    - Mostrar valor da reserva atual
- Proventos
    - Filtrar
    - Listar
- Objetivos
    - Mostrar total investido no mês
    - Mostrar restante ou excedente da meta mensal
- Verificar Investimentos
    - Mostrar total investido
    - Filtrar investimentos

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
| 
