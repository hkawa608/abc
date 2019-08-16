package abc086.c;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Test;

public class MainTest {

    @Test
    public void test1() {
        String input = "2\n"
            + "3 1 2\n"
            + "6 1 1";
        String expected = "Yes";

        assertThat(execute(input + "\n"), is(expected + "\n"));
    }

    @Test
    public void test2() {
        String input = "31\n"
            + "2 100 100";
        String expected = "No";

        assertThat(execute(input + "\n"), is(expected + "\n"));
    }

    @Test
    public void test3() {
        String input = "2\n"
            + "5 1 1\n"
            + "100 1 1";
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
