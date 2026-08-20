package lab;

import org.springframework.stereotype.Component;

@Component
public class GreetingService {

    public String greet (){
        return "Hello from Spring!";
    }

}
