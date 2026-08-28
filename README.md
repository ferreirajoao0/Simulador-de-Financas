#  Simulador de Finanças e Investimentos (Tesouro Selic) em Java

Aplicação em **Java** desenvolvida para simular a evolução de rendimentos de um investimento em renda fixa (Tesouro Selic), considerando saldo inicial, aportes mensais recorrentes e acompanhamento de meta financeira via terminal.

---

## 📌 Funcionalidades

- **Simulação de Rendimento Composto:** Cálculo mensal de juros sobre o saldo acumulado.
- **Aportes Mensais Recorrentes:** Soma contínua do valor investido mês a mês.
- **Acompanhamento de Meta:** Verificação dinâmica para identificar exatamente em qual mês a meta financeira foi atingida.
- **Relatório de Desempenho:** Exibição detalhada do rendimento e saldo acumulado a cada mês, além do cálculo do valor restante caso a meta não seja alcançada.

---

## 🛠️ Conceitos & Boas Práticas Aplicados

- **Laços de Repetição (`for`):** Iteração mês a mês para processar o cálculo dos rendimentos e aportes de forma sequencial.
- **Estruturas Condicionais (`if-else`):** Validação e controle do status da meta financeira (flag `metaAlcancada`).
- **Entrada e Saída de Dados:** Uso de `Scanner` para interatividade e `printf` para formatação monetária e de valores decimais (`R$`).
- **Lógica Financeira:** Aplicação prática de conceitos de matemática financeira (juros compostos).

---

## 📂 Estrutura do Arquivo

```text
├── SimuladorFinancas.java  # Classe principal (Entry Point e Interface Terminal)
└── README.md               # Documentação do projeto
