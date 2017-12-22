import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void shouldProcessInput() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String output = fizzBuzz.processNumber(1);

        assertThat(output, is("1"));
    }

}