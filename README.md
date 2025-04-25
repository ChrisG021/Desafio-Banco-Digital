
# 💳 Banco Digital em Java

Projeto de simulação de um banco digital simples utilizando conceitos fundamentais de **POO (Programação Orientada a Objetos)** em Java.

## 📌 Sobre o Projeto

Este sistema permite a criação e manipulação de contas bancárias do tipo **Corrente** e **Poupança**, incluindo operações como depósito, saque e transferência. O projeto foi estruturado com foco na prática de encapsulamento, herança, polimorfismo e uso de classes abstratas e interfaces.

---

## 🧠 Conceitos Aplicados

- **Encapsulamento**: Uso de getters/setters para proteger atributos.
- **Abstração**: Classe `Conta` como base abstrata para tipos de conta.
- **Herança**: `ContaCorrente` e `ContaPoupanca` estendem `Conta`.
- **Polimorfismo**: Uso da interface `IConta` para ações bancárias.
- **`instanceof`**: Identificação dinâmica de tipos de conta em tempo de execução.

---

## 📁 Estrutura do Projeto

```bash
src/
│
├── banco/
│   ├── Banco.java
│   └── Cliente.java
│
├── banco/conta/
│   ├── Conta.java
│   ├── ContaCorrente.java
│   ├── ContaPoupanca.java
│   └── Iconta.java
│
└── Main.java
```

---

## ⚙️ Como Executar

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/seuusuario/banco-java.git
   cd banco-java
   ```

2. **Compile e execute com o terminal** (assumindo que o `javac` e `java` estão no PATH):
   ```bash
   javac banco/Cliente.java banco/Banco.java banco/conta/*.java Main.java
   java Main
   ```

---

## ✅ Funcionalidades

- Criar contas corrente e poupança
- Depositar valores
- Sacar valores
- Transferir entre contas
- Buscar conta por número ou nome do titular
- Listar todas as contas cadastradas
- Imprimir extrato personalizado com base no tipo de conta

---

## 🧪 Exemplo de Uso

### Criando Contas e Fazendo Operações

```java
Conta conta1 = new ContaCorrente("Chris");
Conta conta2 = new ContaCorrente("Maicon");
Conta conta3 = new ContaPoupanca("Maicon");

bb.adicionarContaCorrente(conta1);
bb.adicionarContaCorrente(conta2);
bb.adicionarContaPoupanca(conta3);

conta1.depositar(1000);
conta2.depositar(7000);
conta2.transferir(5223, conta3);
```

### Buscando por titular

```java
List<Conta> contasMaicon = bb.buscarPorNomeTitular("maicon");
for (Conta c : contasMaicon) {
    if (c instanceof ContaCorrente) {
        System.out.println("[Conta Corrente]");
    } else if (c instanceof ContaPoupanca) {
        System.out.println("[Conta Poupança]");
    }
    c.imprimirExtrato();
}
```

---

## 📚 Tecnologias

- Java 8+
- Terminal para execução
- Paradigmas de POO

---

## 📌 Possíveis Melhorias Futuras

- Interface de usuário via terminal com `Scanner`
- Persistência de dados com arquivos ou banco de dados
- Interface gráfica (Swing/JavaFX)
- Tratamento de exceções personalizadas

---

## 🧑‍💻 Autor

Desenvolvido por [Seu Nome] - estudante de Ciência da Computação, entusiasta de Java e POO.

---
