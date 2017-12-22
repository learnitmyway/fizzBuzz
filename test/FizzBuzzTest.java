import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void shouldProcessNumber() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.processNumber(1), is("1"));
    }

}