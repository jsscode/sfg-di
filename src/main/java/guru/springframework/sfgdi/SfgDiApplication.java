package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx =SpringApplication.run(SfgDiApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		PetController petController = (PetController) ctx.getBean("petController");
		System.out.println(petController.whichPetIsTheBest());

		System.out.println("------i18n-------");

		I18nController i18NController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18NController.greeting());

		System.out.println("------Primary------");
		System.out.println(myController.hello());

		System.out.println("------Property-------");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreetings());

		System.out.println("------Setter-------");

		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreetings());

		System.out.println("------Constructor-------");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreetings());
	}

}
