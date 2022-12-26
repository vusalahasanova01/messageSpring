package meesage.example.messageSpring.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import meesage.example.messageSpring.service.MessageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/message")
public class MessageController {
  private final MessageService messageService;


  //http://localhost:8082/message/facebook/hello
  @GetMapping("/facebook/{message}")
  public String sendFaceboookMessage(@PathVariable String message) {
    return messageService.sendFacebookMessage(message);
  }

  //http://localhost:8082/message/instagram/hello
  @GetMapping("/instagram/{message}")
  public String sendInstagramMessage(@PathVariable String message) {
    return messageService.sendInstagramMessage(message);
  }

  //http://localhost:8082/message/whatsapp/hello
  @GetMapping("/whatsapp/{message}")
  public String sendWhatsappMessage(@PathVariable String message) {
    return messageService.sendWhatsappMessage(message);
  }
}
