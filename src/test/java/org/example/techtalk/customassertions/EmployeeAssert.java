package org.example.techtalk.customassertions;

import org.assertj.core.api.AbstractAssert;

import static org.hamcrest.MatcherAssert.assertThat;

public class EmployeeAssert extends AbstractAssert<EmployeeAssert,Employee> {

    public EmployeeAssert(Employee actual) {
        super(actual, EmployeeAssert.class);
    }

    public static EmployeeAssert assertEmployee(Employee actual) {
        return new EmployeeAssert(actual);
    }

    public void isAdult() {
        isNotNull();
        if (actual.getAge() < 18) {
            failWithMessage("Expected person to be adult");
        }
    }

}
