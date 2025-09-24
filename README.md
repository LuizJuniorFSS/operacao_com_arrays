# Operações com Arrays - Programa Java

## 📋 Descrição do Projeto

Este programa Java demonstra operações fundamentais com arrays unidimensionais e multidimensionais (matrizes). Foi desenvolvido para fins educacionais, mostrando como criar, manipular e realizar cálculos com diferentes tipos de estruturas de dados em Java.

## 🎯 Objetivos

O programa foi projetado para:

1. **Array Unidimensional**: Criar um array que armazene 5 números inteiros fornecidos pelo usuário
2. **Cálculos**: Calcular e exibir a soma dos valores do array
3. **Matriz 3x3**: Criar uma matriz bidimensional e permitir entrada de dados pelo usuário
4. **Exibição Tabular**: Mostrar os valores da matriz em formato organizado
5. **Operações Matemáticas**: Calcular a soma de todos os elementos da matriz

## 🚀 Como Executar

### Pré-requisitos
- Java JDK 8 ou superior instalado
- Terminal/Prompt de comando

### Passos para Execução

1. **Compilar o programa:**
   ```bash
   javac OperacaoComArrays.java
   ```

2. **Executar o programa:**
   ```bash
   java OperacaoComArrays
   ```

3. **Seguir as instruções na tela:**
   - Digite 5 números inteiros para o array unidimensional
   - Digite 9 números inteiros para preencher a matriz 3x3

## 📊 Funcionalidades Implementadas

### Array Unidimensional
- ✅ Entrada de 5 números inteiros pelo usuário
- ✅ Cálculo automático da soma dos elementos
- ✅ Exibição dos elementos em formato de lista
- ✅ Cálculo e exibição da média dos elementos
- ✅ Tratamento de erros para entradas inválidas

### Matriz 3x3
- ✅ Entrada de 9 números inteiros organizados em 3 linhas e 3 colunas
- ✅ Exibição em formato tabular profissional com bordas
- ✅ Cálculo da soma total de todos os elementos
- ✅ Cálculo e exibição da média dos elementos
- ✅ Soma individual por linha e por coluna
- ✅ Tratamento de erros para entradas inválidas

### Recursos Adicionais
- ✅ Interface de usuário clara e organizada
- ✅ Validação robusta de entrada de dados
- ✅ Documentação completa do código (JavaDoc)
- ✅ Tratamento de exceções
- ✅ Formatação profissional da saída

## 📝 Checklist de Requisitos

### ✅ Requisitos Funcionais Atendidos

- [x] **O programa permite que o usuário insira 5 números em um array unidimensional**
  - Implementado na função `criarArrayUnidimensional()`
  - Inclui validação de entrada e tratamento de erros

- [x] **A soma dos valores do array unidimensional é calculada corretamente**
  - Implementado na função `calcularSomaArray()`
  - Utiliza enhanced for loop para eficiência

- [x] **O programa cria uma matriz 3x3 e permite que o usuário insira valores**
  - Implementado na função `criarMatriz3x3()`
  - Interface intuitiva com indicação de posição

- [x] **Os valores da matriz são exibidos no formato tabular**
  - Implementado na função `exibirResultadosMatriz()`
  - Formato profissional com bordas e alinhamento

- [x] **A soma de todos os elementos da matriz é calculada e exibida corretamente**
  - Implementado na função `calcularSomaMatriz()`
  - Inclui informações adicionais como média e somas por linha/coluna

### 🔧 Recursos Técnicos Implementados

- [x] **Tratamento de Exceções**: InputMismatchException para entradas inválidas
- [x] **Validação de Dados**: Loop de validação para garantir entrada correta
- [x] **Documentação**: JavaDoc completo para todas as funções
- [x] **Organização**: Código modularizado em funções específicas
- [x] **Interface**: Saída formatada e profissional

## 🤔 Análise Técnica - Perguntas e Respostas

### ❓ **1. Quais são as diferenças práticas entre arrays unidimensionais e multidimensionais?**

**📋 Resposta:**

**Arrays Unidimensionais:**
- **Estrutura**: Linear simples, como uma lista sequencial
- **Acesso aos dados**: Direto por índice único → `array[i]`
- **Uso de memória**: Menor consumo de memória
- **Aplicações práticas**: Ideal para listas de dados sequenciais (ex: notas de alunos, temperaturas diárias)
- **Complexidade**: Mais simples de implementar e manipular

**Arrays Multidimensionais (Matrizes):**
- **Estrutura**: Tabular com linhas e colunas
- **Acesso aos dados**: Por múltiplos índices → `matriz[i][j]`
- **Uso de memória**: Maior consumo devido à estrutura bidimensional
- **Aplicações práticas**: Ideal para dados organizados em tabelas (ex: planilhas, jogos de tabuleiro, imagens)
- **Complexidade**: Mais complexo, mas oferece melhor organização para dados relacionais

---

### ❓ **2. Quais são as principais limitações dos arrays utilizados neste programa?**

**📋 Resposta:**

1. **🔒 Tamanho Fixo**
   - Uma vez criados, não podem ser redimensionados
   - Necessário definir o tamanho no momento da criação
   - Não é possível adicionar ou remover elementos dinamicamente

2. **🎯 Tipo Homogêneo**
   - Todos os elementos devem ser do mesmo tipo de dados
   - Não é possível misturar diferentes tipos (int, String, etc.) no mesmo array
   - Limitação para estruturas de dados mais flexíveis

3. **💾 Memória Contígua**
   - Requer um bloco contínuo de memória
   - Pode falhar em sistemas com memória fragmentada
   - Limitação para arrays muito grandes

4. **⚙️ Funcionalidades Limitadas**
   - Sem métodos integrados para operações complexas
   - Não possui funcionalidades como busca, ordenação ou filtragem nativas
   - Comparado às Collections (ArrayList, LinkedList), oferece menos recursos

---

### ❓ **3. Como o desempenho do programa pode ser afetado por arrays muito grandes?**

**📋 Resposta:**

**✅ Vantagens de Performance:**

- **🚀 Acesso Rápido**: Complexidade O(1) para acessar elementos por índice
- **💡 Eficiência de Memória**: Sem overhead de objetos adicionais
- **🎯 Cache-Friendly**: Localidade de memória favorece o cache do processador
- **⚡ Operações Aritméticas**: Cálculos diretos sem indireções

**⚠️ Desvantagens e Limitações:**

- **🐌 Alocação Inicial Custosa**: 
  - Criação de arrays muito grandes pode ser lenta
  - Busca por bloco contíguo de memória pode demorar

- **📊 Operações de Cópia**: 
  - Complexidade O(n) para copiar arrays completos
  - Movimentação de grandes volumes de dados

- **💥 Risco de OutOfMemoryError**: 
  - Arrays extremamente grandes podem esgotar a memória disponível
  - Especialmente crítico em sistemas com pouca RAM

- **🔧 Fragmentação de Memória**: 
  - Em sistemas com pouca RAM, pode não haver espaço contíguo suficiente
  - Força o garbage collector a trabalhar mais intensivamente

- **⏱️ Impacto em Operações Matemáticas**:
  - Somas e cálculos em arrays grandes aumentam proporcionalmente o tempo de processamento
  - Necessário considerar algoritmos otimizados para grandes volumes

## 📁 Estrutura do Projeto

```
operacao_com_arrays/
├── OperacaoComArrays.java    # Classe principal com toda a lógica
└── README.md                 # Documentação do projeto
```

### 🖥️ Execução no Terminal

![Screenshot 1](https://raw.githubusercontent.com/LuizJuniorFSS/operacao_com_arrays/master/screenshot%20(1).png)

![Screenshot 2](https://raw.githubusercontent.com/LuizJuniorFSS/operacao_com_arrays/master/screenshot%20(2).png)

## 🧪 Exemplos de Uso

### Exemplo de Execução - Array Unidimensional
```
Digite 5 números inteiros para o array:
Número 1: 10
Número 2: 20
Número 3: 30
Número 4: 40
Número 5: 50

RESULTADOS DO ARRAY UNIDIMENSIONAL:
Elementos do array: [10, 20, 30, 40, 50]
Soma dos elementos: 150
Média dos elementos: 30.00
```

### Exemplo de Execução - Matriz 3x3
```
Digite os valores para preencher a matriz 3x3:
Linha 1:
Posição [1][1]: 1
Posição [1][2]: 2
Posição [1][3]: 3
...

Matriz em formato tabular:
┌─────────┬─────────┬─────────┐
│       1 │       2 │       3 │
├─────────┼─────────┼─────────┤
│       4 │       5 │       6 │
├─────────┼─────────┼─────────┤
│       7 │       8 │       9 │
└─────────┴─────────┴─────────┘

Soma de todos os elementos: 45
```

## 👨‍💻 Autor

Sistema de Operações com Arrays - Versão 1.0

## 📄 Licença

Este projeto é de uso educacional e está disponível para fins de aprendizado.
