package Net.javaguides.ems.mapper;

import Net.javaguides.ems.dto.EmployeeDto;
import Net.javaguides.ems.entity.Employee;

public class EmployeeMapper {

    // Convert DTO to Entity
    public static EmployeeDto mapToEmployeeDto(Employee employee){
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
    }

    // Convert Entity to DTO
    public static Employee mapToEmployee(EmployeeDto employeeDto){
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail()
        );
    }

}
