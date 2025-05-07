package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    @Test
    public void punchIn_ShouldRecordStartTimeOfEmployee() {
        // arrange
        Employee employee = new Employee(12, "Jojo", "QA", 25.0);

        // act
        employee.punchIn(10.0);

        // assert
        assertEquals(10.0, employee.getStartTime());
    }
    @Test
    public void punchOut_ShouldCalculateHoursWorked(){
       Employee employee = new Employee(2, "Kyle", "Manager", 30.0);

       employee.punchIn(8.0);
       employee.punchOut(12.00);

       assertEquals(4.0, employee.getHoursWorked()); // this is how long kyle worked
       assertEquals(0.0, employee.getStartTime()); // After punching out, start time should reset
    }
}