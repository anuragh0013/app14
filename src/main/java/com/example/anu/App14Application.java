package com.example.anu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.anu.service.EmpService;

@SpringBootApplication
public class App14Application {

	public static void main(String[] args) {
		ApplicationContext context =
				SpringApplication.run(App14Application.class, args);
		EmpService emp =context.getBean(EmpService.class);
//		emp.saveEmp();
//		emp.saveEmps();
//		emp.calCustomQueries(10);
		emp.calByFindBy(10000.00);


           int m = 20;

           int k = 20;
           int i = 40;
            String name = "anuragh";

	}

}
