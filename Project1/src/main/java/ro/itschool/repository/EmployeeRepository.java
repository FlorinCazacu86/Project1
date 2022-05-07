package ro.itschool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.itschool.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
        //toate metodele CRUD din database


}

