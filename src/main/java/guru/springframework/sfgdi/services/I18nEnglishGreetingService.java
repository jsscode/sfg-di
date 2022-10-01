package guru.springframework.sfgdi.services;



public class I18nEnglishGreetingService implements GreetingService {

    @Override
    public String greeting() {
        return "Hello world! - EN";
    }
}
