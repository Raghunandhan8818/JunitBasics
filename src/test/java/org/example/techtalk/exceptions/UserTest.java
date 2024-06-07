package org.example.techtalk.exceptions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @BeforeEach
    public void setUp() {
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenNameIsNull() {
        User user = new User();
        assertThrows(IllegalArgumentException.class, () -> {
            user.setName(null);
        });
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenLengthOfNameIsLessThanThree() {
//        We can obtain the returned exception to test further, e.g. assert the exception message:
        Exception exception = assertThrows(
                IllegalArgumentException.class, () -> {
                    User user = new User();
                    user.setName("ab");
                }
        );
        assertEquals("Username is too short", exception.getMessage());
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenLengthOfNameIsMoreThan30() {
        Exception exception = assertThrows(
                IllegalArgumentException.class, () -> {
                    User user = new User();
                    user.setName("Chennai Mumbai Bangalore KolKata Pune Hyderabad");
                }
        );
        assertEquals("Username is too long", exception.getMessage());
    }

}

