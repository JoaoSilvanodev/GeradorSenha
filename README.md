# 🔐 Gerador de Senhas Java FX

Um aplicativo de geração de senhas aleatórias e seguras com interface gráfica moderna desenvolvido em JavaFX.

## 📋 Descrição

O **Gerador de Senhas JavaFX** é uma aplicação desktop que permite gerar senhas aleatórias de forma rápida e segura. O aplicativo utiliza `SecureRandom` para gerar senhas criptograficamente seguras com caracteres variados (letras maiúsculas, minúsculas, números e símbolos especiais).

## ✨ Funcionalidades

- 🎯 Geração de senhas aleatórias seguras
- 📏 Customização do tamanho da senha
- 🔤 Suporte a múltiplos tipos de caracteres:
  - Letras maiúsculas (A-Z)
  - Letras minúsculas (a-z)
  - Números (0-9)
  - Caracteres especiais (!@#$%^&*()_+)
- 🎨 Interface gráfica intuitiva com JavaFX
- 🔒 Uso de `SecureRandom` para máxima segurança

## 🛠️ Tecnologias Utilizadas

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

## 📖 Como Usar

1. **Inicie o aplicativo** utilizando um dos comandos acima
2. **Janela da aplicação abre** com campos de entrada
3. **Digite o tamanho desejado** para a senha no campo "Tamanho da Senha:" (padrão: 8)
4. **Clique no botão "Gerar Senha"** para gerar uma nova senha
5. **A senha gerada aparece** no campo "Senha Gerada:" em destaque (texto cyan em fundo preto)
6. **Copie a senha** do campo e use conforme necessário

## 📁 Estrutura do Projeto

```
GeradorDeSenhasJavaFx/
├── src/
│   └── main/
│       └── java/
│           ├── module-info.java
│           └── joao/projetos/geradordesenhasjavafx/
│               ├── GeradorDeSenhas.java      (Lógica de geração)
│               ├── Launcher.java              (Ponto de entrada)
│               └── ProjetoGeradorDeSenhasGUI.java (Interface)
├── target/                                    (Arquivos compilados)
├── pom.xml                                    (Configuração Maven)
├── mvnw                                       (Maven Wrapper - Linux/Mac)
├── mvnw.cmd                                   (Maven Wrapper - Windows)
└── README.md                                  (Este arquivo)
```

## 🔧 Classes Principais

### GeradorDeSenhas.java
Contém a lógica principal de geração de senhas seguras.

```java
// Método público para gerar senhas
public static String gerarSenha(int comprimento)
```

**Características:**
- Utiliza `SecureRandom` para segurança criptográfica
- Suporta tamanhos variáveis de senha
- Inclui caracteres especiais para maior complexidade

### Launcher.java
Classe de inicialização que lança a aplicação JavaFX.

```java
public static void main(String[] args) {
    Application.launch(ProjetoGeradorDeSenhasGUI.class, args);
}
```

### ProjetoGeradorDeSenhasGUI.java
Interface gráfica baseada em JavaFX.

**Componentes:**
- `Label` - Rótulos para os campos
- `TextField` - Campos de entrada e saída
- `Button` - Botão para gerar senhas
- `VBox` - Layout vertical da interface

## 🧪 Testes

Para executar os testes unitários:

```bash
./mvnw test
```

## 🤝 Contribuindo

Contribuições são bem-vindas! Por favor:

1. Faça um fork do projeto
2. Crie uma branch para sua feature (`git checkout -b feature/AmazingFeature`)
3. Commit suas mudanças (`git commit -m 'Add some AmazingFeature'`)
4. Push para a branch (`git push origin feature/AmazingFeature`)
5. Abra um Pull Request

## 🐛 Problemas Conhecidos

- Nenhum no momento. Reporte problemas [aqui](../../issues).

## 📝 Melhorias Futuras

- [ ] Opção de copiar senha automaticamente para a área de transferência
- [ ] Permite customizar quais caracteres incluir na geração
- [ ] Histórico de senhas geradas
- [ ] Validação de força da senha
- [ ] Suporte a múltiplos idiomas
- [ ] Tema escuro/claro

## 📄 Licença

Este projeto está sob a licença **MIT**. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

## 👨‍💻 Autor

**João Pedro** - Desenvolvedor Java

## 📞 Contato

- GitHub: [@seu-usuario](https://github.com/seu-usuario)
- Email: seu-email@exemplo.com

---

<div align="center">

**💡 Dica:** Use senhas geradas por este aplicativo para proteger suas contas online!

Feito com ❤️ em Java

</div>

