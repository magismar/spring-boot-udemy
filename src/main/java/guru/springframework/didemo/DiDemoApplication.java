package guru.springframework.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import guru.springframework.controllers.MyController;



@SpringBootApplication
@ComponentScan(basePackages = {"guru.springframework.controllers"})
public class DiDemoApplication {

	public static void main(String[] args) {
	  ApplicationContext ctx = 	SpringApplication.run(DiDemoApplication.class, args);
	
	  
	  MyController controller = (MyController)  ctx.getBean("myController");
	
	  controller.hello();
	}
}
