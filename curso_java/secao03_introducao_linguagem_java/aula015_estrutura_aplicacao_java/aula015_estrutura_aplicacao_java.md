# Aula 015 - Estrutura de uma Aplicação Java

## 15.1 Introdução
Antes de vermos na prática, é importante entender os conceitos fundamentais sobre a estrutura de uma aplicação Java.  
O Java é uma linguagem orientada a objetos, e sua organização segue níveis **lógicos** e **físicos**, que ajudam a manter o código limpo, modular e escalável.

## 15.2 Classe
- **Definição:** É a unidade lógica básica de um programa Java orientado a objetos.
- Todo código Java precisa estar dentro de uma classe.
- **Exemplos de classes:**
  - Produto
  - Cliente
  - Pedido

## 15.3 Pacote (Package)
- **Definição:** Agrupamento lógico de classes relacionadas.
- Serve para organizar e categorizar partes do código.
- **Exemplo de uso:**
  - Pacote `entities` para classes que representam entidades de negócio (`Produto`, `Cliente`, `Pedido`).
  - Pacote `services` para classes que implementam lógica de serviços (`EmailService`, `PedidoService`, `LoginService`).
  - Pacote `repositories` para classes responsáveis por acesso a dados (`ProdutoRepository`, `ClienteRepository`).

## 15.4 Módulo (Module) — Introduzido no Java 9
- **Definição:** Agrupamento lógico de pacotes relacionados.
- Permite maior organização e controle de dependências.
- **Exemplo 1:** Módulo `financeiro` contendo:
  - Pacote `entities` (classes de entidades financeiras)
  - Pacote `services` (serviços de cálculos, faturamento, etc.)
  - Pacote `repositories` (acesso a dados financeiros)
- **Exemplo 2:** Módulo `graficos` contendo:
  - Pacote `graphics2D`
  - Pacote `graphics3D`
  - Pacote `utils` (utilitários gráficos)

## 15.5 Agrupamento Lógico x Agrupamento Físico
- **Agrupamento Lógico:** Organização no nível conceitual e de código-fonte (classes, pacotes, módulos).
- **Agrupamento Físico:** Representação compilada, gerada no *build time* (tempo de construção), que produz artefatos físicos como:
  - Arquivos `.class`
  - Arquivos `.jar` (Java Archive)
  - Arquivos `.war` (Web Application Archive)
- O agrupamento físico é a unidade instalada/executada no ambiente de produção.

## 15.6 Aplicação
- **Definição:** Um agrupamento de módulos relacionados que compõem o sistema final.
- **Exemplo:** Um sistema de comércio eletrônico pode ter:
  - Módulo financeiro
  - Módulo estoque
  - Módulo vendas
  - Módulo clientes

## 15.7 Exemplo de Hierarquia
Uma aplicação Java é o sistema completo, que contém módulos, pacotes e classes organizados logicamente.  

**Aplicação:** `loja-online`  

**Estrutura de Módulos, Pacotes e Classes:**
```
Aplicação: loja-online  
│  
├── Módulo: modulo.produto  
│     ├── Pacote: produto.entities  
│     │     ├── Produto.java  
│     │     └── Categoria.java  
│     ├── Pacote: produto.services  
│     │     └── ProdutoService.java  
│     └── Pacote: produto.repositories  
│           └── ProdutoRepository.java  
│  
├── Módulo: modulo.pedido  
│     ├── Pacote: pedido.entities  
│     │     ├── Pedido.java  
│     │     └── ItemPedido.java  
│     ├── Pacote: pedido.services  
│     │     └── PedidoService.java  
│     └── Pacote: pedido.repositories  
│           └── PedidoRepository.java  
│  
└── Módulo: modulo.financeiro  
      ├── Pacote: financeiro.entities  
      │     └── Pagamento.java  
      ├── Pacote: financeiro.services  
      │     └── PagamentoService.java  
      └── Pacote: financeiro.repositories  
            └── PagamentoRepository.java  
```

No **agrupamento lógico** (visão do desenvolvedor), o módulo `modulo.produto` contém: 

`produto.entities.Produto`,  
`produto.entities.Categoria`,  
`produto.services.ProdutoService` e  
`produto.repositories.ProdutoRepository`.  

No **agrupamento físico** (após compilação), os arquivos gerados seriam algo como
`modulo.produto.jar` contendo:  

`produto/entities/Produto.class`,  
`produto/entities/Categoria.class`,  
`produto/services/ProdutoService.class`, e
`produto/repositories/ProdutoRepository.class`.  

**Resumo:**  
- A aplicação é o sistema completo;  
- O módulo agrupa pacotes relacionados;  
- O pacote agrupa classes relacionadas;  
- A classe é a unidade básica de código;  
- O agrupamento lógico é a organização do código-fonte;  
- E o agrupamento físico é o resultado compilado pronto para execução.