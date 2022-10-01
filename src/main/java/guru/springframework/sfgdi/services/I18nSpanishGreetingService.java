package guru.springframework.sfgdi.services;



public class I18nSpanishGreetingService implements GreetingService{

    @Override
    public String greeting() {
        return "Hola mundo! - ES";
    }
}
