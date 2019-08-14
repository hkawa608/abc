package abc132.a;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MainTest {

    @Test
    public void test1() {
        String input = "ASSA";
        String expected = "Yes";

        assertThat(execute(input + "\n"), is(expected + "\n"));
    }

    @Test
    public void test2() {
        String input = "ASTOP";
        String expected = "No";

        assertThat(execute(input + "\n"), is(expected + "\n"));
    }

    @Test
    public void test3() {
        String input = "FFEE";
        String expected = "Yes";

        assertThat(execute(input + "\n"), is(expected + "\n"));
    }

    @Test
    public void test4() {
        String input = "FREE";
        String expected = "No";

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
