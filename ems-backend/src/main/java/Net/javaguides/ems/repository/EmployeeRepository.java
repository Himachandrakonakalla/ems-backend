package Net.javaguides.ems.repository;

import Net.javaguides.ems.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // JpaRepository provides built-in methods:
    // save(), findById(), findAll(), deleteById(), etc.
}
