# Kafka_Ecommerce
Projeto simulando um ecommerce, criado com Java e utilizando mensageria Kafka.
<br>
Feito para estudos de Apache Kafka a apartir do curso "Kafka: Produtores, Consumidores e streams" da Alura.


## Configurações
- Java 11 
- JDK 11
- Maven
- Windows (comandos utilizados nesse sistema operacional)

## Instalações necessárias
#### Importante mencionar que ao fazer os downloads dos softwares abaixo, devem ser utilizados na pasta raiz do disco (C:, D: ou E:), pois pode dar erro nos comandos de execução dos mesmos.
### Apache Kafka
Download no site  https://kafka.apache.org/downloads

Na propriedade "log.dirs", dentro da pasta do kafka, colocar a pasta usada (C:, D: ou E:) + o nome que foi salvo a pasta do Kafka + logs.

Exemplo: E:\\Kafka\\logs, ficando dessa forma: log.dirs=E:\\Kafka\\logs


### Zookeeper
Download no site http://zookeeper.apache.org/releases.html#download 

Dentro de "\conf", na pasta do Zookeeper, renomear o arquivo zoo_sample.cfg para zoo.cfg;

Alterar a propriedade "dataDir" da seguinte forma: dataDir=E:\\apache-zookeeper-3.8.0\\data

Criar o diretório E:\apache-zookeeper-3.8.0\data


## Antes de iniciar a aplicação
#### É necessário iniciar o Zookeeper e o Kafka, respectivamente, para tudo poder rodar.

Considerando que adicionei os downloads na pasta E:
###### Zookeeper
- E:\Users\Ana>cd E:\apache-zookeeper-3.8.0
- E:\apache-zookeeper-3.8.0>.\bin\zkserver

###### Kafka
- E:\Users\Ana>cd E:\Kafka>
- E:\Kafka>.\bin\windows\kafka-server-start.bat .\config\server.properties

## Comandos úteis
#### Criar tópico
kafka-topics.bat --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic mytopic1
#### Produzir mensagem do tópico
bin\windows\kafka-console-producer.bat --bootstrap-server localhost:9092 --topic mytopic1
#### Consumir mensagem do tópico
bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic mytopic1 --from-beginning
