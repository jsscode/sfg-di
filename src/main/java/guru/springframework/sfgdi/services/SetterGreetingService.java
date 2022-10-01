package guru.springframework.sfgdi.services;



public class SetterGreetingService implements GreetingService{

    @Override
    public String greeting() {
        return "Hello -- Setter";
    }
}
