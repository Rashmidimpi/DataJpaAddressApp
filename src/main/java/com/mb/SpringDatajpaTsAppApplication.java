package com.mb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.mb.service.EmployeeService;

@SpringBootApplication
@EnableTransactionManagement
public class SpringDatajpaTsAppApplication {

	public static void main(String[] args) {
		
			ConfigurableApplicationContext context	=
					SpringApplication.run(SpringDatajpaTsAppApplication.class, args);
			EmployeeService bean = context.getBean(EmployeeService.class);
			bean.saveData();
		
	}

}
