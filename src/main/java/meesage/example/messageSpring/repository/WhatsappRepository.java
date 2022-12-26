package meesage.example.messageSpring.repository;

import org.springframework.stereotype.Repository;

@Repository
public class WhatsappRepository implements MessageRepository {
  @Override
  public String messageFormat(String origin) {
    return String.format("%s send by Whatsapp",origin);
  }
}
