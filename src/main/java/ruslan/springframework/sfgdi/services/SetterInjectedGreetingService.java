package ruslan.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingService implements IGreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World - Setter";
    }
}
