package ro.itschool;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import ro.itschool.entity.Employee;
import ro.itschool.repository.EmployeeRepository;

@SpringBootApplication
public class Project1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Project1Application.class, args);
	}

  @Autowired

	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();
		employee.setFirstName("Andrei");
		employee.setLastName("Popescu");
		employee.setEmailId("a.popescu@email.com");
		employeeRepository.save(employee);

		Employee employee1 = new Employee();
		employee1.setFirstName("Ionel");
		employee1.setLastName("Popescu");
		employee1.setEmailId("i.popescu@email.com");
		employeeRepository.save(employee1);

	}
}
