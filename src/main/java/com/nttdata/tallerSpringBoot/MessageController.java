package com.nttdata.tallerSpringBoot;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Autowired
    public MessageServiceImpl messageService;

    @Value("${course.message}")
    private String message;
/*
    // Pasa el mensaje directamente por variable
    @GetMapping("/message")
    public String textWelcome(){
        return message;
    }
*/
    @GetMapping("/health")
    public Boolean isHeath(){
        return true;
    }

    // Pasa el mensaje a través del servicio
    @GetMapping("/message")
    public String getMessageService(){
        return messageService.getMessage();
    }

    @Value("${course.message}")
    private String messageDefect;
}
