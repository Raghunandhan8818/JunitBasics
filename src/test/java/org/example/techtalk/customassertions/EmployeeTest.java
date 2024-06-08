package org.example.techtalk.customassertions;
import org.junit.jupiter.api.Test;
import static org.example.techtalk.customassertions.EmployeeAssert.assertEmployee;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void shouldPassWhenTheEmployeeIsAdult(){
        Employee employee = new Employee();
        employee.setAge(19);
        EmployeeAssert assertInstance = new EmployeeAssert(employee);
        assertInstance.isAdult();
        assertEmployee(employee).isAdult();
    }






}