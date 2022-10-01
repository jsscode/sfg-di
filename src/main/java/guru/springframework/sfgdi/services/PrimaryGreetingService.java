package guru.springframework.sfgdi.services;




public class PrimaryGreetingService implements GreetingService{

    @Override
    public String greeting() {
        return "Hello from the primary bean";
    }
}
