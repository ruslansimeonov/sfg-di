package ruslan.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import ruslan.springframework.sfgdi.services.IGreetingService;

@Controller
public class ConstructorInjectedController {

    private final IGreetingService greetingService;

    public ConstructorInjectedController(@Qualifier("constructorGreetingService") IGreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
