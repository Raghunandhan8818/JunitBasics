package org.example.techtalk.hamcrestmatchers;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;


class LionTest {

    @Test
    void shouldPassWhenLionIsDerivedFromAnimal(){
        assertThat(Lion.class, typeCompatibleWith(Animal.class));
    }

    @Test
    void shouldPassWhenTwoObjectsAreOfSameInstace(){
        Lion mufasa = new Lion();
        assertThat(mufasa, sameInstance(mufasa));
    }
}