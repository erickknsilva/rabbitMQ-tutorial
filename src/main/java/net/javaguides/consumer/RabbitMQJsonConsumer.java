package net.javaguides.consumer;

import net.javaguides.dto.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@RabbitListener(queues = "${spring.rabbitmq.queue.json.name}")
public class RabbitMQJsonConsumer {

    private static Logger logger = LoggerFactory.getLogger(RabbitMQJsonConsumer.class.toString());

    @RabbitHandler
    public void receiver(User user) {
        logger.info(String.format("Message Json recebida id: %d, nome: %s, email:%s", user.getId(), user.getName(), user.getEmail()));
    }

}
