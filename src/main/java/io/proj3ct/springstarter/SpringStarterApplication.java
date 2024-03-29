package io.proj3ct.springstarter;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringStarterApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = new
				AnnotationConfigApplicationContext(SpringConfig.class);


		Car car = ctx.getBean("carWithModelValue" ,Car.class);

		car.getEngineModel();

		System.out.println(car.getManufacture());

		System.out.println(car.getModel());
	}

}
