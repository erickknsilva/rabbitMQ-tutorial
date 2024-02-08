package net.javaguides.controller;

import net.javaguides.publisher.RabbitMQProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class MessageController {

    private final RabbitMQProducer rabbitMQProducer;

    public MessageController(RabbitMQProducer rabbitMQProducer) {
        this.rabbitMQProducer = rabbitMQProducer;
    }


    @GetMapping("/publish/{message}")
    public ResponseEntity<String> publisher(@PathVariable String message) {
        rabbitMQProducer.sendMessage(message);
        return ResponseEntity.ok("Messagem enviada para o RabbitMQ ...");
    }
}
