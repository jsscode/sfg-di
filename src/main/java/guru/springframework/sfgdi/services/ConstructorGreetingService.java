package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;


public class ConstructorGreetingService implements GreetingService{
    @Override
    public String greeting() {
        return "Hello -- Constructor";
    }
}
