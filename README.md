swagger link: http://localhost:8080/swagger-ui/index.html

Created a custom kafka topic in KafkaProducerConfig class with 7 partitions and published 
100000 messages which got distributed by zookepeer among the 7 partitions. Check the data in offset under 
new topic name "devesh-topic-2".