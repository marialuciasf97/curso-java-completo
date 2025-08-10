# 9. Compilação, interpretação, código fonte, código objeto, máquina virtual

## 9.1. Compilador
- Programa que transforma o código fonte em código objeto, realizando análise léxica e análise sintática.  
- Em linguagens compiladas, é a primeira etapa da geração de um executável.

## 9.2. Código Fonte
- Código escrito pelo programador em uma linguagem legível por humanos (ex.: `.c`, `.java`, `.py`).  
- Não pode ser executado diretamente pelo hardware — precisa ser traduzido.

## 9.3. Código Objeto
- Tradução do código fonte feita pelo compilador para um formato que o computador possa entender.  
- Em linguagens compiladas, normalmente é um arquivo intermediário (ex.: `.o` no C/C++).  
- Em linguagens híbridas (ex.: Java), o código objeto assume a forma de **bytecode**.

## 9.4. Bytecode
- Código intermediário gerado por compilação em linguagens híbridas.  
- É independente de sistema operacional, mas dependente da máquina virtual que o executa.  
- Exemplo: bytecode Java é executado pela **JVM**; bytecode C# é executado pelo **CLR**.

## 9.5. Tipos de Linguagens

### 9.5.1. Compiladas
**Fluxo:**  
`Código Fonte → Compilador → Código Objeto → Montador/Linker (build) → Executável`  

**Características:**  
- Geração de executável específico para o sistema operacional e arquitetura.  
- Execução direta pelo hardware, sem interpretador ou VM.  

**Exemplos:** C, C++.  

**Detalhamento:**  
O compilador realiza análise léxica e sintática, transformando o código fonte em código objeto.  
Depois, ferramentas como montador e linker geram o executável final, pronto para ser executado pelo sistema operacional.

### 9.5.2. Interpretadas
**Fluxo:**  
`Código Fonte → Interpretador → Execução imediata`  

**Características:**  
- Tradução e execução ocorrem linha a linha ou bloco a bloco, sob demanda.  

**Exemplos:** PHP, JavaScript, Python, Ruby.  

**Detalhamento:**  
O interpretador lê o código fonte, faz análise léxica e sintática em tempo real e executa instruções sob demanda.

### 9.5.3. Híbridas
**Fluxo:**  
`Código Fonte → Pré-compilador → Bytecode → Máquina Virtual → Execução`  

**Características:**  
- Compilação prévia para bytecode (portabilidade).  
- Execução via máquina virtual, que interpreta ou compila o bytecode em tempo de execução.  

**Exemplos:** Java, C#.  

**Detalhamento:**  
O código é compilado para bytecode, que é interpretado ou compilado dinamicamente pela máquina virtual, equilibrando desempenho e portabilidade.

## 9.6. Vantagens e Desvantagens

### 9.6.1. Linguagens Compiladas
**Vantagens:**  
- Alta velocidade de execução (tradução já feita previamente).  
- Detecção de erros antes da execução.  

**Desvantagens:**  
- Baixa portabilidade: precisa recompilar para cada plataforma.

### 9.6.2. Linguagens Interpretadas
**Vantagens:**  
- Alta flexibilidade para manutenção e alterações rápidas.  
- Portabilidade imediata (mesmo código roda em diferentes plataformas).  

**Desvantagens:**  
- Desempenho geralmente inferior a linguagens compiladas.

### 9.6.3. Linguagens Híbridas
**Vantagens:**  
- Combina portabilidade com desempenho razoável.  
- Possibilidade de otimizações em tempo de execução.  

**Desvantagens:**  
- Desempenho ainda menor que compiladas puras em alguns casos.
