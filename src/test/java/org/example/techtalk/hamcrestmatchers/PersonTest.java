package org.example.techtalk.hamcrestmatchers;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;

/* Object Matchers */

class PersonTest {

    @Test
    public void shouldReturnProperStringWhenToStringMethodIsCalled(){
        Person person = new Person("John","NewYork");
        String str = person.toString();
        assertThat(person , hasToString(str));
    }


    @Test
    void shouldHavePropertyNameWhenTheObjectIsInitialized(){
        Person person = new Person();
        assertThrows(AssertionError.class, ()->assertThat(person, hasProperty("age")));
        assertThat(person, hasProperty("name"));
    }

    @Test
    void shouldHaveRightNameWhenInitializedWithPropertyName(){
        Person person = new Person("Michael","Delhi");
        assertThat(person, hasProperty("name", equalTo("Michael")));
    }

    @Test
    void shouldPassWhenTwoInputObjectsHaveSamePropertyValues(){
        Person person1 = new Person("Jack", "Bangalore");
        Person person2 = new Person("Jack", "Bangalore");
        assertThat(person1, samePropertyValuesAs(person2));
    }

}