package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;


public class PropertyGreetingService implements GreetingService {

    @Override
    public String greeting() {
        return "Hello -- Property";
    }
}
