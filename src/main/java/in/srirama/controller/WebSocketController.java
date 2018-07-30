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
        log.info("****** message : {} ",id);
//        String sessionId = headerAccessor.getSessionAttributes().get("client-id").toString();
//        System.out.println("sessionId : "+sessionId);
        log.info("sessionId : {} ",headerAccessor.getSessionId());
        headerAccessor.getSessionAttributes().put("username", "test");
        this.template.convertAndSendToUser(id, "/chat",  message);
    }
}
