<div align="center">

# ☕  Java — File Handling & Persistence

**A focused Java study project about file handling and data persistence — written, tested, and documented while learning.**

![Java](https://img.shields.io/badge/Java-File%20Handling-orange?logo=openjdk)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen)
![Level](https://img.shields.io/badge/Level-Beginner-blue)

<br>


**· [🇺🇸 English](#-english) · [🇧🇷 Português](#-português) · [🧭 Roadmap](#-learning-roadmap--roteiro-de-estudos) ·**


</div>

---

<details open>
<summary><strong>🇺🇸 English</strong></summary>

### 📖 About

This project explores file handling and data persistence in Java. It demonstrates how to write information to a text file, read its contents, handle input/output exceptions, and organize code by separating responsibilities into classes.

The project uses a simple name manager as a practical example.

### 🎯 Topics Covered

- **FileWriter:** Writing text to a file.
- **Append Mode:** Using `FileWriter("nomes.txt", true)` to append content without replacing existing data.
- **FileReader:** Opening a file for reading.
- **BufferedReader:** Reading text line by line.
- **readLine():** Retrieving a line from a file; returns `null` when the end of the file is reached.
- **System.lineSeparator():** Inserting a platform-appropriate line separator.
- **Try-with-resources:** Automatically closing file resources.
- **IOException:** Handling input/output errors with `try-catch`.
- **Classes and Objects:** Separating application flow from file operations.
- **Separation of Responsibilities:** Keeping the main class focused on program execution and the manager class responsible for file handling.

### 💻 Practical Example

**Writing names to a file**

```java
try (FileWriter escritor = new FileWriter("nomes.txt", true)) {
    escritor.write(nome);
    escritor.write(System.lineSeparator());
} catch (IOException e) {
    System.out.println("Error: " + e.getMessage());
}
```

**Reading names from a file**

```java
try (BufferedReader leitor =
         new BufferedReader(new FileReader("nomes.txt"))) {

    String linha;

    while ((linha = leitor.readLine()) != null) {
        System.out.println(linha);
    }

} catch (IOException e) {
    System.out.println("Error: " + e.getMessage());
}
```

### 🗂️ Project Structure

```text
GerenciadorNomes/
├── main1.java
├── GerenciadorNomes.java
└── nomes.txt
```

- `main1.java`: Receives user input and coordinates the program.
- `GerenciadorNomes.java`: Implements file-writing and file-reading operations.
- `nomes.txt`: Stores names persistently between program executions.

### 🧠 Key Concepts

**Memory vs. Persistence**

Data stored in an `ArrayList` exists in memory and is not automatically saved when the program terminates. A text file allows information to persist between executions.

**Reading vs. Writing**

`FileWriter` writes information to a file, while `BufferedReader` reads its contents. These classes serve different purposes and can work together.

**Separation of Responsibilities**

Organizing file operations in a dedicated class makes the main class simpler and the code easier to maintain.

### 🛣️ Roadmap

- [x] Write text to a file.
- [x] Append data without replacing existing contents.
- [x] Read a file line by line.
- [x] Use try-with-resources.
- [x] Handle `IOException`.
- [x] Separate program flow from file operations.

</details>

---

<details>
<summary><strong>🇧🇷 Português</strong></summary>

### 📖 Sobre

Este projeto explora o tratamento de arquivos e a persistência de dados em Java. Demonstra como escrever informações em um arquivo de texto, ler seu conteúdo, tratar exceções de entrada e saída e organizar o código separando responsabilidades entre classes.

O projeto utiliza um gerenciador de nomes como exemplo prático.

### 🎯 Conteúdos Estudados

- **FileWriter:** Escrita de texto em arquivos.
- **Modo Append:** Uso de `FileWriter("nomes.txt", true)` para acrescentar conteúdo sem substituir os dados existentes.
- **FileReader:** Abertura de arquivos para leitura.
- **BufferedReader:** Leitura de texto linha por linha.
- **readLine():** Leitura de uma linha do arquivo; retorna `null` quando o fim do arquivo é alcançado.
- **System.lineSeparator():** Inserção de uma quebra de linha compatível com o sistema operacional.
- **Try-with-resources:** Fechamento automático dos recursos utilizados.
- **IOException:** Tratamento de erros de entrada e saída com `try-catch`.
- **Classes e Objetos:** Separação do fluxo principal das operações com arquivos.
- **Separação de Responsabilidades:** Manutenção da classe principal focada na execução e da classe gerenciadora responsável pelos arquivos.

### 💻 Exemplo Prático

**Escrevendo nomes em um arquivo**

```java
try (FileWriter escritor = new FileWriter("nomes.txt", true)) {
    escritor.write(nome);
    escritor.write(System.lineSeparator());
} catch (IOException e) {
    System.out.println("Erro: " + e.getMessage());
}
```

**Lendo nomes de um arquivo**

```java
try (BufferedReader leitor =
         new BufferedReader(new FileReader("nomes.txt"))) {

    String linha;

    while ((linha = leitor.readLine()) != null) {
        System.out.println(linha);
    }

} catch (IOException e) {
    System.out.println("Erro: " + e.getMessage());
}
```

### 🗂️ Estrutura do Projeto

```text
GerenciadorNomes/
├── main1.java
├── GerenciadorNomes.java
└── nomes.txt
```

- `main1.java`: Recebe a entrada do usuário e coordena o programa.
- `GerenciadorNomes.java`: Implementa as operações de escrita e leitura de arquivos.
- `nomes.txt`: Armazena os nomes de forma persistente entre execuções.

### 🧠 Conceitos Importantes

**Memória vs. Persistência**

Os dados armazenados em um `ArrayList` permanecem na memória e não são salvos automaticamente quando o programa termina. Um arquivo de texto permite preservar informações entre execuções.

**Leitura vs. Escrita**

`FileWriter` escreve informações em um arquivo, enquanto `BufferedReader` lê seu conteúdo. Essas classes possuem funções diferentes e podem trabalhar em conjunto.

**Separação de Responsabilidades**

Organizar as operações com arquivos em uma classe dedicada simplifica a classe principal e facilita a manutenção do código.

### 🛣️ Roadmap

- [x] Escrever texto em um arquivo.
- [x] Acrescentar dados sem substituir o conteúdo existente.
- [x] Ler arquivos linha por linha.
- [x] Utilizar try-with-resources.
- [x] Tratar `IOException`.
- [x] Separar o fluxo do programa das operações com arquivos.



---

## 🚀 Next Steps

Continue developing the project by implementing an interactive menu and expanding the name manager with search and removal operations.

Continue desenvolvendo o projeto com a implementação de um menu interativo e a expansão do gerenciador de nomes com operações de pesquisa e remoção.

## 📚 Repository

Part of the **Java-Learning-Library**, a collection of practical projects documenting the learning process from Java fundamentals to more advanced concepts.

Parte da **Java-Learning-Library**, uma coleção de projetos práticos que documentam o processo de aprendizagem, desde os fundamentos de Java até conceitos mais avançados.

**Made with ☕, curiosity, and consistency.**  
**Feito com ☕, curiosidade e consistência.**
