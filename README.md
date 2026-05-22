# Gerador de Senhas Java FX

Um aplicativo de geração de senhas aleatórias e seguras com interface gráfica moderna desenvolvido em JavaFX.

## Descrição

O Gerador de Senhas JavaFX é uma aplicação desktop que permite gerar senhas aleatórias de forma rápida e segura. O aplicativo utiliza SecureRandom para gerar senhas criptograficamente seguras com caracteres variados (letras maiúsculas, minúsculas, números e símbolos especiais).

## Funcionalidades

- Geração de senhas aleatórias seguras
- Customização do tamanho da senha
- Suporte a múltiplos tipos de caracteres:
  - Letras maiúsculas (A-Z)
  - Letras minúsculas (a-z)
  - Números (0-9)
  - Caracteres especiais (!@#$%^&*()_+)
- Interface gráfica intuitiva com JavaFX
- Uso de SecureRandom para máxima segurança

## Tecnologias Utilizadas

- **Java 22**
- **JavaFX 21.0.6** - Framework para interface gráfica
- **Maven** - Gerenciador de dependências e build
- **JUnit 5** - Framework para testes unitários

## 📦 Pré-requisitos

Antes de executar o projeto, certifique-se de ter instalado:

- **Java Development Kit (JDK) 22** ou superior
  ```bash
  java -version
  ```
- **Maven 3.6.0** ou superior
  ```bash
  mvn -version
  ```

## 🚀 Instalação e Execução

### 1. Clone o repositório

```bash
git clone https://github.com/seu-usuario/GeradorDeSenhasJavaFx.git
cd GeradorDeSenhasJavaFx
```

### 2. Compile o projeto

```bash
./mvnw clean compile
```

### 3. Crie um arquivo JAR executável

```bash
./mvnw clean package
```

### 4. Execute o aplicativo

**Opção 1: Via Maven (recomendado)**
```bash
./mvnw javafx:run
```

**Opção 2: Via linha de comando (modo console)**
```bash
java joao.projetos.geradordesenhasjavafx.Launcher
```

**Opção 3: Execute o JAR gerado**
```bash
java -jar target/GeradorDeSenhasJavaFx-1.0-SNAPSHOT.jar
```

## Como Usar

1. **Inicie o aplicativo** utilizando um dos comandos acima
2. **Janela da aplicação abre** com campos de entrada
3. **Digite o tamanho desejado** para a senha no campo "Tamanho da Senha:" (padrão: 8)
4. **Clique no botão "Gerar Senha"** para gerar uma nova senha
5. **A senha gerada aparece** no campo "Senha Gerada:" em destaque (texto cyan em fundo preto)
6. **Copie a senha** do campo e use conforme necessário

## Estrutura do Projeto

```
GeradorDeSenhasJavaFx/
├── src/main/java/
│   ├── module-info.java
│   └── joao/projetos/geradordesenhasjavafx/
│       ├── GeradorDeSenhas.java
│       ├── Launcher.java
│       └── ProjetoGeradorDeSenhasGUI.java
├── pom.xml
└── README.md
```

## Arquivos Principais

GeradorDeSenhas.java - Contém a lógica de geração de senhas seguras utilizando SecureRandom.

Launcher.java - Classe de inicialização que lança a aplicação JavaFX.

ProjetoGeradorDeSenhasGUI.java - Interface gráfica da aplicação.

## Licença

MIT

