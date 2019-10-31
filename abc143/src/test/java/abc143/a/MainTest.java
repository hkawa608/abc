package abc143.a;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MainTest {

    @Test
    public void test1() {
        String input = "12 4";
        String expected = "4";

        assertThat(execute(input + "\n"), is(expected + "\n"));
    }

    @Test
    public void test2() {
        String input = "20 15";
        String expected = "0";

        assertThat(execute(input + "\n"), is(expected + "\n"));
    }

    @Test
    public void test3() {
        String input = "20 30";
        String expected = "0";

        assertThat(execute(input + "\n"), is(expected + "\n"));
    }

    private String execute(String input) {
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        Main.solve(
                new ByteArrayInputStream(input.getBytes()), new PrintStream(os)
        );
        return os.toString().replace(System.lineSeparator(), "\n");
    }
}
