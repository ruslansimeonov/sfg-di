package ruslan.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import ruslan.springframework.sfgdi.services.IGreetingService;

@Controller
public class PropertyInjectedController {

    @Qualifier("propertyInjectedGreetingService")
    @Autowired
    public IGreetingService greetingService;


    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
