package abc083.b;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MainTest {

    @Test
    public void test1() {
        String input = "20 2 5";
        String expected = "84";

        assertThat(execute(input + "\n"), is(expected + "\n"));
    }

    @Test
    public void test2() {
        String input = "10 1 2";
        String expected = "13";

        assertThat(execute(input + "\n"), is(expected + "\n"));
    }

    @Test
    public void test3() {
        String input = "100 4 16";
        String expected = "4554";

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
