package guru.springframework.sfgdi.services;




public class ConstructorGreetingService implements GreetingService{
    @Override
    public String greeting() {
        return "Hello -- Constructor";
    }
}
