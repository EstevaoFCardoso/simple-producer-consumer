# Produtor e Consumidor Simples

## Pré-requisitos

Para rodar o projeto, você precisará ter instalados:

- [Kotlin](https://kotlinlang.org/) (Java 17)
- [Spring Boot 3+](https://spring.io/projects/spring-boot)
- [Docker](https://www.docker.com/)
- [Postman](https://www.postman.com/) (opcional, para testar as APIs)

## Passos para Executar o Projeto

### 1. Clonar o Repositório

Clone o projeto para uma pasta local:
 #### git clone <url-do-repositorio>

2. Subir os Serviços Necessários com Docker
Navegue até o diretório raiz do projeto no terminal e execute o seguinte comando:
 #### docker-compose up

3. Serviços que Serão Inicializados
Após o comando acima, 3 containers serão iniciados:

    - [Kafka]: Rodando na porta 9092
    - [Zookeeper]: Rodando na porta padrão 2181
    - [Kafdrop]: Interface de visualização do Kafka, rodando na porta 19000

![image](https://github.com/user-attachments/assets/f451d2fb-e18a-454d-a9fb-421e3c64eac9)

4. Acessar o Kafdrop
Abra o navegador e acesse:
http://localhost:19000/
Você verá uma tela semelhante a esta:
![image](https://github.com/user-attachments/assets/6b98a719-8b82-4c93-95b1-60ebb62701c2)

5. Startar o Produtor e o Consumidor
Com os serviços rodando, agora podemos iniciar nosso produtor e consumidor.

![image](https://github.com/user-attachments/assets/98fdaf85-ae2b-4bea-b719-6101573fb2a9)

![image](https://github.com/user-attachments/assets/6fbb233f-e525-4813-8777-a9a71b071317)

6. Enviar Mensagem via Postman
Abra o Postman e envie uma requisição POST para:
http://localhost:8000/api/sendMessage
![image](https://github.com/user-attachments/assets/03e1d368-03da-4cff-8aaa-156eea5c69cf)

7. Fluxo de Mensagem
O produtor enviará a mensagem, e o consumidor a receberá, processando-a conforme o fluxo do sistema.
![image](https://github.com/user-attachments/assets/94fcb07e-f597-476c-8b8f-118b6fd8c5e8)


Este README serve como um guia simples e direto para iniciar e testar o sistema.