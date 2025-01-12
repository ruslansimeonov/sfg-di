package ruslan.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements IGreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World - From the PRIMARY bean";
    }
}
