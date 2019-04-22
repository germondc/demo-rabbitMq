package test.clyde.rabbitMqTest;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

@RabbitListener(queues = "hello")
public class Receiver {

    @RabbitHandler
    public void receiveMessage(String message) {
        System.out.println("Received <" + message + ">");
    }
}
