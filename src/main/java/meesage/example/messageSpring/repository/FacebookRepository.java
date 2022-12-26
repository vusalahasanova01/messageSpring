package meesage.example.messageSpring.repository;

import org.springframework.stereotype.Repository;

@Repository
public class FacebookRepository implements MessageRepository {
  @Override
  public String messageFormat(String origin) {
    return String.format("%s send by Facebook",origin);
  }
}
