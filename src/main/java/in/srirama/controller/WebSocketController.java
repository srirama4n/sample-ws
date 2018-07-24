package in.srirama.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
@Slf4j
public class WebSocketController {

    private SimpMessagingTemplate template;

    @MessageMapping("/send/message/{id}")
    public void onReceivedMessage(String message, @DestinationVariable("id") String id, SimpMessageHeaderAccessor headerAccessor){
        System.out.println("****** message "+ message+" : " + id);
//        String sessionId = headerAccessor.getSessionAttributes().get("client-id").toString();
//        System.out.println("sessionId : "+sessionId);
        System.out.println("sessionId : "+headerAccessor.getSessionId());
        this.template.convertAndSend("/chat/"+id,  message);
    }
}
