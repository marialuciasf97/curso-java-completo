# Aula 018 - Primeiro programa em Java no Eclipse

## 18.1 Revisão do Workspace no Eclipse
- O workspace é a pasta onde o Eclipse armazena seus projetos.
- Ao abrir o Eclipse, você pode escolher ou criar um novo workspace.
- Essa pasta contém o `.metadata` que não deve ser alterado manualmente.

---

## 18.2 Perspectivas no Eclipse
- **Perspectiva** = layout de janelas adaptado a um tipo de trabalho (Java, Java EE, Debug, etc.).
- Alterar para **Java** (caso esteja em outra perspectiva): `Window` → `Perspective` → `Open Perspective` → `Java`.
- Resetar layout (caso tenha fechado alguma janela sem querer): `Window` → `Perspective` → `Reset Perspective`.

---

## 18.3 Exibir a aba Console
- Exibir/ocultar: `Window` → `Show View` → `Console`.
- O *Console* é usado para visualizar a saída dos programas Java.

---

## 18.4 Criando um projeto Java
1. Menu: `File` → `New` → `Java Project`.
2. Nome do projeto: `aula018_primeiro_programa_java` (evitar espaços e acentos).
3. Não criar módulo neste momento (*Don’t Create Module*).
4. O projeto conterá:
   - `src`: código-fonte.
   - Outras pastas internas do Eclipse.

---

## 18.5 Criar uma classe
1. Botão direito em `src` → `New` → `Class`.
2. Pacote: deixar vazio.
3. Nome: `Main` (inicial maiúscula).
4. Marcar a opção `public static void main(String[] args)`.
5. `Finish`.

---

## 18.6 Estrutura básica
- Todo código Java deve estar dentro de uma **classe**.
- O método **`public static void main(String[] args)`** é o **ponto de entrada** do programa.
- Código criado: [`primeiro programa java`](./src/Main.java)

---

## 18.7 Executando o programa
- Botão direito no arquivo → Run As → Java Application.
- A saída aparecerá na aba Console.