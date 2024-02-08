package net.javaguides.publisher;

import net.javaguides.dto.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQJsonProducer {

    private static final Logger LOGGER = LoggerFactory.getLogger(RabbitMQJsonProducer.class);

    @Value("${spring.rabbitmq.exchange.json.name}")
    private String jsonExchange;

    @Value("${spring.rabbitmq.routingKey.json.name}")
    private String jsonRountingKey;


    private final RabbitTemplate rabbitTemplate;

    public RabbitMQJsonProducer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }


    public void sendJsonMessage(User user) {

        LOGGER.info(String.format("JsonMessage enviado -> %s", user.toString()));
        rabbitTemplate.convertAndSend(jsonExchange, jsonRountingKey, user);
    }

}
