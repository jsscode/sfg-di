package guru.springframework.sfgdi.services;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author codejss
 */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ProtoTypeBean {

    public ProtoTypeBean() {
        System.out.println("Creating a prototype bean");
    }

    public String getMyScope(){
        return "I'm a prototype";
    }
}
