package guru.springframework.sfgdi.services;




public class PropertyGreetingService implements GreetingService {

    @Override
    public String greeting() {
        return "Hello -- Property";
    }
}
