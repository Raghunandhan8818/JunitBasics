package org.example.techtalk.hamcrestmatchers;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.lessThanOrEqualTo;
import static org.hamcrest.Matchers.*;


public class HamcrestMatcherTests {

    /* Number Matchers */
    @Test
    void shouldPassWhenInputIsGreaterThanOrEqualToFive(){
        Integer input = 5;
        assertThat(input, greaterThanOrEqualTo(5));
    }

    @Test
    void shouldPassWhenInputIsLessThanOrEqualToFive(){
        Integer input = -0;
        assertThat(input, lessThanOrEqualTo(5));
    }


    /* String Matchers */
    @Test
    void shouldPassWhenTheInputStringIsEmpty(){
        String input = "";
        assertThat(input, isEmptyOrNullString());
    }

    @Test
    void shouldPassWhenTwoInputStringsAreEqual(){
        String input1 = "INDIA";
        String input2 = "india";
        assertThat(input1, equalToIgnoringCase(input2));
    }

    /* Collection Matchers */

    @Test
    void shouldPassWhenInputListIsOfLengthFour(){
        List<String> fruits = Arrays.asList("Apple", "Orange", "Mango", "Grapes");
        assertThat(fruits, hasSize(4));
    }


    @Test
    void shouldPassWhenInputArrayIsOfSizeFour(){   //For Arrays
        Integer[] numbers = {1 , 2, 3, 4};
        assertThat(numbers, arrayWithSize(4));
    }


    @Test
    void shouldPassWhenInputListContainsElementsInASpecifiedOrder(){
        List<String> states = Arrays.asList("KA", "GA", "TN", "AP");
        assertThat(states, containsInAnyOrder("GA", "AP", "TN", "KA"));
//        assertThat(states, contains("KA", "GA", "TN", "AP"));
    }

    @Test
    void shouldPassWhenAGivenElementIsPresentInTheInputList(){
        List<String> states = Arrays.asList("KA", "GA", "TN", "AP");
        assertThat(states, hasItem("GA"));
    }

    @Test
    void shouldPassWhenAllTheElementsInTheCollectionIsGreaterThanZero(){
        List<Integer> list = Arrays.asList(1, 2, 3);
        int baseCase = 0;
        assertThat(list, everyItem(greaterThan(baseCase)));
    }

    /* for Maps */

    @Test
    void shouldPassWhenTheInputKeyIsPresentInTheMap(){
        Map<String, String> inputMap = new HashMap<>();
        inputMap.put("Australia", "PatCummins");
        assertThat(inputMap, hasKey("Australia"));
    }

    @Test
    void shouldPassWhenTheInputEntryIsPresentInTheMap(){
        Map<String, String> inputMap = new HashMap<>();
        inputMap.put("Colour", "Red");
        assertThat(inputMap, hasEntry("Colour", "Red"));
    }

    /* Chain Conditions */
    @Test
    void shouldPassWhenTheInputNumberIsGreaterThanTenOrLessThanSix(){
        Integer input1 = 4;
        Integer input2 = 12;
        assertThat(input1, anyOf(greaterThan(10), lessThan(6)));
        assertThat(input2, anyOf(greaterThan(10), lessThan(6)));

    }

    @Test
    void shouldPassWhenInputStringStartWithTheLetterSAndEndsWithTheLetterR(){
        String input = "Srinagar";
        String start = "S";
        String end = "r";
        assertThat(input, allOf(startsWith(start), endsWith(end)));
    }




}
