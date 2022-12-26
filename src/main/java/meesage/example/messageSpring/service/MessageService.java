package meesage.example.messageSpring.service;

import com.sun.jdi.request.StepRequest;
import meesage.example.messageSpring.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class MessageService {
  private final MessageRepository whatsappRepository;
  private final MessageRepository facebookRepository;
  private final MessageRepository instagramRepository;


  public MessageService(@Qualifier("facebookRepository") MessageRepository facebookRepository,
                        @Qualifier("instagramRepository") MessageRepository instagramRepository,
                        @Qualifier("whatsappRepository") MessageRepository whatsappRepository) {
    this.instagramRepository = instagramRepository;
    this.whatsappRepository = whatsappRepository;
    this.facebookRepository = facebookRepository;
  }


  public String sendWhatsappMessage(String message) {
    return whatsappRepository.messageFormat(message);
  }

  public String sendInstagramMessage(String message) {
    return instagramRepository.messageFormat(message);
  }

  public String sendFacebookMessage(String message) {
    return facebookRepository.messageFormat(message);
  }

}
