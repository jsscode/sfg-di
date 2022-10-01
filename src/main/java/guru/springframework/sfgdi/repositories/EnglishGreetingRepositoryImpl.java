package guru.springframework.sfgdi.repositories;

/**
 * @author codejss
 */
public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {
    @Override
    public String greeting() {
        return "Hello world! - EN";
    }
}
