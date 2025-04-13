# Consulta de CEP - Java

Este é um projeto simples desenvolvido em Java que permite a consulta de endereços a partir de CEPs (Códigos de Endereçamento Postal) brasileiros. A aplicação utiliza uma API externa para obter os dados do endereço e os salva em formato JSON.

## 📌 Funcionalidades

- Consulta de endereço a partir de um CEP informado.
- Exibição dos dados do endereço no console.
- Geração de um arquivo `.json` com as informações retornadas.
- Tratamento de erros para CEPs inválidos ou não encontrados.

## 💻 Tecnologias Utilizadas

- **Java 21+**
- **Biblioteca HTTP (HttpClient, HttpRequest, HttpResponse)**
- **[ViaCEP](https://viacep.com.br/)**
- **Gson** para manipulação de JSON

## 🚀 Como Executar o Projeto

1. **Clone o repositório:**

   ```bash
   git clone https://github.com/seu-usuario/nome-do-repositorio.git

## 🧾 Exemplo de Saída JSON
```json
{
    "cep": "01001-000",
    "logradouro": "Praça da Sé",
    "complemento": "lado ímpar",
    "bairro": "Sé",
    "localidade": "São Paulo",
    "uf": "SP",
}
```
## 🛠️ Estrutura do Projeto
```
src/main/java/dev/lucaslowhan/viacep
                        ├── domain/
                        │   └── Endereco.java
                        │   └── ConsultaCep.java
                        │   └── GeradorDeArquivo.java
                        ├── main/
                        │   └── Main.java
                        
```
## 📦 Dependências

Se estiver usando Maven, adicione ao pom.xml:
```xml
<dependency>
  <groupId>com.google.code.gson</groupId>
  <artifactId>gson</artifactId>
  <version>2.10.1</version>
</dependency>
```
## 👤 Autor

**Lucas Lowhan**

Estudante de Engenharia de Software

[LinkedIn](https://www.linkedin.com/in/lucaslowhan/) | [GitHub](https://github.com/lucaslowhan)

