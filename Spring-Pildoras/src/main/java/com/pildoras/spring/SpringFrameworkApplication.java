package com.pildoras.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringFrameworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringFrameworkApplication.class, args);

		// Logro la abstraccion a traves de una interface
//		Empleado jefe1 = new JefeEmpleado();
//		Empleado secretario1 = new SecretarioEmpleado();
//		Empleado director1 = new DirectorEmpleado();
//
//		System.out.println(jefe1.getTareas());
//		System.out.println(secretario1.getTareas());
//		System.out.println(director1.getTareas());

//		/* Utilizo XML para insertar objetos de diferentes tipos sin tocar el codigo */
//		// Cargo el objeto XML
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		// Pido el beam
//		Empleado jefe2 = context.getBean("miEmpleado", Empleado.class);
//		// Utilizo el objeto
//        System.out.println(jefe2.getTareas());
//        // Cierro el contexto para liberar recursos
//        context.close();
//		// Donde esta la magia. Si necesito otro objeto diferente, voy al Beam y cambio la clase. De manera que el codigo de la aplicación no se modifica.

		ApplicationContext  applicationContext = new AnnotationConfigApplicationContext("com.pildoras.spring.beans");
		Empleado jefe3 = applicationContext.getBean("jefe", Empleado.class);
		System.out.println(jefe3.getInformes());
	}

}
