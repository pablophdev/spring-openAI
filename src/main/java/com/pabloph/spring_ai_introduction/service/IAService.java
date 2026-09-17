package com.pabloph.spring_ai_introduction.service;

//Se importa chatClient
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class IAService {

    //Inyección de dependencias de chatClient
    private final ChatClient chatClient;

    //Construir el cliente de la config
    //del aplication properties
    public IAService(ChatClient.Builder builder) {
        this.chatClient = builder.build();
    }

    public String preguntar(String pregunta) {
        return chatClient
                .prompt() //prompt
                .system("Eres un profesor de informática especializado en Spring boot " +
                        "Responde siempre en español." + "Explica los conceptos de forma sencilla") //tendra una intro el prompt
                .user(pregunta) //pregunta q manda el usuario
                .call()
                .content();
    }
}
