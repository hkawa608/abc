package abc132.b;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MainTest {

    @Test
    public void test1() {
        String input = "5\n" + "1 3 5 4 2";
        String expected = "2";

        assertThat(execute(input + "\n"), is(expected + "\n"));
    }

    @Test
    public void test2() {
        String input = "9\n" + "9 6 3 2 5 8 7 4 1";
        String expected = "5";

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
